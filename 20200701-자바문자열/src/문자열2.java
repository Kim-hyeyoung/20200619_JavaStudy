/*
 * contains : ���Ե� ���ڿ� ã��
 */
import java.util.*;
import javax.swing.*; //windowâ ��ﶧ
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={
				"#����ִ�",
				"���",
				"����� �ð�",
				"ħ����",
				"�¿���: �� �Ϸ��� ����",
				"�߱��ҳ�",
				"�ݵ�",
				"������ ���׽�",
				"��Ʈ�� �����",
				"������ ���"
		};
		String[] actor= {
			"�⿬������(���ؿ�), �ڽ���(������)",
			"�⿬������(����), ������(ȭ��), ����ȣ(�߽���)",
			"������(������), �����(�����), ���ر�(���ر�)",
			"�⿬����ȿ(����), �蹫��(����)",
			"�� Ȧ����(�̾� ����Ʈǲ ��Ҹ�), ũ���� ����(�߸� ����Ʈǲ ��Ҹ�), �ٸ��� ���̽� �巹���۽�(�η� ����Ʈǲ ��Ҹ�)",
			"���ֿ�(�ּ���), ������(������)",
			"������, ������",
			"���ϸ� ��鸮(������), ���̹� ����(��), ���ٽ��� ����(����ũ)",
			"ũ������ ����(��罺 ����/��Ʈ��), ����Ŭ ����(��������), ���� �Ͻ�(��ī��)",
			"�� ���(P.T. �ٳ�), �� ������(�ʸ� Į����), �̼� ��������(ä��Ƽ �ٳ�)"
		};
		
		String ss=JOptionPane.showInputDialog("�˻��� �Է�"); //�˻� ȭ�� ����
		
		//System.out.println(ss);
		String temp="";
		for(String s:title)
		{
			if(s.contains(ss)) 
			{
				//System.out.println(s);
				temp+=s+"\n";
			}
		}
		//System.out.println(temp);
		JOptionPane.showMessageDialog(null, temp);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
