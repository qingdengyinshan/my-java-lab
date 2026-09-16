import java.util.Scanner;

public class Printer{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);

		
		System.out.println("Good morning!");
		System.out.print("Good afternoon!");
		System.out.println("See you tomorrow!");
		
		System.out.println("If you wanna make a snow pile, please call \" 1 \", and if you wanna make the pile with elements in your mind, please call \" 2 \".");
		System.out.print("Now your turn:");
		Scanner choice = new Scanner(System.in);
		int n = choice.nextInt();
		
		if(n == 1){
			System.out.print("Make a wish, and tell me how much size you wanna the snowflakes to be arranged:");
			int x = number.nextInt();
			Snowflakes snowflake = new Snowflakes();
			snowflake.mount(x);
		}else if(n == 2){
			System.out.print("Make a wish, and tell me which pattern you wanna be arranged:");
			Scanner model = new Scanner(System.in);
			String y = model.nextLine();
			System.out.print("tell me how much size you wanna the patterns to be arranged:");
			int x = number.nextInt();
			Patterns pattern = new Patterns();
			pattern.mount(x, y);
		}
	}
}
