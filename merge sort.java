//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int mid, int r)
    {
        int merged[] =new int[r-l+1];
        int idx1=l;
        int idx2=mid+1;
        int i=0;
        while(idx1<=mid && idx2<=r){
            if(arr[idx1]<=arr[idx2]){
                merged[i++]=arr[idx1++];
            }else{
                merged[i++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[i]=arr[idx1];
            ++i;
            ++idx1;
            
        }
         while(idx2<=r){
            merged[i]=arr[idx2];
            ++i;
            ++idx2;
        }
        
        for(int in=0,j=l;in<merged.length;in++,j++){
            arr[j]=merged[in];
        }
         // Your code here
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        //code here
    }
}
