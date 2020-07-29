package com.sist.temp;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis)); //파일을 메모리에 저장 후 한줄씩 읽어오기
			//InputStreamReader => 1byte를 2byte로 변환 => 글자가 깨지지 않는다 / 네트워크,메모리,파일
			while(true)
			{
				String data=br.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
			fis.close();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
