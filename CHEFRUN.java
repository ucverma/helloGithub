import java.util.Scanner;
class CHEFRUN{


public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++)
        {
        	
        	int X1=scan.nextInt();
        	int X2=scan.nextInt();
        	int X3=scan.nextInt();
        	int V1=scan.nextInt();
        	int V2=scan.nextInt();
        	float chef=(float)(X3-X1)/(float)V1;
        	float kefa=(float)(X2-X3)/(float)V2;
        	if(chef<kefa)
        		System.out.println("Chef");
        	else if(chef>kefa)
        		System.out.println("Kefa");
        	else System.out.println("Draw");

        }

}
}