package com.sist.string;
//StringBuffer : 문자열 결합 => append() 
import java.io.*; //=> CheckException => 예외처리 꼭 하고 사용!
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//파일 읽기
			//String data="";
			StringBuffer data=new StringBuffer(); //속도가 훨씬 빠름!! => 최적화
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) //-1 EOF(End Of File)
			{
				data.append(String.valueOf((char)i));
			}
			fr.close();
			
			System.out.println(data.toString());
		}catch(Exception ex) {}
	}

}
