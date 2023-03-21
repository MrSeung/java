package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 숭행할 수 있도록 해주는 반복자.
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨.
		 * 재사용 불가 -> 다른 연산을 하려면 스트림을 다시 생성해야됨.
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 최종연상 : sum(), forEach(), reduce(계산)
		 * 
		 * */
		Stream<Integer> integerStream1=Stream.of(1,2,3,4,5,6,7,8);
		
		int[] arr= {1,2,3,4,5};
		long cnt=Arrays.stream(arr).count();
		System.out.println(cnt);
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		OptionalDouble avg=Arrays.stream(arr).average();
		System.out.println(avg);
		
		int[] a= {5,7,9,2,4,5,5,4};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>4) {
				sum1+=a[i];
			}
		}
		System.out.println(sum1);
		
		int sum2=Arrays.stream(a).filter(b->b>4).sum();
		System.out.println(sum2);
		
		Stream<Integer> integerStream2=Stream.of(1,2,3,4,5,6,7,8);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(88);
		list.add(78);
		list.add(58);
		list.add(48);
		
		list.add(28);
		
		int listsum = list.stream().filter(b->b>=70).mapToInt(n->n.intValue()).sum();
		System.out.println("list 합계 : ");
		Stream<Integer> s=list.stream();
		
	}

}
