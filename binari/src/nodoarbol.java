public class nodoarbol {
    int dato;
    private nodoarbol hijoizquierdo;
    private nodoarbol hijoderecho;
    public nodoarbol(int dato){
        this.dato = dato;
        hijoizquierdo = null;
        hijoderecho = null;

    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoarbol getHijoizquierdo() {
        return hijoizquierdo;
    }

    public void setHijoizquierdo(nodoarbol hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public nodoarbol getHijoderecho() {
        return hijoderecho;
    }

    public void setHijoderecho(nodoarbol hijoderecho) {
        this.hijoderecho = hijoderecho;
    }
    public boolean hoja(){
        return (hijoderecho == null && hijoizquierdo == null);
    }
}