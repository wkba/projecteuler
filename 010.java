//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
// 142913828922


public class problem_10{
	public static void main(String arg[]){
		int sum = 0,i = 2;

		for(;i <= 2000000;i++){
			if(isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int num){
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 2; i < sqrt ; i++) {
			if (num % i == 0) {
			 return false; 
			} 
		} 
		return true; 
	}

}