
public class CWK_25_pratice
{
	//Practice Problem 1
	public static void main(String[] args) 
	{
     for(int i=0; i<5 ;i++) {
    	 for(int j=0; j<5; j++) {
 	       if(j+i<=4) {
    	 
    	 System.out.print("*");
    	 }
    	else System.out.print(" ");
		}
	System.out.println();
     }
	//Problem no. 2
   int sum=0;
   int n=4;
   for(int k=0; k<n; k++) {
	   sum = sum + (2*k);
   }
   System.out.println("Sum of even numbers : " + sum);
		
   //problem no. 3
	    int n1=4;
	   int sum2=0;
	     for(int k1=1; k1<=10; k1++) {
		System.out.printf("%d x %d = %d\n",n1,k1,n1*k1);
		sum2 +=k1;
	   }
	     System.out.println("the sum of table is:"+ sum2);
	 
   }

	}
