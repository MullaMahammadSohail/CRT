import java.util.*;
public class OptimizeBubble{
	public static void bubbleSort(int[]arr){
	int n = arr.length;
	boolean swapped;
	for(int i = 0;i < n - 1; i++){
		swapped = false;
		for(int j = 0;j < n - 1 ; j++){
			if(arr[j] > arr[j + 1]){
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				swapped = true;
			}
		}
		if(!swapped){
			break;
	}
	}
	}
	public static void main(String[]args){
		int[] arr ={64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr);
		System.out.println("after sorted");
		for(int num : arr){
			System.out.println(num + "");
		}
	}
}
		