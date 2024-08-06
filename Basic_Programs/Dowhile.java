package Basic_Programs;

public class Dowhile {

	public static void main(String[] args) {
		int sum=0,i=0;
		do
		{
			sum=sum+i;
			i++;
			System.out.println(i);
		}while(i == 2);
		System.out.println(sum);
	}

}
