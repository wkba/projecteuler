public class problem_2{
	public static void main(String arg[]){
		int pre1 = 1,pre2 = 2,target = 0,sum = 2,max = 4000000;
		while(true){
			target = pre1 + pre2;
			if(target > max){
				System.out.println(sum);
				break;
			}
			if((target % 2) == 0){
				sum += target;
			}
			pre1 = pre2;
			pre2 = target;
		}
	}
}