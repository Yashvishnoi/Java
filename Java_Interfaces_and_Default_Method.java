interface  camera {
	void TakePic() ;
	void VideoRecord();
	
	private void greet() { // We can't override this method
		System.out.println("Hey Gems ");
	}
	
	default void RecordVideo() {    // We can override this  
		greet();
		System.out.println("Recording in 1040p");
	}
}

interface wifi {
	String[] getNetwork();
}

class MyPhone{
	void callNumber(int phonenumber) {
		System.out.println("Calling..."+phonenumber);
	}
	
	void Pickcall(int number) {
		System.out.println("Incoming..."+number);
	}
}
class MySmartPhone extends MyPhone implements camera,wifi {
public void TakePic() {
	System.out.println("Photo taken");
}

public void VideoRecord() {
	System.out.println("Video Recorded");
}
	
public String[] getNetwork() {
	System.out.println("Getting list of network");
	String[] list= {"Wifi 1","Hotspot 021478"};
	return list; 
}

/* We can Override this
 
 public void RecordVideo() {
 	System.out.println("Recording in 2040p");
}

*/
	
}



public class Java_Interfaces_and_Default_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartPhone ms= new MySmartPhone();
		
		ms.RecordVideo();
		
		// ms.greet(); We can't access this ERROR because it is private
		
		String[] ar = ms.getNetwork();
		for(String item : ar) {
			System.out.println(item);
		
		
		}
	}
}
