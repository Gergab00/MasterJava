package org.masterjava.programamanejodenombres;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        // Create a Scanner object to read from stdin
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the names of the people
        System.out.print("Enter the name of the first person: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the name of the second person: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the name of the third person: ");
        String name3 = scanner.nextLine();

        // Create the variables with the new names
        String newName1 = name1.substring(1, 2).toUpperCase() + "." + name1.substring(name1.length() - 2);
        String newName2 = name2.substring(1, 2).toUpperCase() + "." + name2.substring(name2.length() - 2);
        String newName3 = name3.substring(1, 2).toUpperCase() + "." + name3.substring(name3.length() - 2);


        // Print the new names separated by underscore
        System.out.println(newName1 + "_" + newName2 + "_" + newName3);
    }
}

