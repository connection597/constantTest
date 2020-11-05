package constantTest;

public class ConstastTest {

class Constant{
	
}
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		// MAX_SCORE =90; 상수의 값을 변경할 수 없다.
		System.out.println("최고 점수 : " +MAX_SCORE);
		System.out.println("최하 점수 : " +MIN_SCORE);
		
		int myScore = 95;
		System.out.println("최고 점수 : " + MAX_SCORE+ "획득점수: " 
		                    + myScore + "최고점수와 획득점수의 차:" +(MAX_SCORE - myScore));
		

	}

}
