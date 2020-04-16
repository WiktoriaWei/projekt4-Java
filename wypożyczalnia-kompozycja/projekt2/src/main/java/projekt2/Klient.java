package projekt2;

import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class Klient extends Wypożyczenie {
    private String imie;
    private String nazwisko;
    private String adres;
    private int wiek;
    private Date datazapisu;
    private UUID ID;



    public ArrayList<Wypożyczenie> getWypozyczone()
    {
        return wypozyczone;
    }

    private ArrayList<Wypożyczenie> wypozyczone;

    public Klient (String imie, String nazwisko, String adres, int wiek)
    {
        ID = UUID.randomUUID();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        datazapisu = new Date();
        wypozyczone = new ArrayList<>();

    }

    public Wypożyczenie Wypożyczenie;
    public void wyp(UUID IDproduktu, long date) //metoda dodaje nowe wypozyczenie do listy
    {
        this.Wypożyczenie = new Wypożyczenie();
        Wypożyczenie.setborrowData(date);
        Wypożyczenie.setIDproduktu(IDproduktu);
        Wypożyczenie.setIDuzytkownika(ID);

        wypozyczone.add(Wypożyczenie);
    }

    @Override
    public long getBorrowData() {
        return Wypożyczenie.getBorrowData();
    }

    @Override
    public UUID getIDproduktu() {
        return Wypożyczenie.getIDproduktu();
    }

    @Override
    public UUID getIDuzytkownika() {
        return Wypożyczenie.getIDuzytkownika();
    }

    public void zwrot(UUID IDproduktu) //metoda usuwa wypozyczenie z listy
    {
        for( Wypożyczenie element: wypozyczone)
        if(element.getIDproduktu() == IDproduktu) //ten element podpowiedziala java
        {
            wypozyczone.remove(IDproduktu);
        }
    }

    public UUID getID()
    {
        return ID;
    }

    Wypożyczenie getWypozyczenie(UUID IDproduktu) //nadaje status do zwrotu ksiazce wypozyczonej
    {
        Wypożyczenie dozwrotu = null;
        for (Wypożyczenie wyp : wypozyczone)
        {
            if (IDproduktu == wyp.getIDproduktu())
            {
                dozwrotu = wyp;
            }
        }
        return dozwrotu;
    }

    boolean dlug(Wypożyczalnia wypożyczalnia) //sprawdza czy klient ma dlug
    {
        for (Wypożyczenie wyp : wypozyczone)
        {
            if (wypożyczalnia.zaplata(wyp.getBorrowData(), wypożyczalnia.getCurrentDate()) > 0.f)
            {
                return true;
            }
        }
        return false;
    }
}