public class ListaDoble  {
    private  NodoDoble inicio,fin;


    public ListaDoble(){
        inicio=fin=null;
    }
    public  boolean vacia(){
        return inicio==null;
    }
    public void  agregarFinal(String provincia,String capi,int habitantes,int analfabetos){
        if(!vacia()){
            fin=new NodoDoble(provincia,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(provincia);
        }
    }
    public void  agregarinicio(String provincia){
        if(!vacia()){
            inicio=new NodoDoble(provincia,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(provincia);
        }
    }
    //mostrar Lista inicio fin


    public  void Ordenarporanalfabetos(){
        if (!vacia()){
            String datos= "<>";
            NodoDoble auxiliar = fin;
            while (auxiliar!=null){
                datos = datos+ auxiliar.getProvincias();
                auxiliar=auxiliar.anterior;
            }
            System.out.println(datos+"=>");
        }

    }
    public void bubbleSort() {
        int c=1;
        NodoDoble act =inicio ;
        while(act.siguiente !=null)//Este while cuenta el total de nodos.
        {
            act = act.siguiente;
            c++;
        }
        if (c > 1) {
            boolean cambio;
            do {
                NodoDoble actual = inicio;
                NodoDoble anterior = null;
                NodoDoble siguiente = inicio.siguiente;
                cambio = false;
                while ( siguiente != null ) {
                    if (actual.getProvincias().compareTo(siguiente.getProvincias())>0) {
                        cambio = true;
                        if ( anterior != null ) {
                            NodoDoble sig = siguiente.siguiente;
                            anterior.siguiente = siguiente;
                            siguiente.siguiente = actual;
                            actual.siguiente = sig;
                        } else {
                            NodoDoble sig = siguiente.siguiente;
                            inicio = siguiente;
                            siguiente.siguiente = actual;
                            actual.siguiente = sig;
                        }
                        anterior = siguiente;
                        siguiente = actual.siguiente;
                    } else {
                        anterior = actual;
                        actual = siguiente;
                        siguiente = siguiente.siguiente;
                    }
                }
            } while( cambio );
        }

    }
    public void mostrarlista(){
        if(!vacia()){
            String datos= " ";
            NodoDoble auxiliar= inicio;
            while (auxiliar!=null){
                datos = datos+ "["+auxiliar.getProvincias()+"] ";
                auxiliar=auxiliar.siguiente;
            }
            System.out.println(datos);
        }
    }
}
