//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
// ans = 142913828922
// my ans = 1179908154

public class p010{
	public static void main(String arg[]){
		int sum = 0;
		Lib lib = new Lib();

		for(int i = 2;i <= 2000000;i++){
			if(lib.isPrime(i)){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}

}