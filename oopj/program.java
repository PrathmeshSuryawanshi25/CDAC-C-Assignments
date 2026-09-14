
public class program 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array: ");
		int size=Console.getInt();
		int arr[]=new int[size];
		System.out.println("Enter array 1 elements: ");
		for(int temp=0;temp<size;temp++)
		{
			arr[temp]=Console.getInt();
		}
		
		
		for(int itemp=0;itemp<size-1;itemp++)
		{
			for(int jtemp=0;jtemp<size-1;jtemp++)
			{
				if(arr[jtemp]>arr[jtemp+1])
				{
					int temp=arr[jtemp];
					arr[jtemp]=arr[jtemp+1];
					arr[jtemp+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorted:");
		for(int itemp=0;itemp<size;itemp++)
		{
			System.out.print(arr[itemp]+" ");
		}
		
		System.out.println();
		
		double sum=0;
		for(int itemp=0;itemp<size;itemp++)
		{
			sum += arr[itemp];
		}
		System.out.println("Sum of arrays is: "+sum);
		
		double avg=sum/size;
		System.out.println("Average of array is: "+avg);
		
		int copyarray[]=new int[size];
		for(int itemp=0;itemp<size;itemp++)
		{
			copyarray[itemp]=arr[itemp];
		}
		
		System.out.println("Copy Array: ");
		for(int itemp=0;itemp<size;itemp++)
			System.out.print(copyarray[itemp]+" ");
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int itemp=0;itemp<size;itemp++)
		{
			if(min > arr[itemp])
				min=arr[itemp];
			if(max < arr[itemp])
				max=arr[itemp];
		}
		System.out.println("Minimum value of array: "+min);
		System.out.println("Maximum value of array: "+max);
		
		int count=0;
		int reverseArray[]=new int[size];
		for(int itemp=size-1;itemp>=0;itemp--)
		{
			reverseArray[count]=arr[itemp];
			count++;
		}
		
		System.out.println("Reverse Array: ");
		for(int itemp=0;itemp<size;itemp++)
			System.out.print(reverseArray[itemp]+" ");
		
		System.out.println("Duplicate value:");
		boolean isTrue=false;
		for(int itemp=0;itemp<size;itemp++)
		{
			for(int jtemp=itemp+1;jtemp<size-1;jtemp++)
			{
				if(arr[itemp]==arr[jtemp])
				{
					isTrue=true;
					continue;
				}
			}
			if(isTrue)
				System.out.println(arr[itemp]);
			isTrue=false;
		}
		
		int arr1[]=new int[size];
		System.out.println("Enter array 2 elements: ");
		for(int itemp=0;itemp<size;itemp++)
		{
			arr1[itemp]=Console.getInt();
		}
		
		for(int itemp=0;itemp<size;itemp++)
		{
			for(int jtemp=0;jtemp<size;jtemp++)
			{
				if(arr[itemp]==arr1[jtemp])
				{
					System.out.println(arr1[jtemp]);
					break;
				}
			}
		}
		
	}

}
