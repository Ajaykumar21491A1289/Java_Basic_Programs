package Basic_Programs;

public class Nine {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int index = 0;
		
		for (int i = 0; i < 100; i++) {
			if (String.valueOf(i).contains("9")) {
				arr[index] = i;
				index++;
			}
		}
		
		for (int j = 0; j < index; j++) {
			System.out.println(arr[j]);
		}
	}
}
