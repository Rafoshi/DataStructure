package binarySearch;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonnaci(9));
	}
	
	public static int fibonnaci(int x) {
		if(x == 1 || x == 0) {
			return x;
		}
		return fibonnaci(x - 1) + fibonnaci(x - 2);
	}

}
