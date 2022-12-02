package com.bridgelabz;

import java.util.Scanner;

public class TicTacToePlayer {
	char gameBoard[] = null;
	char playerLetter = '\0';
	char computerLetter = '\0';

	void initialiseGame() {
		gameBoard = new char[10];
		for (int index = 0; index < 10; index++)
			gameBoard[index] = ' ';
	}

	void choosePlayerLetter() {
		System.out.println("\nPlayer please choose your play Letter.");
		System.out.println("Enter 'X' to play 'X' on your turn.");
		System.out.println("Or Enter 'O' to play 'O' on your turn.");
		Scanner scanner = new Scanner(System.in);
		char playerInput = scanner.next().charAt(0);
		scanner.close();
		if (playerInput == 'X' || playerInput == 'x') {
			playerLetter = 'X';
			computerLetter = 'O';
		} else if (playerInput == 'O' || playerInput == 'o') {
			playerLetter = 'O';
			computerLetter = 'o';
		} else
			System.out.println("\nInvalid Input.\nPlease try again!");
	}

	void showBoard() {
		System.out.println("\nCurrent Board : ");
		System.out.println("-------------");
		System.out.println("| " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + " |");
		System.out.println("-------------");
		System.out.println("| " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + " |");
		System.out.println("-------------");
		System.out.println("| " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + " |");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program in Java!");
		System.out.println("In this program you will compete to win in a Tic Tac Toe game against the Computer.\n");

		TicTacToeGame gameObj = new TicTacToeGame();
		gameObj.initialiseGame();
		gameObj.choosePlayerLetter();
		gameObj.showBoard();
	}
}
