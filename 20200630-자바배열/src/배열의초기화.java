/*
 * = �迭 ����
 * 		��������[] �迭��;
 * = �迭 �ʱ�ȭ (�޸𸮿� ���� �Է�)
 * 		ex) 1) int[] arr{10,20,30,40,50}; => ����� ���ÿ� �ʱⰪ
 * 			2) int[] arr=new int[5]; => �޸� ������ ���� / ���߿� ���� ä���
 * 			3) int[] arr; //����
 * 			   arr[0]=10;
 * 			   arr[1]=20;..
 *  Ȱ�� => ���(for,while)
 *  
 *  	for => ���� 
 *  	for-each => ���
 */
public class �迭���ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���
		String[] names= {"ȫ�浿","�ڹ���","�̼���","������","��û��"}; //length=5
		for(int i=0;i<names.length;i++) //�迭 ������ �� �� length
		{
			//names[1]=""; �����Ͱ� ���� ����
			System.out.println(names[i]);
		}
		System.out.println("========= for-each ========");
		for(String name:names) //for(�������� :�迭��)
		{
			System.out.println(name); //�����Ͱ� ������ �Ұ��� => ��¸� ����
		}

	}

}
