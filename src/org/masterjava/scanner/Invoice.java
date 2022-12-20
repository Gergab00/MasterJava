package org.masterjava.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.HashMap;

public class Invoice {

    private static final int CONSOLE_WIDTH = 120;
    private static final String BORDER_CHARACTER = "=";
    private static final int BORDER_WIDTH =  CONSOLE_WIDTH - 2;
    private static final String HEADER_MESSAGE = "Invoicing system";
    private static final int MAX_LENGTH = CONSOLE_WIDTH - 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> map = new HashMap<>();

        System.out.print("\033[8;40;" + CONSOLE_WIDTH + "t");

        printHeader();

        System.out.print("Enter a numeric ID for your invoice: ");
        int id = scanner.nextInt();
        map.put("id", id);
        scanner.nextLine();

        do {
            System.out.print("Enter the date of your invoice (dd/MM/yyyy): ");

            try {
                String dateSt = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateSt, formatter);
                map.put("date", date);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("The entered date does not have the correct format (dd/MM/yyyy).");
            }
        } while(true);

        System.out.print("Enter the name for whom the invoice is issued: ");
        String name = scanner.nextLine();
        map.put("name", name);

        System.out.print("Enter the description of the product to be invoiced: ");
        String description = scanner.nextLine();
        map.put("description", description);

        System.out.print("Enter the total amount of the invoice: ");
        Double amount = scanner.nextDouble();
        scanner.nextLine();
        map.put("amount", amount);

        System.out.print("Enter the other description of the product to be invoiced: ");
        String description_2 = scanner.nextLine();
        map.put("description_2", description_2);

        System.out.print("Enter the other total amount of the invoice: ");
        Double amount_2 = scanner.nextDouble();
        map.put("amount_2", amount_2);

        map.put("tax",((Double)map.get("amount") + (Double)map.get("amount_2"))*0.19);

        printBorderTop();

        String title = "INVOICE";
        printTitle(title);

        printSeparator();

        printInvoiceData(map);

        printSeparator();

        printText(map);

        printBorderBottom();

    }

    private static void printText(HashMap<String, Object> map) {
        String text = "La factura numero " + map.get("id")+ " de " + map.get("name") +
        " tiene un total bruto de $" + ((Double)map.get("amount") + (Double)map.get("amount_2"))
        +", con un impuesto de "+ map.get("tax") +" y el monto después de impuesto es de "
        + ((Double)map.get("amount") + (Double)map.get("amount_2") + (Double)map.get("tax"));

        List<String> lines = new ArrayList<>();

        String tempLine = "";

        for (char c : text.toCharArray()) {
            if (tempLine.length() + 1 > MAX_LENGTH) {
                lines.add(tempLine);
                tempLine = "";
            }
            tempLine += c;
        }

        if (!tempLine.isEmpty()) {
            lines.add(tempLine);
        }

        for (String line : lines) {
            System.out.println("\u2502" + line + repeat(" ", BORDER_WIDTH - line.length() + 2) + "\u2502");
        }

    }

    public static void printHeader() {
        int headerSpace = (CONSOLE_WIDTH - HEADER_MESSAGE.length()) / 2;

        String header = String.format("%s %s %s",
                repeat(BORDER_CHARACTER, headerSpace),
                HEADER_MESSAGE,
                repeat(BORDER_CHARACTER, headerSpace));

        int length = header.length();

        System.out.println(repeat(BORDER_CHARACTER, length));
        System.out.println(header);
        System.out.println(repeat(BORDER_CHARACTER, length));
    }

    public static void printBorderTop() {
        System.out.println("\u250C" + repeat("\u2500", CONSOLE_WIDTH) + "\u2510");
    }

    public static void printTitle(String title) {
        int titleLength = title.length();
        int titleSpace = (BORDER_WIDTH - titleLength) / 2;
        String titleFormat = String.format("%s %s %s %s %s",
                "\u2502",
                repeat(" ", titleSpace),
                title,
                repeat(" ", titleSpace - 1),
                "\u2502"
                );
        System.out.println(titleFormat);
    }

    public static void printSeparator() {
        System.out.println("\u251C" + repeat("\u2500", CONSOLE_WIDTH) + "\u2524");
    }

    public static void printInvoiceData(HashMap<String, Object> map) {
        System.out.println("\u2502 Invoice ID: " + map.get("id") + repeat(" ", BORDER_WIDTH - ("Invoice ID: " + map.get("id")).length() + 1) + "\u2502");
        System.out.println("\u2502 Date: " + map.get("date") + repeat(" ", BORDER_WIDTH - ("Date: " + map.get("date")).length() + 1) + "\u2502");
        System.out.println("\u2502 Client: " + map.get("name") + repeat(" ", BORDER_WIDTH - ("Client: " + map.get("name")).length() + 1) + "\u2502");
        printSeparator();
        System.out.println("\u2502 Description: " + map.get("description") + repeat(" ", BORDER_WIDTH - ("Description: " + map.get("description")).length() + 1) + "\u2502");
        System.out.println("\u2502 Amount: " + map.get("amount") + repeat(" ", BORDER_WIDTH - ("Amount: " + map.get("amount")).length() + 1) + "\u2502");
        System.out.println("\u2502 Description: " + map.get("description_2") + repeat(" ", BORDER_WIDTH - ("Description: " + map.get("description_2")).length() + 1) + "\u2502");
        System.out.println("\u2502 Amount: " + map.get("amount_2") + repeat(" ", BORDER_WIDTH - ("Amount: " + map.get("amount_2")).length() + 1) + "\u2502");
        printSeparator();
        System.out.println("\u2502 Tax: " + map.get("tax") + repeat(" ", BORDER_WIDTH - ("Tax: " + map.get("tax")).length() + 1) + "\u2502");
        System.out.println("\u2502 Total: " + ((Double)map.get("amount") + (Double)map.get("amount_2")) + repeat(" ", BORDER_WIDTH - ("Total: " + ((Double)map.get("amount") + (Double)map.get("amount_2"))).length() + 1) + "\u2502");
    }

    public static void printBorderBottom() {
        System.out.println("\u2514" + repeat("\u2500", CONSOLE_WIDTH) + "\u2518");
    }

    public static String repeat(String s, int n) {
        return new String(new char[n]).replace("\0", s);
    }

}