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

