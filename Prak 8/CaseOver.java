import java.util.Scanner;
public class CaseOver {
	public static void main (String [] args) {
		int menu;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pilihan penjelasan definisi dan contoh");
		System.out.println("1. Overloading");
		System.out.println("2. Overriding");
		System.out.println("--------------------------");
		System.out.print("Masukkan pilihan Anda = ");
		menu = input.nextInt();
		
		switch(menu){
			case 1 : System.out.println("Definisi Overloading : ");
					 System.out.println("Overloading adalah method dengan nama yang sama dengan method lain pada suatu class tetapi dengan parameter yang berbeda. Tujuan dibuatnya overloading yaitu memudahkan penggunaan method dengan fungsi yang hampir sama.");
					 System.out.println("");
					 System.out.println("Contoh program Overloading : ");
					 System.out.println("class Pertambahan {");
					 System.out.println(" public void tambah1() {");
					 System.out.println(" int a=5, b=10;");
					 System.out.println(" System.out.println(''" + "Hasil Pertambahann dari metod tambah1 ke-1 = ''" + "+(a+b));");
					 System.out.println(" }");
					 System.out.println("");
					 System.out.println(" //Metod tambah1 di overloading dengan 2 parameter (int x, int y)");
					 System.out.println(" public void tambah1(int x, int y) {");
					 System.out.println(" System.out.println(''" + "Hasil Pertambahann dari metod tambah1 ke-2 = ''" + "+(x+y));");
					 System.out.println(" }");
					 System.out.println("");
					 System.out.println(" public static void main(String [] args) {");
					 System.out.println("   Pertambahan pp;");
					 System.out.println("   pp = new Pertambahan();");
					 System.out.println("   pp.tambah1();	 //memanggil metod tambah1 ke-1");
					 System.out.println("   pp.tambah1(5,5); //memanggil metod tambah1 ke-2");
					 System.out.println(" }");
					 System.out.println("}");
			break;
			case 2 : System.out.println("Definisi Overridding : ");
					 System.out.println("Overriding  memiliki method yang namanya sama namun berbeda class. Method pertama adalah method yang berasal dari class induk dengan parameter yang sama dengan method pada class anak. Pada Overriding nama method dan parameternya pada kedua classnya harus sama.");
					 System.out.println("");
					 System.out.println("Contoh program Overridding : ");
					 System.out.println("class Nama { ");
					 System.out.println("public void Sapa() { ");
					 System.out.println("System.out.println(''" + "Achmad Cahya Aditya''" + ");");
					 System.out.println(" } ");
					 System.out.println("public static void main(String [] args) { ");
					 System.out.println("Siapa ss;");
					 System.out.println("Nama nn;");
					 System.out.println("ss = new Siapa();");
					 System.out.println("nn = new Nama();");
					 System.out.println("");
					 System.out.println("ss.Sapa();  //memanggil method Sapa() pada class Siapa");
					 System.out.println("nn.Sapa();  //memanggil method Sapa() pada class Nama");
					 System.out.println("}");
					 System.out.println("}");
					 System.out.println("class Siapa extends Nama { ");
					 System.out.println("//Method Sapa() pada class Nama di override");
					 System.out.println("public void Sapa() {");
					 System.out.println("System.out.println(''" + "Yesica Dwi Lestari''" + ");");
					 System.out.println("}");
					 System.out.println("}");
			break;
			default : System.out.println("Menu tidak tersedia");
		}	
	}
}