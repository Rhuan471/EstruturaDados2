public class SelectionSort {

    public static void main(String[] args) {
        int[] vetor = {25, 20, 22, 11, 8, 18};
        
        
        System.out.println("Array original:");
        imprimirVetor(vetor); // Função auxiliar para imprimir
        System.out.println("---");

        for (int selectionaux = 0; selectionaux < vetor.length - 1; selectionaux++) {
            
            int menorindice = selectionaux; 
            

            for (int auxindice = selectionaux + 1; auxindice < vetor.length; auxindice++) {
                

                if (vetor[auxindice] < vetor[menorindice]) {
                    menorindice = auxindice;
                }
            }
            
            int valoraux = vetor[selectionaux];
            vetor[selectionaux] = vetor[menorindice];
            vetor[menorindice] = valoraux;

            System.out.print("Passo " + (selectionaux + 1) + ": ");
            imprimirVetor(vetor);
        }

        System.out.println("---");
        System.out.println("Array final ordenado:");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
