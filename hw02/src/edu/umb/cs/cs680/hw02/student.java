package edu.umb.cs.cs680.hw02;

public class student {

	private float tuition;
	private String name;
	private int i20num;
	private String usAddr;
	private int yrsInState;
	private String foreignAddr;
	private enum StudentStatus{INSTATE,OUTSTATE,INTL}
	private StudentStatus status;

	private student(float tuition1, String name1, int i20num1, String usAddr1,int yrsInState1, String foreignAddr1, StudentStatus stStatus) {
		this.tuition=tuition1;
		this.name=name1;
		this.i20num=i20num1;
		this.usAddr=usAddr1;
		this.yrsInState=yrsInState1;
		this.foreignAddr=foreignAddr1;
		this.status=stStatus;	
	}
	public static student createinStateStudent(String stname, String staddr, int stYrsInState){	
		float InTuition=2000;
		return new student(InTuition,stname,0,staddr,stYrsInState, null,StudentStatus.INSTATE);	
	}
	
	public static student createOutStateStudent(String stname, String staddr, int stYrsInState) {
		float InTuition=5000;
		return new student(InTuition,stname,0,staddr,stYrsInState, null,StudentStatus.OUTSTATE);		
	}
	
	public static student createIntlStudent(String stname, int stI20num ,String staddr, int stYrsInState, String stForeignAddr) {
		float InTuition=90000;
		return new student(InTuition,stname,stI20num,staddr,stYrsInState, null,StudentStatus.INTL);
		
	}
	public float getTuition() {
		return this.tuition;
	}
	public static void main(String[] args) {


	}

	
}
