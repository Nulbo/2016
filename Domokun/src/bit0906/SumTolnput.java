package bit0906;

import java.util.Scanner;

public class SumTolnput {

	public static void main(String[] args) {
	// 0부터 입력된 값 까지의 합 
		
		Scanner scanner = new Scanner ( System.in );
		System.out.print( "입력값: " );
		int input = scanner.nextInt(); 

		int sum = 0; 
		for( int i = 0; i <= input; i++ ) { 
			sum +=i; 
		}
		
		System.out.println( "총합 : " + sum );
		scanner.close();
	}
}
//		
//		int i = 0; 
//		int sum = 0;
//		
//		while( i <= num ) { 
//		    sum = sum + i;  
//				++i;	
//		} 				
//		System.out.println( "총 합 : " + sum );		
//	}
//}
