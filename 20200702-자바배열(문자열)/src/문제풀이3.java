import java.util.*;
public class ����Ǯ��3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int jumsu[]= {95,88,76,62,55};
		boolean bCheck=false;
		
		while(true)
		{
			bCheck=false;
			Scanner scan=new Scanner(System.in);
			System.out.println("���� �Է�:");
			String subject=scan.nextLine();
			if(subject.equals("�׸�"))
			{
				break;
			}
			
			for(int i=0;i<course.length;i++)
			{
				if(subject.equals(course[i]))
				{
					bCheck=true;
					System.out.println(jumsu[i]);
				}
			}
			if(bCheck==false)
			{
				System.out.println("���� �����Դϴ�");
			}
		}
		
	
		
		

	}

}
