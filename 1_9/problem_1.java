public class problem_1{
	public static void main(String arg[]){
		int ans = ReturnSum(3,1000) + ReturnSum(5,1000) - ReturnSum(15,1000);
		System.out.println(ans);
	}

	public static int ReturnSum(int radix,int range){
		int sum = 0,i = 1;
		for(;i < range;i++){
			if((i % radix) == 0){
				sum +=i;
			}
		}
		return sum;
	}	
}

