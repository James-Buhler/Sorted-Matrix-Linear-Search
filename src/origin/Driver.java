package origin;

public class Driver {
	public static void main(String[] args) 
	{
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
		int[] locationFound = MatrixSearch(arr, 17);
		System.out.println(locationFound[0] + ", " + locationFound[1]);
	}
	//function that takes in a sorted matrix of int's and a int you are searching for
	//It does a linear search through the matrix to try to find the int
	//if it finds the int it returns its index number for the matrix
	//if it does not find the int it returns -1,-1
	public static int[] MatrixSearch(int[][] arr, int key){
		
		int high = arr.length * arr[0].length - 1;
		int low = 0; 
		int mid;
		int[] answer = {-1,-1};
		while (low <= high) {
			mid = (low + high) / 2;
			answer[0] = mid/arr[0].length;
			answer[1] = mid % arr[0].length;
			if(arr[answer[0]][answer[1]] == key) {
				return answer;
			} else if (arr[answer[0]][answer[1]] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		answer[0] = -1;
		answer[1] = -1;
		return answer;
	}
}
