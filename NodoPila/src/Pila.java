public class Pila {
    private NodoPila cima;
    int tama;
    public Pila(){
        cima=null;
        tama=0;
    }
    //metodo para saber cuando la pila esta vacia
    public boolean estavacia(){
        return cima==null;
    }

    //metodo para empujar push un elemnto en la pila
    public void empujar(int elem){
        NodoPila nuevo = new NodoPila(elem);
        nuevo.siguiente=cima;
        cima=nuevo;
        tama++;
    }
    //metodo para sacar un elemnto de la pila
    public int sacar(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tama--;
        return aux;
    }
    //metodo para saber quien esta en la cima
    public int cima(){
        return cima.dato;
    }
    //metodo para saber el tamaño de la pila
    public int tamañopila(){
        return tama;
    }
    //metodo para vacia la pila
    public void limpialpila(){
        while (!estavacia()){
            sacar();
        }
    }
}
