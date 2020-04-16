package projekt2;

import java.util.Date;

public class Płyty extends Daneproduktu{
    String rodzaj;

    public Daneproduktu Daneproduktu;
    public Płyty()
    {
        this.Daneproduktu=new Daneproduktu();
        setrodzaj(rodzaj);
        Daneproduktu.setAutor("D");
        Daneproduktu.setCena(34);
        Daneproduktu.setwydawnictwo("E");
        Daneproduktu.settytul("F");
        Daneproduktu.setwydanie(new Date(02,01,04));
        this.rodzaj = "G";
    }
    public String getAutor(){ return Daneproduktu.getAutor(); }
    public Date getwydanie(){ return Daneproduktu.getwydanie(); }
    public String getwydawnictwo(){ return Daneproduktu.getwydawnictwo(); }
    public String gettytul() { return Daneproduktu.gettytul(); }
    public int getCena(){ return Daneproduktu.getCena(); }

    public void setrodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
    public String getrodzaj(){ return rodzaj; }
    public void informacje() {
        Daneproduktu.informacje();
        System.out.println( "rodzaj: "+ rodzaj);}
}
