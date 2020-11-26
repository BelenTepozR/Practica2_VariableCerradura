package condicionescompetencias;
public class Cerradura {
    private int cerrado;

    Cerradura(){
        this.cerrado = 0; 
    }
    public int isCerrado() {
        return cerrado;
    }

    public void setCerrado(int cerrado) {
        this.cerrado = cerrado;
    }
}
