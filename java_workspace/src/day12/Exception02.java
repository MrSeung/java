package day12;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[]arr=ranArray(0,1,10);
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
		catch(Exception e) {
			//String str=e.getMessage();	
			e.printStackTrace();
		}	
	}

	public static int[] ranArray(int max,int min, int n) throws Exception {
		if(n<=0)
			throw new Exception("배열의 크기가 0보다 작습니다.");
		if(max<=0)
			throw new Exception("랜덤 값의 범위가 잘못됐습니다.");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
		}
		return arr;
	}
	
	
}
