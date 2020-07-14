
class Member
{
	private String name; //접근불가
	public int age; //접근가능
	protected String addr; //접근가능
	String tel; //접근가능
	
	//필요시 변수 사용 가능하게 만든다
	public void setName(String n) //메모리에 저장 => 자동생성(lombok)
	{
		name=n;
	}
	public String getName() //메모리에서 데이터 읽기
	{
		return name;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member에 저장되어 있는 변수에 접근
		// Memeber를 저장
		Member m=new Member();
		//m.name="홍길동";
		m.setName("홍길동");
		m.age=30;
		m.addr="서울";
		m.tel="010-1111-1111";
		
		System.out.println("이름:"+m.getName());
		System.out.println("나이:"+m.age);
		System.out.println("주소:"+m.addr);
		System.out.println("전화:"+m.tel);
	}

}
