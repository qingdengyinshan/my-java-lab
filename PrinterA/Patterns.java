public class Patterns{
	static void mount(int x, String y){
		int i = 0, n;
		n = x;
		while(i <= n){
			System.out.println(y.repeat(i));
			i++;
		}

		i = i - 2;

		while(i > 0){
			System.out.println(y.repeat(i));
			i--;
		}
	}
}
			
