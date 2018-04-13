package com.kgfsl;

public class Employee {
	private int reg_no;
	private String grade;
	private int id_no;
	private String bank_id;
	private String data;
	private String info;
	private String file1;
	private String empty1;
	private String empty2;
	private int rate1;
	private float rate2;
	private String state;
	private String ocolumn;
	private String ucolumn;
	private String formula;
	private String file2;
	
/**
 * @return the reg_no
 */
public int getReg_no() {
	return reg_no;
}
/**
 * @param reg_no the reg_no to set
 */
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}
/**
 * @return the grade
 */
public String getGrade() {
	return grade;
}
/**
 * @param grade the grade to set
 */
public void setGrade(String grade) {
	this.grade = grade;
}
/**
 * @return the id_no
 */
public int getId_no() {
	return id_no;
}
/**
 * @param id_no the id_no to set
 */
public void setId_no(int id_no) {
	this.id_no = id_no;
}
/**
 * @return the bank_id
 */
public String getBank_id() {
	return bank_id;
}
/**
 * @param bank_id the bank_id to set
 */
public void setBank_id(String bank_id) {
	this.bank_id = bank_id;
}
/**
 * @return the data
 */
public String getData() {
	return data;
}
/**
 * @param data the data to set
 */
public void setData(String data) {
	this.data = data;
}
/**
 * @return the info
 */
public String getInfo() {
	return info;
}
/**
 * @param info the info to set
 */
public void setInfo(String info) {
	this.info = info;
}
/**
 * @return the hashfile1
 */
public String getfile1() {
	return file1;
}
/**
 * @param file1 the hashfile1 to set
 */
public void setfile1(String file1) {
	this.file1 = file1;
}
/**
 * @return the empty1
 */
public String getEmpty1() {
	return empty1;
}
/**
 * @param empty1 the empty1 to set
 */
public void setEmpty1(String empty1) {
	this.empty1 = empty1;
}
/**
 * @return the empty2
 */
public String getEmpty2() {
	return empty2;
}/**
 * @param empty2 the empty2 to set
 */
public void setEmpty2(String empty2) {
	this.empty2 = empty2;
}
/**
 * @return the rate1
 */
public int getRate1() {
	return rate1;
}
/**
 * @param rate1 the rate1 to set
 */
public void setRate1(int rate1) {
	this.rate1 = rate1;
}
/**
 * @return the rate2
 */
public float getRate2() {
	return rate2;
}/**
 * @param rate2 the rate2 to set
 */
public void setRate2(float rate2) {
	this.rate2 = rate2;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the ocolumn
 */
public String getOcolumn() {
	return ocolumn;
}
/**
 * @param ocolumn the ocolumn to set
 */
public void setOcolumn(String ocolumn) {
	this.ocolumn = ocolumn;
}/**
 * @return the ucolumn
 */
public String getUcolumn() {
	return ucolumn;
}
/**
 * @param ucolumn the ucolumn to set
 */
public void setUcolumn(String ucolumn) {
	this.ucolumn = ucolumn;
}/**
 * @return the formula
 */
public String getFormula() {
	return formula;
}
/**
 * @param formula the formula to set
 */
public void setFormula(String formula) {
	this.formula = formula;
}
/**
 * @return the hashfile2
 */
public String getfile2() {
	return file2;
}
/**
 * @param file2 the hashfile2 to set
 */
public void setfile2(String file2) {
	this.file2 = file2;
}	

	@Override
	public String toString() {
		return "{" + reg_no+ "   " + grade +  "   " +id_no+"   "+ bank_id+"   "+data+"   "+info+"   "+file1+"   "+empty1+"   "+empty2+"   "+rate1+"   "+rate2+"   "+state+"   "+ocolumn+"   "+ucolumn+"   "+formula+"   "+file2+" }";
	}
}
