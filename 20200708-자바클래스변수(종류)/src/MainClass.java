/*
 * ��ȭ Ŭ����
 * 1��ȭ��,2�⿬,3����,4������,5����
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {"�㽩-������ �ٲ� ��ź����",
						"��ũ����Ʈ������",
						"#����ִ�",
						"���зο�",
						"�����"};
		String[] actor= {"�������� �׷� , ���� Ű��� , ���� �κ�",
						"ũ������ ���� , ���� ��� ���� , �Ը� �õ常 , �� �ؼ����� , �� �ϵ� , ������ ����Ƹ� , ��� ������ , ����Ŭ ���� , ���� �Ͻ�",
						"������, �ڽ���",
						"���ϸ� ���� ,  ����ƾ ������",
						"����ũ ������ ,��ũ ���ȷ�"};
		
		String[] director= {"���� ��ġ","ũ�������� ���","������","ī���� �̶󺧶� ���̺� ","���̺� ��ó"};
		double[] reserve= {15.2,15.0,2.6,1.6,1.5};
		int[] rank= {1,2,3,4,5};
		
		for(int i=0;i<5;i++)
		{
			System.out.println("��ȭ��:"+title[i]);
			System.out.println("����:"+director[i]);
			System.out.println("�⿬:"+actor[i]);
			System.out.println("������:"+reserve[i]);
			System.out.println("��ȭ����:"+rank[i]);
			System.out.println("=====================");
		}
		

	}

}
