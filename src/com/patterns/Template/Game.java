package com.patterns.Template;

public abstract class Game {
	
	public void startPlay(){
		
	}
	public abstract void endPlay();
	public abstract void initialize();
	
	public void play(){
		
		initialize();
		
		startPlay();
		
		endPlay();
	}
}
