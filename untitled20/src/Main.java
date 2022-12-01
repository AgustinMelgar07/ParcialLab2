import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int opcion=0;
        int elemento;
        String nombre;
        arbol arbolito= new arbol();
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1agregar un nodo\n"
                                +"2 inOrden\n"
                                +"3 preorden\n"
                                +"4 postorden\n"
                                +"5 buscar un nod en el arbol\n"
                                +"6 salir\n"
                                +"eligen una opcion", "arboles binarios",JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero del nodo", "agregar nodo", JOptionPane.QUESTION_MESSAGE));

                        arbolito.agregarnodo(elemento);
                        break;
                    case 2:
                        if (!arbolito.estavacio()) {
                            arbolito.inorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio", "vaacio", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 3:
                        if (!arbolito.estavacio()) {
                            arbolito.preorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio",
                                    "vaacio", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 4:
                        if (!arbolito.estavacio()) {
                            arbolito.postorden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio",
                                    "vaacio", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 5:
                        if (!arbolito.estavacio()) {
                            int num;
                            num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nodo que quiera buscar",
                                    "buscar nodo", JOptionPane.QUESTION_MESSAGE));
                            arbolito.buscarnodo(num);
                            if (arbolito.buscarnodo(num) == null) {
                                JOptionPane.showMessageDialog(null, "nodo no encontrado", "F", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("nodo encontrado");
                            }
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizda", "F", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    default:
                        JOptionPane.showMessageDialog(null,"opcion incorrecta ","F",JOptionPane.INFORMATION_MESSAGE);

                }

            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error"+n.getMessage());
            }
        }while (opcion!=7);
    }
}
