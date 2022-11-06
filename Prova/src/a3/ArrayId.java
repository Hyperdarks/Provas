package a3;

public class ArrayId extends Atributos{
	Atributos at = new Atributos();
	String armazenaInfo;
	int[] arrayId = new int[10];
	public String getArmazenaInfo() {
		return armazenaInfo;
	}
	public void setArmazenaInfo(String armazenaInfo) {
		this.armazenaInfo = armazenaInfo;
	}
	public int[] getArrayId() {
		return arrayId;
	}
	public void setArrayId(int i, int value) {
		arrayId[i] = value;
	}
	
	
	
	
	
}
