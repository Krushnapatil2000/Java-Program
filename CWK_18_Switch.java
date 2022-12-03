import java.util.*;
public class CWK_18_Switch {

	public static void main(String[] args) {
		int age;
		System.out.println("enter the age ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
if(age>56)
{
	System.out.println("you are experinced");
}
 else if ( age >46)
{
	System.out.println("you are semi experinced");
}
 else if(age>36)
 {
	 System.out.println("you are semi semi experince");
	 
 }
 else
	 {
	 System.out.println("you are not experince");
	 }
if(age<10)
{
	System.out.println("baby");
}
 	}

}
