public class problem_6{
	public static void main(String[] args) {
		int i = 0,sum = 0,ans = 0;
		for(i = 0; i <= 100; i++){
			sum += i*i;
			ans += i;
		}

		ans = ans*ans - sum;
		System.out.println(ans);
	}
}
