package cuervo_p1;
import java.util.Scanner;

public class cuervo_p1 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value to encrypt: ");
		
		int input = in.nextInt();
				
		int n1 = input/1000;
		int n2 = (input-(n1*1000))/100;
		int n3 = (input-(n1*1000)-(n2*100))/10;
		int n4 = input-(n1*1000)-(n2*100)-(n3*10);
			
		n1 = (n1+7)%10;
		n2 = (n2+7)%10;
		n3 = (n3+7)%10;
		n4 = (n4+7)%10;
		
		System.out.println(""+n3+n4+n1+n2);
	
		in.close();
	}

}
