package teatProject;

import java.util.Arrays;

public class DecimalHex2 {
	public static void main(String[] args) {
		byte[] a = "AB".getBytes();
		
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		String ad = Arrays.toString(a);
		System.out.println(ad);
		String ads = ad.replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
		long  adsf = Integer.valueOf(ads);
		System.out.println(adsf);
		String adsfg = Long.toHexString(adsf);
		System.out.println(adsfg);
		
	}
}
