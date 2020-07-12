package libro.cap01;

public class DemoCaracteres3 {

	public static void main(String[] args) {
		
		char c;
		for( int i='A'; i<='Z'; i++)
		{
			//para asignar un int en un char se debe "castear"
			c = (char) i;
			System.out.println(c);
			//el resultado serán las letras de la A a la Z
		}

	}

}
