import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*es una coleccion ordenada de elementos a los cuales solo se pueden
        acceder por un unico lugar o extremo de la pila. los elementos se añaden o se quitan
        (borran ) de la pila solo por su parte superior (cima). este es el caso de una pila
        de plato, una pila de libros, etc
         */

        /*las pilas se pueden representar de dos formas
        por memoria estatica(arreglos(vectores))
        o memorias dinamicas (arraylist y nodos)
        */

        int opcion=0;
        int elemento,tamaño;
        boolean estado = false;
        try {
tamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"de que taño queire que sea la pila","solicitando el tamaño",JOptionPane.INFORMATION_MESSAGE));
        Pila pilita = new Pila(tamaño);
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 empujar elemento\n"
                    +"2 sacar un elemnto de la pila\n"
                    +"3 la pila esta vacia?\n"
                    +"4 la pila esta llena??\n"
                    +"5 que elemento esta en la cima?\n"
                    +"6 tamaño de la pila\n"
                    +"7 salir\n"
                    +"solicitando el tamaño",
                    JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese elemento a empujar en la pila","empujando",JOptionPane.INFORMATION_MESSAGE));
                    if (!pilita.estallena()){
                        pilita.empujar(elemento);
                    }else {

                        JOptionPane.showMessageDialog(null,"esta llena","pila llena",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese elemento a empujar en la pila","empujando",JOptionPane.INFORMATION_MESSAGE));

                    pilita.buscar(elemento);
                    break;
                case 3:
                    if (pilita.estaVacio()){
                        JOptionPane.showMessageDialog(null,"esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(null,"no esta vacia","pila no vacia",JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 4:
                    if (pilita.estallena()){
                        JOptionPane.showMessageDialog(null,"esta llena","pila llena",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(null,"no esta llena","pila no llena",JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 5:
                    if (!pilita.estaVacio()){
                        JOptionPane.showMessageDialog(null,"el elemnto que esta en la cima es"+pilita.cima," elemnto cima",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(null,"esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"el tamaño de la pila es"+pilita.tamañopila()," tamaño pila",JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"aplicacion finalizada","fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"opcion incorrecta","error",JOptionPane.INFORMATION_MESSAGE);


            }
        }while (opcion !=7);
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null,"error"+ n.getMessage());
        }
    }
}
