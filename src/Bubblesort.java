import java.util.*;
public class Bubblesort {

	public static void main(String[] nix) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int size = sc.nextInt();
		int[] list = new int[size];
		int element;
		for ( int i = 0; i < size; i++) {
			element = sc.nextInt();
			list[i] = element;
		}
		for(int j = 0; j<size-1; j++) {
			for(int k = 0; k<size-1-j; k++) {
				if(list[k]  > list[k+1]) {
					temp = list[k];
					list[k] = list[k+1];
					list[k+1] = temp;
					
				}
			}
		}
		System.out.println("Sorted List :");
		for ( int i = 0; i < size; i++) {
			System.out.print(list[i]+ " ");
		}
	}
}
