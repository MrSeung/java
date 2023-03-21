package day15;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer : 문자열을 추가하거나, 변경할때 주로 사용하는 객체
		// append : 문자열 추가
		// insert : 특정 위치에 문자열 추가
		
		StringBuffer sb=new StringBuffer();  //멀티스레드 환경에서 안전성이 우수
		sb.append("hello");
		sb.append(" ");
		sb.append("java");
		System.out.println(sb.toString());
		String result=sb.toString();
		System.out.println(result);
		
		StringBuilder sb1=new StringBuilder();  //StringBuffer보다 성능이 좋음.
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("js");
		System.out.println(sb1.toString());
		
		
	}

}
