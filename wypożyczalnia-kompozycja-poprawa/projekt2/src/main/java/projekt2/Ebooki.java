package projekt2;

import java.util.Date;
import java.util.UUID;

public class Ebooki {
    int wielkosc;

    public Daneproduktu Daneproduktu;
    public Ebooki()
    {
        this.Daneproduktu=new Daneproduktu();
        setwielkosc(wielkosc);
        Daneproduktu.setAutor("K");
        Daneproduktu.setCena(76);
        Daneproduktu.setwydawnictwo("L");
        Daneproduktu.settytul("M");
        Daneproduktu.setwydanie(new Date(02,01,03));
        this.wielkosc = 8;
    }
    public String getAutor(){ return Daneproduktu.getAutor(); }
    public Date getwydanie(){ return Daneproduktu.getwydanie(); }
    public String getwydawnictwo(){ return Daneproduktu.getwydawnictwo(); }
    public String gettytul() { return Daneproduktu.gettytul(); }
    public int getCena(){ return Daneproduktu.getCena(); }
    public UUID getID() { return Daneproduktu.getID(); }

    public void setwielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }
    public int getwielkosc() { return wielkosc; }
    public void informacje() {
        Daneproduktu.informacje();
        System.out.println( "Wielkosc: " +wielkosc+ " GB");}
}
