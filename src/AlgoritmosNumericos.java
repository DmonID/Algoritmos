public class AlgoritmosNumericos {

    private int n;

    public AlgoritmosNumericos(int n) {
        this.n = n;
    }

    public int[] calcularPrimos() {
        int[] primos = new int[n];
        int contador = 0;
        int numero = 2;
        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    public int[] calcularFibonacci() {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AlgoritmosNumericos algoritmos = new AlgoritmosNumericos(100);

        int[] primos = algoritmos.calcularPrimos();
        System.out.println("Números primos:");
        for (int primo : primos) {
            System.out.print(primo + ", ");
        }

        System.out.println("\nSucesión de Fibonacci:");
        int[] fibonacci = algoritmos.calcularFibonacci();
        for (int fibo : fibonacci) {
            System.out.print(fibo + ", ");
        }
    }
}
