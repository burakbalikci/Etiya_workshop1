public class Q5 {
    public static void main(String[] args) {
        String str = "   Java   ";

        System.out.println("Uzunluk: " + str.length());

        System.out.println("Dördüncü karakter: " + str.charAt(3));

        System.out.println("Alt dize: " + str.trim().substring(1, 5));

        System.out.println("İçeriyor mu: " + str.contains("ha"));

        System.out.println("Eşit mi: " + str.trim().equals(str2));

        System.out.println("Büyük/küçük harf duyarsız eşit mi: " + str.trim().equalsIgnoreCase(str2));

        System.out.println("M ile başlıyor mu: " + str.trim().startsWith("J"));

        System.out.println("a ile bitiyor mu: " + str.trim().endsWith("a"));

        System.out.println("Küçük harfler: " + str.toLowerCase());

        System.out.println("Büyük harfler: " + str.toUpperCase());

        System.out.println("Trimmed: '" + str.trim() + "'");

        System.out.println("Değiştirilmiş: " + str.trim().replace('a', 'u'));
    }
}
