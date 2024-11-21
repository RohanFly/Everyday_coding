import java.util.Scanner;
public class Reverse_String {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.print("Enter the String --->");
		s.append(sc.nextLine());
		int l=s.length();
		
		System.out.print("Before reversing string-->"+s); //before reversing the string
		
		for(int i=0;i<l/2;i++)
		{
			char c1=s.charAt(i);
			char c2=s.charAt(l-i-1);
			char temp=c1;
			
			s.setCharAt(i, c2);
			s.setCharAt(l-i-1, temp);
			
		}
		
		
		System.out.print("After reversing string-->"+s); //after reversing the string
		
	
		
	}

}
