package mj;

public class Employee {
	
	// 사원 번호는 자동 생성 된다( 사원 번호는 중복되면 안된다 )
	private int no = 0; // iv
	private String name;
	private int age;
	private Job job;
	private Department department;
	private static int generateNo = 0; // 생성용
	
	// 생성자
	public Employee(String name, int age, Job job, Department department) {
		this.no = ++generateNo; // 사원 번호 자동 생성
		this.name = name;
		this.age = age;
		this.job = job;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return  "사원 정보[사원 번호: " + no + ", 이름: " + name + ", 나이: " + age + ", 직책: " +  job.getName() + ", 연봉: " + job.getSalary() + ", " 
				+ department + "]";
	}
	
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
