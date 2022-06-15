
// Class contain multiple objects
package com.codebind;

public class MultipleObj {
	
	int x=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleObj obj1=new MultipleObj();
		MultipleObj obj2=new MultipleObj();
		obj2.x=400;
		System.out.println("fitst x value="+obj1.x);
		System.out.println("second x value="+obj2.x);
		
		

	}

}
