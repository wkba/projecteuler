public class problem_14{
	public static void main(String arg[]){
		int num = 13;
		System.out.println(FindMax());

	}

	public static int Collatz(long num){
		int count = 1;
		for(int i = 0;;i++){
			count++;
			if((num%2) == 0){
				num = num/2 ;
			}else{
				num = num * 3 + 1;
			}
			if(num == 1){
				break;
			}
		}
		System.out.println(count);
		return count;
	}

	public static long FindMax(){
		int max = 0,tmp = 0;
		long ans = 0;
		for(long n = 2; n <= 1000000; n++){
			tmp = Collatz(n);
			if(max < tmp){
				max = tmp;
				ans = n;
			}
		}
		return ans;
	}
}