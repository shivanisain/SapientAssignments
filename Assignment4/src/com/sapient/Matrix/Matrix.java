package com.sapient.Matrix;

public class Matrix {

	int m;
	int n;
	int matrix[][];

//default constructor	(i)

	public Matrix() {
		m = 3;
		n = 3;
		matrix = new int[m][n];
	}

//constructor to specify the dimensions of the matrix    (ii)

	public Matrix(int i, int j) {

		m = i;
		n = j;
		matrix = new int[m][n];
	}

//constructor to adopt a matrix     (iii)

	public Matrix(int[][] M) {
		m = M.length;
		n = M[0].length;
		this.matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.matrix[i][j] = M[i][j];
			}
		}
	}

//copy constructor   (iv)

	Matrix(Matrix M) {
		this.m = M.m;
		this.n = M.n;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.matrix[i][j] = M.matrix[i][j];
			}
		}
	}

// (v)

	public void readMatrix() {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.matrix[i][j] = read.rd.nextInt();
			}
		}
	}

// (vi)

	public void displayMatrix() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

// (vii)

	public Matrix addMatrix(Matrix M) {

		Matrix result = new Matrix(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result.matrix[i][j] = this.matrix[i][j] + M.matrix[i][j];
			}
		}
		return result;
	}

// (viii)

	public void checkIfScalar() {
		Boolean isScalar = true;
		int x = this.matrix[0][0];
		for (int i = 0; i < m; i++) {

			if (this.matrix[i][i] != x) {
				isScalar = false;
			}
			for (int j = 0; j < n; j++) {
				if (i != j && this.matrix[i][j] != 0) {
					isScalar = false;
				}
			}
		}

		if (isScalar) {
			System.out.println("this is a scalar matrix");
		} else {
			System.out.println("this is not a scalar matrix");
		}
	}

// (ix)

	public Matrix multiplyMatrix(Matrix M) {

		Matrix result = new Matrix(m, M.n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < M.n; j++) {
				for (int k = 0; k < n; k++) {
					result.matrix[i][j] += this.matrix[i][k] * M.matrix[k][j];
				}
			}
		}
		return result;
	}

}