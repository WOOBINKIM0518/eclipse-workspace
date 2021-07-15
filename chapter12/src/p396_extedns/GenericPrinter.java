package p396_extedns;

public class GenericPrinter <T extends Material> {
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
