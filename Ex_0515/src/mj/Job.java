package mj;

// 직책(상수)
public enum Job {

	BOSS("보스", 100000),
	SENEOR("시니어", 50000),
	JUNIOR("주니어", 20000),
	STAFF("말단사원", 100)
	;

	private final String name; // 직책 이름
	private final int salary;  // 연봉
	
	Job(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
}
