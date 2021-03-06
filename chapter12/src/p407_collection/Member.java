package p407_collection;

public class Member implements Comparable<Member> {
	
	private int memberId;			//회원아이디
	private String memberName;		//회원 이름
	
	public Member(int memberId, String memberName) {	//생성자
		
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
	public String toString() {		//toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
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
		return memberId;						//	hashset.MemberHashSetTest 중복홍길동 제거//
	}

	
/*	@Override			//MemberId 기준으로 정렬
	public int compareTo(Member member) {		// 객체의 특정 컬럼을 정렬방식 정의
		//return (this.memberId - member.memberId);  // 오름차순 양수일때
		 return (this.memberId - member.memberId ) * (-1); // 내림차순(음수일떄)*/
		 
	
		 @Override			//MemberName 기준으로 정렬
			public int compareTo(Member member) {		// String 클래스에 compare
				return (this.memberName.compareTo(member.memberName));  
			 	// 오름차순 (ASC)
				// return (this.memberName.compareTo(member.memberName)*(-1)); 
				 // 내림차순(DESC)	
				 }
				 
				 
	
}


