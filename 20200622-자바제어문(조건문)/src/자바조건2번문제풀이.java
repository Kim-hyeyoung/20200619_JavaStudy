import java.util.*;
public class �ڹ�����2������Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�������� �������� �������� �Է�:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		
		if (avg>=90 && avg<100)
			score='A';
		if (avg>=80 && avg<90)
			score='B';
		if (avg>=70 && avg<80)
			score='C';
		if (avg>=60 && avg<70)
			score='D';
		if (avg<60) 
			score='F'; 
		
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f%n",avg);
		System.out.println("����:"+score);
		
		
	}

}
