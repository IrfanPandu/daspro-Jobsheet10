import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner pandu = new Scanner(System.in);
        String nama;
        int baris, kolom, pilihan;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = pandu.nextInt();
            pandu.nextLine(); 

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama penonton: ");
                        nama = pandu.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = pandu.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = pandu.nextInt();
                        pandu.nextLine();

      
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom tidak valid! Silakan masukkan baris antara 1-4 dan kolom antara 1-2.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah ditempati! Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton berhasil ditambahkan.");
                            break; 
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": **");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    pandu.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}