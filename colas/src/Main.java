import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int opcion=0,elemento=0;
        cola colita=new cola();
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1 insertar elemento en la cola\n"
                                +"2 sacar un elemnto en la cola\n"
                                +"3 la cola esta vacia?\n"
                                +"4 elemento ubicado al inicio\n"
                                +"5 tamaño de la cola?\n"
                                +"6 salir\n"
                                +"solicitando el tamaño",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese elemento a empujar en la cola","empujando",JOptionPane.INFORMATION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estavacia()){
                            JOptionPane.showMessageDialog(null,"El elemento obtenido es"+colita.quitar(),"quitando datos de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,"esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese elemento a empujar en la cola","empujando",JOptionPane.INFORMATION_MESSAGE));
                        colita.buscar(elemento);
                        break;
                    case 4:
                        if (!colita.estavacia()){
                            JOptionPane.showMessageDialog(null,"el elemento al inicio de la cola es"+colita.inicio,"inicio pila",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,"cola vacia","vacio",JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 5:

                            JOptionPane.showMessageDialog(null,"el tamaño de la cola ess"+colita.tamaño()," tamaño cola",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,"aplicacion finalizada","fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"opcion incorrecta","error",JOptionPane.INFORMATION_MESSAGE);


                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error"+ n.getMessage());
            }
        }while (opcion!=6);
    }
}
