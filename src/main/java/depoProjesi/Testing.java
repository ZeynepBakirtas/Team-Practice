package depoProjesi;

public class Testing {
    public static void main(String[] args) {
        int urunID = 123456;
        String urunAdi = "Örnek Ürün";
        String uretici = "ABC Şirketi";
        int miktar = 100;
        String birim = "adet";
        String rafDurumu = "Dolu";

        String formatliMetin = String.format(
                "+--------------+--------------+%n" +
                        "|         URUN LISTESI        |%n" +
                        "+--------------+--------------+%n" +
                        "| ID           | %12d |%n" +
                        "| Ürün Adı     | %12s |%n" +
                        "| Üretici      | %12s |%n" +
                        "| Miktar       | %12d |%n" +
                        "| Birim        | %12s |%n" +
                        "| Raf          | %12s |%n" +
                        "+--------------+--------------+%n",
                urunID, urunAdi, uretici, miktar, birim, rafDurumu);

        System.out.println(formatliMetin);
    }
}
