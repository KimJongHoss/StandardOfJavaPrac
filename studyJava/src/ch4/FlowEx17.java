package ch4;
import java.util.*;

public class FlowEx17 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(temp);
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//main의 끝
}
