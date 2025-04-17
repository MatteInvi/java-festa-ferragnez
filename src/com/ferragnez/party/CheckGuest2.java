package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest2 {
    public static void main(String[] args) {
        String[] nomiInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Tachel Zeilic" };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String nomeRichiesto = scanner.nextLine().toUpperCase();
        boolean inLista = false;
        int i = 0;
        while (inLista == false && i < nomiInvitati.length) {
            if (nomeRichiesto.equals(nomiInvitati[i].toUpperCase())) {
                inLista = true;
                break;
            }
            i++;
        }

        if (inLista == true) {
            System.out.println("Puoi entrare");

        } else {
            System.out.println("Non sei ammesso!!!");
        }

        scanner.close();
    }
}
