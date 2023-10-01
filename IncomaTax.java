import java.util.Scanner;
class IncomeTax{
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Basic salary: ");
      float basic = sc.nextFloat();
      float DA = basic*(0.2f);
      float HRA = basic*(0.3f);
      System.out.println("DA is: " + DA);
      System.out.println("HRA is: " + HRA);
      float GrossSalary = (basic+DA+HRA);
      System.out.println("Gross Salary is: "+ GrossSalary);
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
