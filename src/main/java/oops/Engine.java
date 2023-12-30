package oops;

public class Engine {
	
	Piston piston;
	Shaft shaft;
	SparkPlug plug;
	FuelInlet inlet;
	int cc;
	
	public void crush() {
		piston.crush();
	}

}
