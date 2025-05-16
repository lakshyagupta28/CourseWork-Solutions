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
	public static int sum(int input[]) {

		if(input.length==0)
		return 0;
		else
		{
			return input[0]+sum(getSubArray(input,1));
		}
	}
}
