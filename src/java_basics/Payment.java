package java_basics;
//
interface Payment {
	public void pay(int amount);

}
class Upi implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("enter upi number");
		
	}
	
}
class Credit implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("enter card details");
		
	}
	
}
