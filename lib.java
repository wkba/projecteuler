import java.math.*;

final class Lib{

//素数かどうか判断
	public static boolean isPrime(int num){
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 2; i < sqrt ; i++) {
			if (num % i == 0) {
			 return false; 
			} 
		} 
		return true; 
	}

//桁数を返す（大数用）
	public static BigInteger BigDigitNum(BigInteger f){
		BigInteger bigTmp,bigSum,bigZero,big0ne;
		bigTmp = new BigInteger("10");
		bigSum = new BigInteger("0");
		bigZero = new BigInteger("0");
		big0ne = new BigInteger("1");

		while(true){
			bigSum = bigSum.add(big0ne);
			f=f.divide(bigTmp);
			if( f.equals(bigZero)){
				break;
			}
		}
		return bigSum;
	}
///桁数を返す
	public static int DigitNum(int f){
		int sum=0;
		while(true){
			f = f/10;
			sum++;
			if( f==0){
				return sum;
			}
		}
	}
//最大公約数を返す（ユークリッドの互除法）	
	public static int gcd(int x,int y){
 		if(y == 0){
            return x;
        }else{
            return gcd(y, x % y);
        }
        //System.out.println(y);
	}
//最小公倍数を返す
	public static int lcm(int x,int y){
		return x*y/gcd(x,y);
	}

//配列の中から最大値を求める
	public static int MaxArr(int[] a){
		int max=0;
		for(int i =1 ; i < a.length; i++){
            if(a[i] > a[max]){
                max = i;
            }
        }
        return a[max];
	}
//
	public static int a(){
		return a
	}


}