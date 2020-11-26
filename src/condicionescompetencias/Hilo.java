
package condicionescompetencias;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private boolean pausado = false;   
    private boolean corriendo = true;   
    private int numHilo;
    private final static int ini = 100;
    private final static int fin = 200;
    private Cerradura c;
    
    Hilo(JTextArea area, RCompartido rc, int n, Cerradura c){
        this.area = area;
        this.rc = rc;
        this.setName("Perrito" + n);
        this.numHilo = n;
        this.c = c;
    }
   
    @Override
    public void run(){
        try{
            while(true){
                    if(rc.isEntra()){
                        rc.bloquea();
                        rc.setDatoCompartido(this.getName());
                        area.append(rc.getDatoCompartido() + "\n"); 
                        Thread.sleep((int)(ini + Math.random()*fin));
                        rc.desbloquea();
                    }else
                        area.append("Esperando" + "\n");
                Thread.sleep((int)(ini + Math.random()*fin));
		if(numHilo == 4)
     	           this.stop();
                synchronized(this){
                    if(pausado)
                        wait();
                    if(!corriendo)
                        join();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    public void pausar(){
        this.pausado = true;
    }
    
    public void continuar(){
        synchronized(this){
            pausado = false;
            notifyAll();
        }
    }
    
    public void parar(){
        this.corriendo = false;
    }

}
