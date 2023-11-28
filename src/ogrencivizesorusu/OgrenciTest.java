/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrencivizesorusu;

/**
 *
 * @author Semih
 */
   import java.util.ArrayList;
    import java.util.Scanner;
public class OgrenciTest {

public static void main(String args[])
     {
        ArrayList<Ogrenci>ogrenciler=new ArrayList<Ogrenci>();
        Ogrenci ogrenci1 = new Ogrenci(1,"Ezgi","Kaya");
        Ogrenci ogrenci2 = new Ogrenci(2,"Onur","Güven");
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
       
        Scanner input=new Scanner(System.in);
       
        
        
        while(true)
        {
            System.out.println("İşlem yapacağınız bölüm için sayıyı giriniz: ");
        System.out.println("1-Tüm öğrencileri listeleme: ");
        System.out.println("2-Yeni öğrenci ekleme: ");
        System.out.println("3-Id'ye göre öğrenci silme ");
        System.out.println("-1: çıkış");
        int secim = input.nextInt();
        if(secim==1)
           {
            ogrencilerigoster(ogrenciler);
           }
       else if(secim==2)
           {
            System.out.println("Lütfen Öğrenci ID numarasını giriniz");
                    int OgrenciID=input.nextInt();
            System.out.println("Lütfen Öğrenci ismini giriniz");
                    String isim=input.next();
            System.out.println("Lütfen Öğrenci Soyismini giriniz");
                    String Soyisim=input.next();
                    OgrenciEkle(OgrenciID,isim,Soyisim,ogrenciler);
            System.out.println("Öğrenci başarıyla eklendi");
           }
      else  if(secim==3)
          {
            System.out.println("Lütfen Ogrenci ID numarasını giriniz");
            int OgrenciID=input.nextInt();
            IDgoresil(OgrenciID,ogrenciler);
            
          }
      else if(secim== -1){
            break;
        }
       else
         {
             System.out.println("!!!Geçersiz seçim yaptınız");
         }
        
        }
        
      }
             public static void ogrencilerigoster(ArrayList<Ogrenci>ogrenciler)
              {
                 for(int i=0;i<ogrenciler.size();i++)
                 {
                     Ogrenci o=ogrenciler.get(i);
                     o.ogrenciBilgileriniListele();
                     System.out.println();
                 }
                 System.out.println("Listeleme tamamlandı");
              }
             public static void IDgoresil(int OgrenciID,ArrayList<Ogrenci>ogrenciler)
             {
                 boolean kontrol =false;
                 for(int i=0;i<ogrenciler.size();i++)
                 {
                     if(ogrenciler.get(i).getOgrenciID()==OgrenciID)
                     {
                             
                         kontrol = true;
                         ogrenciler.remove(i);
                         System.out.println("Öğrenci başarıyla silindi");
                         break;
                     }
                 }
                 if(kontrol==false)
                 {
                     System.out.println("Girdiğiniz ID'de öğrenci bulunmamaktadır");
                 }
             }
             public static void OgrenciEkle(int OgrenciID,String isim,String Soyisim,ArrayList<Ogrenci>ogrenciler )
             {
                Ogrenci ogr=new Ogrenci(OgrenciID,isim,Soyisim);
                ogrenciler.add(ogr);
             }
}

            

  


