
public class Test {
	
	public static boolean visited(int[] arrInput,int input) {
		for (int i = 0; i < arrInput.length; i++) {
			if(input==arrInput[i])
				return true;
		}
		return false;
	}
	public static void countFreq(int arr[]) 
	{ 
		int[] visited=new int[arr.length];
		int vCounter=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(!visited(visited,arr[i])) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i]==arr[j])
						count++;
				}
				visited[vCounter]=arr[i];
				System.out.println(arr[i]+"		"+count);	
				vCounter++;
				count=0;
			}
		}
	} 
	public static void main(String[] args) {
		int[] khar=new int[]{10,20,40,20,20,40,20 };
		
		countFreq(khar);

	}

}
