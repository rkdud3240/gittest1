package ch03;
                          //T -> 임시값
public class GenericPrinter<T> {
	
	//제네릭 프로그램 설계 방식
	
	//T라는 대체 문자를 사용한다. E -> element , K - key, V - value
	//자료형 매개변수 (type parameter)
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString 오버라이드
	@Override
	public String toString() {
		return material.toString();
	}
}
