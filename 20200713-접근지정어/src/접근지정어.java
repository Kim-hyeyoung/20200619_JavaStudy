import lombok.Getter;
import lombok.Setter;

/*
 * 메소드 : 읽기=>getter(), 쓰기=>setter()
 * 
 * private String name;
 * 캡슐화 방식 => 데이터 보호 목적
 * =>setter
 * 	public void setName(String name)
 * 	{
 * 		this.name=name;
 * 	}
 * =>getter
 * 	public String getName()
 * 	{
 * 		return name;
 * 	}
 */
@Getter
@Setter
class Student{
	private int hakbun;
	private String name;
	private String sex;
	/*
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	*/
	
}
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
