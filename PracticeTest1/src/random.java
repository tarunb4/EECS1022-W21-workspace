
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 37;
//		int j = 11;
//		int k = 3;
//		System.out.println(((i%j) * (j/k)) % 4);
		
		
		
		
//		
//		(s + i) + j + k
//		s + (i + j) + k
//		
	
		boolean p = false;
		boolean q = false;
		boolean conjunction = p && q;
		boolean dis = p || q;
		System.out.println(!conjunction);
		System.out.println(!dis);
		
		p = true;
		System.out.println(!conjunction);
		System.out.println(!dis);
		
//		int count = 0;
//		for(int i = -99; i < 903; i += 3) {
//			count += 1;
//			System.out.println("Hello" + count);
//		}
		
//		int count = 0;
//		for(int i = -49; i < 49; i++) {
//			count += 1;
//			System.out.println("Outcome" + count);
//		}
		
		double a = 3.4;
		double b = ((int) a) * 3;
		System.out.println(b);
		
		double c = ((int) a) + 2.7;
		System.out.println(c);
		
		double d = (((int) c) * 3)/2;
		System.out.println(d);
		
		d = (b *3) / 2;
		System.out.println(d);
		
		}

	}


