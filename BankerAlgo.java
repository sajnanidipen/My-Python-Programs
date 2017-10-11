import java.util.Scanner;
class Resource{
	public static void main(String []args){
		int avai_resource[]={16,50,5,2};
		int max[][]={{3,2,2,1},{8,12,0,0},{2,1,0,0},{4,3,0,0},{2,0,3,1}};
		//int maxclaimed[][]=new int[5][4];
		int allocation[][]={{1,1,1,0},{2,1,0,0},{1,0,0,0},{2,1,0,0},{1,0,0,0}};
		int need[][]=new int[5][4];
		Scanner input=new Scanner(System.in);
		System.out.println("-----------MAXCLAIMED------------");
		for(int i=0;i<=4;i++){
			for(int j=0;j<=3;j++){
				System.out.print(max[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("------------ALLOCATED-----------");
		for(int i=0;i<=4;i++){
			for(int j=0;j<=3;j++){
				System.out.print(allocation[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<=4;i++){
			for(int j=0;j<=3;j++){
				need[i][j]=max[i][j]-allocation[i][j];
			}
		}
		System.out.println("------------NEEDED-----------");
		for(int i=0;i<=4;i++){
			for(int j=0;j<=3;j++){
				System.out.print(need[i][j]+" ");
			}
			System.out.println("");
		}
		//initializing the element of finish to false 
		boolean finish[]={false,false,false,false,false};
		/*for(int i=0;i<=4;i++){
			finish[i]=false;
		}*/
		 
		//all the element of avai_resource are assign to work[]
		int work[]=avai_resource;
		int x=0;
		boolean flag;
		for(int i=0;i<=4;i++){
				flag=true;
				if(finish[i]==false){
					for(int j=0;j<4;j++){
						if(need[i][j]<=work[j]){
							flag=false;
						}
						else{
							System.out.println("Cannot complete process");
							flag=true;
							break;
						}
					}
					if(!flag){
						for(int k=0;k<4;k++){
							work[k]=work[k]-need[i][k];
							need[i][k]=0;
							finish[i]=true;
						}
					}
				}
		}		
		boolean f=false;
		for(int i=0;i<4;i++){
			if(finish[i]==false){
				f=true;
			}
		}
		if(!f){
			System.out.println("Safe state");
		}		

	}
}