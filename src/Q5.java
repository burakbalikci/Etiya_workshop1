public class Q5 {
    public static void main(String[] args) {
        String str = "   Merhaba   ";
        String str2 = "merhaba";

        // length()
        System.out.println("Uzunluk: " + str.length());

        // charAt()
        System.out.println("Dördüncü karakter: " + str.charAt(3));

        // substring()
        System.out.println("Alt dize: " + str.trim().substring(1, 5));

        // contains()
        System.out.println("İçeriyor mu: " + str.contains("ha"));

        // equals()
        System.out.println("Eşit mi: " + str.trim().equals(str2));

        // equalsIgnoreCase()
        System.out.println("Büyük/küçük harf duyarsız eşit mi: " + str.trim().equalsIgnoreCase(str2));

        // startsWith()
        System.out.println("M ile başlıyor mu: " + str.trim().startsWith("M"));

        // endsWith()
        System.out.println("a ile bitiyor mu: " + str.trim().endsWith("a"));

        // toLowerCase()
        System.out.println("Küçük harfler: " + str.toLowerCase());

        // toUpperCase()
        System.out.println("Büyük harfler: " + str.toUpperCase());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // replace()
        System.out.println("Değiştirilmiş: " + str.trim().replace('a', 'i'));
    }
}