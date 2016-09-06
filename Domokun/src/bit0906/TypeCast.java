package bit0906;
 
public class TypeCast {
	
	public static void main(String[] args ){ 

		//implicity(암시적) typecasting  
		int i = 10;
		long l = i; 
		
		//explicity(명시적) 
		long l2 = 123456789;
		// int i2 = (int) l2;    int 임을 써줘야 에러가 안남. 
		
		System.out.println( i + ": " + l );
	}

}
