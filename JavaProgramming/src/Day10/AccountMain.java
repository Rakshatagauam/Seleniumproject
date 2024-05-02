package Day10;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Account ac= new Account();
    ac.setAcc_no(123);
    ac.setName("Robert");
    ac.setAmount(50000);
   System.out.println(ac.getAcc_no());
   System.out.println(ac.getName());
   System.out.println(ac.getAmount());
	}

}
