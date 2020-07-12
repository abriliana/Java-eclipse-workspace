package libro.cap02.colecciones;

public class TestPila {

	public static void main(String[] args) {
		MiPila<Integer> c = new MiPila<Integer>();
		c.apilar(1);
		c.apilar(2);
		c.apilar(3);
		System.out.println(c.desapilar());//saca el 3
		System.out.println(c.desapilar());//saca el 2
	}
	//LIFO last In First Out

}
