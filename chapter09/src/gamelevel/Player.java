package gamelevel;

public class Player {
	private PlayerLevel level; // PlayerLevel<�ڷ���>. level<�ν��Ͻ���>
							//lever �ν��Ͻ� ������ ��ü�� ��� ��� ����ȯ(��ĳ����)
	
	
	public Player() {  // Player �⺻ ������, 
		
	level = new BeginnerLevel();		//PlayerLevel �ڷ������� ��ĳ����
	level.showLevelMessage();			//PlayerLevel Level = new BeginnerLevel();
}
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {		//��ü�� ��ǲ������ �ް� ����ȯ (��ĳ����)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {	// 
		level.go(count);
	}
}
