import java.util.Scanner;
class OddEvenRange{
public static void main (String args[]){
int r,i;
Scanner scan=new Scanner(System.in);

System.out.print("Enter the first number for the range: ");
int num1=scan.nextInt();
System.out.print("Enter the second number for the range: ");
int num2=scan.nextInt();
System.out.print("\nDisplay the even numbers between "+num1+" and "+num2+" are :");
i=num1; 
while(i<=num2){ 
r=i%2; 
if(r==0) 
System.out.println(i);
 i++;
}
System.out.print("\nDisplay the odd numbers between "+num1+" and "+num2+" are :");
i=num1; 
while(i<=num2){ 
r=i%2; 
if(r==1) 
System.out.println(i);
 i++;
}
}
}