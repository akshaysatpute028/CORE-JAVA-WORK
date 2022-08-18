package Array;

public class BubbleSortArray {
	int arr[]= {100,70,80,90,50,60,30,40};
	
	int l=arr.length;
	
	int temp;
	int i,j;

	void search() {
		for(j=0;j<l-1;j++) {
			for(i=0;i<l-1;i++) {
				if(arr[i]>arr[i+1]) { // > for ascending(increasing) & < for descending(decreasing) order
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	
	void display() {
		System.out.print("Ascending Bubble Sort = ");
		for(i=0;i<l-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSortArray b=new BubbleSortArray();
		b.search();
		b.display();
	}
}
