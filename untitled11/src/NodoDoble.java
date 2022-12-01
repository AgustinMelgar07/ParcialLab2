public class NodoDoble {
    private String provincias;
    public String capital;
    public int cantidadtotalhabitantes;
    private int cantidaddeANalfabetos;

    NodoDoble siguiente,anterior;

    public  NodoDoble(String provincia, NodoDoble s, NodoDoble a){
        provincias=provincia;
        siguiente=s;
        anterior=a;
    }

    public NodoDoble (String provincia) {

    this(provincia,null,null);
    }


    public String getProvincias() {
        return provincias;
    }

    public void setProvincias(String provincias) {
        this.provincias = provincias;
    }

    public int getCantidaddeANalfabetos() {
        return cantidaddeANalfabetos;
    }

    public void setCantidaddeANalfabetos(int cantidaddeANalfabetos) {
        this.cantidaddeANalfabetos = cantidaddeANalfabetos;
    }
}
