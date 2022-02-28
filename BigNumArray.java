package Practice;

public class BigNumArray
{

	public static void main(String[] args)
	{
		int big = 0;
		int arr[] = {1,2,3,4,100,5,6,7,8,9,10};
		System.out.println("\n This is Orignal Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " +arr[i]);
		}
			System.out.println("\n Print the largest Elemrnt is the Array");
			for(int i=0; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]<=arr[j])
					{
						if(j==arr.length-1)
						{
							big = arr[j];
							break;
						}	
						continue;
					}
					else
					break;
				}
			}
			System.out.println(" " +big);
	}

}
