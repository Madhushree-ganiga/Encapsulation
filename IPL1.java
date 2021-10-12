import java.util.Scanner;
class IPL1{
	static Scanner scan=new Scanner(System.in);
	IPLTeams []ipl1;
	IPLTeams ipl;
	int n;
	static IPL1 ip;
	String teamName;
	byte numTeamMemeber;
	byte numBatsMan;
	byte numBollers;
	public static void main(String []arg){
	
	ip=new IPL1();
	String more;
	int n;
		
		do{
		System.out.println("To give team details type give, to display type display");
		String inp=scan.nextLine();
		if(inp.equals("give")){
		    System.out.println("Enter Team details");
			ip.give();}
		else if (inp.equals("display")){
			
			ip.display();}
		else if (inp.equals("update")){
			
			ip.update((byte)13,"RCB");}
		else
			System.out.println("enter valid input");
		
		System.out.println("you want to give more details type more");
		more=scan.nextLine();
		
      }	while(more.equals("more"));
}

	 void give(){
		System.out.println("Enter number of Teams ");
		ip.n=scan.nextInt();
		ipl1=new IPLTeams[n];
		for(int i=0;i<ipl1.length;i++){
		
		scan.nextLine();
		System.out.println("Enter Team Name ");
		ip.teamName=scan.nextLine();
		//String teamName1=ip.teamName;
		System.out.println("Enter number of Team members ");
		ip.numTeamMemeber=scan.nextByte();
		//byte numTeamMemeber1
		System.out.println("Enter the number of batsman in Team ");
		ip.numBatsMan=scan.nextByte();
		System.out.println("Enter the numeber of bollers in Team ");
		ip.numBollers=scan.nextByte();
		scan.nextLine();
		
		
		ipl=new IPLTeams();
		ipl.setTeamName(teamName);
		ipl.setNumTeamMemeber(numTeamMemeber);
		ipl.setNumBatsMan(numBatsMan);
		ipl.setNumBollers(numBollers);
		
		ipl1[i]=ipl;
		
	  }
	  
	}
	void update(byte numTeamMemeber,String teamName){
		
		
		for(int i=0;i<ipl1.length;i++){
		IPLTeams ipl= ipl1[i];
		if(ipl.getTeamName().equals(teamName)){
		
			ipl.setNumTeamMemeber(numTeamMemeber);
		}
		
		
		}
	}
	void display(){
		for(int i=0;i<ipl1.length;i++){
		IPLTeams ipl = ipl1[i];
		
		System.out.println(ipl.getTeamName()+"\t"+ipl.getNumTeamMemeber()+"\t"+ipl.getnumBatsMan()+"\t"+ipl.getNumBollers());
	  }
	}
	


}

class IPLTeams{
	
	private String teamName;
	private byte numTeamMemeber;
	private byte numBatsMan;
	private byte numBollers;
	
	void setTeamName(String teamName){
		this.teamName=teamName;
	}
	void setNumTeamMemeber(byte numTeamMemeber){
		this.numTeamMemeber=numTeamMemeber;
	}
	void setNumBatsMan(byte numBatsMan){
		this.numBatsMan=numBatsMan;
	}
	void setNumBollers(byte numBollers){
		this.numBollers=numBollers;
	}
	
	String getTeamName(){
		return teamName;
	}
	byte getNumTeamMemeber(){
		return numTeamMemeber;
	}
	byte getnumBatsMan(){
		return numBatsMan;
	}
	byte getNumBollers(){
		return numBollers;
	}
}

	
	
	
	
	
	
