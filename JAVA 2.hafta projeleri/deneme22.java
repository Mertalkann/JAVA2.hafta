package simkus;

public class deneme22 {

	public static void main(String[] args) 
	{
		int total = topla(2,7,89,5,1);
		System.out.print(total);
	}
	
	public static int topla(int... sayilar)
	{
		 int toplam = 0;
		 for(int sayi:sayilar)
		 {
			 toplam+=sayi;
		 }
		 return toplam;
	}
	

}
