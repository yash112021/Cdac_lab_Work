import java.util.*;
public class TestService {
	// this part will be load before the main part
	static Team[] tarr;
	static int cnt;
	
	
	static {
		tarr = new Team[20];
		Player[] plst = new Player [15];
		plst [0] = new Player(11, "Virat Kohli", "Batsman");
		plst[1] = new Player (12,"MS Dhoni", "Allrounder");
		plst[2] = new Player (13,"Umesh yadav", "bawler");
		Player c = new Player (20,"Suresh Raina", "Allrounder");
		tarr[0]=new Team(101,"MI",c,plst,3);
		
		
		plst[0] = new Player (21,"Rohit Sharma", "Batsman");
		plst[1] = new Player (22,"Jadeja", "Batsman");
		plst[2] = new Player (30,"Dravid", "Bawler");
		Player c1 = new Player (31,"Sachin", "Allrounder");
		tarr[1] = new Team(102, "CSK",c,plst, 4);
		
		
	}
	
	public static boolean addNewTeam(){
		
		Scanner sc = new Scanner(System.in);
		
		if(cnt!=20) {
			
			//team detail
			System.out.println("Enter the team id");
			int tid = sc.nextInt();
			System.out.println("Enter the team name");
			String tname = sc.next();
			
			
			//captain detail
			System.out.println("Enter the captain player id");
			int pid = sc.nextInt();
			System.out.println("Enter the captain player name");
			String pname = sc.next();
			System.out.println("Enter the speciality of captain player");
			String psp = sc.next();
			
			Player c = new Player (pid, pname, psp);
			
			Player[] plst = new Player[15];
			plst[0] = c;
			int i =0;
			String str= "y";
			do {
				System.out.println("enter a player id");
				pid = sc.nextInt();
				System.out.println("enter a player name");
				pname = sc.next();
				System.out.println("enter a player speciality");
				psp = sc.next();
				plst[i] = new Player(pid,pname,psp);
				i++;
				System.out.println("Do you want to add more player(y/n)");
				str = sc.next();
				
			}while(str.equals("y"));
			 
			tarr[cnt] = new Team(tid,tname, c,plst,i);
			cnt++;
			return true;
			
			
			
		}
		return false;
		}

	public static void displayTeam() {
		 
			for(Team x:tarr) {
				if(x!=null) {
					System.out.println(x);
				}else {
					break;
				}
				
			}
		}

	public static Team findById(int id) {
		
		for(Team t : tarr) {
			if(t!=null) {
				if(t.getTid()==id) {
					return t;
				}
			}else {
				break;
			}
		}return null;

		
	}

	public static boolean addMorePlayers(int tid, int pid, String pname, String psp) {
		//we have already one function of find by id so we use it
		Team t=findById(tid);
		if(t!=null){
			Player p=new Player(pid,pname,psp);
			int s=t.getSize();
			
			t.getPlist()[s] = p;
			t.setSize(s+1);
			return true;
		}
		return false;
	}

	
	// search for the player by using the  player id 
	public static Team searchPlayer(int pid) {
		 for(Team t:tarr) {
			 if(t!=null) {
				 Player arr[]=t.getPlist();
				 for(Player x:arr) {
					 if(x!=null) {
						 	if(x.getPid()==pid) {
						 		return t;
						 	}
					}
				}
			 }else {break;
			 }
		 }
		return null;
	}
		
	
	
	}
	 


