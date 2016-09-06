package bit0906;

public class InfiniteLoop {

	public static void main(String[] args) {
          // for( ; ; )  - for문의 무한루프 
        	  
		      int i = 0; 
		      int sum = 0; 
		      
        	  while( true ) 	{  //while문의 무한루프
        		  i++; 
        		  if( i > 1000 ) { 
        			  break; 
        		  }
        		  
        		 sum += i;  
        		 i++; 
          }
        	
          System.out.println( sum ); 
    }  
}	
  