/*
 * 		\t
 *		\n 		
 *		\"
 * 		\\
 * 		double d=123456.78
 * 		int a= (int)((d-123456)*100)
 * 
 * 		�ۺ� Ŭ���� �ڹٱ⺻��{
 * 			�ۺ� ����ƽ ���̵� ����(��Ʈ��[] �Ű�)
 * 			{
 * 			}       => �̷��� �ڵ��� ���� �ֱ� �� (�ٱ���)
 */
public class �ڹٱ⺻��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("C:\\javaDev\\javaStudy\\20200617-�ڹ���¸޼ҵ�\\src\\�ڹٱ⺻��������2.java");
		System.out.println("\"ȫ�浿\""); // "ȫ�浿"���� ����ϰ� ����
		System.out.print("Hello\t");
		System.out.print("Java!!\n");
		
		//double d=123456.78;   // �̷��� �ϸ� double�� 8byte�� int�� 4byte���� 78�� �ƴ� 77�� ����
		float d=123456.78F;    //  �̷��� 4byte�� �����ָ� 78�� �°� ����
		int a= (int)((d-123456)*100); 
		System.out.println(a);    
		
		

	}

}
