import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Exercicio: Quantas vezes a letra 'a' aparece numa frase
//equalsIgnoreCase() - para maíusculo/minúsculo
//tirar o acento.
public class Main {
    static final Collator instance = Collator.getInstance();
    static int cont = 0;

    public static int soma () {
        cont++;
        return cont;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String letraAContar = scanner.nextLine();

        List<String> letras = converteFraseParaListaDeLetras(frase);

//        foreachContains(letras, letraAContar);
//        foreachEqualsIgnoreCase(letras, letraAContar);
        foreachTiraAcento(letras, letraAContar);
    }

    //Separa a frase em letras (retorna um vetor de String) e transforma o vetor de String em um ArrayList
    public static List<String> converteFraseParaListaDeLetras(String frase) {
        List<String> letras = Arrays.asList(frase.split(""));
        return letras;
    }

    public static void foreachTiraAcento(List<String> letras, String letraAContar) {
        // Will print 0 because its EQUAL
//        System.out.println(instance.compare(a, b));

        // This strategy mean it'll ignore the accents and the case
        instance.setStrength(Collator.PRIMARY);

        letras.forEach(letra -> {
            if (instance.compare(letra, letraAContar) == 0) {
                System.out.println(letra);
                soma();
            };
        });
        System.out.println(cont);
    }

    public static void foreachContains(List<String> letras, String letraAContar) {
        letras.forEach(letra -> {
            //System.out.println(letra);
            if (letra.contains(letraAContar)){
                soma();
            };
        });
        System.out.println(cont);
    }

    public static void foreachEqualsIgnoreCase(List<String> letras, String letraAContar) {
        letras.forEach(letra -> {
                if (letra.equalsIgnoreCase(letraAContar)){
                    soma();
                }
        });
        System.out.println(cont);
    }

}