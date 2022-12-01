public class arbolbinario {
    private nodoarbol raiz;

    public arbolbinario (){
        raiz = null;// vacio
    }
    public boolean estavacio(){
        return raiz== null;
    }
    public nodoarbol getraiz(){
        return raiz;
    }

    //**********insertar nodo*************

    public void insertarnodo (int dato, nodoarbol nodo){
        if (estavacio ()) {
            nodoarbol nuevo = new nodoarbol (dato);
            raiz= nuevo;
        }else{
            if (dato<nodo.getDato()) {//izquierda
                if (nodo.getHijoizquierdo()==null) {
                    nodoarbol nuevo = new nodoarbol(dato);
                    nodo.setHijoizquierdo(nuevo);
                }else{//no es nulo
                    insertarnodo(dato,nodo.getHijoizquierdo());
                }

            }else{//no es menor
                if (dato>nodo.getDato()) {// derecha
                    if (nodo.getHijoderecho()==null) {
                        nodoarbol nuevo = new nodoarbol(dato);
                        nodo.setHijoderecho(nuevo);
                    }else{//no es nulo
                        insertarnodo(dato,nodo.getHijoderecho());
                    }
                }else{
                    System.out.println("dato repetido "+dato);
                }
            }
        }
    }
    public void inorden(nodoarbol ra){
        if (ra != null) {
            inorden(ra.getHijoizquierdo());
            System.out.print(ra.dato+ " ");
            inorden(ra.getHijoderecho());
        }
    }

    //**********preorden*****raiz, izq,dere*

    public void preorden(nodoarbol ra){
        if (ra != null) {
            System.out.print(ra.dato+" ");
            preorden(ra.getHijoizquierdo());
            preorden(ra.getHijoderecho());
        }
    }

    ///********** posorden*****izq,dere,raiz

    public void posorden(nodoarbol ra){
        if (ra != null) {
            posorden(ra.getHijoizquierdo());
            posorden(ra.getHijoderecho());
            System.out.print(ra.dato+" ");
        }
    }


    public nodoarbol buscar (int dato){
        nodoarbol extra = raiz;
        while   (extra.getDato()!= dato){
            if (dato<extra.dato) {//si es menor
                extra = extra.getHijoizquierdo();
            }else{// si es mayor
                extra = extra.getHijoderecho();
            }
            if (extra == null) {// no hay nodo
                return null;
            }
        }return extra;// si se encontro
    }
    public boolean eliminar (int dato){
        nodoarbol aux = raiz;
        nodoarbol padre = raiz;
        boolean eshijoizq = (aux.getHijoizquierdo()!= null);
        while   (aux.getDato()!= dato){
            padre = aux;
            if (dato<aux.dato) {//si es menor
                aux = aux.getHijoizquierdo();
                eshijoizq = true;
            }else{// si es mayor
                aux = aux.getHijoderecho();
                eshijoizq = false;
            }
            if (aux == null) {// no hay nodo
                return false;
            }
        }//fin mientras
        if (aux.hoja()) {     //hoja
            eliminarhoja(padre,aux,eshijoizq);
        }else{                    //un hijo
            if (aux.getHijoizquierdo()== null || aux.getHijoderecho()== null) {
                unhijo(padre,aux,eshijoizq);
            }else{                   // 2 hijos
                doshijos(padre,aux,eshijoizq);
            }

        }return true;
    }

////caso 1 *************************

    private void eliminarhoja(nodoarbol padre, nodoarbol aux, boolean eshijoizq) {
        if (aux == raiz) {
            raiz = null;
        }else{
            if (eshijoizq) {
                padre.setHijoizquierdo(null);
            }else{
                padre.setHijoderecho(null);
            }
        }
    }

    private void unhijo(nodoarbol padre, nodoarbol aux, boolean eshijoizq) {
        if (aux == raiz) {
            if (aux.getHijoizquierdo()== null) {
                raiz= aux.getHijoderecho();
            }else{
                raiz= aux.getHijoizquierdo();
            }
        }else{
            if (eshijoizq) {
                if (aux.getHijoizquierdo()==null) {//derecho
                    padre.setHijoizquierdo(aux.getHijoderecho());
                }else{//izquierdo
                    padre.setHijoizquierdo(aux.getHijoizquierdo());
                }
            }else{
                if (aux.getHijoizquierdo()==null) {//derecho
                    padre.setHijoderecho(aux.getHijoderecho());
                }else{//izquierdo
                    padre.setHijoderecho(aux.getHijoizquierdo());
                }
            }
        }

    }
    private void doshijos(nodoarbol padre, nodoarbol aux, boolean eshijoizq) {
        nodoarbol nodo = reemplazoderecho(aux);
        if (aux == raiz) {
            raiz = nodo;
        }else{
            if (eshijoizq) {
                padre.setHijoizquierdo(nodo);
            }else{
                padre.setHijoderecho(nodo);
            }
        }nodo.setHijoizquierdo(aux.getHijoizquierdo());
    }

// remplazo menor de los mayores

    private nodoarbol reemplazoderecho(nodoarbol aux) {
        nodoarbol padre = aux;
        nodoarbol auxiliar =aux.getHijoderecho();
        nodoarbol rem = aux;
        while (auxiliar !=null){
            padre = rem;
            rem = auxiliar;
            auxiliar = auxiliar.getHijoizquierdo();
        }if (rem!= aux.getHijoderecho()) {
            padre.setHijoizquierdo(rem.getHijoderecho());
            rem.setHijoderecho(aux.getHijoderecho());
        }
        System.out.println("\n EL NODO REMPLAZO ES : "+ rem.getDato());
        return rem;
    }



}
