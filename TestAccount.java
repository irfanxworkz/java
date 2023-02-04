public class TestAccount
{
	public static void main(String args[])
	{
		//creating instance of Account class
		Account acc=new Account();
		
		//setting values through setter method
		acc.setAcc_no(264578451212L);
		acc.setEmail("khan@gmail.com");
		acc.setName("Irfan");
		acc.setAmount(50000f);

		//getting value through getter methods
		System.out.println("Account no: "+acc.getAcc_no());
		System.out.println("Email id: "+acc.getEmail());
		System.out.println("Account Holder name: "+acc.getName());
		System.out.println("Balamce: "+acc.getAmount());
	} 
}