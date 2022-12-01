public class nodobinario {
    int dato;
    nodobinario hijoizq,hijoder;
    public nodobinario(int d ){
        this.dato=d;
        this.hijoder=null;
        this.hijoizq=null;
    }

    public int getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "nodoarbol{" +
                "dato=" + this.dato +
                '}';
    }
}
