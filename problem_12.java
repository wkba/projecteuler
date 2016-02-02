public class problem_12{
	public static void main(String arg[]){
		int triangleNum = 1;
		for(int i = 1; ;i++){
			if(Rivisors(triangleNum) > 500){
				break;
			}
			triangleNum = i * ( i + 1) / 2;
							System.out.println(triangleNum);

		}
	}

//約数の個数を返す
	public static int Rivisors(int num){
		int tmp = 0;
		for(int n = 1; n <= num ; n++){
			if((num%n) == 0 ){
				tmp ++;
			}
		}

		return tmp;
	}


}