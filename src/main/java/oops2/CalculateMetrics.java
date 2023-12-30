package oops2;

public class CalculateMetrics {

	public void compute(InterfaceArea anyShapeThatImplementsArea) {
		anyShapeThatImplementsArea.area();
	}

	public void compute(InterfacePerimeter anyShapeThatImplementsPerimeter) {
		anyShapeThatImplementsPerimeter.perimeter();
	}

}
