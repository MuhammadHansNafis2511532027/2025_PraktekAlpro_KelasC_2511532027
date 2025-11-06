package nilai_pekan_6_2511532027;

import java.util.Scanner;
import java.util.Random;

public class TugasPraktekAlproPekan6_2511532027 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int tries = 0;
        String jawab = "ya";
        boolean menang = false;

        while (jawab.equalsIgnoreCase("ya")) {
            tries++;

            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            int jumlah = dadu1 + dadu2;

            System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);

            if (jumlah == 7) {
                System.out.println("Tebakan Anda Benar");
                menang = true;
                break; // keluar dari perulangan jika menang
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak)? ");
                jawab = input.nextLine();
            }
        }

        if (menang) {
            System.out.println("Anda menang setelah " + tries + " percobaan!");
        } else {
            System.out.println("Anda gagal menang");
        }

        input.close();
    }
}