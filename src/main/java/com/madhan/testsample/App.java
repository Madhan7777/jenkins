package com.madhan.testsample;


public final class App 
{
	
    private App() {
		super();
	}

	public static int compareString(String str1,String str2)
    {
        if(str1.equals(str2))
        	return 1;
        else
        	return 0;
    }
    
    public static int sum(int[] val)
    {
    	int total = 0;
    	for(int i=0; i<val.length;i++)
    	{
    	total+=val[i];
    	}
    	return total;
    	
    }
}
