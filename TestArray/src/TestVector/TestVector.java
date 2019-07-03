package TestVector;

public class TestVector {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(sum1(a));
		System.out.println(sum2(a));
	}

	private static int sum2(int[] a) {
		int result = 0;
		for(int i : a)
			result  += i;
		return result;
	}

	private static int sum1(int[] a) {
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
}
