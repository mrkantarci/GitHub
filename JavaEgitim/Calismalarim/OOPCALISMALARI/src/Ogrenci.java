public class Ogrenci {

    private int ogrenciNo;
    private String isim;
    private byte sinif;
    private boolean aktifMi;
    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktifMi){
this.ogrenciNo = ogrenciNo;
this.isim = isim;
this.sinif = sinif;
this.aktifMi = aktifMi;
    }


    public void dersAl(){

        System.out.println("ogrenci ders aliyor ");

    }

    public void ogrenciBilgileriniYazdir(){
       if(aktifMi){
           System.out.println("adim " + isim + " numaram " + ogrenciNo + " sinifim " + sinif);
       } else {
           System.out.println("bu ogrenci aktif degil");
       }
    }


}
