
import java.util.*;

class NewNumException extends Exception{
	public NewNumException() {
		super("3�ڸ��� �Ѿ�� ���ڸ� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
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
			System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("�Է¹��� ���ڿ��� ���ڰ� �ƴմϴ�. ���α׷��� �����մϴ�.");
		} catch (NewNumException e) {
			System.out.println("3�ڸ��� �Ѿ�� ���ڸ� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
		}
	}

}
