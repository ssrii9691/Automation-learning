package ExerciseProblems;

public class Exercise1 {
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		System.out.println(num[0] + " is The first element of the number in array.");
		System.out.println(num[num.length - 1] + " is The last element of the number in array.");
		int k = 0;
		System.out.println("elements of the numbers array in reverse order.");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
			k++;
		}
		System.out.println(k + " total number of elements in array");
	}
}
