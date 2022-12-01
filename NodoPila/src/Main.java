import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int opcion=0;
        int elemento;
        Pila pilita = new Pila();

        boolean estado = false;

            do {
                try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1 empujar elemento\n"
                                +"2 sacar un elemnto de la pila\n"
                                +"3 la pila esta vacia?\n"
                                +"4 vaciar pila\n"
                                +"5 que elemento esta en la cima?\n"
                                +"6 tamaño de la pila\n"
                                +"7 salir\n"
                                +"solicitando el tamaño",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese elemento a empujar en la pila","empujando",JOptionPane.INFORMATION_MESSAGE));
                        pilita.empujar(elemento);
                        break;
                    case 2:
                        if (!pilita.estavacia()){
                            JOptionPane.showMessageDialog(null,"El elemento obtenido es"+pilita.sacar(),"obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,"esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pilita.estavacia()){
                            JOptionPane.showMessageDialog(null,"esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,"no esta vacia","pila no vacia",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 4:
                        if (!pilita.estavacia()){
                        pilita.limpialpila();
                            JOptionPane.showMessageDialog(null,"la pila se a vaciado","vaciando pila",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,"no hya nada que vaciar","vacio",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 5:
                        if (!pilita.estavacia()){
                            JOptionPane.showMessageDialog(null,"el elemnto que esta en la cima es"+pilita.cima()," elemnto cima",JOptionPane.INFORMATION_MESSAGE);
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
            }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null,"error"+ n.getMessage());
        }
            }while (opcion !=7);

    }
}
