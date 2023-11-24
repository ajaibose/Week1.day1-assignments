package week1.day1;

public class Mobile {

	
	public void makeCall() {
		
		String mobileModel = "Switched On";
		float mobileWeight = 70.50f;
		
		System.out.println("Mobile mode is:" +mobileModel);
		System.out.println("Mobile weight is:" +mobileWeight);
	}
	
public void sendMsg() {
	
	Boolean isFullCharged = true;
	int mobileCost = 20000;
	
		System.out.println("Is mobile fully charged:" +isFullCharged);
		System.out.println("Mobile cost is:" +mobileCost);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is my mobile");

Mobile obj = new Mobile();
obj.makeCall();
obj.sendMsg();

	}

}
