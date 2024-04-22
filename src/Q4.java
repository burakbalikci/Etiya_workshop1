public class Q4 {public static void main(String[] args) {
    int sayi = 28;
    if (isPerfectNumber(sayi)) {
        System.out.println(sayi + " bir mükemmel sayıdır.");
    } else {
        System.out.println(sayi + " bir mükemmel sayı değildir.");
    }
}

    // Mükemmel sayıyı kontrol eden fonksiyon
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}