package tr.org.linux.kamp.karaklerler;

public class StringGelismis {

	
	public static void main(String[] args) {
		String str="hello world";
		System.out.println(str.substring(0, 5));// hello w     ekran çıktıları.
		System.out.println(str.substring(1, 4));//  ell
		System.out.println(str.substring(0, 7));//hello
		
		System.out.println(str.indexOf(' '));	//boşluğun index nosunu verir. 
		System.out.println(str.indexOf('e'));	//e harfinin index nosunu verir. 
		System.out.println(str.indexOf("w"));	//w nin index nosunu verir. 
		System.out.println(str.indexOf(' '+1, str.length()));	//world kelimesinin index nosunu verir.
		System.out.println(str.charAt(str.length()-1));	//d 
		System.out.println(str.indexOf('1', 4));	//birincisi char ikincisi index
		//yukarıdaki indexOf metodlarının farklı kullanımları. noktaya basınca alternatiflerden.
		
		System.out.println(str.substring(0,2)=="he");	//false döndürür. çünkü referanslar farklı.
		System.out.println(str.substring(0,2).equals("he"));	//true döndürür.

	}
}
