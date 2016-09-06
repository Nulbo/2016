package bit0906;

import java.util.Random;
import java.util.Scanner;

//컴퓨터가 1부터 100까지의 수를 생각. 사용자가 입력해서 맞춤
//틀리면 더 큰 수였는지, 작은 수였는지 한글 힌트를 준다. 

public class HomeWork2 {

	public static void main(String[] args) {			
				Scanner scanner = new Scanner( System.in );
				
				while( true ){
				
					Random r = new Random();
					
					int guessNumber = r.nextInt(100) + 1; 					
					
					int k = r.nextInt( 100 ) + 1;
					
					int max = 100;
					int min = 1;
					int tryCount = 0;
					
					while( true ){
					
						System.out.println( min + "-" + max );
						System.out.print( ++tryCount + ">>");
						int guess = scanner.nextInt();
					
						if( guess > k ) {
							System.out.println( "더 낮게" );
							max = guess;
						} else if( guess < k ){
							System.out.println( "더 높게" );
							min = guess;
						} else {
							System.out.println( "맞았습니다.");
							break;
						}
					}
					
					System.out.print( "다시하시겠습니까?(y/n)>>" );
					String yn = scanner.next();
					if( "y".equals( yn ) == false ){
						break;
					}
				}
				
				scanner.close();
			}		
	}