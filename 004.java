public class problem_4{
	public static void main(String arg[]){
		int dig1 = 100,dig2 = 100,tmp = 0,ans = 0;

		for(;dig1<1000;dig1++){
			for(;dig2<1000;dig2++){
				tmp = dig1 * dig2;
				if(tmp >99999){
				if((tmp % 10) == (tmp / 100000)) {
					ans = tmp;
				}
			}
			}
		}
		System.out.println(ans);
	}
}