public class Snowflakes{
	static void mount(int x){
		int i = 0, n;
		n = x;
		while(i <= n){
			System.out.println("*".repeat(i));
			i++;
		}
		
		i = i - 2;

		while(i > 0){
			System.out.println("*".repeat(i));
			i--;
		}
	}
}
	
