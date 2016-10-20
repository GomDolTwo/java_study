
import java.util.*;

class NewNumException extends Exception{
	public NewNumException() {
		super("3자리를 넘어가는 숫자를 입력하였습니다. 프로그램을 종료합니다.");
	}
}

public class QuickCoding03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String as, bs;
		int ai, bi;
		
		try {
			System.out.print("Enter a number 1 : ");
			as = in.nextLine();
			
			System.out.print("Enter a number 2 : ");
			bs = in.nextLine();
			
			ai = Integer.parseInt(as);
			bi = Integer.parseInt(bs);
			
			if ((ai>=1000) || (bi>=1000))
			{
				throw new NewNumException();
			}
			else
			{
				System.out.println("Number 1 / Number 2 is -> " + (ai/bi));
			}
		
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
		} catch (NumberFormatException e) {
			System.out.println("입력받은 문자열이 숫자가 아닙니다. 프로그램을 종료합니다.");
		} catch (NewNumException e) {
			System.out.println("3자리를 넘어가는 숫자를 입력하였습니다. 프로그램을 종료합니다.");
		}
	}

}
