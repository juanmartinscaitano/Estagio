import java.util.Scanner;

public class ExisteA {
    public static void main(String[] args) {
        String contem = "Sim, tem a letra 'a' na palvra/frase! ";
        String naoContem = "Não tem a letra 'a' na palvra/frase! ";

        System.out.println("Digite uma palavra/frase: ");
        String existeA = new Scanner(System.in).nextLine();
        if (existeA.contains("a") || existeA.contains("A")) {
            System.out.println(contem);
        } else
            System.out.println(naoContem);


    }
}

// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar
// a quantidade de vezes em que ela ocorre.
//IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
