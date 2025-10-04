package nilai_pekan_4;

import java.util.Scanner;

public class TugasAlproPekan4_2511532027 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Nama Pembeli: ");
	        String nama = input.nextLine();

	        System.out.print("Jumlah Tiket: ");
	        int jumlah = input.nextInt();

	        System.out.print("Hari (1=Senin, 2=Selasa, 3=Rabu, 4=Kamis, 5=Jumat, 6=Sabtu, 7=Minggu): ");
	        int hari = input.nextInt();

	        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Sore, 4=Malam): ");
	        int waktu = input.nextInt();

	        System.out.print("Jenis Studio (1=Bronze, 2=Silver, 3=Gold, 4=Platinum, 5=Diamond,): ");
	        int studio = input.nextInt();

	        int hargaDasar = 0;
	        String namaStudio = "";
	        switch (studio) {
	            case 1: 
	                hargaDasar = 50000; 
	                namaStudio = "Bronze"; 
	                break;
	            case 2: 
	                hargaDasar = 100000; 
	                namaStudio = "Silver"; 
	                break;
	            case 3: 
	                hargaDasar = 150000; 
	                namaStudio = "Gold"; 
	                break;
	            case 4:
	            	hargaDasar = 200000;
	            	namaStudio = "Platinum";
	            	break;
	            case 5:
	            	hargaDasar = 250000;
	            	namaStudio = "Diamond";
	            	break;
	            default: 
	                System.out.println("\nPilihan studio tidak valid"); 
	                input.close(); 
	                return;
	        }

	        double biayaHari = 0;
	        String namaHari = "";
	        if (hari == 1) { 
	            biayaHari = 0.0; 
	            namaHari = "Senin"; 
	        } else if (hari == 2) { 
	            biayaHari = 0.05; 
	            namaHari = "Selasa"; 
	        } else if (hari == 3) { 
	            biayaHari = 0.10; 
	            namaHari = "Rabu"; 
	        } else if (hari == 4) { 
	        	biayaHari = 0.15;
	        	namaHari = "Kamis";
	        } else if (hari == 5) {
	        	biayaHari = 0.20;
	        	namaHari = "Jumat";
	        } else if (hari == 6) {
	        	biayaHari = 0.25;
	        	namaHari = "Sabtu";
	        } else if (hari == 7) {
	        	biayaHari = 0.30;
	        	namaHari = "Minggu";
	        } else {
	            System.out.println("\nPilihan hari tidak valid"); 
	            input.close(); 
	            return;
	        }

	        double biayaWaktu = 0;
	        String namaWaktu = "";
	        if (waktu == 1) { 
	            biayaWaktu = 0.05; 
	            namaWaktu = "Pagi"; 
	        } else if (waktu == 2) { 
	            biayaWaktu = 0.10; 
	            namaWaktu = "Siang"; 
	        } else if (waktu == 3) { 
	            biayaWaktu = 0.15; 
	            namaWaktu = "Sore"; 
	        } else if (waktu == 4) { 
	        	biayaWaktu = 0.20;
	        	namaWaktu = "Malam";
	        } else {
	            System.out.println("\nPilihan waktu tidak valid"); 
	            input.close(); 
	            return;
	        }

	        double hargaPerTiket = hargaDasar + (hargaDasar * biayaHari) + (hargaDasar * biayaWaktu);

	        double subtotal = hargaPerTiket * jumlah;

	        double diskon = 0;
	        if (jumlah >= 3) {
	            diskon = subtotal * 0.10;
	        }

	        double totalBayar = subtotal - diskon;

	        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
	        System.out.println("Nama Pembeli          : " + nama);
	        System.out.println("Jumlah Tiket          : " + jumlah);
	        System.out.println("Hari                  : " + namaHari);
	        System.out.println("Waktu Tayang          : " + namaWaktu);
	        System.out.println("Jenis Studio          : " + namaStudio);
	        System.out.println("------------------------------------");
	        System.out.println("Harga Dasar           : Rp " + hargaDasar + "/tiket");
	        System.out.println("Biaya Hari            : +" + (int)(biayaHari*100) + "%");
	        System.out.println("Biaya Waktu           : +" + (int)(biayaWaktu*100) + "%");
	        System.out.println("Harga per Tiket       : Rp " + (int)hargaPerTiket);
	        System.out.println("Subtotal              : Rp " + (int)subtotal);
	        System.out.println("Diskon (10%)          : Rp " + (int)diskon);
	        System.out.println("------------------------------------");
	        System.out.println("TOTAL BAYAR           : Rp " + (int)totalBayar);

	        input.close();
	    }
	}

