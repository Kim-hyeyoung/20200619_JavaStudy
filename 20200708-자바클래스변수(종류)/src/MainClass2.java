/*
 * ����ڰ� ���� ���������� �����
 */
class MovieInfo{
	String title;
	String director;
	String actor;
	double reserve;
	int rank;  //�ν��Ͻ� ���� => �޸� ���� ���� => 'new'
	static String site_name; //static�� ���������̱� ������ �޸𸮸� �������� ��� => ���� �����ϸ� ��� �ٲ�
	
}
//MovieInfo m1=new MovieInfo()
public class MainClass2 { //public�� ���� Ŭ������ ������� ��. �� ���� ��밡��. ��� ��(������ main�� �ִ� Ŭ������ �����)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		//m1 �޸𸮿� ����Ǿ� �ִº����� �ʱ�ȭ   // MovieInfo[]=new  MovieInfo[50];
		m1.title="�㽩-������ �ٲ� ��ź����";
		m1.director="���� ��ġ";
		m1.actor="�������� �׷� , ���� Ű��� , ���� �κ�";
		m1.reserve=15.2;
		m1.rank=1;
		m1.site_name="CGV";
		
		MovieInfo m2=new MovieInfo();
		//m2 �޸𸮿� ����Ǿ� �ִº����� �ʱ�ȭ
		m2.title="��ũ����Ʈ������";
		m2.director="ũ�������� ���";
		m2.actor="ũ������ ���� , ���� ��� ���� , �Ը� �õ常 , �� �ؼ����� , �� �ϵ� , ������ ����Ƹ� , ��� ������ , ����Ŭ ���� , ���� �Ͻ�";
		m2.reserve=15.0;
		m2.rank=2;
		m2.site_name="�Ե��ó׸�";
		
		MovieInfo m3=new MovieInfo();
		//m3 �޸𸮿� ����Ǿ� �ִº����� �ʱ�ȭ
		m3.title="#����ִ�";
		m3.director="������";
		m3.actor="������, �ڽ���";
		m3.reserve=2.6;
		m3.rank=3;
		m3.site_name="�ް��ڽ�";
		
		System.out.println("��ȭ��:"+m1.site_name); //=>�� ��� �ް��ڽ��� ����
		
		MovieInfo.site_name="�������"; //m1,m2���� �ƴ� Ŭ���� �̸����ε� ���� ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
