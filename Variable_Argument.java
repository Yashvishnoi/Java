
public class Variable_Argument {
	static int Sum(int ...arr) {
		int total = 0;
		for(int a:arr) {
			total+=a;
		}
	return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of 2 number " +  Sum(2,5));
		System.out.println("Sum of 3 number " +  Sum(2,5,7));
		System.out.println("Sum of 4 number " +  Sum(2,5,7,8));
		System.out.println("Sum of 5 number " +  Sum(2,5,7,8,9));
		
	}

}
