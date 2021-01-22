
public class CompileTimeTypeError2 {
	public static void main(String[] args) {
		/* Type error: Refer to undeclared variable */
		int i = 23;
		int j = i * 2;
		System.out.println(j / 3);
	}
}

