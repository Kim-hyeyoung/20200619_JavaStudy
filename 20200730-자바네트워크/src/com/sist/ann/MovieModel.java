package com.sist.ann;

public class MovieModel {
	@RequestMapping("list") //������(�ε���)�ֱ� => �� �޼ҵ� �̸��̶� ���ƾ� �ϴ� �� �ƴϰ� �ڱⰡ �˾ƺ� �� �ִ� �ɷ�
	public void list()
	{
		System.out.println("��� ���");
	}
	@RequestMapping("insert")
	public void insert()
	{
		System.out.println("������ �߰�");
	}
	@RequestMapping("update")
	public void update()
	{
		System.out.println("������ ����");
	}
	@RequestMapping("delete")
	public void delete()
	{
		System.out.println("������ ����");
	}
	@RequestMapping("find")
	public void find()
	{
		System.out.println("������ ã��");
	}

}
