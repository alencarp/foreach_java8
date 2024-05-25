import java.util.Arrays;
import java.util.List;

//Exercicio: Quantas vezes a letra 'a' aparece numa frase
//equalsIgnoreCase() - para maíusculo/minúsculo
//tirar o acento.
public class Main {

    static int cont = 0;

    public static int soma () {
        cont++;
        return cont;
    }

    public static void main(String[] args) {
        String frase = "Ola Munda!";

        //separando a frase em letras (retorna um vetor de String) e transformando o vetor de String em um ArrayList
        List<String> letras = Arrays.asList(frase.split(""));

        letras.forEach(letra -> {
            System.out.println(letra);
            if (letra.contains("a")){
                soma();
            };
        });
        System.out.println(cont);

    }
}