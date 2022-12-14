public class Main {

    public static String vertices[]={"a","b","c","d","e","f","g"};
    public static int[][] pesos= {
            {0,4,2,999,999,999,0},
            {4,0,1,5,999,999,0},
            {2,1,0,8,10,999,0},
            {999,5,8,0,2,6,0},
            {999,999,10,2,0,2,0},
            {999,999,10,2,0,2,0},
            {999,999,999,6,2,0,0}};

    public static void main(String[] args){
        Grafo grafo = new Grafo(vertices, pesos);

        grafo.imprimir();

        grafo.calcularDijkstra();
    }

}