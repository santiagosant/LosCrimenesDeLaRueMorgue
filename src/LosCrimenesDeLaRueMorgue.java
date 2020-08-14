import java.util.Scanner;

public class LosCrimenesDeLaRueMorgue {

	public static void main(String[] args) {

		Interacciones i = new Interacciones();
		Historia h = new Historia();
		HistoriaTexto ht = new HistoriaTexto();
		Scanner scan = new Scanner(System.in);
		
		

//	2da version voy a usar un switch para mantener una serie de comandos
//		
		ht.historia();
		i.iniciarJuegos();
		boolean seguirJugando = true;
		while (seguirJugando) {
			String imput = scan.nextLine();
//comprobar si Hay espacios y dividir array
			String[] partes = new String[10];
			
			if (imput.contains(" ")) {
				partes = imput.split(" ");
			}else {
				partes[0] = imput; 
				//evitar el nullPointException
				partes[1] = "dsfsdgfsg"; 
			}
			
			switch (partes[0]) {
			
			//iniciar
			case "start":
				h.Start(imput);
				//para iniciar parrafo 1 e imprimir el parrafo
				System.out.println(ht.getParrafoN(ht.devuelveElNumeroDeParrafo()));
				break;
				
			//pasar al proximo parrafo
			case "s":
				if (h.getStart()) {
					//imprimir parrafo
					System.out.println(ht.getParrafoN(ht.devuelveElNumeroDeParrafo()));
				}else {
					System.out.println("Para iniciar escriba -start-");
				}
				break;
				
			case "salir":
				seguirJugando = false;
				break;
			
	//casos de archivos de declaraciones
			case "declaracion":
// Switch en el swicth				
				switch (partes[1]) {
				
				case "Pauline":
					System.out.println(ht.getDeclaracion(0));
					h.Pauline = true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Pierre":
					System.out.println(ht.getDeclaracion(1));
					h.Pierre =true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Isidore":
					System.out.println(ht.getDeclaracion(2));
					h.Isidore = true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Henri":
					System.out.println(ht.getDeclaracion(3));
					h.Henri=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Odenheimer":
					System.out.println(ht.getDeclaracion(4));
					h.Odenheimer=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Jules":
					System.out.println(ht.getDeclaracion(5));
					h.Jules=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Adolphe":
					System.out.println(ht.getDeclaracion(6));
					h.Adolphe=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "William":
					System.out.println(ht.getDeclaracion(7));
					h.William=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Alfonso":
					System.out.println(ht.getDeclaracion(8));
					h.Alfonso=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Alberto":
					System.out.println(ht.getDeclaracion(9));
					h.Alberto=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Paul":
					System.out.println(ht.getDeclaracion(10));
					h.Paul=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "Alexandre":
					System.out.println(ht.getDeclaracion(11));
					h.Alexandre=true;
					System.out.print(h.declaracionesLeidas());
					break;
				case "prueba":
					h.Pauline = true;
					h.Pierre =true;
					h.Isidore = true;
					h.Henri=true;
					h.Odenheimer=true;
					h.Jules=true;
					h.Adolphe=true;
					h.William=true;
					h.Alfonso=true;
					h.Alberto=true;
					h.Paul=true;
					h.Alexandre=true;
					System.out.println(ht.getDeclaracion(12));
					//System.out.print(h.declaracionesLeidas());
					break;

				default:
					System.out.println("¿la declaracion de quien?");
				}
				break;
			
			case "examinaba":
				System.out.println("\tLa parte trasera del edificio no era extraordinario, ademas de ventanas tenia un pararrayos, nada resaltaba\n");
				break;
				
			case "peculiar":
				System.out.println("\tAlgo había en su manera de acentuar la palabra, que me hizo estremecer sin que\r\n" + 
						"pudiera decir por qué.\r\n" + 
						"\t—No, nada peculiar —dije—. Por lo menos, nada que no hayamos encontrado ya\r\n" + 
						"referido en el diario.\n");
				break;
				
			case "voces":
				System.out.println("\tHice notar que, mientras todos los testigos coincidían en que la voz más ruda debía ser\r\n" + 
						"la de un francés, existían grandes desacuerdos sobre la voz más aguda o —como la calificó\r\n" + 
						"uno de ellos— la voz áspera.\n");
				break;
				
			case "vocablo":
				
				switch (partes[1]) {
					
					case "articulado":
						System.out.println("\tAl oír estas palabras pasó por mi mente una vaga e informe concepción de lo que\r\n" + 
								"quería significar Dupin. Me pareció estar a punto de entender, pero sin llegar a la\r\n" + 
								"comprensión, así como a veces nos hallamos a punto de recordar algo que finalmente no se\r\n" + 
								"concreta. Pero mi amigo seguía hablando.\n");
						break;
				}
				
			case "impresión":
				System.out.println("\tAl escuchar las preguntas de Dupin sentí que un estremecimiento recorría mi cuerpo.\r\n" + 
						"\t—Un maníaco es el autor del crimen —dije—. Un loco furioso escapado de alguna\r\n" + 
						"maison de santé de la vecindad.\r\n"
						+ "\t—En cierto sentido —dijo Dupin—, su idea no es inaplicable. Pero, aun en sus más\r\n" + 
						"salvajes paroxismos, las voces de los locos jamás coinciden con esa extraña voz escuchada\r\n" + 
						"en lo alto. Los locos pertenecen a alguna nación, y, por más incoherentes que sean sus\r\n" + 
						"palabras, tienen, sin embargo, la coherencia del silabeo. Además, el cabello de un loco no\r\n" + 
						"es como el que ahora tengo en la mano. Arranqué este pequeño -mechon- de entre los dedos\r\n" + 
						"rígidamente apretados de madame L’Espanaye. ¿Puede decirme qué piensa de ellos?\n");
				break;
				
			case "mechon":
				System.out.println("\t—¡Dupin... este cabello es absolutamente extraordinario...! ¡No es cabello humano!\r\n" + 
						"—grité, trastornado por completo.\n");
				break;
				
			default:
				System.out.println("Escriba un comando valido");
			}

		}
		
		scan.close();

		
	}

}
