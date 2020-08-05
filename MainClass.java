class OuterClass {
	int x=10;
	static class InnerClass{
		int y=5;
	}
}

public class MainClass{
	public static void main(String[] ,args) {
		OuterClass .InnerClass in=new OuterClass.InnerClass();
		System.out.println(in.y);
	}
}