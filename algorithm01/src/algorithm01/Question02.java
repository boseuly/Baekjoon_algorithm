package algorithm01;

public class Question02 {

	public static void main(String[] args) {
/*		고양이를 출력한다.
		\    /\
 		 )  ( ')
 		(  /  )
		 \(__)|
*/
		// 줄바꿈 이용 안 한 풀이
		System.out.println("\\    /\\");		// \ 는 escape문자 -> \\ -> \로 출력,  \의 경우는 escape문자 불필요
		System.out.println(" )  ( \')");	 	// '(작은 따옴표)나 "(큰따옴표)는 escape문자가 필요
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		// 줄바꿈 이용한 풀이
		System.out.println("\\    /\\\n )  ( \')\n(  /  )\n \\(__)|");
	
	
	}

}
