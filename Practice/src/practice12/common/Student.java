/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentId() {
		return studentId;
	}

	/** 受講生氏名 */
	private String studentName;
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}

	/** 会社名 */
	private String companyName;
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}

	/** 教室名 */
	private String className;
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return className;
	}

	/** メールアドレス */
	private String mail;
	public void setMail(String mail) {
		this.mail =mail;
	}
	public String getMail() {
		return mail;
	}

	/** パスワード */
	private String password;
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

}
