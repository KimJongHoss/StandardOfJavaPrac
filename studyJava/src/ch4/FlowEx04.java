package ch4;
import java.util.*;

public class FlowEx04 {
	public static void main(String[] args) {
		int score = 0; //점수를 저장하기 위한 변수
		char grade = ' '; //학점을 저장하기 위한 변수. 공백으로 초기화
		
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >=80) {
			grade = 'B';
		} else if (score >=70) {
			grade = 'C';
		} else {
			grade ='D';
		}
		System.out.printf("당신의 학점은 %c 입니다.", grade);
	}
}
