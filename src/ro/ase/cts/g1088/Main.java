package ro.ase.cts.g1088;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // De citit un string de la tastatura.
        // Se vor arunca exceptii daca stringul contine
        // doar litere mari sau doar litere mici.

        System.out.println("Introduceti o propozitie care contine litere mari si litere mici:");

        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.nextLine();
//        System.out.println(propozitie);

        try
        {
            if(propozitie == propozitie.toLowerCase())
            {
                throw new ExceptionLower();
            }

            if(propozitie == propozitie.toUpperCase())
            {
                throw new ExceptionUpper();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
