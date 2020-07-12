package libro.cap02.colecciones;

public class TestCola { //este es First In First Out

	public static void main(String[] args) {
		MiCola<Integer> c = new MiCola<Integer>();
		c.encolar(1);
		c.encolar(2);
		c.encolar(3);
		
		System.out.println(c.desencolar()); //saca el 1
		System.out.println(c.desencolar()); //saca el 2
	}
	//FIFO
}
