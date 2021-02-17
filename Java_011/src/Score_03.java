import com.callor.applications.service.ScoreServiceV2;

public class Score_03 {
	public static void main(String[] args) {
		
		ScoreServiceV2 scService2 = new ScoreServiceV2();
		scService2.print(1,2,3);
		
		//ScoreServiceV2 클래스의 sum() 메서드를 호출하면서 정수 1,2,3을 전달
		scService2.sum(1,2,3);
		//sum() method에는 3개의 정수형 매개변수가 선언되어있고 sum() method를 호출할 때 3개 미만이거나 3개보다 많은 값을
		//전달하면 문법오류가 난다.
		scService2.sum();
	}
}
