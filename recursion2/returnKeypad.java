import java.util.*;


public class solution {

	public static String[] keypad(int n){

		if(n<=1)
		return new String[]{""};
		
		String smallOutput[]=keypad(n/10);
		String[] ch={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String curChars=ch[n%10];
		String largeOutput[]=new String[smallOutput.length*curChars.length()];
		int idx=0;
		for(char c: curChars.toCharArray())
		{
			for(String 	s: smallOutput)
			{
				largeOutput[idx++]=s+c;
			}
		}
		return largeOutput;

	}
	
}
