import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
                                +"6 salir\n"
                                +"eligen una opcion", "arboles binarios",JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero del nodo", "agregar nodo", JOptionPane.QUESTION_MESSAGE));
                        arbolito.insertarnodo(elemento,arbolito.getraiz());
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero del nodo", "agregar nodo", JOptionPane.QUESTION_MESSAGE));
                        if (!arbolito.estavacio()) {
                            arbolito.eliminar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio", "vaacio", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;

                    case 3:
                        if (!arbolito.estavacio()) {
                            arbolito.posorden(arbolito.getraiz());
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio",
                                    "vaacio", JOptionPane.INFORMATION_MESSAGE);

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
