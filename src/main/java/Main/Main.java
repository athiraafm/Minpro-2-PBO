package Main;

import data.Donor;
import data.PengelolaDonor;
import data.PendonorTetap;
import data.PendonorSporadis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PengelolaDonor pengelola = new PengelolaDonor();
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("+----------------------------------------+");
                System.out.println("|     Manajemen Pengelolaan Data Donor   |");
                System.out.println("+----------------------------------------+");
                System.out.println("| 1. Tambah Donor                        |");
                System.out.println("| 2. Hapus Donor                         |");
                System.out.println("| 3. Tampilkan Semua Donor               |");
                System.out.println("| 4. Cari Donor                          |");
                System.out.println("| 5. Update Donor                        |");
                System.out.println("| 6. Keluar                              |");
                System.out.println("+----------------------------------------+");
                System.out.print("Pilih menu: ");
                
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.println("Jenis Pendonor: 1. Tetap, 2. Sporadis");
                        int jenisPendonor = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan usia (Min 17 Tahun): ");
                        int usia = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan golongan darah (A, B, AB, O): ");
                        String golonganDarah = scanner.nextLine();
                        
                        Donor donorBaru;
                        if (jenisPendonor == 1) {
                            donorBaru = new PendonorTetap(nama, usia, golonganDarah, 5);  
                        } else {
                            donorBaru = new PendonorSporadis(nama, usia, golonganDarah, "Event Kampus");
                        }
                        pengelola.tambahDonor(donorBaru);
                    }
                    
                    case 2 -> {
                        pengelola.tampilkanSemuaDonor();
                        System.out.print("Masukkan ID donor yang ingin dihapus: ");
                        int idHapus = scanner.nextInt();
                        pengelola.hapusDonor(idHapus);
                    }

                    case 3 -> pengelola.tampilkanSemuaDonor();
                    
                    case 4 -> {
                        System.out.print("Masukkan ID donor yang ingin dicari: ");
                        int idCari = scanner.nextInt();
                        pengelola.cariDonor(idCari);
                    }
                    
                    case 5 -> {
                        System.out.print("Masukkan ID donor yang ingin diupdate: ");
                        int idUpdate = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan nama baru: ");
                        String namaBaru = scanner.nextLine();
                        System.out.print("Masukkan usia baru: ");
                        int usiaBaru = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan golongan darah baru (A, B, AB, O): ");
                        String golonganDarahBaru = scanner.nextLine();
                        pengelola.updateDonor(idUpdate, namaBaru, usiaBaru, golonganDarahBaru);
                    }
                    
                    case 6 -> System.out.println("Keluar dari program.");
                    
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 6);
        }
    }
}
