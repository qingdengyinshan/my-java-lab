import java.util.Scanner;

public class Printer{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);

		
		System.out.println("Good morning!");
		System.out.print("Good afternoon!");
		System.out.println("See you tomorrow!");
		System.out.print("Make a wish, and tell me how many lines you wanna the snowflakes to be arranged:");
		int x = number.nextInt();
		Snowflakes snowflake = new Snowflakes();
		snowflake.mount(x);
	}
}