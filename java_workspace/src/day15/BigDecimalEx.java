package day15;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BigDecimal : java에서 숫자를 정밀하게 저장/표현하기 위한 클래스
		// 돈, 소수점 정밀한 계산이 필요한 경우는 필수
		// 단점, 느린속도

		// 값을 초기화 하기 위해서는 문자열로 값을 넘겨줘야 함.
		BigDecimal db = new BigDecimal("1000.1234");
		BigDecimal db2 = new BigDecimal("100");
		
		System.out.println(db);
		//== 객체의 주소가 같은지 비교, 값이 같은지 비교를 위해서는 equals를 사용해야됨.
		System.out.println(db==db2);
		System.out.println(db.equals(db2));	
		//compareTo: 값을 비교시 같으면 0, 작으면 -1, 크면 1
		
		//+(add), -(subtract), *(multiply), /(divide), %(remainder)
		System.out.println(db.add(db2));
		System.out.println(db.subtract(db2));
		System.out.println(db.multiply(db2));
		System.out.println(db.divide(db2));
		System.out.println(db.remainder(db2));
		
		//max min
		System.out.println("max : "+db.max(db2));
		System.out.println("min : "+db.min(db2));
		
		//BigInteger
		BigInteger bi=BigInteger.valueOf(10000);
		System.out.println(bi);
		
		int int_bi = bi.intValue(); // Integer -> int 형변환
		long long_bi = bi.longValue(); // Integer -> long 형변환
		String string_bi=bi.toString(); // Integer -> String 형변환
	}

}
