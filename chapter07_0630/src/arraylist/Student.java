package arraylist;

import java.util.ArrayList;


public class Student {

		int studentID;
		String studentName;
		ArrayList<Subject> subjectList; // ArrayList 선언 ( 해당 과목의 이름과 점수를 담는 객체형 배열 선언)
										//자료형 만들어놓음
		public Student(int studentID, String StudentName) {
			this.studentID =studentID;
			this.studentName = studentName;
			
			subjectList = new ArrayList<Subject>();  // 생성자 호출할 때 ArrayList도 생성 해주어야함
		}
		
		public void addSubject(String name, int score) {
			Subject subject = new Subject();
			subject.setName(name);
			subject.setScorePoint(score);
			subjectList.add(subject);
		}
		
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : subjectList) {
				total +=s.getScorePoint();
				System.out.println("학생 " + studentName+ "의 "+s.getName()+"과목 성적은 "+s.getScorePoint()+"입니다.");
			}
			System.out.println("학생 "+ studentName + " 의 총점은"+ total+"입니다.");
		}
	} 

