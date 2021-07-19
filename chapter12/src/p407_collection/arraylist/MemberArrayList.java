package p407_collection.arraylist;

import java.util.ArrayList; // improt
import java.util.Iterator;

import p407_collection.Member;	 // collection.Member



public class MemberArrayList {
	private ArrayList<Member> arrayList;	//ArrayList ����

	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();		// ����� ������ ArrayList ����
	}
	
	public void addMember(Member member) {		//  ArrayList�� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {		//��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		/*for(int i = 0; i < arrayList.size(); i++) {		// �ش� ���̵� ���� ����� ArrayList���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {				// ������̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);				//�ش� ����� ����
				return true;						// true ��ȯ 
			}
		}*/
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {						// 0��° �濡 ���� �����ϸ� True , �������� ������ False
			Member member = ir.next();				//hasNext���� ���� �������
			int tempId = member.getMemberId();		//������̵� �Ű������� ��ġ�ϸ�
			if(tempId == memberId) {				//�ش� ����� ����
				arrayList.remove(member);			//true��ȯ
				return true;
			}
		}
		
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");		//for �� ������ ���� return�� �ȵȰ��
		return false;
	}
	public void showAllMember() {				//��ü ȸ���� ����ϴ� �޼���
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
