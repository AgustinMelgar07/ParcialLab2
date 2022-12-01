public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] vertice={"1","2","3","4","5"};
        Grafos grafo1=new Grafos(vertice);
        grafo1.conectarVerticesDistintas("1","2");
        grafo1.conectarVerticesDistintas("1","4");

        grafo1.conectarVerticesDistintas("2","3");
        grafo1.conectarVerticesDistintas("4","5");
        grafo1.conectarVerticesDistintas("2","5");

        grafo1.imprimir();

        Grafos grafo2=new Grafos(vertice);

        grafo1.conectarVerticesDistintas("1","2");
        grafo1.conectarVerticesDistintas("2","3");

        grafo1.conectarVerticesDistintas("4","5");


    }
}
