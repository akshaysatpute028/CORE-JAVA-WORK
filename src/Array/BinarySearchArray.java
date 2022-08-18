package Array;

public class BinarySearchArray {
	int arr []= {10,20,30,40,50,60,70};
	int l = arr.length;
	
	int start=arr[0];
	
	int end=arr[l-1], endlen=l-1;
	int mid=arr[l/2], midlen=l/2;
	
	int key = 22;

	void search() {
		System.out.println("Start = "+start+"\nMid = "+mid+"\nEnd = "+end);
		System.out.print("Key = "+key+"\n");
		
		if (key==mid) System.out.println(key+" found at position "+midlen);
		
		else if(key<mid) {
			for(int i=0;i<midlen;i++)
				if(arr[i]==key) System.out.println(key+" found at position "+i);
		}
		
		else if(key>mid) {
			for(int i=midlen+1;i<=endlen;i++)
				if(arr[i]==key) System.out.println(key+" found at position "+i);
		}
		
		if(key>end) System.out.println("Key not found beacuse end is "+end);
		else System.out.println("\nKey not found ");
	
	}

	public static void main(String[] args) {
		BinarySearchArray b=new BinarySearchArray();
		b.search();
	}

}
