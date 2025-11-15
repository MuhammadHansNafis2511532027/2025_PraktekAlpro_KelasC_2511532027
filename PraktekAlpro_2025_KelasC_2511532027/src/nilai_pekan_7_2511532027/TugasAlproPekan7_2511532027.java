package nilai_pekan_7_2511532027;

import java.util.Scanner;

public class TugasAlproPekan7_2511532027 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username: ");
		String w = input.nextLine();
		System.out.print("Masukkan Password: ");
		String x = input.nextLine();
		System.out.print("Masukkan Email: ");
		String y = input.nextLine();
		System.out.print("Masukkan PIN (8 digit): ");
		int z = input.nextInt();
		Akun a = new Akun();
		a.setName(w);
		a.setPassword(x);
		a.setEmail(y);
		a.setPin(z);
		if (a.isEmailValid(y) && a.isPasswordValid(x)) {
			System.out.println("");
			System.out.println("--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \"" + w + "\" telah berhasil dibuat.");
			System.out.println("");
			System.out.println("--- Detail Akun ---");
			System.out.println("Username (Lowercase): " + a.getName().toLowerCase());
			System.out.println("Email (Uppercase): " + a.getEmail().toUpperCase());
			System.out.println("ID Pengguna (Gabungan): " + a.getName() + a.getPin());
			System.out.println("");
			System.out.println("---" + " Uji Tipe Data (PIN Anda: " + a.getPin() + " )" + " ---");
			System.out.println("PIN (int) + 10 = " + z);
			System.out.println("PIN (String) + \"" + 10 + "\" = " + a.getPin() + "10");
		}else if(!a.isEmailValid(y)) {
			System.out.println("");
			System.out.println("--- REGISTRASI GAGAL ---");
			System.out.println("Email Anda \"" + a.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
			System.out.println("Silakan coba lagi.");
		}else if (!a.isPasswordValid(x)) {
			System.out.println("");
			System.out.println("--- REGISTRASI GAGAL ---");
			System.out.println("Password Anda \"" + a.getPassword() + "\" tidak valid (harus terdiri dari 8 karakter atau lebih).");
			System.out.println("Silakan coba lagi.");
		}
		
		input.close();
	}
}
