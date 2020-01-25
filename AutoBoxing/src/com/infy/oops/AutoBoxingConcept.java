package com.infy.oops;

public class AutoBoxingConcept{
	public static void main(String[] args) {
		
		/*Byte b1 = new Byte((byte) 12);//syntax for autoboxing
		byte bb1 = b1;//unautoboxing primitive to wrapper class 
		System.out.println(bb1);
		
		Integer ii = new Integer((int)44);
		int iii = ii;
		System.out.println(iii);
		
		Float f = new Float((float)5.5);
		float ff = f;
		System.out.println(ff);
		
		Double d = new Double((double)55.22);
		double dd = d;
		System.out.println(dd);
		
		Character c = new Character((char)'s');
		char cc = c;
		System.out.println(cc);
		 
		Short s = new Short((short)258);
		short ss = s;
		System.out.println(ss);
		
		Long l = new Long((long)4567825);
		long ll = l;
		System.out.println(ll);
		
		*/
		
		
		
		String s = "200";//string to integer
		int a = Integer.parseInt(s);
		System.out.println(a);
		
		String w = "111";
		Float f = Float.parseFloat(w);
		System.out.println(f);
		
		float t = 5.5f;
		int tt = (int)t;
		System.out.println(tt);
		
		
		int b = 34;//integer to string
		String ss = String.valueOf(b);
		System.out.println(ss);
		
		
		
	}

}		
