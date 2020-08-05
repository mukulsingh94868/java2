import java.util.Scanner;
public class Demo3 {
int x=5;
static void method(int age) {
	if (age>18) {
		System.out.println("you are allowed");

	}
	else {
		System.out.println("you are not allowed");

	}

}
public static void main(String[] args) {
	Demo3 a = new Demo3();
	method(20);
}
}