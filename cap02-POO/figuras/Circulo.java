package libro.cap02.figuras;

public class Circulo extends FiguraGeometrica 
{
	private int radio;
	//constructor
	public Circulo (int r)
	{
		super("Circulo");
		radio = r;
		
	}
	 public double area()
	 {
		 //retorno pi por radio al cuadrado
		 return Math.PI*Math.pow(radio, 2);
	 }
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}

	 
}
