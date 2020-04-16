package pl_249609;

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class zad3 {

    public static void main(String[] args) {

        int[] tab = new int[5];
        int wybor = 0 ;
        boolean powtorz;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 cyfr: ");
        for (int i = 0; i < tab.length; i++) {
            try {
                System.out.print((i + 1) + ": ");

                tab[i] = Integer.parseInt(scanner.next());

            } catch (NumberFormatException e) {
                System.out.println("Podaj liczbę!");
                i--;
            }

        }
        System.out.print("Podaj którą liczbę z tablicy chcesz wyświetlić: ");

        do {
            try {

                wybor = Integer.parseInt(scanner.next());
                wybor--;
                System.out.println("Liczba o ID " + (wybor + 1) + " to " + tab[wybor]);
                powtorz = false;

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Nie ma takiego indeksu w tabeli, podaj liczbe ponownie:");
                powtorz = true;

            }catch(NumberFormatException e){
                System.out.println("Podaj liczbę!");
                powtorz = true;
            }
        }while (powtorz);
    }

}

