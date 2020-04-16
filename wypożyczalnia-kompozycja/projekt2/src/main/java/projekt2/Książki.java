package projekt2;

import java.util.Date;
import java.util.UUID;

public class Książki extends Daneproduktu{
    int iloscstron;

    public Daneproduktu Daneproduktu;
    public Książki()
    {
        this.Daneproduktu=new Daneproduktu();
        setiloscstron(iloscstron);
        Daneproduktu.setAutor("A");
        Daneproduktu.setCena(25);
        Daneproduktu.setwydawnictwo("B");
        Daneproduktu.settytul("C");
        Daneproduktu.setwydanie(new Date(02,01,03));
        this.iloscstron = 321;
    }

    public String getAutor(){ return Daneproduktu.getAutor(); }
    public Date getwydanie(){ return Daneproduktu.getwydanie(); }
    public String getwydawnictwo(){ return Daneproduktu.getwydawnictwo(); }
    public String gettytul() { return Daneproduktu.gettytul(); }
    public int getCena(){ return Daneproduktu.getCena(); }



    public void setiloscstron(int iloscstron) { this.iloscstron = iloscstron; }
    public int getIloscstron(){ return iloscstron; }
    public void informacje() {
        Daneproduktu.informacje();
        System.out.println( "strony: "+ iloscstron);}
}
