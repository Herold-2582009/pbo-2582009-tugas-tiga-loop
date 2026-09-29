import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = in.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.print("do-while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int lebih = 0;
        for (int i = 1; i <= n; i++) {
            lebih++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + lebih + " kali");

        int cetak = 0;
        StringBuilder hasil = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            hasil.append(i).append(" ");
            cetak++;
        }
        System.out.println("Disaring : " + hasil.toString().trim());
        System.out.println("Sampai println  : " + cetak + " kali");

        in.close();
    }
}

/*

nomor 2:

 * ===================== HASIL EKSEKUSI =====================
 *
 * --- Run pertama, n = 5 ---
 *
 * Batas deret (n) : 5
 *
 * ===== SATU DERET, TIGA LOOP =====
 * for      : 1 2 3 4 5
 * while    : 1 2 3 4 5
 * do-while : 1 2 3 4 5
 *
 * i <  n berputar : 4 kali
 * i <= n berputar : 5 kali
 * Disaring : 1 3 5 7
 * Sampai println  : 4 kali
 *
 * --- Run kedua, n = 0 ---
 *
 * Batas deret (n) : 0
 *
 * ===== SATU DERET, TIGA LOOP =====
 * for      :
 * while    :
 * do-while : 1
 *
 * i <  n berputar : 0 kali
 * i <= n berputar : 0 kali
 * Disaring : 1 3 5 7
 * Sampai println  : 4 kali
 *
 * KESIMPULAN: do-while mengecek kondisinya sesudah badan loop dijalankan,
 * jadi badannya pasti jalan minimal sekali.
 *
 * ---------------------------------------------------------
*/

/*
nomor 3

Batas deret (n) : 5

===== SATU DERET, TIGA LOOP =====
for      : 1 2 3 4 5
while    : 1 2 3 4 5
do-while : 1 2 3 4 5

i <  n berputar : 4 kali
i <= n berputar : 5 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali
 */


/*
nomor 5

 * Penjelasan: continue dieksekusi lebih dulu untuk angka genap, jadi
 * saat i = 8 pengecekan i > 7 terlewati. break baru jalan di i = 9.
*/