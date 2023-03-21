package studentmanager;

import java.util.ArrayList;

public class Student {
		/* 학생클래스 : 한 학생의 정보를 나타내는 클래스 
			- 학번, 이름, 주민번호, 학부, 학과, 수강과목s(과목클래스를 배열생성)
			- 수강과목의 번지를 대신할 count 
			- 메서드 
			  - 수강과목 추가(배열이 다 찼다면 늘려주기)
			  - 수강과목 삭제
			- 생성자, getter/setter, 출력메서드(print) - 2가지 형태로
		 * */
		
		//멤버변수는 초기값이 자동으로 세팅됨.
		//지역변수는 초기값이 필요함.
		private String stdNum;
		private String stdName;
		private String registerNum;
		private String faculty;
		private String major;
		private ArrayList<Subject> subjectList=new ArrayList<>() ; //subject 클래스를 배열로 선언.
		private int subCount;
		
		//생성자
		public Student() {}
		//전체 요소를 받는 생성자
		public Student(String stdNum, String stdName, String registerNum, String faculty, String major) {
			this.stdNum = stdNum;
			this.stdName = stdName;
			this.registerNum = registerNum;
			this.faculty = faculty;
			this.major = major;
		}
		
		//메서드
		//print method : 학생정보만 출력
		public void stdPrint() {
			System.out.println("학생명(학번):"+stdName+"("+stdNum+")");
			System.out.println("학부(학과):"+faculty+"("+major+")");
		}
		
		//수강과목을 출력하는 메서드
		public void subPrint() {
			//수강과목이 없을 때
			boolean flag=true;
			//수강과목이 있을 때 : 수강과목은 여러개 있을 수 있음.
			for(Subject s: subjectList) {
				System.out.println(s); //toString을 이용한 출력
				//print메서드로 직접 sysout을 했을 경우
				//subjectList[i].print();  //subject 클래스에 print메서드가 있을 경우 호출
				flag=false;
			}
			if(flag) {
				System.out.println("수강중인 과목이 없습니다.");
			}
		}
		
		//수강과목 추가
		/* 매개변수 : Subject subName
		 * 리턴타입 : void
		 * */
		public void insertSubject(Subject subName) {
			//배열이 다 찼다면 늘려주기
			
			//subName 추가
			subjectList.add(subName);
		}
		
		//수강과목 삭제
		/* 매개변수 : String subName
		 * 리턴타입 : void
		 * */
		public void deleteSubject(String subName) {
			boolean flag =true ; //찾는 과목의 위치를 나타내는 변수
			int cnt=-1;
			// 만약 매개변수의 값이 null이라면 return(메서드 빠져나감)
			if(subName == null) {
				return;
			}
			//subName이 subjectList에 있는지 검색
			for(Subject s:subjectList) {
				cnt++;
				if(s.getSubName().equals(subName)) {
					//있다면 번지를 index에 저장 
					flag=false ;
					break;
				}
			}
			
			//찾는 과목이 없다면... return
			if(flag) {
				System.out.println("존재하지않는 과목입니다.");
				return;
			}
			
			subjectList.remove(cnt);
		}
		
		
		//getter/setter
		public String getStdNum() {
			return stdNum;
		}
		public void setStdNum(String stdNum) {
			this.stdNum = stdNum;
		}
		public String getStdName() {
			return stdName;
		}
		public void setStdName(String stdName) {
			this.stdName = stdName;
		}
		public String getRegisterNum() {
			return registerNum;
		}
		public void setRegisterNum(String registerNum) {
			this.registerNum = registerNum;
		}
		public String getFaculty() {
			return faculty;
		}
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public int getSubCount() {
			return subCount;
		}
		
		
		
	}


