package practice13.common;

public class Employee extends Person {
	private String departmentNm;		//部署名
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public String getDepartmentNm() {
		return departmentNm;
	}
	private int departmentCnt;			//部署人数
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
	public int getDepartmentCut() {
		return departmentCnt;
	}

}
