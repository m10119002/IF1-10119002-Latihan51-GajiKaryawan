/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan51;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program gaji karyawan
 * Pertemuan 5
 * 
 */
public class Program {
    private enum INPUT {NIK, Nama, Golongan, Jabatan, Kehadiran}
    private static String input = "";
    private static Manager manager = new Manager();
    
    private static boolean cekParsing(String test) {
        try {
            Integer.parseInt(test);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("Pastikan tidak berisi huruf/simbol!");
            return false;
        } catch (Exception ex) {
            System.err.println("Terjadi kesalahan system!");
            return true;
        }
    }
    
    private static boolean masukkanInput(INPUT type, boolean status) {
        boolean hasil;
        Scanner scanner = new Scanner(System.in);
        switch(type) {
            case NIK:
                System.out.print("Masukkan NIK : ");
                input = scanner.nextLine();
                if(input.equals("")) 
                    System.err.println("Pastikan kolom tidak kosong!");
                if(!input.equals("")) return true;
                else return false;
            case Nama:
                System.out.print("Masukkan Nama : ");
                input = scanner.nextLine();
                if(input.equals("")) 
                    System.err.println("Pastikan kolom tidak kosong!");
                if(!input.equals("")) return true;
                else return false;
            case Golongan:
                System.out.print("Masukkan Golongan (1/2/3) : ");
                input = scanner.nextLine();
                if(input.equals("")) 
                    System.err.println("Pastikan kolom tidak kosong!");
                if(!input.equals("")) return cekParsing(input);
                else return false;
            case Jabatan:
                System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
                input = scanner.nextLine();
                if(input.equals("")) 
                    System.err.println("Pastikan kolom tidak kosong!");
                if(!input.equals("")) return true;
                else return false;
            case Kehadiran:
                System.out.print("Masukkan Jumlah Kehadiran : ");
                input = scanner.nextLine();
                if(input.equals("")) 
                    System.err.println("Pastikan kolom tidak kosong!");
                if(!input.equals("")) return cekParsing(input);
                else return false;
            default:
                System.err.println("Terjadi kesalahan system!");
                return true;
        }
    }
    
    private static void masukkanData() {
        System.out.println("Program Perhitungan Gaji Karyawan====");
        boolean status = false;
        while(status!=true) status = masukkanInput(INPUT.NIK, status);
        manager.setNik(input); status = false;
        while(status!=true) status = masukkanInput(INPUT.Nama, status);
        manager.setNama(input); status = false;
        while(status!=true) status = masukkanInput(INPUT.Golongan, status);
        manager.setGolongan(Integer.parseInt(input)); status = false;
        while(status!=true) status = masukkanInput(INPUT.Jabatan, status);
        manager.setJabatan(input); status = false;
        while(status!=true) status = masukkanInput(INPUT.Kehadiran, status);
        manager.setKehadiran(Integer.parseInt(input)); status = false;
    }
    
    private static void tampilHasil() {
        System.out.println("");
        System.out.println("====Hasil Perhitugan====");
        System.out.println("NIK     : ".concat(manager.getNik()));
        System.out.println("NAMA    : ".concat(manager.getNama()));
        System.out.println("GOLONGAN: ".
                concat(Integer.toString(manager.getGolongan())));
        System.out.println("JABATAN : ".concat(manager.getJabatan()));
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN      : ".
                concat(Float.toString(
                        manager.tunjanganGolongan(manager.getGolongan()))));
        System.out.println("TUNJANGAN JABATAN       : ".
                concat(Float.toString(
                        manager.tunjanganJabatan(manager.getJabatan()))));
        System.out.println("TUNJANGAN KEHADIRAN     : ".
                concat(Float.toString(
                        manager.tunjanganKehadiran(manager.getKehadiran()))));
        System.out.println("");
        System.out.println("GAJI TOTAL      : ".
                concat(Float.toString(
                        manager.gajiTotal())));
    }
    
    public static void main(String[] args) {
        masukkanData();
        tampilHasil();
    }
}
