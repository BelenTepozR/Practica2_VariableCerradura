
package condicionescompetencias;
import java.util.ArrayList;

public class RCompartido {
    private String datoCompartido;
    private Cerradura c;
    
    RCompartido(Cerradura cerradura){
        this.datoCompartido = "";
        this.c = cerradura;
    }
    
    public String getDatoCompartido() {
        return datoCompartido;
    }
  
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }

    public Cerradura getCerradura(){
        
        return this.c;
    }

    public void setCerradura(Cerradura cerradura) {
        this.c = cerradura;
    }
    
    public void bloquea(){
        this.c.setCerrado(1);
    }
    
    public void desbloquea(){
        this.c.setCerrado(0);
    }
    
    public boolean isEntra(){
        if(c.isCerrado() == 0)
            return true;
        else
            return false;                
    }
}
