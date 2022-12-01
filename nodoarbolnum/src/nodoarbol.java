public class nodoarbol {
    int dato;
    String nombre;
    nodoarbol hijoizq,hijoder;
    public nodoarbol(int d , String nombr){
        this.dato=d;
        this.nombre=nombr;
        this.hijoder=null;
        this.hijoizq=null;
    }

    @Override
    public String toString() {
        return "nodoarbol{" +
                ", nombre='" + nombre + '\'' +
                "dato=" + this.dato +
                '}';
    }
}
