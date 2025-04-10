import java.util.Scanner;
class array03{
	public static void main(String[] args){
		
Scanner ob=new Scanner (System.in);
int[] num = new int[5];
System.out.println("enter the number:");

for(int i=0;i<5;i++)
{
  num[i] =ob.nextInt();
}

int maxi=num[0];
int mini=num[0];

for(int i=0;i<5;i++)
{
	if(maxi<num[i])
	{
		maxi=num[i];
	}
	else
	{
		maxi=maxi;
	}
}
for(int i=0;i<5;i++)
{
	if(mini>num[i])
	{
		mini=num[i];
	}
	else
	{
		mini=mini;
	}
}

System.out.println("the maximum number is:"+maxi);
System.out.println("the minimum number is:"+mini);
	}
}