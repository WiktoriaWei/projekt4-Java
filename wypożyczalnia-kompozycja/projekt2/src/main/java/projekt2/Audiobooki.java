package projekt2;


import java.util.Date;

public class Audiobooki extends Daneproduktu {
    String lektor;

    public Daneproduktu Daneproduktu;
    public Audiobooki()
    {
        this.Daneproduktu=new Daneproduktu();
        setlektor(lektor);
        Daneproduktu.setAutor("N");
        Daneproduktu.setCena(85);
        Daneproduktu.setwydawnictwo("O");
        Daneproduktu.settytul("P");
        Daneproduktu.setwydanie(new Date(02,01,03));
        this.lektor = "Q";
    }
    public String getAutor(){ return Daneproduktu.getAutor(); }
    public Date getwydanie(){ return Daneproduktu.getwydanie(); }
    public String getwydawnictwo(){ return Daneproduktu.getwydawnictwo(); }
    public String gettytul() { return Daneproduktu.gettytul(); }
    public int getCena(){ return Daneproduktu.getCena(); }

    public void setlektor(String lektor) {
        this.lektor = lektor;
    }
    public String getlektor() { return lektor; }
    public void informacje() {
        Daneproduktu.informacje();
        System.out.println( "lektor: " +lektor);}
}