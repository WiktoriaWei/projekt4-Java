package projekt2;

import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class Wypożyczalnia {
    ArrayList<Daneproduktu> zbior;
    ArrayList<Klient> listaklientow;

    public float zaplata(long borrowTime, long currentTime) //okresla limit czasowy i oplate za brak oddania w terminie
    {
        long oplata = currentTime - borrowTime;
        int limit = 1000;
        float kwota = 0.5f;
        float naleznosc = 0.f;
        if (oplata >= 180) {
            naleznosc = oplata * kwota;
            System.out.println("Trzeba zaplacic: ");
        }
        return naleznosc;
    }

    public Wypożyczalnia()
    {
        this.zbior = new ArrayList<>();
        this.listaklientow = new ArrayList<>();
    }

    public void addDaneproduktu(Daneproduktu x) //dodaje dane produktu do listy
    {
        zbior.add(x);
    }

    public void addUzytkownik(Klient x) ////dodaje dane klienta do listy
    {
        listaklientow.add(x);
    }

    long wyp(UUID IDuzytkownika, UUID IDproduktu)  //deklaruje wypozyczenie produktu
    {
        Klient uzytkownik = this.listaklientow.get(0); //sprawdza czy ID klienta zdadza sie z ID klienta, ktory cos wypozyczyl
        for (Klient x : this.listaklientow)
        {
            if (x.getID() == IDuzytkownika)
            {
                uzytkownik = x;
            }
        }
        if (uzytkownik.dlug(this))  //blokuje wypozyczenie przez klienta z dlugiem
        {
            System.out.println("Uzytkownik nie moze wypozyczyc, poniewaz ma dlug");
        }
        Daneproduktu produkt = null;
        for (Daneproduktu y : this.zbior) //sprawdza czy ID pruduktu zdadza sie z ID wypozyczonego produktu
        {
            if (y.getID() == IDproduktu)
            {
                produkt = y;
            }
        }
        if (produkt == null) //dla unikniecia bledow z ID
        {
            System.out.println("nie ma takiego ID");
        }
        Date datawypozyczenia = new Date();
        long date1 = datawypozyczenia.getTime();
        if (!produkt.Wypozyczony) //wypozycza oraz blokuje wypozyczenie wypozyczonej ksiazki
        {
            uzytkownik.wyp(IDproduktu, date1);
            produkt.wyp();
        } else {
            System.out.println("Probujesz wypozyczyc wypozyczona ksiazke");
        }
        return date1;
    }

    long zwrot(UUID IDuzytkownika, UUID IDproduktu) //deklaruje zwrot produktu, sprawdza ID tak samo jak wyp
    {
        Klient uzytkownik = this.listaklientow.get(0);
        for (Klient x : this.listaklientow)
        {
            if (x.getID() == IDuzytkownika)
            {
                uzytkownik = x;
            }
        }
        Daneproduktu produkt = this.zbior.get(0);
        for (Daneproduktu y : this.zbior)
        {
            if (y.getID() == IDproduktu)
            {
                produkt = y;
            }
        }
        Date datazwrotu = new Date();
        long date2 = datazwrotu.getTime();

        uzytkownik.zwrot(IDproduktu);
        produkt.zwrot();
        return date2;
    }

    public long getCurrentDate() //zwraca obecna date
    {
        Date date = new Date();
        return date.getTime(); //wiem, ze zwraca czas w milisekundach, ale nie znalazlam lepszej funkcji na to :(
    }
}

