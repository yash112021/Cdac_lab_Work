import java.util.*;
public class TestTeamMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int choice;
		do {
			System.out.println("\n1.Add Team \n2.Display Team \n3.Search by id");
			System.out.println("\n4.Add More player \n5.Search a Player \n6.exit");

			
			System.out.println("Enter the your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				// function for  Add Team
				
				boolean add = TestService.addNewTeam();
				break;
			case 2:
				 
				// function for  Display Team
				TestService.displayTeam();
				break;
				
	
			case 3:
				System.out.println("Enter the the team id");
				int id =sc.nextInt();
				Team arr=TestService.findById(id);
				if(arr!=null) {
					System.out.println(arr);
				}else {
					System.out.println("Not found");
				}
				// function for  Search By id
				break;
			case 4:
				// function for  Add More Players
				
				System.out.println("Enter the team id ");
				int tid = sc.nextInt();
				System.out.println("Enter the player id ");
				int pid = sc.nextInt();
				System.out.println("Enter the player name ");
				String pname = sc.next();
				sc.nextLine();
				System.out.println("Enter the player speciality ");
				String psp = sc.next();
				
				 boolean status = TestService.addMorePlayers(tid,pid,pname,psp);
				 
					 if(status) {
						 System.out.println("Player added successfully");
					 }
					 else {
						 System.out.println("Player not found");
					 }
				 
				
				break;
			case 5:
				// function for  search a Player
				System.out.println("Enter player id ");
				int id1=sc.nextInt();
				Team arr12=TestService.searchPlayer(id1);
				if(arr12!=null) {
					System.out.println(arr12);
				}else {
					System.out.println("no Player exists of these id ");
				}
				
				break;
			default :
				// function for exit
				break;
				
			}
			
		}while(choice!=6);
		
		
		
	}

	

}
