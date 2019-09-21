package cuervo_p3;
import java.util.Scanner;

public class cuervo_p3 {
  
public static void main(String[] args){

	String[] issues = {"Academics", "Movies", "Video Games", "Sports", "Food"};
	int[][]output = new int[5][10];
	
	double[] sum = new double[]{0,0,0,0,0};
	double average = 0;
	
	Scanner in = new Scanner(System.in);
	
	for(int i=0; i<10; i++){
       for(int j=0; j<5; j++){
           System.out.println("Rate how important you find " + issues[j] + " on a scale from 1-10:");
           output[j][i] = in.nextInt();
       }
   }
   
   for(int i=0; i<5; i++){
	   System.out.print("\n" + (i+1) + ". " + issues[i] + " ");
       for(int j=0; j<10; j++){
           System.out.print("\t" + output[i][j] + "\t");
           sum[i] = sum[i] + output[i][j];
       }
       average = sum[i]/10;
       System.out.print("Average: " + average);
   }
   
   double maxPoints = sum[0];
   double minPoints = sum[0];
   int highestTotal = 0;
   int lowestTotal = 0;

   for(int i=0; i<5; i++){
       if(maxPoints < sum[i]){
           maxPoints = sum[i];
           highestTotal = i;
       }
       if(minPoints>sum[0]){
           minPoints=sum[0];
           lowestTotal=i;
       }
   }
   
   System.out.println("\nHighest Point Total: "+issues[highestTotal]);
   System.out.println("Point Total: " + maxPoints);
   System.out.println("Lowest Point Total: "+issues[lowestTotal]);
   System.out.println("Point Total: "+ minPoints);
  
   in.close();
   }

  
}