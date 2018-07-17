package com.patterns.singleton;

import java.io.Serializable;

public final class SingleToneDP implements Serializable, Cloneable{
	
	private static volatile SingleToneDP single;
	
	private SingleToneDP(){
		
	}
	
	public static SingleToneDP getInstance(){
		if(single == null)
			synchronized(SingleToneDP.class){
				if(single == null)
					single = new SingleToneDP();
			}
		return single;
	}
	
	// implement readResolve method
    protected Object readResolve()
    {
        return single;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
      throw new CloneNotSupportedException();
    }
}
