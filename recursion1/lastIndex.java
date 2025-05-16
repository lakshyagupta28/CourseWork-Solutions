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
	public static int lastIndex(int input[], int x) {
		if(input.length==0)
		return -1;
		int smallIdx=lastIndex(getSubArray(input,1),x);
		if(smallIdx!=-1)
			return 1+smallIdx;
		else
		{
			if(input[0]==x)
			return 0;
			else
			return -1;
		}
	}
}
