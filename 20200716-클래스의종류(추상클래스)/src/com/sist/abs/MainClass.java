package com.sist.abs;
/*
 * �߻� Ŭ����
 * 	= �̿ϼ��� Ŭ����
 * 	=new�� ����ؼ� �޸� �Ҵ� �Ұ��� => ������ Ŭ������ ����ؼ� �޸� �Ҵ� �ؾ� �� / ���� g=new �ﰢ��();
 * 	class A
 * 		=> A a=new A();
 * 	abstract class B
 * 		=> B b=new B(); => error!
 * 	=> �׻� ����� ���� ���� Ŭ�������� ������ ������ ���
 * 	=> �⺻ Ʋ�� ����
 * 	=> ���ø� �Ѵ� => �����ϴ� ������ ���α׷����� �ٸ� �� �ֱ� ����
 */
abstract class ����
{
	public abstract void draw();
	public void color()
	{
		System.out.println("���������� �׸� �׸���");
	}
	//������
}
class �ﰢ�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ�� �׸���");
	}
	
}
class �� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�� �׸���");
	}

	@Override
	public void color() {
		System.out.println("���������� �׸���");
	}
	
}
class �簢�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢�� �׸���");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� g=new �ﰢ��();
		g.color();
		g.draw();
		
		g=new �簢��();
		g.color();
		g.draw();
		
		g=new ��();
		g.color();
		g.draw();

	}

}
