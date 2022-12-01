import java.util.LinkedList;

public class arbolbinario {

    nodoarbol raiz;
    int altura;
    public arbolbinario() {
        raiz = null;
    }

    //metodo para insertar un nodo en elarbol
    public void agregarnodo(String d, String nom) {
        nodoarbol nuevo = new nodoarbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            nodoarbol aux = raiz;
            nodoarbol padre = null;
            while (aux != null) {
                padre = aux;
                if (d.compareTo(aux.dato) <= 0) {
                    aux = padre.hijoizq;
                } else if (d.compareTo(aux.dato) > 0) {
                    aux = aux.hijoder;

                }

            }
            if (d.compareTo(padre.dato) <= 0) {
                padre.hijoizq = nuevo;
            }

            if (d.compareTo(padre.dato) > 0) {
                padre.hijoder = nuevo;
            }
        }

    }


    public boolean estavacio() {
        return raiz == null;
    }

    //metodo de inorden
    public void inorden(nodoarbol r) {
        if (r != null) {
            inorden(r.hijoizq);
            System.out.println(r.dato);
            inorden(r.hijoder);
        }
    }

    //metodo de preorden
    public void preorden(nodoarbol r) {
        if (r != null) {
            System.out.println(r.dato);
            preorden(r.hijoizq);
            preorden(r.hijoder);
        }
    }

    //metodo de postorden
    public void postorden(nodoarbol r) {
        if (r != null) {
            postorden(r.hijoizq);
            postorden(r.hijoder);
            System.out.println(r.dato);

        }
    }



    //metodo para buscar en el arbol algo
    public nodoarbol buscarnodo(String d) {
        nodoarbol aux = raiz;
        while (aux.dato != d) {
            if (d.compareTo(aux.dato) <= 0) {
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

    public boolean printLevel(nodoarbol root, int level)
    {
        // caso base
        if (root == null) {
            return false;
        }

        if (level == 1)
        {
            System.out.print(root.dato + " ");

            // devuelve verdadero si al menos un nodo está presente en un nivel dado
            return true;
        }

        boolean left = printLevel(root.hijoizq, level - 1);
        boolean right = printLevel(root.hijoder, level - 1);

        return left || right;
    }

    // Función para imprimir el recorrido del orden de nivel de un árbol binario dado
    public void levelOrderTraversal(nodoarbol root)
    {
        // comienza desde el nivel 1 — hasta la altura del árbol
        int level = 1;

        // ejecutar hasta que printLevel() devuelva falso
        while (printLevel(root, level)) {
            level++;
        }
    }
    public nodoarbol eliminarRecursivo(nodoarbol nodo, String valor){
        nodoarbol aux = nodo;

        if (aux == null) {
            return aux;
        }

        if(valor.compareTo(aux.dato) < 0) {
            aux.hijoizq = eliminarRecursivo(aux.hijoizq, valor);
        }
        else if(valor.compareTo(aux.dato) > 0){
            aux.hijoder = eliminarRecursivo(aux.hijoder, valor);
        }
        else {
            if(aux.hijoizq == null && aux.hijoizq == null){
                aux = null;
            }
            else if(aux.hijoder == null){
                aux = aux.hijoizq;
            }
            else if(aux.hijoizq == null){
                aux = aux.hijoder;
            }
            else {
                nodoarbol auxNodoHojaIzq  = encontrarNodoMasIzquierda(aux.hijoder);
                aux.dato = auxNodoHojaIzq.dato;
                aux.hijoder = eliminarRecursivo(aux.hijoder, auxNodoHojaIzq.dato);
            }
        }

        return aux;
    }
    private nodoarbol encontrarNodoMasIzquierda(nodoarbol nodo) {
        nodoarbol aux = nodo;

        while(aux.hijoizq != null){
            aux = aux.hijoizq;
        }

        return aux;
    }

    public nodoarbol encontrar(nodoarbol nodo, String valor){
        nodoarbol aux = nodo;

        if (aux == null) {
            return aux;
        }

        if(valor.compareTo(aux.dato) < 0) {
            aux.hijoizq = eliminarRecursivo(aux.hijoizq, valor);
        }
        else if(valor.compareTo(aux.dato) > 0){
            aux.hijoder = eliminarRecursivo(aux.hijoder, valor);
        }
        else {
            if(aux.hijoizq == null && aux.hijoizq == null){
                aux = null;
            }
            else if(aux.hijoder == null){
                aux = aux.hijoizq;
            }
            else if(aux.hijoizq == null){
                aux = aux.hijoder;
            }
            else {
                nodoarbol auxNodoHojaIzq  = encontrarNodoMasIzquierda(aux.hijoder);
                aux.dato = auxNodoHojaIzq.dato;
                aux.hijoder = eliminarRecursivo(aux.hijoder, auxNodoHojaIzq.dato);
            }
        }

        return aux;
    }
}
