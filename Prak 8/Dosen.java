//Perintah Class & Object - Dosen
import java.util.*;

public class Dosen
{
	String nama;
	String email;
	
	public Dosen(String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	public Dosen() {}
	
	//Method
	public void info()
	{
		System.out.println("Nama Dosen  : " + nama);
		System.out.println("Email Dosen : " + email);
		System.out.println();
		System.out.println();
	}
}