import java.io.*;
import java.util.Scanner;
public class MovieManager {
	static MovieVO[] movies=new MovieVO[1938];
	// static => ��� Ŭ�������� ����
	// ���α׷��� �����Ǹ� �ڵ����� ������ �о� �迭�� ���� 
    //				=====> �ʱ�ȭ ��� ��� 
	static {
		try
		{
			StringBuffer data=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) //-1 => EOF(End Of File)
			{
				data.append(String.valueOf((char)i));  // valueof => char�� String���� ��ȯ
			}
			fr.close();
			
			String[] movieData=data.toString().split("\n");
			int k=0;
			for(String s:movieData)
			{
				String[] ss=s.split("\\|");
				/*
				 * ss={};
				 */
				movies[k]=new MovieVO(); //�޸𸮿� ����
				movies[k].mno=Integer.parseInt(ss[0]); //���ڿ��� ������ ��ȯ
				movies[k].title=ss[1];
				movies[k].genre=ss[2];
				movies[k].poster=ss[3];
				movies[k].actor=ss[4];
				movies[k].regdate=ss[5];
				movies[k].grade=ss[6];
				movies[k].director=ss[7];
				k++;
			}
		}catch(Exception ex) {} //File�� �д� ��� �ݵ�� ����ó�� (try~catch = ���� ���� ó�� / throws Exception = ���� ȸ��(�ý���ó��))
	}
	// ������ ������
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0; //10���� �����ִ� ����
		int j=0; //for Ƚ��
		int rowSize=10; //�� �������� �
		int pagecnt=(page*rowSize)-rowSize; //���� ��ġ
		/*
		 * 1 page => �迭�� 0~9
		 * 2 page => �迭�� 10~19
		 */
		for(MovieVO vo:movies)
		{
			if(i<10 && j>=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("��ȭ��ȣ:"+vo.mno);
			System.out.println("��ȭ��:"+vo.title);
			System.out.println("========================");
		}
	}
	
	
	/*
	public static void main(String[] args) {
		//System.out.println(data.toString());
		for(MovieVO vo:movies)
		{
			System.out.println("��ȭ��ȣ:"+vo.mno);
			System.out.println("��ȭ��:"+vo.title);
			System.out.println("�帣:"+vo.genre);
			System.out.println("�⿬:"+vo.actor);
			System.out.println("����:"+vo.director);
			System.out.println("���:"+vo.grade);
			System.out.println("������:"+vo.regdate);
			System.out.println("==============================================");
		}
		*/ //�� ���� Ȯ�ο�
		
		
	

}
