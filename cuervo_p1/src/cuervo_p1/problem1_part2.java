package cuervo_p1;
import java.util.Scanner;

public class problem1_part2 {

	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter value to decrypt: ");
	
	int encryptedNum = in.nextInt();
	
	int n1 = encryptedNum/1000;
	int n2 = (encryptedNum-(n1*1000))/100;
	int n3 = (encryptedNum-(n1*1000)-(n2*100))/10;
	int n4 = encryptedNum-(n1*1000)-(n2*100)-(n3*10);
	
	if(n1>6)n1=n1-7;
	else if(n1<=6)n1=(n1+10)-7;
	
	if(n2>6)n2=n2-7;
	else if(n2<=6)n2=(n2+10)-7;
	
	if(n3>6)n3=n3-7;
	else if(n3<=6)n3=(n3+10)-7;
	
	if(n4>6)n4=n4-7;
	else if(n4<=6)n4=(n4+10)-7;
	
	System.out.println(""+n3+n4+n1+n2);
	
	in.close();
	
	}
}
