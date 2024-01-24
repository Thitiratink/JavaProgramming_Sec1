
public class Sales extends Employee {
	private double sales;
	
	public Sales(String id,String name,double salary,double sales) {
		super(id , name , salary);
		this.sales = sales;
	}
	public Sales(String id,String name,double sales) {
		super(id,name);
		this.sales = sales;
		
	}
	public double getCommission(){
		return this.sales;
	}
	public String toString() {
		return this.getName()+"("+this.getId()+")"+this.getCommission() + "[getCommission() in ]";
		}
}
