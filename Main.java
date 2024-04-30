import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char respostaUsuario;
        String nome;
        int maxPerguntas = 5;
        int usuarioPontos = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        nome = scan.nextLine();

        char[] gabarito = {'a', 'c', 'b', 'a', 'c'};

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Pergunta 1: Qual a maior estrela do nosso sistema solar?");
        perguntas.add("Pergunta 2: Qual a primeira letra do nosso alfabeto?");
        perguntas.add("Pergunta 3: 2x10 eh igual a?");
        perguntas.add("Pergunta 4: O fantastico mundo de ___. (desenho dos anos 80)");
        perguntas.add("Pergunta 5: Valor de PI?");

        ArrayList<String> alternativas = new ArrayList<>();
        alternativas.add("a) Sol  |  b) Lua  | c) Marte");
        alternativas.add("a) Z    |  b) C    | c) A");
        alternativas.add("a) 10   |  b) 20   | c) 12");
        alternativas.add("a) Bob  |  b) Carl | c) Zec");
        alternativas.add("a) 3.10 |  b) 3    | c) 3.14");

        for (int i = 0; i < maxPerguntas; i++) {
            System.out.println(perguntas.get(i));
            System.out.println(alternativas.get(i));
            System.out.print("Qual é a sua resposta? ");
            respostaUsuario = scan.next().charAt(0);

            if (gabarito[i] == respostaUsuario) {
                usuarioPontos += 2;
            }
            
        }

        if (usuarioPontos >= 7) {
            System.out.printf("Parabéns, %s! Você foi aprovado com um total de %d pontos.", nome, usuarioPontos);
        } else {
            System.out.printf("Que pena, %s! Você foi reprovado com um total de %d pontos.", nome, usuarioPontos);
        }

        scan.close();

    }
}
