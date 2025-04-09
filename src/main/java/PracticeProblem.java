import java.util.ArrayList;
import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.print(Arrays.toString(recaman(-5)));

	}





	public static int[] recaman (int n){
		ArrayList<Integer> arr = new ArrayList<>();
		recamanHelp(n, arr);
		if (n<=0){
			return new int[0];
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = arr.get(i);
		}
		return array;
	}




	public static int recamanHelp(int n, ArrayList<Integer> arr){
		if (n <= 0){
			return 0;
		}
		int num = recamanHelp(n - 1, arr);
		int possibleNum = num - n;
		int thisNum = num + n;
		if (possibleNum > 0){
			for (int i = 0; i < arr.size(); i++){
				if (possibleNum == arr.get(i)){
					arr.add(thisNum);
					return thisNum;
				}
			}
			arr.add(possibleNum);
			return possibleNum;
		}
		else {
			arr.add(thisNum);
			return thisNum;
		}

	}
}
