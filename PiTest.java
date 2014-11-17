public class PiTest
{
	public static void main(String[] args)
	{
		double pi=0.0;
		for(double i=1.0;i<1000000000000001d;i++){
			pi += Math.pow(-1,i+1)/(2*i-1);
		}
		System.out.println(4*pi);
	}
}
