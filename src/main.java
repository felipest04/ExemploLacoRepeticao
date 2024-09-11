/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //inicialização; condição; incremento
        // ++ -> vai somar +1 i = i +1
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do Player 1: " +i);
            nomesJogadores[i] = sc.next();
        }

        //Pedir o nome do time A
        //Pedir os nomes do time A - 5 nomes
        //Pedir o nome do time B
        //Pedir os nomes do time B - 5 nomes


    }
}*/

/*import java.util.Scanner;

    public class main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do time A:");
        String nomeTimeA = scanner.nextLine();

        System.out.println("Quantos jogadores o time A tem?");
        int numJogadoresTimeA = scanner.nextInt();
        scanner.nextLine();

        String[] jogadoresTimeA = new String[numJogadoresTimeA];

        for (int i = 0; i < numJogadoresTimeA; i++) {
            System.out.println("Digite o nome do jogador " + (i + 1) + " do time A:");
            jogadoresTimeA[i] = scanner.nextLine();
        }

        System.out.println("Digite o nome do time B:");
        String nomeTimeB = scanner.nextLine();

        System.out.println("Quantos jogadores o time B tem?");
        int numJogadoresTimeB = scanner.nextInt();
        scanner.nextLine();

        String[] jogadoresTimeB = new String[numJogadoresTimeB];

        for (int i = 0; i < numJogadoresTimeB; i++) {
            System.out.println("Digite o nome do jogador " + (i + 1) + " do time B:");
            jogadoresTimeB[i] = scanner.nextLine();
        }

        System.out.println("Time A: " + nomeTimeA);
        System.out.println("Jogadores do time A:");
        for (int i = 0; i < jogadoresTimeA.length; i++) {
            System.out.println("- " + jogadoresTimeA[i]);
        }

        System.out.println("Time B: " + nomeTimeB);
        System.out.println("Jogadores do time B:");
        for (int i = 0; i < jogadoresTimeB.length; i++) {
            System.out.println("- " + jogadoresTimeB[i]);
        }

        scanner.close();
    }
}*/
