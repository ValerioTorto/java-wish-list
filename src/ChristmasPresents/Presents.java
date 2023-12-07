package ChristmasPresents;

import java.util.ArrayList;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creo la lista dei regali
        ArrayList<String> presents = new ArrayList<>();
        System.out.println(presents.size());
        boolean stop = false;
        while (!stop) {
            // chiedo se vuole inserire un nuovo regalo
            System.out.print("Add a new present? (y/n)");
            String answer = scanner.nextLine();
            switch (answer) {
                case "y":
                    // inserisce nuovo regalo
                    System.out.print("Insert present: ");
                    String present = scanner.nextLine();
                    System.out.println(presents);
                    // aggiungo il nome alla lista
                    presents.add(present);

                    boolean added = presents.add(present);
                    if(!added){
                        System.out.println("Present already added");
                    }

                    break;
                case "n":
                    // esce
                    System.out.println("Here are your presents: " + presents);
                    stop = true;
                    break;
                default:
            }
        }
    }
}
