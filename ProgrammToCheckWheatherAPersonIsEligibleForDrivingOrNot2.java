import java.util.Scanner;
class ProgrammToCheckWheatherAPersonIsEligibleForDrivingOrNot2
{
public static void main(String []args)
{
Scanner Q=new Scanner(System.in);
System.out.println("This Is To Check That Wheater You Are Eligible For Driving Or Not");
System.out.println("Enter Your Age:");
int Age=Q.nextInt();
if
(Age>18)
{
System.out.println("You Are Eligigle For Driving");
}
else
{
System.out.println("You Are Not Eligible For Driving");
}
}
}