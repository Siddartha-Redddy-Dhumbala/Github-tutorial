class StaticFour{
	public static void main(String[] args) {
		StaticFour sf = new StaticFour();
		sf.add(10,30);
	}
	public void add(int x , int y) {
		int a = x;
		int b = y;
		int c = a + b;
		System.out.println("Sum is: "+c);
	}
}

  