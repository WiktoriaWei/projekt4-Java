package projekt2;

import java.util.Date;


public class start {
    public static void main(String[] args)  throws Exception {
        Wypożyczalnia wei = new Wypożyczalnia();
        Płyty mf = new Płyty();
        Książki fantasy = new Książki();
        Filmy MARVEL = new Filmy();
        Ebooki prog = new Ebooki();
        Audiobooki bajki = new Audiobooki();
        wei.addDaneproduktu(fantasy);
        wei.addDaneproduktu(mf);
        wei.addDaneproduktu(MARVEL);
        wei.addDaneproduktu(prog);
        wei.addDaneproduktu(bajki);
        System.out.println("zasoby wypożyczalni:");
        MARVEL.informacje(); //wyswietlam te dane
        fantasy.informacje();
        mf.informacje();
        prog.informacje();
        bajki.informacje();

        Klient W = new Klient("Wiktoria", "Weichbrodt", "Wroclaw", 21);
        wei.addUzytkownik(W);
        Klient J = new Klient("Jan", "Kowalski", "Warszawa", 34);
        wei.addUzytkownik(J); //deklaruje i dodaje dane klientow
        long dw= wei.wyp(W.getID(), mf.getID()); //nadaje date wypozyczeniu
        wei.wyp(W.getID(), prog.getID());//na przykladzie ebooka
        Thread.sleep(1000);
        long dz= wei.zwrot(W.getID(), prog.getID()); //nadaje date zwrotu
        System.out.println(wei.zaplata( dw,dz)); //wyswietlam kwote do zaplaty
    }
}