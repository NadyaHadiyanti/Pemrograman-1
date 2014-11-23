import java.util.*;

public class DemoOverloading
{
	public static void main(String[] Xx)
	{
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "Candra";
		d.email = "Ichan@gmail.com";
		d.info();
	}
}