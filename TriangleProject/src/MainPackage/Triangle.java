package MainPackage;


public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
		
	}

	public double getSide1(){
		return this.side1;
	}

	public double getSide2(){
		return this.side2;
	}
	
	public double getSide3(){
		return this.side3;
	}

	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
	
	public double getArea(){
		double p = (this.side1 + this.side2 + this.side3) /2;
		return Math.pow(p*(p-this.side1)*(p-this.side2)*(p-this.side3), 1/2);
	}
	
	@Override
	public String toString(){
		Double Side1 = side1;
		String Sside1 = Side1.toString();
		Double Side2 = side2;
		String Sside2 = Side2.toString();
		Double Side3 = side3;
		String Sside3 = Side3.toString();
		return "Side 1: " + Sside1 + ", Side 2: " + Sside2 + ", Side 3: " + Sside3;
	}
}
