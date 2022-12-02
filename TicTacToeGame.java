package com.bridgelabz;

public class TicTacToeGame {
	char gameBoard[] = null;

	void initialiseGame() {
		gameBoard = new char[10];
		for (int index = 0; index < 10; index++)
			gameBoard[index] = ' ';
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program in Java!");
		System.out.println("In this program you will compete to win in a Tic Tac Toe game against the Computer.\n");

		TicTacToeGame gameObj = new TicTacToeGame();
		gameObj.initialiseGame();
	}
}
