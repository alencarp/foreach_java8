package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Às vezes é melhor usar matrizes de tamanho dinâmico. ArrayList do Java pode fornecer esse recurso.
 * Tente resolver este problema usando ArrayList.
 * Você recebe "n" linhas. Em cada linha existem zero ou mais inteiros.
 * Você precisa responder a algumas perguntas onde precisa informar o número localizado na posição "y" da linha "x".
 *
 * Obtenha seu input do System.in.
 *
 * Formato de entrada
 * A primeira linha possui um inteiro “n”. Em cada uma das próximas “n” linhas haverá um inteiro “d” denotando o número
 * de inteiros naquela linha e então haverá “d” inteiros separados por espaço. Na próxima linha haverá um número
 * inteiro "q" denotando o número de consultas. Cada consulta consistirá em dois inteiros "x" e "y".
 *
 *Constraints
 * 1 <= n <= 20000
 * 0 <= d <= 50000
 * 1 <= q <= 1000
 * 1 <= x <= n
 *
 * Cada número caberá em um número inteiro assinado.
 * O número total de inteiros em “n” linhas não ultrapassará 10 elevado a 5ª potência.
 *
 * Formato de saída
 * Em cada linha, imprima o número localizado na posição “y” da linha “x”.
 * Caso não exista tal posição, basta imprimir "ERROR!"
 */
public class ExercicioArrayList {

    public static void main(String[] args) {
        List<String> numeros;
        List<List<String>> matriz = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int numeroLinhas = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i <= numeroLinhas; i++) {
            String linha = scanner.nextLine();
            numeros = Arrays.asList(linha.split(" "));
            matriz.add(numeros);
            System.out.println(numeros);
        }
        System.out.println("MATRIZ: " + matriz.get(0).get(3));
        System.out.println("MATRIZ: " + matriz.get(2).get(4));
        System.out.println("MATRIZ: " + matriz.get(2).get(1));

        int numeroTentativas = scanner.nextInt();
        System.out.println("TENTATIVAS: " + numeroTentativas);
        scanner.nextLine();

        for (int i = 0; i < numeroTentativas; i++) {
            String linhaCoordenadas = scanner.nextLine();

            List<String> coordenadas = Arrays.asList(linhaCoordenadas.split(" "));
            Integer coordenadaX = Integer.parseInt(coordenadas.get(0));
            Integer coordenadaY = Integer.parseInt(coordenadas.get(1));

            System.out.println("coordenadaX = " + coordenadaX);
            System.out.println("coordenadaY = " + coordenadaY);

            System.out.println("Coordenadas: " + coordenadas);

            System.out.println("(" + matriz.get(coordenadaX - 1).get(coordenadaY) + ")");
        }

    }

}
