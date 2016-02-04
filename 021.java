public class problem_21{
	public static void main(String arg[]){
		int ans=0,tmp=0;

		for(int i=1; i<10000; i++){
			tmp=SumOfDivisors(i);
			if(i == SumOfDivisors(tmp)){
				if(i!=tmp){
					ans+=i;
				}
			}
		}
		System.out.println(ans);

	}

//約数を出して合計を返す
	public static int  SumOfDivisors(int n){
		int sum=0;
		for(int i=1; i<n; i++){
			if((n%i)==0){
				sum += i;
			}
		}
		//System.out.println(sum);
		return sum;
	}

}