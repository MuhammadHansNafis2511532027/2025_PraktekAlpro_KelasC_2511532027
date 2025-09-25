package nilai_pekan_3;

import java.util.Scanner;

public class HitungVolume {

	public static void main(String[] args) {
		double r;
		double t;
		double volume;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Masukkan jari-jari tabung: ");
		r =  keyboard.nextDouble();
		System.out.println("Masukkan tinggi tabung: ");
		t = keyboard.nextDouble();
		keyboard.close();
		
		volume = 3.14 * r * r * t;
		System.out.println("Volume tabung = " + volume);
	}

}
