//未完

public class problem_19{
	public static void main(String agr[]){
		int year = 1901,mon = 1,day,count = 0, now=0;
		for(;year<=2000; year++){
			for(;mon<=12;mon++){
				if(now == 5){
					count++;
				}
				now = (now + Days(year,mon)) % 7;
			}
		}
		System.out.println(count);
	}
	public static int Days(int year,int mon){
		if(mon == 2){
			if((year%4 == 0 && year%100 != 0) || year%400 == 0){
				return 29;
			}else{
				return 28;
			}
		}else if((mon == 4) || (mon == 6) || (mon == 9) || (mon == 11)){
			return 30;
		}else{
			return 31;
		}
	}

}