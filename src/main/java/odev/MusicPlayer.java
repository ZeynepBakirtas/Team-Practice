package odev;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {

    /*
      Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
      Kullanıcılar, çalma listelerine şarkı ekleyebilmeli, şarkıları sıralayabilmeli ve
      şarkıları listeden silebilmelidir.
      Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
  */
    public static List<String> playerList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        playerList.add("mihriban");
        playerList.add("arkadasim essek");
        playerList.add("hayat sevince guzel");
        playerList.add("flowers");
        playerList.add("this is the life");
        playerList.add("litaliano");
        playerList.add("merhabalar");



        Scanner input = new Scanner(System.in);
        System.out.println("========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________        \n"
                + "   | 1-SARKI EKLEME     |             |  2-SARKI SIL  |        \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯        \n"
                + "   | 3-SARKILARI SIRALA |              | 4-TÜMÜNÜ SIL |        \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯        \n"
                + "   | 5-CIKISI           |                                       \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯        \n");

        System.out.print("ISLEM SECİNİZ : ");

        String option = input.next();

        switch (option) {
            case "1":
                addSong();
                break;
            case "2":
                deleteSong();
                break;
            case "3":
                orderList();
                break;
            case "4":
                deleteAllSong();
                break;
            case "5":
                System.out.println("----------Sarki listenizin son hali--------");
                System.out.println(playerList);
                break;
            default:
                System.out.println("Yanlis deger girdiniz!..");
        }

    }

    private static List<String> orderList() {
        Collections.sort(playerList);
        System.out.println("Listenizdeki sarkilar alfabetik olarak siralanmistir...");

        return playerList;
    }


    private static List<String> addSong() {
        System.out.println("Lütfen eklemek istediginiz sarkiyi yaziniz...");
        String song = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");

        if (playerList.contains(song)) {
            System.out.println("Bu sarki listenizde bulunmaktadir...");
        } else {
            System.out.println("Sectiginiz sarki eklenmistir...");
            playerList.add(song);
        }

        return playerList;
    }

    private static List<String> deleteSong() {

        System.out.println("Sarki ismi giriniz...");
        String song = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");

        if (playerList.contains(song)) {
            playerList.remove(song);
            System.out.println("Istediginiz sarki silinmistir...");
        } else {
            System.out.println("Silmek istediginiz sarki listenizde bulunmamaktadir!");
        }

        return playerList;

    }

    private static List<String> deleteAllSong() {
        System.out.println("Listenin Tamamini silmek istediginizden emin misiniz? Evet ise (E) Hayir ise (X) tuslayiniz?");
        String answer = input.nextLine().toLowerCase();

        if (answer.equals("e")) {
            playerList.clear();
            System.out.println("Listedeki sarkilarin tamami silinmistir");
        } else if (answer.equals("x")) {
        } else {
            System.out.println("Lütfen secenekleri dogru giriniz");
            deleteAllSong();
        }

        return playerList;
    }
}

