/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2266008_pbo_lat60;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas karakter
public class Karakter {
    //variabel
   private String nama;
    private String jenisKelamin;
    private String profesi;
    //konstruktor
    public Karakter(String nama, String jenisKelamin, String profesi) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.profesi = profesi;
    }
    //metode get dan set
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getProfesi() {
        return profesi;
    }
    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }
    //metode menampilkan tampilan karakter
    public void tampilKarakter() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Profesi : " + profesi);
    }
}
//kelas akatsuki turunan dati karakter
class Akatsuki extends Karakter {
    //variabel
    private String cincin;
    //konstruktor
    public Akatsuki(String nama, String jenisKelamin, String cincin) {
        super(nama, jenisKelamin, "Anggota Akatsuki");
        this.cincin = cincin;
    }
    //metode get dan set
    public String getCincin() {
        return cincin;
    }
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }
    @Override
    //metode menampilkan tampilan karakter
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Cincin : " + cincin);
    }
}
//kelas pemimpinakatsuki turunan dari kelas akatsuki
class PemimpinAkatsuki extends Akatsuki {
    //variabel
    private String panggilan;
    //konstruktor
    public PemimpinAkatsuki(String nama, String jenisKelamin, String cincin, String panggilan) {
        super(nama, jenisKelamin, cincin);
        this.panggilan = panggilan;
    }
    //metode get dan set
    public String getPanggilan() {
        return panggilan;
    }
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
    @Override
    //metode menampilkan tampilan kararakter
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Panggilan : " + panggilan);
    }
}
//krlas AnggotaAkatsuki turuanan dari kelas Akatsuki
class AnggotaAkatsuki extends Akatsuki {
    //variabel
    private String senjata;
    //konstruktor
    public AnggotaAkatsuki(String nama, String jenisKelamin, String cincin, String senjata) {
        super(nama, jenisKelamin, cincin);
        this.senjata = senjata;
    }
    //metode get dan set
    public String getSenjata() {
        return senjata;
    }
    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }
    @Override
    //metode menampilkan tampilankarakter
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Senjata : " + senjata);
    }
    //metode menjalankan program
    public static void main(String[] args) {
        Karakter karakter1 = new PemimpinAkatsuki("Pain", "Laki-laki", "零", "Tendo");
        karakter1.tampilKarakter();
        
        System.out.println(" ");

        Karakter karakter2 = new AnggotaAkatsuki("Itachi Uchiha", "Laki-laki", "朱", "Kunai");
        karakter2.tampilKarakter();
    } 
    
}
