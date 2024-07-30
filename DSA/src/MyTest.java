
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account checkin=new Account("checking",0.93);
		System.out.println(checkin);
		Account account=new Account();
		account.adjust(1000);
		account.adjust(-200);
		System.out.println(account);
	}

}
