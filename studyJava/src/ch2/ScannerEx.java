package ch2;
import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 하나 입력해주세요.>");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용:" + input);
		System.out.printf("num=%d\n", num);
		
	}
	
}
