package bit0906;

public class Arith {

	public static void main( String[] args ) { 
		
        int a = 7; 
        int b = 3; 
        
        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );
        
        a = a + 1; 
        System.out.println( a );
        
        a += 1; 
        System.out.println( a );
        
        ++a;
        System.out.println( a );
        
        a++; 
        System.out.println( a );
        
        System.out.println( a++ );
        //System.out.println( a );
		//a++; 
		
        System.out.println( ++a );
        //++a;
        //System.out.println( a ); 
        
        //나누기 연산
        System.out.println( 10 / 3 );
        System.out.println( 10. /3. );
        System.out.println( 10. /3 );
        
        System.out.println( (double) 10 / 3 );    //
        System.out.println( (double) (10/3) );    // 괄호 먼저계산 - 10/3 의 결과를 casting 하므로 3.0이 나온다. 
        
        // 나머지 연산
        System.out.println( 44 % 3 );
        System.out.println( -7 % 3 );
        System.out.println( 7 % -3 );       
	}			
}