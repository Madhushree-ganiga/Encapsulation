import java.util.Scanner;
class CountryTester
{
public static void main(String []args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("number of country");
	int num=sc.nextInt();
	Country []countrys=new Country[num];
	for( int i=0; i<countrys.length;i++)
	{
		sc.nextLine();
    System.out.println("Enter Country Name:");
	String cname=sc.nextLine();
	System.out.println("Enter Capital :");
	String captl=sc.nextLine();
	System.out.println("Enter number of State:");
	byte state=sc.nextByte();
	System.out.println("Enter population :");
	short pop=sc.nextShort();
	System.out.println();
  
  Country country =new Country();
  
  country.setCountryName(cname);
  country.setCapital(captl);
  country.setNoOfStates(state);
  country.setPopulation(pop);
  countrys[i]=country;
	}
   for( int i=0; i<countrys.length;i++)
	{
		Country country =countrys[i];
   String name=country.getCountryName();
    String capital=country.getCapital();
	byte noOfStates=country.getNoOfStates();
	short population=country.getPopulation();
	
	 System.out.println(name+"\t "+ capital +" \t"+noOfStates +" \t"+ population);
	}
 }
 

}