package ChristmasPresents;


import java.util.HashSet;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creo insieme di regali senza duplicati
        HashSet<String> presents = new HashSet<>();

        boolean stop = false;
        while (!stop) {
            System.out.println("insert new present? (y/n)");
            String answer = scanner.nextLine();
            switch (answer) {
                case "y":
                    //aggiungo regalo
                    System.out.println("Present: ");
                    String present = scanner.nextLine();
                    boolean added = presents.add(present);
                    System.out.println(presents);


                    if (!added) {
                        System.out.println("Present already added");
                    }
                    break;
                case "n":
                    stop = true;
                    break;
            }
        }
        System.out.println(presents);
        scanner.close();
    }
}
