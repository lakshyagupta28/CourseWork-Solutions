public class solution {
	public static int sumOfDigits(int input){
        if(input==0)
        return 0;
        else
        return input%10+sumOfDigits(input/10);
	}
}
