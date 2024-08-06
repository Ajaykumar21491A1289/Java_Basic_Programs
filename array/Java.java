package array;

public class Java {

	public static void main(String[] args) {
		int[][] n1=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				n1[i][j]=i+1;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(n1[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
