
public class Person {
	//declare 2 private attributes
		private String firstName , lastName;
		//default constructor
		//Initialize firstName and lastName to an empty string
		Person(){
			firstName = "";
			lastName = "";
			//set(first,last);
		}
		
		//Constructor with parameters
		Person(String first , String last){
			firstName = first;
			lastName = last;
		}
		
		public void setName(String first , String last) {
			firstName = first;
			lastName = last;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String toString() {
			return firstName + " "+ lastName;
		}
	 
}
