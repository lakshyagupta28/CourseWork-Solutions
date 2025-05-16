
public class Solution {
	public static int[] getSubArray(int input[],int idx)
	{
		int output[]=new int[input.length-idx];
		for(int i=idx;i<input.length;i++)
		{
			output[i-idx]=input[i];
		}
		return output;
	}
	public static int firstIndex(int input[], int x) {
		if(input.length==0)
		return -1;
		else if(input[0]==x)
		return 0;
		else
		{
			int smallIdx=firstIndex(getSubArray(input,1),x);
			if(smallIdx!=-1)
			return 1+smallIdx;
			else
			return -1;
		}
	}
}
