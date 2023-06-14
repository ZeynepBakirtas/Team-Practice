package konuAnlatimi;

public class StringManipulations {
    public static void main(String[] args) {

       //s stringindeki n harflerini xxx cevir
        String s = "Ali okula ne zaman basladi";
        s = s.replace("n","xxx");
        System.out.println(s);//Ali okula ne zaman basladi


        String price = "$15.38";
        System.out.println(price.replace("$", ""));//15.38

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz. split()
        String name = "   ZeyneP    bAKIRTAS";
        name = name.toUpperCase().trim().replaceAll("\\s+", " ");
        System.out.println(name);
        char ilkHarf = name.charAt(0);
        char ikinciHarf = name.split(" ")[1].charAt(0);

        System.out.println("" + ilkHarf + ikinciHarf);//ZB


        //Ornek 1:  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail

        String a = "abcdefghei@hotmail.com";

        int r1 = a.indexOf("@");
        int r2 = a.indexOf(".");

        String result = a.substring(r1+1,r2);
        System.out.println(result);

        /*
        Ornek:
        Asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        1) En az 8 character olsun  ==>  length
        2) Space characteri passwordde olmasin  ==>  contains
        3) En az bir buyuk harf olsun  ==> replaceAll
        4) En az bir kucuk harf olsun
        5) En az bir rakam olsun
        6) A harfi ile basliyor mu ==> startsWith
                */

        String pwd = "123zey.";
        boolean result1 =  pwd.length()<8;
        boolean result2 = !pwd.contains("1");

        boolean result3 = pwd.replaceAll("[^0-9]", "").length()>0;
        boolean result4 = pwd.startsWith("A");
/*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
                */

        String n = "Tom";
        System.out.println(n.concat(" zengin"));
        String r3 = n + " zengin";
        System.out.println(r3);
        System.out.println("n" + n);

        String t = "Terry";
        String r = new String("Tom");
        System.out.println(n.equals(r));//true dger
        System.out.println(r == n);//false adres deger

        //Ornek 2: Bir stringin space haric hicbir karakter icermedigini kontrol eden kodu yaziniz.
        String l = "    ";
        System.out.println(l.isEmpty());// karakter var mi yok mu false
        System.out.println(l.isBlank());// space de bakar true











    }
}
