import java.util.Scanner;

public class Historia {

	// todo lo que sea imprimir en la pantalla de la historia original va ir aca
	// mas que nada para organizar mas comodamente todo el texto

	Scanner scan = new Scanner(System.in);
	Interacciones i = new Interacciones();
	HistoriaTexto ht = new HistoriaTexto();

	private boolean start = false;

	// gets de los booleans

	public boolean getStart() {
		return this.start;
	}

	// Iniciar

	public void Start(String imput) {
		if (imput.equalsIgnoreCase("start")) {
			this.start = true;
		}

	}

	// Listado de las declaraciones leidas
	public boolean Pauline = false;
	public boolean Pierre = false;
	public boolean Isidore = false;
	public boolean Henri = false;
	public 	boolean Odenheimer = false;
	public boolean Jules = false;
	public boolean Adolphe = false;
	public boolean William = false;
	public boolean Alfonso = false;
	public boolean Alberto = false;
	public boolean Paul = false;
	public boolean Alexandre = false;

	//cambia el boolean a true si lee la declaracion y si son todos true da el aviso 

	public String declaracionesLeidas() {
		
		String leidosTodos="";

		if (Pauline == true && Pierre == true && Isidore == true && Henri == true && Odenheimer == true && Jules == true
				&& Adolphe == true && William == true && Alfonso == true && Alberto == true && Paul == true
				&& Alexandre == true) {

			leidosTodos = "\t»No se ha obtenido ningún otro dato de importancia, a pesar de haberse interrogado a\r\n" + 
					"varias otras personas. Jamás se ha cometido en París un asesinato tan misterioso y tan\r\n" + 
					"enigmático en sus detalles... si es que en realidad se trata de un asesinato. La policía está\r\n" + 
					"perpleja, lo cual no es frecuente en asuntos de esta naturaleza. Pero resulta imposible hallar\r\n" + 
					"la más pequeña clave del misterio.»\n";

		}
		return leidosTodos;
	}

}