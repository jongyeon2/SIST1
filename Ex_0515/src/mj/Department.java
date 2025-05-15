package mj;

public class Department {
	
	private String name;      // 부서이름 
	private String boss;	  // 부서장	
	private String createBy;  // 부서 창립일
	
	
	public Department(String name, String boss, String createBy) {
		this.name = name;
		this.boss = boss;
		this.createBy = createBy;
	}

	@Override
	public String toString() {
		return "부서 이름: " + name + ", 부서장: " + boss + ", 부서 역할: " + createBy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getCreatedBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	
	
}
