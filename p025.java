import java.math.*;

public class p025{
	public static void main(String arg[]){
		BigInteger bigTmp,bigA,bigB,bigC;
		bigTmp = new BigInteger("0");
		bigA = new BigInteger("1");
		bigB = new BigInteger("1");
		bigC = new BigInteger("2");
		Lib lib = new Lib();



		for(int i=3;;i++){
			bigA=bigB;
			bigB=bigC;
			bigC=bigB.add(bigA);
			//System.out.println(i +"  "+bigC);
			//System.out.println(bigA +"  "+bigB+"  "+bigC);
			System.out.println(i+1 +"  "+bigC+"  "+lib.BigDigitNum(bigC).intValue());

			if(lib.BigDigitNum(bigC).intValue() >= 1000){
				break;
			}
		}
	}
}