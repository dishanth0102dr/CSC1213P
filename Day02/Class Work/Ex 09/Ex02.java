import java.util.Scanner;
class Ex02{
	public static void main(String [] args)
	{
		Scanner ob = new Scanner(System.in);
		
		//Boolean
		System.out.println("Input the value: ");
		boolean value01 = ob.nextBoolean();
		System.out.println("Output: "+value01);
		
		//Byte
		System.out.println("Input the value: ");
		byte value02 = ob.nextByte();
		System.out.println("Output: "+value02);
		
		//Short
		System.out.println("Input the value: ");
		short value03 = ob.nextShort();
		System.out.println("Output: "+value03);
		
		//Integer
		System.out.println("Input the value: ");
		int value04 = ob.nextInt();
		System.out.println("Output: "+value04);
		
		//Float
		System.out.println("Input the value: ");
		float value05 = ob.nextFloat();
		System.out.println("Outputt: "+value05);
		
		//Double
		System.out.println("Input the value: ");
		double value06 = ob.nextDouble();
		System.out.println("Output: "+value06);
		
		//Long
		System.out.println("Input the value: ");
		long value07 = ob.nextLong();
		System.out.println("Output: "+value07);
		
	}
}