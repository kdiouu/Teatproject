package teatProject;

/*
 *  字母A -- 65 (Decimal) -- 41(Hex)
 * 
 */

import java.util.Arrays;

public class DecimalHex {
	public static void main(String[] args) throws Exception {

		// 0. String to Bytes
		byte[] s = "A".getBytes();

		System.out.println("------------------");
		// 1-1. print "A".getBytes(); //65
		for (byte b : s) {
			System.out.println("1-1. for each method: " + b);
		}

		// 1-2. print "A".getBytes(); // 65
		for (int i = 0; i < s.length; i++) {
			System.out.println("1-2. for loop method: " + s[i]);
		}

		// 1-3. print address of "A".getByte();
		System.out.println("1-3(X). address of A.getBytes: " + s);

		// 1-4. print s[0]
		System.out.println("1-4. print s[0]: " + s[0]);

		// 1-5. print "A".getBytes(); //65
		String ss = Arrays.toString(s);
		System.out.println("1-5. Arrays.toString: " + ss);

		// 1-5-1. delete []
		String sss = ss.replace("[", "").replace("]", "");
		System.out.println("1-5-1. Arrays.toString & delete []: " + sss);

		System.out.println("------------------");
		// 2-1 convert to int & cast type
		int ssss = Integer.valueOf(sss);
		System.out.println("2-1. convert to int type: " + ssss);
		
		System.out.println("------------------");
		
		// 3-1 print with %X
		System.out.printf("3-1 printf : 0x%X\n", ssss);
		
		// 3-2 toHexMethod
		String sssss = Integer.toHexString(ssss);
		System.out.println("3-2 toHexMethod: "+sssss);


	}
}
