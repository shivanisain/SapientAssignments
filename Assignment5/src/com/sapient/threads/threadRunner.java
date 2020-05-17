package com.sapient.threads;

public class threadRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tic tic = new tic();
		tic.start();
		tic.setPriority(10);
		toc tok = new toc();
		tok.start();
		
	}

}
