public class nodoarbol {
    String dato;
    String nombre;
    nodoarbol hijoizq,hijoder;
    public nodoarbol(String d , String nombr){
        this.dato=d;
        this.nombre=nombr;
        this.hijoder=null;
        this.hijoizq=null;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "nodoarbol{" +
                ", nombre='" + nombre + '\'' +
                "dato=" + this.dato +
                '}';
    }
}
