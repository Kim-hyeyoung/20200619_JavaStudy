/*
 * indexOf(동일문자가 있을경우 앞에 것), lastIndexOf(동일문자가 있을경우 뒤의 것) => 문자의 위치 찾기
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="fsfsfsfs.fsfsfsfsfsfsfsfsfdf.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자:"+msg.substring(msg.indexOf(".")+1));
		

	}

}
