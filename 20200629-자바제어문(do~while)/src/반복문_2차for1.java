/*
 * ��ø for��
 * 		����)
 * 			for(�ʱⰪ;���ǽ�;������) //�������(�ټ�)      
 * 			{
 * 				for(�ʱⰪ;���ǽ�;������) //�������
 * 				 {
 * 					�ݺ� ���๮��		
 *				 }
 * 			}
 * 			ex)
 * 				*****
 * 				*****
 *				*****
 * 				***** => 1�� for���� 4����, 2�� for���� 5���� => ���� ����� 2�� for�� �ȿ� ����
 */
public class �ݺ���_2��for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
