package simkus;

public class deneme21 {

	public static void main(String[] args) 
	{
		Ekle();
		String mesaj = "hava çok güzel";
		String yenimesaj = mesaj;
		System.out.println(yenimesaj);
		int sayi = topla(4,6);
	
	}
	public static void Ekle()
	{
		 System.out.println("eklendi");
	}
	public static int topla(int sayi1,int sayi2)
	{
		 return sayi1 + sayi2;
	}
	

}
