package com.sist.ann;

public class MovieModel {
	@RequestMapping("list") //구분자(인덱스)주기 => 꼭 메소드 이름이랑 같아야 하는 건 아니고 자기가 알아볼 수 있는 걸로
	public void list()
	{
		System.out.println("목록 출력");
	}
	@RequestMapping("insert")
	public void insert()
	{
		System.out.println("데이터 추가");
	}
	@RequestMapping("update")
	public void update()
	{
		System.out.println("데이터 수정");
	}
	@RequestMapping("delete")
	public void delete()
	{
		System.out.println("데이터 삭제");
	}
	@RequestMapping("find")
	public void find()
	{
		System.out.println("데이터 찾기");
	}

}
