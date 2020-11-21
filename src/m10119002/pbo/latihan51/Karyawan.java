/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan51;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Karyawan
 * Pertemuan 5
 * 
 */
public class Karyawan {
    protected String nik, nama, jabatan;
    protected int golongan;
    
    public String getNik() {return this.nik;}
    public void setNik(String nik) {this.nik = nik;}
    public String getNama() {return this.nama;}
    public void setNama(String nama) {this.nama = nama;}
    public String getJabatan() {return this.jabatan;}
    public void setJabatan(String jabatan) {
        String l_jabatan = jabatan.toLowerCase();
        switch (l_jabatan) {
            case "manager":
                this.jabatan = "Manager";
                break;
            case "kabag":
                this.jabatan = "Kabag";
                break;
            default:
                this.jabatan = jabatan;
                break;
        }
    }
    public int getGolongan() {return this.golongan;}
    public void setGolongan(int golongan) {this.golongan = golongan;}
}
