package p396_extedns;

public class GenericPrinter <T extends Material> {		//타입체크를 강하게 해서 컴파일단계에서의 오류 찾아냄
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	

	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

	public Water getMaterial() {
		return null;
	}

}
