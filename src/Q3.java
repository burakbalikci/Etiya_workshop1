import java.util.Random;
import java.util.Scanner;

public class Q3 { public static void main(String[] args) {

    Random random = new Random();
    int randomNo = random.nextInt(10) + 1;  // 1 ile 10 arasında bir sayı üretelim.


    Scanner scanner = new Scanner(System.in);
    int guess;

    System.out.println("1 ile 10 arasında bir sayı tahmin ediniz:");

    while (true) {
        guess = scanner.nextInt();  // Kullanıcının tahminini alalım.

        if (guess == randomNo) {
            System.out.println("Tebrikler! Doğru tahmin ettiniz.");
            break;  // Doğru tahminde döngüden çıkalım.
        } else {
            System.out.println("Yanlış tahmin. Tekrar deneyin:");
        }
    }

    scanner.close();
}
}