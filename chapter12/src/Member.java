

public class Member implements Comparable<Member> {
	
	private int memberId;			//ȸ�����̵�
	private String memberName;		//ȸ�� �̸�
	
	public Member(int memberId, String memberName) {	//������
		
		this.memberId = memberId;
		this.memberName = memberName;
				
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberID(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {		//toString �޼ҵ� �����ε�
		return memberName + " ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId){
				return true;
			}
			else {
				return false;	}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;						//	hashset.MemberHashSetTest �ߺ�ȫ�浿 ����//
	}

	
/*	@Override			//MemberId �������� ����
	public int compareTo(Member member) {		// ��ü�� Ư�� �÷��� ���Ĺ�� ����
		//return (this.memberId - member.memberId);  // �������� ����϶�
		 return (this.memberId - member.memberId ) * (-1); // ��������(�����ϋ�)*/
		 
	
		 @Override			//MemberName �������� ����
			public int compareTo(Member member) {		// String Ŭ������ compare
				return (this.memberName.compareTo(member.memberName));  
			 	// �������� (ASC)
				// return (this.memberName.compareTo(member.memberName)*(-1)); 
				 // ��������(DESC)	
				 }
				 
				 
	
}


