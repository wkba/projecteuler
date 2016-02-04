public class p005{
	public static void main(String arg[]){
		Lib lib = new Lib();
		int min=2;
		for(int i=2;i<20;i++){
			min=lib.lcm(min,i);
		}
		System.out.println(min);
	}
}