public class arbol {

    nodobinario raiz;
    int altura;

    public arbol() {
        raiz = null;
    }

    //metodo para insertar un nodo en elarbol
    public void agregarnodo(int d) {
        nodobinario nuevo = new nodobinario(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            nodobinario aux = raiz;
            nodobinario padre;
            while (true) {
                padre = aux;
                if (d < aux.dato) {
                    aux = aux.hijoizq;
                if (aux==null){
                    padre.hijoizq=nuevo;
                    return;
                }
                }else {
                    aux=aux.hijoder;
                    if (aux==null){
                        padre.hijoder=nuevo;
                        return;
                    }
                }

            }
        }

    }


    public boolean estavacio() {
        return raiz == null;
    }

    //metodo de inorden
    public void inorden(nodobinario r) {
        if (r != null) {
            inorden(r.hijoizq);
            System.out.println(r.dato);
            inorden(r.hijoder);
        }
    }

    //metodo de preorden
    public void preorden(nodobinario r) {
        if (r != null) {
            System.out.println(r.dato);
            preorden(r.hijoizq);
            preorden(r.hijoder);
        }
    }

    //metodo de postorden
    public void postorden(nodobinario r) {
        if (r != null) {
            postorden(r.hijoizq);
            postorden(r.hijoder);
            System.out.println(r.dato);

        }
    }


    //metodo para buscar en el arbol algo
    public nodobinario buscarnodo(int d) {
        nodobinario aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.hijoizq;
            } else {
                aux = aux.hijoder;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }
}