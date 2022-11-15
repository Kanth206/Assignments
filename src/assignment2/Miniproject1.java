package assignment2;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Hey! Guesser guess the number fast");
		guessNum=s.nextInt();
		return guessNum;
			
	}
}
class Player
{
	int playerNum;
	int playerNum()
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" ");
		playerNum=s.nextInt();
		return playerNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		System.out.println("player-1  guess your number please ");
		numFromPlayer1=p1.playerNum();
		System.out.println("player-2  guess your number please ");
		numFromPlayer2=p2.playerNum();
		System.out.println("player-3  guess your number please ");
		numFromPlayer3=p3.playerNum();
		
	}
	void compare()
	{
		if(numFromGuesser<=9&&numFromPlayer1<=9&&numFromGuesser>0&&numFromPlayer1>0
		   &&numFromPlayer2<=9&&numFromGuesser>0&&numFromPlayer2>0
		  &&numFromPlayer3<=9&&numFromGuesser>0&&numFromPlayer3>0) 
		{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
			{
				System.out.println("congrats! All Won the match ");
			}
			else if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2)
			{
				System.out.println(" Player-1 & Player-2 Won the match ");
			}
			else if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2)
			{
				System.out.println(" Player-1 & Player-3 Won the match ");
			}
			else
			{
			    System.out.println("player-1 won the Match");
			}
		}	
		else if(numFromGuesser==numFromPlayer2)
		{
		   if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
			{
				System.out.println(" Player-2 & Player-3 Won the match ");
			}
		   else
		   {
			    System.out.println("player-3 won the Match");
		   }
		   
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			    System.out.println("player-3 won the Match");
		}
		else 
		{
			System.out.println("No one guess correct number");
		}
		
	}
		else
		{
			System.out.println("enter numbers between (1-9)");
		}
	}
	
}



public class Miniproject1 {

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
