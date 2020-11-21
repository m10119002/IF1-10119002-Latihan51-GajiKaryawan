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
 * Deskripsi Program : Class untuk objek Manager
 * Pertemuan 5
 * 
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran() {return this.kehadiran;}
    public void setKehadiran(int kehadiran) {this.kehadiran = kehadiran;}
    public float tunjanganKehadiran(int hadir) {
        this.tunjanganKehadiran = this.kehadiran * 10000;
        return this.tunjanganKehadiran;
    }
    public float tunjanganJabatan(String jabatan) {
        switch(jabatan) {
            case "Manager":
                this.tunjanganJabatan = 2000000;
                break;
            case "Kabag":
                this.tunjanganJabatan = 1000000;
                break;
            default:
                this.tunjanganJabatan = 0;
                break;
        }
        return this.tunjanganJabatan;
    }
    public float tunjanganGolongan(int golongan) {
        switch(golongan) {
            case 1:
                this.tunjanganGolongan = 500000;
                break;
            case 2:
                this.tunjanganGolongan = 1000000;
                break;
            case 3:
                this.tunjanganGolongan = 1500000;
                break;
            default:
                this.tunjanganGolongan = 0;
                break;
        }
        return this.tunjanganGolongan;
    }
    public float gajiTotal() {
        return this.tunjanganJabatan + this.tunjanganGolongan 
                + this.tunjanganKehadiran;
    }
}
