package pm;

public class Ex4_Emp { //사원 클래스 
	private int ein;
	private String name;
	private String position;
	private String department;
	
	public Ex4_Emp(int ein, String name, String position, String department) {
		this.ein = ein;
		this.name = name;
		this.position = position;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "사원정보 : " + ein + " 사원 이름 : " + name + " 직책 : " + position + " 부서 : " + department;
	}
	
	public Ex4_Emp() {};
	
	public int getEin() {
		return ein;
	}
	public void setEin(int ein) {
		this.ein = ein;
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
