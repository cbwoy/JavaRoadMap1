import java.util.Scanner;

public class Main {

    static void main(String[]args) {
        for(int i=0;i<22;i++){
            System.out.print("=");
        }
        System.out.println(
                "\nWelcome to my RoadMap\n" +
                "Ejercicio número 1\n" +
                "Piedra Papel o Tijera");

        for(int i=0;i<22;i++){
            System.out.print("=");
        }

        Scanner sc = new Scanner(System.in);
        int theLordRuler = 0;
        int lose = 0;
        int win = 0;

        while (win != 2 && lose != 2) {
            String playerOption;

            do {
                System.out.println("\nElige piedra, papel o tijera");
                playerOption = sc.nextLine().toLowerCase();

                if (!playerOption.equals("piedra")
                    && !playerOption.equals("tijera")
                    && !playerOption.equals("papel")) {
                    System.out.println("Pensaba que tú y yo podríamos llevarnos bien");
                    theLordRuler++;
                }
            } while (!playerOption.equals("piedra")
                     && !playerOption.equals("tijera")
                     && !playerOption.equals("papel"));

            String[] npcSays = {"piedra", "tijera", "papel"};
            int npcOption = (int) (Math.random() * 3);
            String npcChoice = npcSays[npcOption];

            System.out.println("\nEl Lord Legislador eligió: " + npcChoice);

            if (npcChoice.equals(playerOption)) {
                System.out.println("\nEsta partida no cuenta");
            } else if (
                    (playerOption.equals("piedra") && npcChoice.equals("tijera"))
                    || (playerOption.equals("papel") && npcChoice.equals("piedra"))
                    || (playerOption.equals("tijera") && npcChoice.equals("papel"))
            ) {
                System.out.println("\nVictoria");
                win++;
            } else {
                System.out.println("\nDerrota");
                lose++;
            }
        }

        System.out.println(
                """
                        
                        Como sabes, las partidas a piedra, papel o tijera
                        son siempre siempre siempre al mejor de tres"""
        );

        if (win > lose) {
            System.out.println(
                    "\nEsta vez has ganado.\n" +
                    "Pero que no se te suba a la cabeza, rata infecta."
            );
        } else {
            System.out.println("\nNadie puede superar al Lord Legislador");
            System.out.println("Vuelve al trabajo, escoria skaa");
        }
        for(int i=0;i<22;i++){
            System.out.print("=");
        }
        System.out.println("\nManos ganadas [" + win + "]");
        System.out.println("Manos perdidas [" + lose + "]");
        for(int i=0;i<22;i++){
            System.out.print("=");
        }

        if (theLordRuler > 0) {
            System.out.println("\nHas intentado jugármela [" + theLordRuler + "]");
            System.out.println("Pero los inquisidores están atentos a tus sucios trucos");
        }

        sc.close();
    }
}