package projekt2;
import java.util.Date;

public class Filmy extends Daneproduktu{
    int dlugosc;

    public Daneproduktu Daneproduktu;
    public Filmy()
    {
        this.Daneproduktu=new Daneproduktu();
        setdlugosc(dlugosc);
        Daneproduktu.setAutor("H");
        Daneproduktu.setCena(25);
        Daneproduktu.setwydawnictwo("I");
        Daneproduktu.settytul("J");
        Daneproduktu.setwydanie(new Date(02,01,03));
        this.dlugosc = 365;
    }
    public String getAutor(){ return Daneproduktu.getAutor(); }
    public Date getwydanie(){ return Daneproduktu.getwydanie(); }
    public String getwydawnictwo(){ return Daneproduktu.getwydawnictwo(); }
    public String gettytul() { return Daneproduktu.gettytul(); }
    public int getCena(){ return Daneproduktu.getCena(); }

    public void setdlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public int getdlugosc() { return dlugosc; }
    public void informacje() {
        Daneproduktu.informacje();
        System.out.println( "długość filmu: " +dlugosc+ " min");}
}

