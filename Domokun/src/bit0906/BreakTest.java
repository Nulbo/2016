package bit0906;

public class BreakTest {

	public static void main(String[] args) {
          int num = 0;
          int sum = 0; 
          
          while( true ) { 
        	  sum += num; 
        	  
        	  if( sum > 5000 ) { 
        		  break;          //중첩문 안에 있으면 그것 하나만 빠져나간다. 
        	  }
        	  
        	   num++; 
          }
          System.out.println( sum ); 
          	}
}