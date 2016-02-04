public class problem_9{
	public static void main(String arg[]){
		int a = 0,b = 0,c = 0;

		for(int i = 0;i<1000;i++){
			for(int n = 0;n<1000;n++){
				for(int m = 0;m<1000;m++){
					if(isCondition(i,n,m)){
						System.out.println(i + "," + n + "," + m);
						break;
					}
				}
			}
		}

	}

	public static boolean isTotal(int a, int b, int c){
		if((a + b + c) == 1000){
			return true;
		}
		return false;
	}
	public static boolean isPythagorean(int a, int b, int c){
		if((a*a + b*b) == c*c){
			return true;
		}
		return false;
	}

	public static boolean isCondition(int a, int b, int c){
		if(isTotal(a,b,c) && isPythagorean(a,b,c)){
			return true;
		}
		return false;
	}
}
