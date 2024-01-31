import java.time.*;
public class FictionBook implements Author , Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorname(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatname() {
		if(author_name.indexOf(" ") > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getLastName() {
		return this.author_name.toUpperCase();
	}
	
	public String getFirstName() {
		return this.author_name.toUpperCase();
	}
	
	public boolean checkEmail() {
		if(this.email == "@hotmail.com" || this.email == "@windowslive.com") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int totalPublicYear() {
		return Year.now().getValue() - this.publicYear ;
	}
	
	public String toString() {
		return title + " write by " + getLastName().charAt(0)+ "."+ getFirstName() + "("+ checkEmail() +
				")\nPublished for " + totalPublicYear() + " years.";
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}


	

}
