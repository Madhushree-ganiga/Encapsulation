import java.util.Scanner;
class IPL3
{
public static void main(String []args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("number of Teams");
	int num=sc.nextInt();
	Teams []team=new Teams[num];
	for( int i=0; i<team.length;i++)
	{
		sc.nextLine();
    System.out.println("Enter Team Name:");
	String cname=sc.nextLine();
	System.out.println("Enter captan name :");
	String capt=sc.nextLine();
	System.out.println("Enter coach name:");
	String coac=sc.nextLine();
	System.out.println("EnTer Number of Person :");
	byte per=sc.nextByte();
	System.out.println("Enter place :");
	String pla=sc.nextLine();
	
	System.out.println();
  
  Teams teams =new Teams();
  
  teams.setTeamName(cname);
  teams.setCaptan(capt);
  teams.setCoach(coac);
  teams.setNoOfPlayers(per);
  teams.setPlace(pla);
  team[i]=teams;
	}
   for( int i=0; i<team.length;i++)
	{
		Teams teams =team[i];
   String name=teams.getTeamName();
    String captan=teams.getCaptan();
	String coach=teams.getCoach();
	byte noplayer=teams.getNoOfPlayers();
	String plac=teams.getPlace();
	
	 System.out.println(name+"\t "+ captan +" \t"+ coach +" \t"+ noplayer+ " \t"+plac);
	}
 }
 

}