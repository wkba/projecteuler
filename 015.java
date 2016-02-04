import java.math.*;

public class problem_15{
	public static void main(String arg[]){
		BigInteger bigAns,bigI,bigTmp;
		bigAns = new BigInteger("1");
		bigTmp = new BigInteger("1");

		for(int i = 1 ;i <= 40 ;i++){
			bigI = BigInteger.valueOf(i);
			bigAns = bigAns.multiply(bigI);
		}
				System.out.println(bigAns);


		for(int n = 1 ;n <= 20 ;n++){
			bigI = BigInteger.valueOf(n);
			bigTmp = bigTmp.multiply(bigI);
		}
				System.out.println(bigTmp);


		bigTmp = bigTmp.multiply(bigTmp);
		bigAns = bigAns.divide(bigTmp);

		System.out.println(bigAns);
	}
}