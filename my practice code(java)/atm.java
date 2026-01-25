import java.util.*;
public class atm{
public static void main(String[] args){
System.out.println("WELCOME TO THE ATM");
System.out.println("ENTER PIN OF 5 DIGITS ");
Scanner sc=new Scanner(System.in);
int i,j,k;
int pin=sc.nextInt();
if(pin>10000&&pin<99999){
System.out.println("WELCOME TO THE MENU");
System.out.println("1.CHECK BALANCE:-press 1 ");
System.out.println("2.Fee deposit:-press 2");
System.out.println("3.access previous transaction:-press 3");
System.out.println("Enter your choice");
int choice=sc.nextInt();
if("choice==press 1"){
	System.out.println("Welcome to blance enquiry");
	System.out.println("State Your acc number");
	int AC/N=sc.nextInt();
	if(AC/N<=3&&AC/N number=>5){
		System.out.println("INVALID NUMBER");
	}
	if(AC/N==4){
		System.out.println("Balance:-Rs 2000")
	}
}
else{
	System.out.println("INVALID PIN");
 }
}
}