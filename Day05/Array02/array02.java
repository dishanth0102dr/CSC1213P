import java.util.Scanner;
class array02{
	public static void main(String[] args){
		
Scanner ob=new Scanner (System.in);
int[] num = new int[10];
System.out.println("enter the number:");
for(int i=0;i<10;i++)
{
//System.out.println("enter the number:");
num[i] =ob.nextInt();
}

String days[]={"monday","tuseday","wednesday","thursday","friday","saturday","sunday"};

for(String day:days)
{
	System.out.println(day);
	
}
}
}