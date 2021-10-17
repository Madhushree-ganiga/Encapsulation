 import java.util.Scanner;
class Test
 { 
	static Scanner sc = new Scanner(System.in);
	static Scientist []sct = new Scientist[20];
	  public static void main(String []args)
       {
			Test t = new Test();
		while(true){
			System.out.println("Enter Your Choice \n 1.Save \n 2.Display \n 3.Update \n 4.Delete");
			System.out.println("Enter any other number to exit.");
			int choice = sc.nextInt();

			if(choice == 1){
				sc.nextLine();
				Scientist scientist = new Scientist();
				System.out.println("Enter Scientist Name: ");
				String name = sc.nextLine();
				System.out.println("Enter number of Experience: ");
				byte noOfExp = sc.nextByte();
				System.out.println("Enter Scientist Age: ");
				byte age= sc.nextByte();
				sc.nextLine();
				System.out.println("Enter Scientist Role: ");
				String role = sc.nextLine();
				System.out.println("Enter Scientist Type: ");
				String type = sc.nextLine();
				
				scientist.setName(name);
				scientist.setNoOfExp(noOfExp);
				scientist.setAge(age);
				scientist.setRole(role);
				scientist.setType(type);
				scientist.setAddress();
				
				boolean a = t.save(scientist);
				if(a){
					System.out.println("\n Data Entered Successfully");
				}
				else{
					System.out.println("Data not saved");
				}
			}

			else if(choice == 2){
				t.getAll();
			}


			else if(choice == 3){
				sc.nextLine();
				System.out.println("Enter Scientist name to update: ");
				String name = sc.nextLine();
				System.out.println("Enter Role to edit: ");
				String role = sc.nextLine();
				
				boolean a = t.updateRoleByName(role, name);
				if(a){
					System.out.println(" \n Updated Successfully");
				}
				else{
					System.out.println("Update Failed");
				}
			}

			else if(choice == 4){
				sc.nextLine();
				System.out.println("Enter Scientist name to delete : ");
				String name = sc.nextLine();
				
				boolean a = t.deleteByName(name);
				if(a){
					System.out.println("\n Deleted Successfully");
				}
				else
				{
					
					System.out.println("Delete Failed");
				}
			}

			else{
				break;
			}
		}
	}
    

     int temp=0;

	boolean save(Scientist scientist){
		if(temp<sct.length){
			sct[temp] = scientist;
			temp++;
			return true;
		}
		else{
			return false;
		}
	}

	void get(Scientist scientist)
	{
		String name = scientist.getName();
		byte noOfExp = scientist.getNoOfExp();
		byte age = scientist.getAge();
		String role = scientist.getRole();
		String type = scientist.getType();
		
		Address address = scientist.getAddress();
		
		short houseNum = address.getHouseNum();
		String area = address.getArea();
		String city = address.getCity();
		String state = address.getState();
		String country = address.getCountry();
		int pincode = address.getPincode();
		
		System.out.println(name+"\n"+noOfExp+"\n"+age+"\n"+role+"\n"+type+"\n"+houseNum+"\n"+area+"\n"+city+"\n"+state+"\n"+country+"\n"+pincode);
	}
	void getAll(){
		Scientist scientist = new Scientist();
		Test t = new Test();
		for(int i=0;i<temp;i++){
			scientist = sct[i];
			t.get(scientist);
		}
	}


	boolean updateRoleByName(String role, String name)
	{
		Scientist scientist = new Scientist();
		for(int i=0;i<temp;i++){
			String sname = sct[i].getName();
			if(sname.equals(name)){
				sct[i].setRole(role);
				return true;
			}
		}
		return false;
	}

	boolean deleteByName(String name)
	{
		Scientist scientist = new Scientist();
		for(int i=0;i<temp;i++){
			String sname = sct[i].getName();
			if(sname.equals(name)){
				sct[i].setRole(null);
				sct[i].setName(null);
				sct[i].setNoOfExp((byte)0);
				sct[i].setAge((byte)0);
				sct[i].setType(null);
				sct[i].setAddress(null);
				temp--;
				return true;
			}
		}
		return false;
	}
    
 

}