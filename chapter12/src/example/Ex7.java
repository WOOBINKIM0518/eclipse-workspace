package example;

import java.util.HashMap;
import java.util.Scanner;

class Student{//�л��� ǥ���ϴ� Ŭ����
		int id;
		String tel;
		public Student(int id, String tel) {
			this.id = id; this.tel = tel;
		}
	}
	public class Ex7 {
		public static void main(String[] args) {
			
			// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ����
			HashMap<String, Student> map = new HashMap<String , Student>();
			
			//3���� �л� ����
			map.put("Ȳ����", new Student(1,"010-111-1111"));
			map.put("���繮", new Student(2,"010-2222-2222"));
			map.put("�賲��", new Student(3,"010-333-3333"));
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("�˻��� �̸�?");
				String name = sc.nextLine(); // ����ڷκ��� �̸� �Է�
				if(name.equals("exit"))
					break; // while���� ��� ���α׷� ����
				Student student = map.get(name);
				if(student == null)
					System.out.println(name + " ��/�� ���� ����Դϴ�.");
				else
					System.out.println("id : " + student.id+ "    /   ��ȭ : "+student.tel);
			}
			sc.close();
		}
	}
