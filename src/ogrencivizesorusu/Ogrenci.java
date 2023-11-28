/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrencivizesorusu;

/**
 *
 * @author Semih
 */
public class Ogrenci {
    private int OgrenciID;
    private String Isim;
    private String Soyisim;

    public Ogrenci(int OgrenciID, String İsim, String Soyisim) {
        this.OgrenciID = OgrenciID;
        this.Isim = İsim;
        this.Soyisim = Soyisim;
    }

    public int getOgrenciID() {
        return OgrenciID;
    }

    public void setOgrenciID(int OgrenciID) {
        this.OgrenciID = OgrenciID;
    }

    public String getİsim() {
        return Isim;
    }

    public void setİsim(String İsim) {
        this.Isim = İsim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }
    public void ogrenciBilgileriniListele()
    {
        System.out.println("Öğrenci'nin ID'si: "+this.OgrenciID);
         System.out.println("Öğrenci'nin İsmi: "+this.Isim);
          System.out.println("Öğrenci'nin Soyİsmi: "+this.Soyisim);
    }
}

