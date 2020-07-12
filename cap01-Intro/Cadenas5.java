package libro.cap01;

public class Cadenas5 {

	public static void main(String[] args) {
		String s = "Un buen libro de java, un buen material";
		
		int pos1 = s.indexOf("buen");
		int pos2 = s.lastIndexOf("buen");
		
		System.out.println(pos1);
		System.out.println(pos2);
	}

}
