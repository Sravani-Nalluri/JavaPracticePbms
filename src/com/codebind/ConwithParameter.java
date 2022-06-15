package com.codebind;

public class ConwithParameter {
	
	String sName;
	String sBranch;
	String sCollege;
	int sAge;
	public ConwithParameter(String name,String branch,String college,int age)
	
	{
		sName=name;
		sBranch=branch;
		sCollege=college;
		sAge= age;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConwithParameter obj=new ConwithParameter ("sravani","cse","VNR",20);
		
		System.out.println("nameof student="+obj.sName);
		System.out.println("branch student="+obj.sBranch);
		System.out.println("college of student="+obj.sCollege);
		System.out.println("age of student="+obj.sAge);
		
		
	}

}
