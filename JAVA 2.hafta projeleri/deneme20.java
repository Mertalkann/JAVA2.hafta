package simkus;

public class deneme20 {

	public static void main(String[] args) 
	{
		SayiBulmaca();
	}
	public static void SayiBulmaca() 
	{
		  int[] number = {1, 2 , 3, 4, 7};
		  int finder = 70 ;
		  
		  for(int i=0;i<number.length;i++)
		   {
	    	 if(finder == number[i]) 
	    	 {
	    		 MesajVer("bulundu");
	    		 return;
	    	 }
		   }
		  MesajVer("bulunamadı");
	}
	
	public static void MesajVer(String mesaj) 
	{
		 System.out.println(mesaj);
	}
}
