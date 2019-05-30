import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix="Company.com";
	//Constructor to receive firstName and lastName
	
	public Email(String firstName, String lastName ) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		System.out.println("Email created:"+" "+this.firstName+" "+this.lastName);
		
		//call a method asking for department-return department
		
		this.department=setDepartent();
		System.out.println("Department: "+this.department);
		//call a method that returns a random password
		this.password= randomPassword(8);
		System.out.println("Your password is"+ this.password);
		//combine elements to generate email
		email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
		System.out.println("Your email is"+" "+email);
	}
	
	//ask for Department
	private String setDepartent() {
		System.out.println("Department Codes\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEntire department code:");
	
	Scanner in=new Scanner(System.in);
	int DepChoice= in.nextInt();
	if(DepChoice==1) {
		return "sales";
	}else if(DepChoice==2) {
		return "dev";
	}else if(DepChoice==3) {
		return "acct";
	}else {
		return"";
	}
		
	}
	//generate a random password
	private String randomPassword(int length) {
		String PasswordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$!";
		char[] password= new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()* PasswordSet.length());
			password[i]= PasswordSet.charAt(rand);
		}
		return new String (password);
	}
	
//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set alternative email
	public void setAlernateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
	return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
}
