import java.util.HashMap;
import java.util.*;

class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in the array: ");
		
		int n = sc.nextInt();
		int[] arr = new int[n];                                                                       
		
		//input
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//input the target sum 
		System.out.println("Enter the target sum: ");
		int target = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int result[] = new int[2];
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			int temp = target-arr[i];
			
			if(map.containsKey(temp)) {
				result[0]=map.get(temp);
				result[1]=i;
				found=true;
				break;
			}
			map.put(arr[i], i);
		}
		if(found) {
			System.out.println("Indices: ["+result[0]+","+result[1]+"]");
			
		}
		else {
			System.out.println("no two sum solution found");
		}
	}
}
