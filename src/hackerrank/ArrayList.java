package hackerrank;

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
public class ArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        ArrayList<String> lista = new ArrayList<String>();

        int n = scanner.nextInt();
    }

}
