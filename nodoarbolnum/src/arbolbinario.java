public class arbolbinario {

    nodoarbol raiz;
    public arbolbinario(){
        raiz=null;
    }
    //metodo para insertar un nodo en elarbol
    public void agregarnodo(int d,String nom){
        nodoarbol nuevo= new nodoarbol(d,nom);
        if(raiz==null){
            raiz=nuevo;
        }else {
            nodoarbol aux= raiz;
            nodoarbol padre=null;
            while (aux != null){
                padre=aux;
                if (d<aux.dato) {
                    aux = padre.hijoizq;
                }else if (d>aux.dato){
                    aux = aux.hijoder;

                }
            }
            if (d< padre.dato) {
                padre.hijoizq = nuevo;
            }

            if (d> padre.dato) {
                padre.hijoder = nuevo;
            }
        }

    }


    public boolean estavacio(){
        return raiz==null;
    }

    //metodo de inorden
    public void inorden(nodoarbol r){
        if(r!=null){
            inorden(r.hijoizq);
            System.out.println(r.dato);
            inorden(r.hijoder);
        }
    }
    //metodo de preorden
    public void preorden(nodoarbol r){
        if(r!=null){
            System.out.println(r.dato);
            preorden(r.hijoizq);
            preorden(r.hijoder);
        }
    }
    //metodo de postorden
    public void postorden(nodoarbol r){
        if(r!=null){
            postorden(r.hijoizq);
            postorden(r.hijoder);
            System.out.println(r.dato);

        }
    }
    //metodo para buscar en el arbol algo
    public nodoarbol buscarnodo(int d){
        nodoarbol aux=raiz;
        while (aux.dato!=d){
            if (d<aux.dato) {
                aux=aux.hijoizq;
            }else{
                aux=aux.hijoder;
            }
            if (aux==null){
                return null;
            }
        }
        return aux;
    }
    //metodo para eliminar un nodo del arbol
    public boolean eliminar(int d){
        nodoarbol aux = raiz;
        nodoarbol padre = raiz;
        boolean eshijoizq = true;
        while (aux.dato!=d){
            padre=aux;
            if (d<aux.dato){
                eshijoizq=true;
                aux=aux.hijoizq;
            }else {
                eshijoizq=false;
                aux=aux.hijoder;
            }
            if (aux==null){
                return false;
            }
        }
        if (aux.hijoizq==null && aux.hijoder==null){
            if (aux==raiz){
                raiz=null;
            }else if (eshijoizq){
                padre.hijoizq=null;
            }else {
                padre.hijoder=null;
            }
        }else if(aux.hijoder==null){
            if (aux==raiz){
                raiz=aux.hijoizq;
            }else if (eshijoizq){
                padre.hijoizq=aux.hijoizq;
            }else {
                padre.hijoder=aux.hijoizq;
            }
        }else if (aux.hijoizq==null){
            if (aux==raiz){
                raiz=aux.hijoder;
            }else if (eshijoizq){
                padre.hijoizq=aux.hijoder;
            }else {
                padre.hijoder=aux.hijoder;
            }
        }else {
            nodoarbol reemplazo= obtenernodoreemplazo(aux);
            if (aux==raiz){
                raiz =reemplazo;
            }else if (eshijoizq){
                padre.hijoizq=reemplazo;
            }else {
                padre.hijoder=reemplazo;
            }
            reemplazo.hijoizq=aux.hijoizq;
        }
        return true;
    }
    //metodo encargado de devolver el nodo reemplazo
    public nodoarbol obtenernodoreemplazo(nodoarbol nodoreemplazo){
        nodoarbol reemplazarpadre=nodoreemplazo;
        nodoarbol reemplazo=nodoreemplazo;
        nodoarbol aux=nodoreemplazo.hijoder;
        while (aux!=null){
            reemplazarpadre=reemplazo;
            reemplazo=aux;
            aux=aux.hijoizq;
        }
        if (reemplazo!=nodoreemplazo.hijoder){
            reemplazarpadre.hijoizq=reemplazo.hijoder;
            reemplazo.hijoder=nodoreemplazo.hijoder;
        }
        System.out.println("el nodo reemplazo es"+reemplazo);
        return reemplazo;

    }
}
