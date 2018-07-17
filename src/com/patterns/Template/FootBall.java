package com.patterns.Template;

public class FootBall extends Game{

	@Override
	public void startPlay() {
		System.out.println(" FootBall game started ");
	}

	@Override
	public void endPlay() {
		System.out.println(" FootBall game ended ");
	}

	@Override
	public void initialize() {
		System.out.println("FootBall game initialized ");
	}

}
