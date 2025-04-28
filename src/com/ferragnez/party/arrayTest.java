package com.ferragnez.party;

public class arrayTest {
    public static void main(String[] args) {
        String[] arrayStrings = {"parola1", "parola2", "parola3"};
        String[] newArrayStrings = new String[arrayStrings.length + 1];

        int i = 0;
        while (i < arrayStrings.length) {
            newArrayStrings[i] = arrayStrings[i];
            System.out.println(newArrayStrings[i]);
            i++;
        }

        newArrayStrings[arrayStrings.length] = "parola4";
        System.out.println("Aggiunta una parola");
     

         for (int index = 0; index < newArrayStrings.length; index++) {
             System.out.println(newArrayStrings[index]);
         }

    }
}
