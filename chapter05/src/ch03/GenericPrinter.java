package ch03;
                          //T -> �ӽð�
public class GenericPrinter<T> {
	
	//���׸� ���α׷� ���� ���
	
	//T��� ��ü ���ڸ� ����Ѵ�. E -> element , K - key, V - value
	//�ڷ��� �Ű����� (type parameter)
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString �������̵�
	@Override
	public String toString() {
		return material.toString();
	}
}
