public class Grafo {

    int[][] matrizPesos;
    String[] vertices;

    public Grafo(String[] vertices) {
        this.vertices = vertices;
        matrizPesos = new int[vertices.length][vertices.length];
    }

    public void conectarConsigoMisma(String v1, String v2) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        int i =0;
        if (index1==index2){
            if (matrizPesos[index1][index2]==2){
                return;
            }else if ( matrizPesos[index1][index2]==1){
                ;
                matrizPesos[index1][index2]++;
            }else if (index1 != -1 && index2 != -1) {
                i++;
                matrizPesos[index1][index2] = i;
            }
        } else {
            return;
        }


    }

    public void imprimir() {
        System.out.println("   "+vertices[0]+" "+vertices[1]+" "+vertices[2]+" "+vertices[3]+" "+vertices[4]+" " +vertices[5]);

        for (int i = 0; i < matrizPesos.length; i++) {
            System.out.print(vertices[i]+"  ");

            for (int j = 0; j < matrizPesos.length; j++) {
                System.out.print(matrizPesos[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int busquedaIndex(String v) {
        int resultado = -1;

        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(v)) {
                resultado = i;
                break;
            }
        }

        return resultado;
    }
    public void conectarVerticesDistintas(String v1, String v2) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        int i =0;
        if (index1!=index2) {

            if (matrizPesos[index1][index2] == 2) {
                return;
            } else if (matrizPesos[index1][index2] == 1) {
                ;
                matrizPesos[index1][index2]++;
            } else if (index1 != -1 && index2 != -1) {
                i++;
                matrizPesos[index1][index2] = i;
            }
        }


    }
    public void EliminarConexionentreDosVerticesdistintas(String v1, String v2) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        int i =0;
        if (index1!=index2) {
            if (matrizPesos[index1][index2] >0) {
                matrizPesos[index1][index2]=matrizPesos[index1][index2]-1;
            }else {
                return;
            }
        }


    }
    public void Adyacencia(String v1){
        int index1 = busquedaIndex(v1);
            for(int j=0; j< matrizPesos.length; j++){
                if (matrizPesos[index1][j]!=0) {
                    System.out.print("Se recorrio los caminos" +vertices[index1] + "-->" + vertices[j] + "\n");
                }
            }

            System.out.println();
        }

    public void CaminosPOsibles(String v1){
        int index1 = busquedaIndex(v1);
        for(int j=0; j< matrizPesos.length; j++){
            if (matrizPesos[index1][j]==0) {
                System.out.print("Se recorrio los caminos" + vertices[index1] + "-->" + vertices[j] + "\n");
            }
        }

        System.out.println();
    }
    }
