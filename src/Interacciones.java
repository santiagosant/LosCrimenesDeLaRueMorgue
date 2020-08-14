public class Interacciones {

	// Para futuras referencia todo lo que implique interacciones del jugador va en
	// esta clase
	// la misma no es "acciones" para la segunda parte del juego esto se tiene que
	// mejorar

	// Metodo esperar para hacer tiempo entre prints
	public static void esperar(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// iniciar juego va en esta seccion para usar de referencia a futuro
	
	public void iniciarJuegos() {
		System.out.println(
				"  _____ _            __  __               _                 _         _   _            ____               __  __                            ");
		System.out.println(
				" |_   _| |__   ___  |  \\/  |_   _ _ __ __| | ___ _ __ ___  (_)_ __   | |_| |__   ___  |  _ \\ _   _  ___  |  \\/  | ___  _ __ __ _ _   _  ___ ");
		System.out.println(
				"   | | | '_ \\ / _ \\ | |\\/| | | | | '__/ _` |/ _ \\ '__/ __| | | '_ \\  | __| '_ \\ / _ \\ | |_) | | | |/ _ \\ | |\\/| |/ _ \\| '__/ _` | | | |/ _ \\ ");
		System.out.println(
				"   | | | | | |  __/ | |  | | |_| | | | (_| |  __/ |  \\__ \\ | | | | | | |_| | | |  __/ |  _ <| |_| |  __/ | |  | | (_) | | | (_| | |_| |  __/ ");
		System.out.println(
				"   |_| |_| |_|\\___| |_|  |_|\\__,_|_|  \\__,_|\\___|_|  |___/ |_|_| |_|  \\__|_| |_|\\___| |_| \\_\\\\__,_|\\___| |_|  |_|\\___/|_|  \\__, |\\__,_|\\___| ");
		System.out.println(
				"                                                                                                                           |___/             ");
		System.out.println("Asi el analista halla su placer en esa actividad del espiritu consistente en DESENREDAR");
		esperar(5);
		System.out.println("\nEscriba -start- para iniciar\r\n" + 
		"-S- para seguir leyendo\r\n" + 
		"las palabras con - - dan mas informacion y sirven para interactuar con la historia" +
		"-salir- termina el programa");
	}

}
