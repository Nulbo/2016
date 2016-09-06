package bit0905;

public class ConstantTest {
	public static void main(String[] args ) { 
		
		final int CONST_NUMBER = 10; //값 대입은 여기서 끝. 상수에 final 붙임. 변수는 소문자, 상수는 대문자.다시 값대입 안됨 
		final double PI = 3.14;
		
		int number = 10;
		System.out.println( number );
		
		number = 20;
		System.out.println( number );
		
	}

}
