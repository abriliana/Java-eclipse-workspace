package libro.cap02.colecciones;

public class MiColeccion <T>
{
	private Object datos[] = null;
	private int len = 0;
	
	//en el constructor se especifica la capacidad inicial
	public MiColeccion (int capacidadInical)
	{
		datos = new Object [capacidadInical];
	}

	//retorna el i-esimo elemento de la coleccion
	public T obtener(int i)
	{
		return (T)datos[i];
	}
	
	//indica cuantos elementos tiene la coleccion
	public int cantidad()
	{
		return len;
	}
	
	//inserta
	public void insertar(T elm, int i)
	{
		if (len ==datos.length)
		{
			Object aux[] = datos;
			datos = new Object [datos.length*2];
			for(int j = 0; j<len; j++)
			{
				datos[j] = aux[j];
			}
			aux = null;
		}
		for (int j = len-1; j>=i; j--)
		{
			datos[j+1] = datos [j];
		}
		datos [i] = elm;
		len++;
	}
	
	public int buscar (T elm)
	{
		int i = 0;
		
		for (;i<len && !datos[i].equals(elm); i++);
		//si no me pasé, encontré. sino no encontré
		return i<len ? i : -1;
	}
	@SuppressWarnings ("unchecked")
	public void agregar(T elm)
	{
		insertar(elm,len);
	}
	
	public T eliminar (int i)
	{
		Object aux = datos[i];
		for (int j = i; j<len-1; j++)
		{
			datos [j] = datos [j+1];
		}
	len--;
	return (T)aux;
	}
	
	
	
	
	
	
	
	
	
	
	
}
