package pl_249609;

import java.util.Scanner;

public class zad2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int znaki;
            boolean powtorz = false;
            System.out.println("Jesli chesz konwertowac litery wpisz 1, jesli liczbe wpisz 2: ");
            int a = scanner.nextInt();
            System.out.println("Wpisz wybrane znaki:");
            do {                 
                if (a == 1) {
                        try {
                            znaki = Integer.parseInt(scanner.next(), 36); //suma cyfr(10) i liter(26), pozwala konwertowac wszystkie liczby i litery
                            System.out.println("Oto twoje znaki w wersji liczbowej:" + znaki);
                            powtorz = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Zły format spróbuj ponownie");
                            powtorz = true;
                        }
                }
                if (a == 2) {
                        try {
                            znaki = Integer.parseInt(scanner.next().trim());
                            System.out.println("Liczba to " + znaki);
                            powtorz = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Zły format spróbuj ponownie");
                        powtorz = true;
                    }
                }
            } while(powtorz);
        }
}
