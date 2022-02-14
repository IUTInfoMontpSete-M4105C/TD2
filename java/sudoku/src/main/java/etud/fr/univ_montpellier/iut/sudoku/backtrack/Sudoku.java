package etud.fr.univ_montpellier.iut.sudoku.backtrack;

import java.time.Duration;
import java.time.Instant;

import org.chocosolver.solver.Solution;

public class Sudoku {

	int n;
	int s;
	int[][] grid;
	public static int counter;
	public static int solution;

	/*
	 * Create an instance of the problem sudoku (nxn)
	 * 
	 */

	public Sudoku(int n) {
		this.n = n;
		this.s = (int) Math.sqrt(n);
		this.grid = new int[n][n];
	}

	public boolean alreadyInCol(int val, int col) {
	//TODO
		
		return false;
	}

	public boolean alreadyInRow(int val, int row) {
		//TODO
		return false;
	}

	public boolean alreadyInShape(int val, int row, int col) {
		//TODO
		return false;
	}

	public boolean isPossible(int valeur, int row, int col) {
		//TODO
		return false;
	}

	public void print() {
		//TODO
	}

	public boolean findSolutionAll(int row, int col) {
		//TODO
		return false;

	}

	public boolean findSolution(int row, int col) {
		//TODO
		return false;

	}

	public static void main(String[] a) {
		counter = 0;
		solution = 0;

		Instant start = Instant.now();

		System.out.println(
				new Sudoku(4).findSolutionAll(0, 0) + " #recursive_calls=" + counter + " nb_soluion=" + solution);

		Instant end = Instant.now();

		System.out.println(Duration.between(start, end));

	}
}