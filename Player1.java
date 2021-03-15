package game;
import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class Player1 {
	 
	//private int times=1;
	BufferedReader in;

	public Player1() {
       Socket clientSocket = null;
    try {// Complete this part. Use the port number: 16790
    	int ip = 16790;
    	
    	//int numberOfTurns=0;
    	String host = "localhost"; 
    	clientSocket = new Socket(host, ip);
    	
    	PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		Scanner keyboard = new Scanner(System.in);
	
		
		//while (numberOfTurns<times) {
			//System.out.println("Enter 0 for Rock ,1 for paper, 2 for scissor");
			//out.println(keyboard.nextLine());
			play(out);
		//	numberOfTurns++;
		//}
    	in.close();
    	keyboard.close();
    	clientSocket.close();
	
    }catch (Exception e) {
     // System.out.println("Error: " + e);
      System.exit(0);
    }   		
  }
  public static void main(String[] args){
    //This method is complete. Do not change it.
  	new Player1();
  }
  
  private void play(PrintWriter out) {
    //This method is complete. Do not change it.
    final int times = 10;
    Random rand = new Random();
    for(int i =1; i <= times; i++) {
      int ply = rand.nextInt(3);
      out.println("" + ply);
      display(ply);
    }
    System.out.println("P1=");
  }
  
  private void display(int ply) {
    //This method is complete. Do not change it.
    if(ply == 0)
    	System.out.print("Paper,");
    else if(ply == 1)
    	System.out.print("Rock,");
    else
    	System.out.print("Scissors,");
	}
}

