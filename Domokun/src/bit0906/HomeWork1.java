package bit0906;

import java.util.Scanner;

public class HomeWork1 {
// 3,6,9 게임 만들기 : 3에서 짝, 6에서 짝, 9에서 짝, 30에서 짝, 36에서 짝짝... 
// 정수값에 3의 배수가 몇 개 들어갔나 ? x -> 문자열로 생각할 것.  
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner( System.in );
			System.out.print( "수를 입력하시오 : " );
					
			int number = 369; 
			String s = String.valueOf( number ); 
			
			System.out.println( s.length() );
			char c = s.charAt( 2 ); 
			System.out.println( c );
			
			int clapCount = 0; 
			if( c =='3' || c == '6' || c == '9' ) { 
				clapCount++; 
			}
												
//			if( number % 3 == 0 ) {
//				System.out.println( "3의 배수입니다." );
//			}	
			scanner.close();
		}
	}	
