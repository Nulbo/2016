package bit0906;

public class MultiTable {

	public static void main(String[] args) {
	    int i = 1; 
	    while( i <=9 ) { 
	    	
	    	int j = 1; 
	    	while( j <= 9 ) { 
	    		int result = i * j ; 
	    		    	System.out.println( i + " x " + j + " = " + result );
	    	j++;	    	
	       }
	     i++; 	
	   }
  }
}