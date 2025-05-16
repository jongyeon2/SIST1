package pm;

public class Ex6_Emp {
	private String empno; //사번
	private String ename; // 이름
	private String dept; // 부서
	public String getEmpno() {
		return empno;
	}
	
	public Ex6_Emp(String empno, String enam, String dept) {
		this.empno = empno;
		this.ename = enam;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return " 사번: " + empno + " 이름: " + ename + " 부서: " + dept;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
