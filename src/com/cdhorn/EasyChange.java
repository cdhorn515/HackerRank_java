package com.cdhorn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EasyChange {
    static int howMuchToAsk(int c, int p) {
        int amountToAsk = p - c;
        int pesosNeeded = 20 - amountToAsk;
        if (pesosNeeded >=10) {
            pesosNeeded = -1;
            return pesosNeeded;
        }
        if(amountToAsk == 20 || amountToAsk ==50 || amountToAsk ==100 || amountToAsk == 200 || amountToAsk == 500 || amountToAsk ==1000){
            return pesosNeeded = 0;
        } else if (amountToAsk > 1000) {
            pesosNeeded = 2000 - amountToAsk;
        } else if (amountToAsk > 500) {
            pesosNeeded = 1000 - amountToAsk;
        } else if (amountToAsk > 200) {
            pesosNeeded = 500 - amountToAsk;
        } else if (amountToAsk > 100) {
            pesosNeeded = 200 - amountToAsk;
        } else if (amountToAsk > 50) {
            pesosNeeded = 100 - amountToAsk;
        } else if (amountToAsk > 20) {
            pesosNeeded = 50 - amountToAsk;
        } else if (amountToAsk > 10) {
            pesosNeeded = 20 - amountToAsk;
        }
        if (pesosNeeded >= 10) {
            pesosNeeded = -1;
        }
        return pesosNeeded;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = Integer.parseInt(scan.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] cp = scan.nextLine().split(" ");
            int c = Integer.parseInt(cp[0].trim());
            int p = Integer.parseInt(cp[1].trim());
            int result = howMuchToAsk(c, p);
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.close();
    }
}
