public class Main {

    public static void main(String[] args) {
	// write your code here
        Pila p=new Pila();
        p.apilar("ola");
        p.apilar("excel");
        p.apilar("!!!!");
        p.imprimir();

        System.out.println("________");

        String valor = p.desapilar();
        System.out.println(valor);
        p.imprimir();
    }
}
