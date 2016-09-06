package bit0906;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "승수 : " );
		
		int pow = scanner.nextInt(); 
		
		//Q. 아래 while 반복문을 작성하시오.
		 int i = 0; 
		 int result = 1; 
		 while ( i < pow ) { 
			 result = result * 2; 
			 i++; 
		 }
			System.out.println("2의" + pow + "승은" + result + "입니다." );
      }
}
