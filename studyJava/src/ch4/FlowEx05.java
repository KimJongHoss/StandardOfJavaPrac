package ch4;
import java.util.*;

public class FlowEx05 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		System.out.printf("입력하신 점수는 %d입니다. \n", score);
		
		if (score >= 90) { //score가 90점보다 같거나 크면 A학점(grade)
			grade = 'A';
			if (score >= 98) { //90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if (score <94) { //90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >=80) { //scoer가 80점보다 같거나 크면 B학점(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade ='C'; //나머지는 C학점(grade)
		}
		System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
	}
}
