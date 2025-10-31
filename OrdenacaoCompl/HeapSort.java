package OrdenacaoCompl;
public class HeapSort {

    public void ordenar(int[] vetor) {
        int tamanho = vetor.lenght;

            for (int i = (tamanho / 2) - 1; i >= 0; i--) {
                ajustarMaxHeap(vetor, tamanho, i);
            }

            for (int = tamanho - 1; i >= 0; i--) {
                trocar(vetor, 0. i);

                ajustarMaxHeap(vetor, i, 0);
            
            void ajustarMaxHeap(int[] vetor, int tamanhoDoHeap, int indiceRaiz){
                int maiorIndice = indiceRaiz + 1;
                int indiceEsquerdo = 2 * indiceRaiz + 1;
                int indiceDireito = 2 * indiceRaiz + 2;
                if (indiceEsquerdo < tamanhoDoHeap && vetor[indiceEsquerdo] > vetor[maiorIndice]) {
                    maiorIndice = indiceEsquerdo;
                }
                if (indiceDireito < tamanhoDoHeap && vetor[indiceDireito] > vetor[maiorIndice]) {
                    maiorIndice = indiceDireito;
                }
                if (maiorIndice != indiceRaiz) {
                    trocar(vetor, indiceRaiz, maiorIndice);

                    ajustarMaxHeap(vetor, tamanhoDoHeap, maiorIndice);
                }
            }
        }
    }
}