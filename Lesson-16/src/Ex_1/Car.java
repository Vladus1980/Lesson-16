package Ex_1;

public class Car {
	public String modelCar;
	public int year;
	private double engine;
	private String color;
	
	
	public Car(String modelCar, int year, double engine, String color) {
		super();
		this.modelCar = modelCar;
		this.year = year;
		this.engine = engine;
		this.color = color;
	}
	
	
	public Car(String modelCar, int year) {
		super();
		this.modelCar = modelCar;
		this.year = year;
	}


	public Car() {};
	
	public void speed(String driver) {
		System.out.println("Водій цієї машини "+driver);
	}
	
	public void oilType(int oilType) {
		System.out.println("Олива для машини має бути WD"+oilType);
		
	}
	
	public String getModelCar() {
		return modelCar;
	}
	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(engine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((modelCar == null) ? 0 : modelCar.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(engine) != Double.doubleToLongBits(other.engine))
			return false;
		if (modelCar == null) {
			if (other.modelCar != null)
				return false;
		} else if (!modelCar.equals(other.modelCar))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [modelCar=" + modelCar + ", year=" + year + ", engine=" + engine + ", color=" + color + "]";
	} 

}
