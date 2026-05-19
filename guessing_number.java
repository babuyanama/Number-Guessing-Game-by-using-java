package javagames;

import java.util.Scanner;
class guessing_number{
	public static void A() {
		Scanner in=new Scanner(System.in);
		int num=1+(int)(100*Math.random());
		int k=5;
		System.out.println("you have guess the number between 1 to 100");
		System.out.println("you have" + k +"attempts to guess the number");
		for(int i=0; i<k; i++){
			System.out.println("enter your guessing number");
			int guess=in.nextInt();
			if(guess==num){
				System.out.println("congrtualtions you have guess the correct number");	
				in.close();
				return;
			}
			else if(guess<num){
				System.out.println("the number is greater than "+ guess);
			}
			else{
				System.out.println("the number is lower than "+ guess);
			}
		}
		 System.out.println("You've exhausted all attempts. The correct number was: " + num);
       		 in.close();
}
		public static void main(String[] args){
			A();
		
	}
}
