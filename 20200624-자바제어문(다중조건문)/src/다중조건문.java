/*
 * 	���� ���ǹ� => ������ ���� ��쿡 ���
 * 	========���ǿ� �´� ���常 ����(1���� ����)
 * 	int a=15;
 * 	if(a%3==0)
 * 		system.out,println("3�� ���"); => 3�� ������� 5�� ����ε� ���⼭ ����ǹǷ� ����!!! => else if�� �ƴ϶� if������ ó���ؾ� ��
 * 	if(a%5==0)
 * 		system.out,println("5�� ���");
 * 	if(a%7==0)
 * 		system.out,println("7�� ���");
 * 
 * 	���� ��� =>
 * 
 * 	*3���� ������ �޾Ƽ� ����, ���, ���� ���
 */
import java.util.*;
public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� => ���� ������ ����
		int kor=0, eng=0, math=0;
		int total=0;
		double avg=0.0;
		char hakjum='A';
		// �Է��� �޴´� => ������ ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		kor=scan.nextInt(); // Ű����� �Է��� ������ �о�´�
		System.out.print("���� ���� �Է�:");
		eng=scan.nextInt();
		System.out.print("���� ���� �Է�:");
		math=scan.nextInt();
		// ����, ���, ���� ���
		total=kor+eng+math;
		avg=total/3.0; // �Ҽ������� ���
		System.out.println("====����====");
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		// ����
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else 
			hakjum='F';
		System.out.println("����:"+hakjum);
		
		
	}

}
