package bit0906;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in ); 

		System.out.println( "소수인지 판단할 숫자 : " );
		int num = scanner.nextInt(); 
		
		int divisor = 2; 
		boolean isPrime = true;
		
		while( divisor < num ) {  
			int result = num % divisor ;
			if( result == 0 ) {   //소수가 아님  		
				isPrime = false;
				break; 
			}else{
				isPrime = true; 			
         }	
			
			divisor++;
			
		if ( isPrime = false ) { 
			System.out.println( num + "은 소수입니다.");		
	    } else { 
			System.out.println( num + "은 소수가 아닙니다.");
		}
	  }
    }
}