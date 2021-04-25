
public class Deadlock {
	
	String s1="Aman";
	String s2 = "Vijay";
	Thread t1 = new Thread() {
		public void run() {
			while(true) {
				synchronized(s1){
					try {
						System.out.println(Thread.currentThread().getName()+"locked"+s1);
						Thread .sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(s2) {
						System.out.println(Thread.currentThread().getName()+"locked"+s2);
						System.out.println(s1+s2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			while(true) {
				synchronized(s2){
					synchronized(s1) {
						System.out.println(Thread.currentThread().getName()+"locked"+s1);
						System.out.println(s1+s2);
					}
				}
			}
		}
	};
	public static void main(String[] args) {
		Deadlock obj = new Deadlock();
		obj.t1.start();
		obj.t2.start();
	}
}
