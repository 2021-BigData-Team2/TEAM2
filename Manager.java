package asdf;

public class Manager {
	
	private String name="";
	private int kor,math,eng;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
}