import java.util.Scanner;

public class  IT24102488Lab4Q3{
  public static void main (String[] args){

Scanner input=new Scanner(System.in);

System.out.print("Enter a number");
int num=input.nextInt();

String result = (0>num)?"negative"
		:(0<num)?"positive"
		:"number is zero";
System.out.println("The number is "+result);

		
  }
}
