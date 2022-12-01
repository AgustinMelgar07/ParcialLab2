import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*un arbol es un estructura de datos no lineal
        se utiliza para representar fomular algebraicas, organizar obnjetos
        inteligencia artificual y algoritmos cifrado
        */
        /*esta compuesto por un conjunto finito de nodos t consta
        de un conjunto finito de lineas(ramas)
        */
        /*nodo sin hijos (hoja) con hijos son los padres */
        /*
        los arboles binarios solo pueden tener dos o menos hijos
        y los narios mas de dos
        un arbol binario es una estructura recusriva. porque cada nodo es la riaz de su
        propio subarbol y tiene hijos que son
        raices de arboles, llamados subarboles
        derecho e izquierdo del nodo, respectivamente
        */

        /*
        recorrido de un arbol biario
        inorden:para recorrer un arbol binario no vacio inorden, hay que realizar las siguientes operaciones
        recursivamente en cada nodo
        1 recorrer el subarol izquierdo inorden
        2 examinar la raiz
        3 recorrer el subarbol derecho inorden
        Recorrido de un arbol con preOrden
        para recorrer un arbol en preorden hay qeu seguir los isguientes pasos:
        1examinar raiz
        2 recorrer el subarbol izq en preorden
        3 recorrer el subarbol derechoi en preorden

        para  recorrer un arbol en postorden hay que seguir los siguientes pasos:
        1 recorrer el subarbol izquierdo en post
        2 recorrer el subarbol derecho en post
        3 examinar la raiz




        */
        int opcion=0;
        int elemento;
        String nombre;
        arbolbinario arbolito= new arbolbinario();
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1agregar un nodo\n"
                                +"2 inOrden\n"
                                +"3 preorden\n"
                                +"4 postorden\n"
                                +"5 buscar un nod en el arbol\n"
                                +"6 buscar y eliminar nod un en el arbol\n"
                                +"7 salir\n"
                                +"eligen una opcion", "arboles binarios",JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero del nodo","agregar nodo",JOptionPane.QUESTION_MESSAGE));
                        nombre= JOptionPane.showInputDialog(null,"ingrese nombre del nodo","agregar nodo",JOptionPane.QUESTION_MESSAGE);

                        arbolito.agregarnodo(elemento,nombre);
                        break;
                    case 2:
                        if (!arbolito.estavacio()){
                            arbolito.inorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,"el arbol esta vacio","vaacio",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 3:
                        if (!arbolito.estavacio()){
                            arbolito.preorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,"el arbol esta vacio",
                                    "vaacio",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 4:
                        if (!arbolito.estavacio()){
                            arbolito.postorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,"el arbol esta vacio",
                                    "vaacio",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 5:
                        if (!arbolito.estavacio()){
                            elemento= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el nodo que quiera buscar",
                                    "buscar nodo",JOptionPane.QUESTION_MESSAGE));
                            arbolito.buscarnodo(elemento);
                            if (arbolito.buscarnodo(elemento)==null){
                                JOptionPane.showMessageDialog(null,"nodo no encontrado","F",JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                System.out.println("nodo encontrado"+"sus datos son: "+ arbolito.buscarnodo(elemento));
                            }
                        }
                        break;
                    case 6:
                        if (!arbolito.estavacio()){
                            elemento= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el nodo que quiera eliminar",
                                    "elminar nodo",JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.eliminar(elemento)==false){
                                JOptionPane.showMessageDialog(null,"nodo no encontrado","F",JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                JOptionPane.showMessageDialog(null,"el nodo a sido elimindado","no F",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"aplicacion finalizda","F",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"opcion incorrecta ","F",JOptionPane.INFORMATION_MESSAGE);

                }

            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error"+n.getMessage());
            }
        }while (opcion!=7);
    }
}
