class Hamster { //nama kelas
//deklarasi variabel
	String Nama; //mendeklarasikan variabel Nama yang bertipe data string
	String Jenis; //mendeklarasikan variabel Jenis yang bertipe data string
	String Umur; //mendeklarasikan variabel Umur yang bertipe data string
	String Berat; //mendeklarasikan variabel Berat yang bertipe data string
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama
	}
	public void setNama(String x){ //deklarasi set untuk atribut Nama
		this.Nama=x;
	}
	
	public String getJenis(){ //inisialisasi nilai Jenis
		return Jenis; //mengembalikan nilai Jenis
	}
	public void setJenis(String y){ //deklarasi set untuk atribut Jenis
		this.Jenis=y;
	}
	
	public String getUmur(){ //inisialisasi nilai Umur
		return Umur; //mengembalikan nilai Umur
	}
	public void setUmur(String a){ //deklarasi set untuk atribut Umur
		this.Umur=a;
	}
	
	public String getBerat(){ //inisialisasi nilai Berat
		return Berat; //mengembalikan nilai Berat
	}
	public void setBerat(String b){ //deklarasi set untuk atribut Berat
		this.Berat=b;
	}
	
	public static void main(String [] args){
		Hamster hammy = new Hamster();
		hammy.setNama("Mikko"); //mengisi nilai setter Nama 
		System.out.print("Nama hamster : "); //output kalimat
		System.out.print(hammy.getNama()); //memanggil setter Nama dengan getter
		
		hammy.setJenis("White Winter"); //mengisi nilai setter Jenis
		System.out.print("\nJenisnya adalah : "); //output kalimat
		System.out.print(hammy.getJenis()); //memanggil setter Jenis dengan getter
		
		hammy.setUmur("4 bulan"); //mengisi nilai setter Umur
		System.out.print("\nUmurnya adalah : "); //output kalimat
		System.out.print(hammy.getUmur()); //memanggil setter Umur dengan getter
		
		hammy.setBerat("10 ons"); //mengisi nilai setter Berat
		System.out.print("\nBeratnya adalah : "); //output kalimat
		System.out.print(hammy.getBerat()); //memanggil setter Berat dengan getter
	}
}