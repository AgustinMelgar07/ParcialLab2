public class cola {
    nodocola inicio,fin;
    int tamaño;
    public cola(){
        inicio=fin=null;
        tamaño=0;
    }

    public  boolean estavacia(){
        return inicio ==null;
    }
    public void buscar(int dato){
        nodocola aux = this.inicio;

        for (int i = 0; i<tamaño();i++){
            if (aux.dato==dato){
                System.out.println("nodo encontradp");
                return;
            }
            aux = aux.siguiente;
        }
    }
    public void insertar(int ele){
        nodocola nuevo=new nodocola(ele);
        if (estavacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        return aux;
    }
    public int iniciocola(){
        return inicio.dato;
    }
    public int tamaño(){
        return tamaño;
    }
    public void imprimir() {
        if (estavacia()) {
            System.out.println("Cola vacia");
        } else {

            nodocola aux = this.inicio;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.dato);
                aux = aux.siguiente;
            }
        }
    }
}
