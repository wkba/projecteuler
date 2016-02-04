import java.math.*;

public class problem_16{
	public static void main(String arg[]){
		BigInteger bigAns,bigI,bigTmp;
		bigAns = new BigInteger("1");
		bigTmp = new BigInteger("10");
		long sum = 0;

		for(int i = 1 ;i <= 1000 ;i++){
			bigI = BigInteger.valueOf(2);
			bigAns = bigAns.multiply(bigI);
		}

		while(true){
			sum += (bigAns.remainder(bigTmp)).longValue();
			System.out.println(sum);
			bigAns = bigAns.divide(bigTmp);
			if( bigAns.intValue()== 0){
				break;
			}
		}
		System.out.println(bigAns);
	}
}

//2の1000乗がどのくらいになるか
//10で割っていいってあまりを足し算してく。
