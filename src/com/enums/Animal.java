package com.enums;

public enum Animal {
	CAT{
		@Override
		public String makeNoise() {
			return "MEOW";
		}
		
	}, DOG{
		@Override
		public String makeNoise() {
			return "BOW";
		}
		
	};
	
	public abstract String makeNoise();
}
