public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] vertice1={"A","B","C","D","E","F"};
        Grafo grafo= new Grafo(vertice1);
       grafo.conectarVerticesDistintas("A","E");
       grafo.conectarVerticesDistintas("A","B");
       grafo.conectarVerticesDistintas("A","F");
       grafo.conectarVerticesDistintas("B","A");
       grafo.conectarVerticesDistintas("B","E");
       grafo.conectarVerticesDistintas("B","C");
       grafo.conectarVerticesDistintas("C","B");
       grafo.conectarVerticesDistintas("C","E");
       grafo.conectarVerticesDistintas("C","D");
       grafo.conectarVerticesDistintas("D","E");
       grafo.conectarVerticesDistintas("D","F");
       grafo.conectarVerticesDistintas("D","C");
       grafo.conectarVerticesDistintas("E","B");
       grafo.conectarVerticesDistintas("E","A");
       grafo.conectarVerticesDistintas("E","F");
       grafo.conectarVerticesDistintas("E","D");
       grafo.conectarVerticesDistintas("E","C");
       grafo.conectarVerticesDistintas("F","A");
       grafo.conectarVerticesDistintas("F","E");
       grafo.conectarVerticesDistintas("F","D");
       grafo.imprimir();
       grafo.EliminarConexionentreDosVerticesdistintas("F","D");
       System.out.println("\n\n");
       grafo.imprimir();
       grafo.Adyacencia("A");
       grafo.CaminosPOsibles("A");






    }
}
