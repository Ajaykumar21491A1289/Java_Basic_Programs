package Basic_Programs;

public class Bigg {

	public static void main(String[] args) {
		int[] n = {5,8,6,4,7};
		int[] k = new int[5];
		int i;
		for(i=0;i<n.length;i++) {
			for(int j=1;j<n.length;j++) {
				if(n[i]>n[j]){ 
					k[i]=n[i];
				}
			}
			
	}
		for(i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}

}
}
