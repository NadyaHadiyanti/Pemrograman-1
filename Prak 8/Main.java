//Perintah Class & Object - Main
//package Latihan01.sesi1.bin;
import java.util.*;

public class Main
{
	public static void main(String[] Xx)
	{
		Mahasiswa.jumlah = 0;
		//Mahasiswa.nim = "999"; //error, instance variabel harus ada objectnya dulu
		System.out.println("Jumlah Mahasiswa : " + Mahasiswa.jumlah);
		
		Mahasiswa m1 = new Mahasiswa();
		m1.nim = "123";
		m1.nama = "Candra";
		m1.jumlah = 1;
		
		Mahasiswa m2 = new Mahasiswa();
		m2.nim = "456";
		m2.nama = "Nursari";
		m2.jumlah = 2;
		
		tampilkanMahasiswa(m1);
		tampilkanMahasiswa(m2);
		System.out.println("Jumlah Mahasiswa : " + Mahasiswa.jumlah);
	}
	
	public static void tampilkanMahasiswa(Mahasiswa m)
	{
		System.out.println(" NIM    : " + m.nim);
		System.out.println(" Nama   : " + m.nama);
		System.out.println(" Jumlah : " + m.jumlah);
		System.out.println("");
		System.out.println("");
	}
}