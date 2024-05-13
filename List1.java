import java.util.Arrays;

public class List1 {
    public static void main(String[] args) {
        // Teste das funções
        System.out.println("1. Par: " + ehPar(6));
        System.out.println("2. Fatorial: " + calcularFatorial(5));
        int[] vetor = {3, 8, 2, 10, 5};
        System.out.println("3. Máximo: " + encontrarMaximo(vetor));
        String str = "Java é uma linguagem de programação";
        System.out.println("4. Vogais: " + contarVogais(str));
        int[] vetorPares = filtrarPares(vetor);
        System.out.println("5. Pares: " + Arrays.toString(vetorPares));
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("6. Média: " + calcularMediaMatriz(matriz));
        String nomeCompleto = "João Silva";
        System.out.println("7. Primeiro Nome: " + primeiroNome(nomeCompleto));
        int[] maioresQueN = filtrarMaioresQueN(vetor, 5);
        System.out.println("8. Maiores que N: " + Arrays.toString(maioresQueN));
        System.out.println("9. MDC: " + calcularMDC(24, 36));
        System.out.println("10. Primo: " + ehPrimo(2));
    }

    // 1. Verificar se um número é par
    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }

    // 2. Calcular o fatorial de um número
    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * calcularFatorial(num - 1);
    }

    // 3. Encontrar o valor máximo em um vetor de inteiros
    public static int encontrarMaximo(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    // 4. Contar vogais em uma string
    public static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // 5. Filtrar números pares de um vetor
    public static int[] filtrarPares(int[] vetor) {
        return Arrays.stream(vetor)
                     .filter(num -> num % 2 == 0)
                     .toArray();
    }

    // 6. Calcular o valor médio de uma matriz
    public static double calcularMediaMatriz(int[][] matriz) {
        int total = 0;
        int count = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                total += elemento;
                count++;
            }
        }
        if (count != 0) {
            return (double) total / count;
        } else {
            return 0.0;
        }
    }

    // 7. Obter o primeiro nome de um nome completo
    public static String primeiroNome(String nomeCompleto) {
        return nomeCompleto.split(" ")[0];
    }

    // 8. Filtrar números maiores que N de um vetor
    public static int[] filtrarMaioresQueN(int[] vetor, int n) {
        return Arrays.stream(vetor)
                     .filter(num -> num > n)
                     .toArray();
    }

    // 9. Calcular o máximo divisor comum
    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMDC(b, a % b);
        }
    }

    // 10. Verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}