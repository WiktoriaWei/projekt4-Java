package projekt2;

import java.util.Date;
import java.util.UUID;

public class Daneproduktu {

    //kompozycja
        UUID ID; //zmienna UUID reprezentuje 128-bitową wartość, która jest unikalna, zapisana szesnastkowo
        Date wydanie;
        String autor;
        String wydawnictwo;
        int cena;
        String tytul;
        Date datawydania;
        boolean Wypozyczony;

    public String getAutor(){ return autor; }
    public void setAutor(String autor){ this.autor = autor; }
    public Date getwydanie(){ return wydanie; }
    public void setwydanie(Date wydanie){ this.wydanie = wydanie; }
    public String getwydawnictwo(){ return wydawnictwo; }
    public void setwydawnictwo(String wydawnictwo){ this.wydawnictwo = wydawnictwo; }
    public String gettytul() { return tytul; }
    public void settytul(String tytul){ this.tytul = tytul; }
    public int getCena(){ return cena; }
    public void setCena(int cena){ this.cena = cena; }
    public void setID() { this.ID = UUID.randomUUID(); }
    public UUID getID() { return this.ID; }

    public Daneproduktu(){}


    public void wyp() //nadaje status wypozyczenia oraz date
    {
        if (this.Wypozyczony)
        {
            System.out.println("Wypozyczone:" + this.tytul);
        } else {
            this.Wypozyczony = true;
            this.datawydania = new Date();
        }
    }
    public void zwrot()  ////nadaje status zwrot oraz date
    {
        if (this.Wypozyczony)
        {
            this.Wypozyczony = false;
        }
        else {
            System.out.println("Zwrocona:" + this.tytul);
        }
    }

    public void informacje() //wyswietla podstawowe dane o produkcie
    {
        System.out.println("tytuł: "+this.tytul+"\n"+"wydanie: "+this.wydanie+"\n" +"autor:  " +this.autor+"\n"+ "wydawnictwo: "+ this.wydawnictwo+"\n"+"cena: "+ this.cena );
    }
}
