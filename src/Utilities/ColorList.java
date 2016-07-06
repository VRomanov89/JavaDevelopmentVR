package Utilities;

public enum ColorList {
	Red(10), Green(13), Blue(43), Purple(56);
	private int colorWeight;
	ColorList(int weight) {
		colorWeight = weight;
	}
	public int getWeight() {
		return colorWeight;
	}
}
