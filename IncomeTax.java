package Lab1;

public class IncomeTax {
	public static void main(String args[]) {
		
		System.out.println("args[0]:"+ args[0]);
		String s1= args[0];
		int basic = Integer.parseInt(s1);
		double DA = (basic*0.2);
		double HRA = basic*0.3;
		double Gross = basic + DA + HRA;
		System.out.println("Gross is: "+ Gross);
		if(basic>0 && basic<4000)
		{
		      System.out.println("Income Tax is 4%");
		}
		      else if(basic>=4000 && basic<10000)
		{
		      System.out.println("Income Tax is 6%");
		}
		      else if(basic>=10000 && basic<17000)
		{
		      System.out.println("Income Tax is 8%");
		}
		      else if(basic>=17000 && basic<27000)
		{
		      System.out.println("Income Tax is 10%");
		}
		      else
		{
		      System.out.println("Income Tax is 15%");
		}

	}

}
