public class p004{
	public static void main(String arg[]){
		int max = 1;
    	for (int i = 100; i < 999; i++) {
        	for (int j = i; j < 999; j++) {
            	int n = i * j;
            	int len = (int) Math.floor(Math.log10(n));
            	boolean ispalindrome = true;
            	for (int k = 0; k < 3; k++) {
                                 
                	int digitatk = (int) ((n % Math.pow(10, k + 1) - n% Math.pow(10, k)) / Math.pow(10, k));
               		int l = len - k;
               		int digitatl = (int) ((n % Math.pow(10, l + 1) - n% Math.pow(10, l)) / Math.pow(10, l));
                
                if (digitatl != digitatk) {
                    ispalindrome = false;
                }
            }
            if (ispalindrome && n > max) {
                max = n;
            }
        }
    }
		System.out.println(max);
	}
}