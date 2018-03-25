package com.cdhorn;

import java.util.Scanner;

public class BonAppetit {

    public static void bon_appetit() {
        Scanner scan = new Scanner(System.in);

        int[] costArray = new int[scan.nextInt()];
        int indexNotEaten = scan.nextInt();

        int totalCost = 0;


        for (int i = 0; i < costArray.length; i++) {
            costArray[i] = scan.nextInt();
            totalCost += costArray[i];
        }

        int shouldCharge = (totalCost - costArray[indexNotEaten]) / 2;

        int charged = scan.nextInt();
        if (charged == shouldCharge) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - shouldCharge);
        }

    }
}
