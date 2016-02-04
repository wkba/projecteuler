import java.math.*;

public class problem_20{
	public static void main(String arg[]){
		BigInteger fac = Factorial(100);
		long sun = 0;
		System.out.println(Total(fac));




	}

	public static BigInteger Factorial(int range){
		BigInteger bigNum,bigi;
		bigNum = new BigInteger("1");
		bigi = new BigInteger("1");
		for(int i = 1; i <=range; i++){
			bigi = BigInteger.valueOf(i);
			bigNum = bigNum.multiply(bigi);
		}
		//System.out.println("100!: " + bigNum);
		return bigNum;
	}

	public static BigInteger Total(BigInteger f){
		BigInteger bigTmp,bigSum,bigZero;
		bigTmp = new BigInteger("10");
		bigSum = new BigInteger("0");
		bigZero = new BigInteger("0");

		while(true){
			bigSum = bigSum.add(f.remainder(bigTmp));
			//sum += (f.remainder(bigTmp)).longValue();
			//System.out.println(sum);
			f = f.divide(bigTmp);
			System.out.println(bigSum);
			if( f.equals(bigZero)){
				break;
			}
		}
		//System.out.println(bigSum);
		return bigSum;
	}

}