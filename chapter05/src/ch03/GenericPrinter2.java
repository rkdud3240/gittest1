package ch03;

public class GenericPrinter2<T extends Material> {
	
	private T material;
	//alt shift s
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		
		return material.toString();
	}
}
