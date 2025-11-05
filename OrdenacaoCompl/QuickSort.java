public class QuickSort {
    public static void main(String[] args) {
        
    }

    public void ordenar(int[] vetor) {
        if (vetor == null || vetor.length == 0) return;

        int indiceInicio = 0;
        int indiceFim = vetor.length - 1;
        quickSort(vetor, indiceInicio, indiceFim);
    }

    public void quickSort(int[] vetor, int indiceInicio, int indiceFim) {
        if (indiceInicio < indiceFim) {
            int indicePivo = particionar(vetor, indiceInicio, indiceFim);

            quickSort(vetor, indiceInicio, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, indiceFim);
        }
    }
    
    private int particionar(int[] vetor, int indiceInicio, int indiceFim) {
        int pivo = vetor[indiceFim];
        int i = (indiceInicio - 1);

        for (int j = indiceInicio; j < indiceFim; j++) {
            if (vetor[j] <= pivo) {
                i++;

                trocar(vetor, i, j);
            }
        }

        trocar(vetor, i + 1, indiceFim);

        return i + 1;
    }
}


