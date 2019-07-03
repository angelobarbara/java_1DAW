package stringTest;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("0");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		for(int i=1; i<10; i++)
			sb.append(i);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		}
}
