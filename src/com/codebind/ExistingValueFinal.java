
//pgm declaring class variable as final 
package com.codebind;

public class ExistingValueFinal {
      int x=890;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExistingValueFinal obj=new ExistingValueFinal();
        obj.x=100;   // will generate an error: cannot assign a value to a final variable
        System.out.println("Overriding existing value="+obj.x);
        
}
}