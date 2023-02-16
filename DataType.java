import java.time.*;

public class DataType {
  public static void main(String[] args) {
	  //Integral  numbers
	byte noOfPeopleInHouse=5;
	short populationOfArea=20000;
	int populationhOfTown=120000;
	long populationOfIndia=14000000000L;
	
	System.out.println("Number of People in a House :"+noOfPeopleInHouse);
	System.out.println("Population of a Area:"+populationOfArea);
	System.out.println("Population of a Town"+populationhOfTown);
	System.out.println("Population of India:"+populationOfIndia);
	//Floating Numbers
	float intrestRate=3.4f;
	double molecularWeight=5.23746238746823764;
	System.out.println("Interest Rate is : "+intrestRate);
	System.out.println("Molecular Weight :"+molecularWeight);
	
	//characters
	char ASCII=65;
	System.out.println("Character for ASCII 65: "+ASCII);
	char gender='M';
	System.out.println("Gender is :"+gender);
	
	boolean areYouCertified=true;
	System.out.println("are You Certified :"+areYouCertified);
	
	String myFirstName="Subrahmanya";
	String myMiddleName="L";
	String myLastName="Bhat";
	
	System.out.println("My Full Name :"+myFirstName+" "+myMiddleName+" "+myLastName);
	LocalDate date1=LocalDate.now();
	System.out.println("Today is :"+date1);
	
	LocalTime Time1=LocalTime.now();
	System.out.println("Time :"+Time1);
	LocalDateTime date2=LocalDateTime.now();
	System.out.println("date2:"+date2);
	
	
	
}
}
