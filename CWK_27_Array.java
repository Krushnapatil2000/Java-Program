package CWK_java;

public class CWK_27_Array {

	public static void main(String[] args) {
		
		/*float []marks= {100.5f,80,80,60,70};
		System.out.println(marks.length);
        System.out.println(marks[4]);
        String[]students= {"Krushna" , "Madhav" , "patil" ," Ajay"};
        System.out.println(students.length);
		System.out.println(students[3]);
        */
		//Displaying the array(For loop)
     int[]marks= {100,80,80,60,70};
	 System.out.println("Printing using for loop:");
	 for(int i=0; i<marks.length;i++)
	 {
		 System.out.println(marks[i]);
	 }
	 
	 //Displaying the arrayin Reverse order(For loop)
	 System.out.println("Printing using for loop in reverse order:");
	 for(int i=marks.length-1; i>=0;i--)
	 {
		 System.out.println(marks[i]);
	 }
	 
     //Displaying the array(For-each loop)
	 System.out.println("Printing using for-each loop: ");
	 for(int element: marks) {
		 System.out.println(element);
	 }
	}

}
