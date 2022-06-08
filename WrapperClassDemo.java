class WrapperClassDemo{
	public static void main(String[] args){
		
		//1 . Converting primitive to Wrapper class (Boxing)
		int a = 10;
		Integer i1 = new Integer(a);
		
		Integer i2 = new Integer(20);
		
		Integer i3 = new Integer("100");
		
		//Integer i4 = new Integer("abc"); // NumberFormatException
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		//System.out.println(i4);
		
		Integer i5 = Integer.valueOf("200");
		Double d = Double.valueOf("10.2");
		System.out.println(i5);
		System.out.println(d);
		
		//2. Unboxing => converting wrapper to primitive
		// .xxxValue()
		int i = i3.intValue();
		byte b = i3.byteValue();
		short s = i3.shortValue();
		
		// converting String to primitive
		//parseXXX
		int p = Integer.parseInt("100");
		double q = Double.parseDouble("10.2");
		float r = Float.parseFloat("10.3");
		
	}
}