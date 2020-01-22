
/**
 * @author Juan Antonio Guillo Lopez
 * @version 22/01/2020
 */
public class EntradaBlogJAGL {
 
	/**
	 * Campos de clase
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	/**
	 * Constructor de la calse
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogJAGL(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
		
	}
	
	
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
	/**
	 * Metodo Getter
	 * @return su id
	 */
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * Metodo Getter
	 * @return texto
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	
	/**
	 * Metodo Getter
	 * @return autor
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * Metodo en deshuso
	 * @return autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	/**
	 * Metodo main
	 * @param args 
	 */
	public static void main(String[] args) {
		EntradaBlogJAGL e1=new EntradaBlogJAGL (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}