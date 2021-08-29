package co.bridgelabz.Working;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Working 
{
	static int player1 = 0, player2 = 0, position = 0, winningPosition = 10, flag = 0, counter1 = 0,
			counter2 = 0;

	private static void playgame() {
		if (flag == 0) {
			counter1++;
			int rollDie = rollCheck();
			System.out.println("Value at die is: " + rollDie);
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				flag = 1;
				break;
			case 1:
				System.out.println("Ladder");
				player1 = player1 + rollDie;
				if (player1 > winningPosition)
					player1 = player1 - rollDie;
				break;
			case 2:
				System.out.println("Snake");
				player1 = player1 - rollDie;
				if (player1 < 0)
					player1 = 0;
				break;
			}
			if (counter1 == winningPosition) {
				System.out.println("Player1 is winner");
			}
			position++;

		} else {
			counter2++;
			int rollDie = rollCheck();
			System.out.println("Value at die is: " + rollDie);
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				flag = 0;
				break;
			case 1:
				System.out.println("Ladder");
				player2 = player2 + rollDie;
				if (player2 > winningPosition)
					player2 = player2 - rollDie;
				break;
			case 2:
				System.out.println("Snake");
				player2 = player2 - rollDie;
				if (player2 < 0)
					player2 = 0;
				break;
			}
			if (counter2 == winningPosition) {
				System.out.println("Player2 is winner");
			}
			position++;
		}
	}

	private static int rollCheck() {
		int rollValue = (int) (Math.floor(Math.random() * 10 % 6 + 1));
		return rollValue;

	}

	private static int options() {
		int option = (int) (Math.floor(Math.random() * 10 % 3));
		return option;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		while (position != winningPosition) {
			playgame();
		}
	}
}