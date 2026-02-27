public class BubbleSortOptimizado {

    // Método Bubble Sort optimizado
    public static void bubbleSortOptimizado(int[] arr) {
        int n = arr.length;
        int ultimoIntercambio;

        while (n > 0) {
            ultimoIntercambio = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    ultimoIntercambio = i;
                }
            }

            n = ultimoIntercambio;
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        bubbleSortOptimizado(datos);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(datos);
    }
}