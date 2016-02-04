public class problem_7{
	public static void  main(String[] args) {
		int num = 3,primeNum = 2;

		while(true){
			num++;
			if(isPrime(num)){
				primeNum ++;
				if(primeNum == 10001){
					System.out.println(num);
					break;
				}
			}
		}
	}

	public static boolean isPrime(int num){
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
			 return false; 
			} 
		} 
		return true; 
	}
}