import java.util.Scanner;

public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner pandu = new Scanner(System.in);


        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = pandu.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = pandu.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Masukkan nilai ke-" + (j + 1) + ": ");
                nilai[i][j] = pandu.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n==============================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");


        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int k = 0; k < jumlahSiswa; k++) {
                totalPerMatkul += nilai[k][j];
            }
            System.out.println("Mata kuliah ke-" + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

        pandu.close();
    }
}
