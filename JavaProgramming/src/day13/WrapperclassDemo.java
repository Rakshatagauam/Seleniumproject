package day13;

public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*int a=100;  //primati
        System.out.println(a);
        
        Integer a=100;  //objet one
        System.out.println(a); */
		
		byte b=10;
		short s=20;
		int a=30;
		long l=40;
		float f= 50.0F;
		double d= 34.45;
		char c= 'a';
		boolean b2= true;
		// coverting primative into object : autoboxing
		
		Byte byteobj = b;
		Short shortobj= s;
		Integer intobj= 30;
		Long longobj= l;
		Float floatobj= f;
		Double doubleobj= d;
		Character charobj= c;
		Boolean booleanobj = b2;
		
		System.out.println("Byte objet: " + byteobj);
		System.out.println("short objet: "+ shortobj);
		System.out.println("Integer obj: " + intobj);
		System.out.println("Long obj: " + longobj);
		System.out.println("Float obj: "+ floatobj);
		System.out.println("double obj: " +doubleobj);
		System.out.println("har obj: " +charobj);
		System.out.println("Boolean obj: " +booleanobj);
		
		//oering objet into primatie : unboing
		
		byte bytevalue= byteobj;
		
		System.out.println("byte value: " +bytevalue);
		
		
		
		
		
		
        
	}

}
