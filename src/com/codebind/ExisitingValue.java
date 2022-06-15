
//Program on Overriding existing value
package com.codebind;

public class ExisitingValue {
	
	int x=500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExisitingValue obj=new ExisitingValue();
        obj.x=890;
        System.out.println("Overriding existing value="+obj.x);
        
        
	}

}
