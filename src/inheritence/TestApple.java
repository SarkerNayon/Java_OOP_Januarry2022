package inheritence;

public class TestApple {

	public static void main(String[] args) {
//		//single 
//		IPhone iPhone = new IPhone();
//		iPhone.iPhoneInfo();
//		iPhone.appleInfo();
//		
//		//Multilevel
//		AppleWatch iWatch = new AppleWatch();
//		iWatch.appleWatchInfo();
//		iWatch.iPhoneInfo();
//		iWatch.appleInfo();
		
		//Hierarchical
		Airpods airpods = new Airpods();
		airpods.airpodInfo();
		airpods.iPhoneInfo();
		airpods.appleInfo();

	}

}
