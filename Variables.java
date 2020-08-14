package src.java;

private int a, b;

class Variables {
	
	i = a + b; // Noncompliant; calculation result not used before value is overwritten
	i = compute();
	
	public static void main (String[] args) {
		double a = 3, b = 4;
		double c;
		
		int ret4, ret5;;
		
		c = Math.sqrt (a* a + b* b);
		System.out.println ("c = "+ c);
		System.out.println ("c = "+ c);s
	}
	
	public static void main (String[] args) {
		double a = 3, b = 4;
		
		int ret7;

		System.out.println ("c = "+ c);
	}
}