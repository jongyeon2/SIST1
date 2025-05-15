package pm;

public class Ex4_Emp { //사원 클래스 
	private int cleanup;
	private String name;
	private String position;
	private String department;
	
	public Ex4_Emp(int cleanup, String name, String position, String department) {
		this.cleanup = cleanup;
		this.name = name;
		this.position = position;
		this.department = department;
	}
	
	public Ex4_Emp() {};
	
	public int getCleanup() {
		return cleanup;
	}
	public void setCleanup(int cleanup) {
		this.cleanup = cleanup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
