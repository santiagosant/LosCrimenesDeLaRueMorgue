import java.util.ArrayList;
import java.util.List;

public class HistoriaTexto {

	// Aca va ir el texto de la historia osea el copiar pegar del cuento

	private List<String> parrafo = new ArrayList<String>();
	private List<String> declaracion = new ArrayList<String>();
	private int nParrafo = 0;

// para que no se pase del ultimo parrafo
	public String getParrafoN(int numero) {
		String texto;
		if (numero < this.parrafo.size()) {
			this.nParrafo++;
			texto = this.parrafo.get(numero);
		} else {
			texto = "FIN";
		}
		return texto;
	}

	public int devuelveElNumeroDeParrafo() {
		return nParrafo;
	}

	public String getDeclaracion(int numero) {
		String declaracion = this.declaracion.get(numero);
		return declaracion;
	}

	public void historia() {
		this.parrafo
				.add("\tMientras resid�a en Par�s, durante la primavera y parte del verano de 18..., me relacion�\r\n"
						+ "con un cierto C. Auguste Dupin. Este joven caballero proced�a de una familia excelente �y\r\n"
						+ "hasta ilustre�, pero una serie de desdichadas circunstancias lo hab�an reducido a tal\r\n"
						+ "pobreza que la energ�a de su car�cter sucumbi� ante la desgracia, llev�ndolo a alejarse del\r\n"
						+ "mundo y a no preocuparse por recuperar su fortuna. Gracias a la cortes�a de sus acreedores\r\n"
						+ "le qued� una peque�a parte del patrimonio, y la renta que le produc�a bastaba, mediante una\r\n"
						+ "rigurosa econom�a, para subvenir a sus necesidades, sin preocuparse de lo superfluo. Los\r\n"
						+ "libros constitu�an su solo lujo, y en Par�s es f�cil procur�rselos.\n");
		this.parrafo.add("\tNuestro primer encuentro tuvo lugar en una oscura librer�a de la rue Montmartre, donde\r\n"
				+ "la casualidad de que ambos anduvi�ramos en busca de un mismo libro �tan raro como\r\n"
				+ "notable� sirvi� para aproximarnos. Volvimos a encontrarnos una y otra vez. Me sent�\r\n"
				+ "profundamente interesado por la menuda historia de familia que Dupin me contaba\r\n"
				+ "detalladamente, con todo ese candor a que se abandona un franc�s cuando se trata de su\r\n"
				+ "propia persona. Me qued� asombrado, al mismo tiempo, por la extraordinaria amplitud de\r\n"
				+ "su cultura; pero, sobre todo, sent� encenderse mi alma ante el exaltado fervor y la v�vida\r\n"
				+ "frescura de su imaginaci�n. Dado lo que yo buscaba en ese entonces en Par�s, sent� que la\r\n"
				+ "compa��a de un hombre semejante me resultar�a un tesoro inestimable, y no vacil� en\r\n"
				+ "dec�rselo. Qued� por fin decidido que vivir�amos juntos durante mi permanencia en la\r\n"
				+ "ciudad, y, como mi situaci�n financiera era algo menos comprometida que la suya, logr�\r\n"
				+ "que quedara a mi cargo alquilar y amueblar �en un estilo que armonizaba con la\r\n"
				+ "melancol�a un tanto fant�stica de nuestro car�cter� una decr�pita y grotesca mansi�n\r\n"
				+ "abandonada a causa de supersticiones sobre las cuales no inquirimos, y que se acercaba a su\r\n"
				+ "ruina en una parte aislada y solitaria del Faubourg Saint-Germain.\n");
		this.parrafo.add("\tSi nuestra manera de vivir en esa casa hubiera llegado al conocimiento del mundo, �ste\r\n"
				+ "nos hubiera considerado como locos �aunque probablemente como locos inofensivos�.\r\n"
				+ "Nuestro aislamiento era perfecto. No admit�amos visitantes. El lugar de nuestro retiro era\r\n"
				+ "un secreto celosamente guardado para mis antiguos amigos; en cuanto a Dupin, hac�a\r\n"
				+ "muchos a�os que hab�a dejado de ver gentes o de ser conocido en Par�s. S�lo viv�amos para\r\n"
				+ "nosotros.\n");
		this.parrafo.add("\tUna rareza de mi amigo (�qu� otro nombre darle?) consist�a en amar la noche por la\r\n"
				+ "noche misma; a esta bizarrerie, como a todas las otras, me abandon� a mi vez sin esfuerzo,\r\n"
				+ "entreg�ndome a sus extra�os caprichos con perfecto abandono. La negra divinidad no pod�a\r\n"
				+ "permanecer siempre con nosotros, pero nos era dado imitarla. A las primeras luces del alba,\r\n"
				+ "cerr�bamos las pesadas persianas de nuestra vieja casa y encend�amos un par de buj�as que,\r\n"
				+ "fuertemente perfumadas, s�lo lanzaban d�biles y mortecinos rayos. Con ayuda de ellas\r\n"
				+ "ocup�bamos nuestros esp�ritus en so�ar, leyendo, escribiendo o conversando, hasta que el\r\n"
				+ "reloj nos advert�a la llegada de la verdadera oscuridad. Sal�amos entonces a la calle\r\n"
				+ "tomados del brazo, continuando la conversaci�n del d�a o vagando al azar hasta muy tarde,\r\n"
				+ "mientras busc�bamos entre las luces y las sombras de la populosa ciudad esa infinidad de\r\n"
				+ "excitantes espirituales que puede proporcionar la observaci�n silenciosa.\n");
		this.parrafo.add("\tEn esas oportunidades, no dejaba yo de reparar y admirar (aunque dada su profunda\r\n"
				+ "idealidad cab�a esperarlo) una peculiar aptitud anal�tica de Dupin. Parec�a complacerse\r\n"
				+ "especialmente en ejercitarla �ya que no en exhibirla� y no vacilaba en confesar el placer\r\n"
				+ "que le produc�a. Se jactaba, con una risita discreta, de que frente a �l la mayor�a de los\r\n"
				+ "hombres ten�an como una ventana por la cual pod�a verse su coraz�n y estaba pronto a\r\n"
				+ "demostrar sus afirmaciones con pruebas tan directas como sorprendentes del �ntimo\r\n"
				+ "conocimiento que de m� ten�a. En aquellos momentos su actitud era fr�a y abstra�da; sus\r\n"
				+ "ojos miraban como sin ver, mientras su voz, habitualmente de un rico registro de tenor,\r\n"
				+ "sub�a a un falsete que hubiera parecido petulante de no mediar lo deliberado y lo preciso de\r\n"
				+ "sus palabras. Al observarlo en esos casos, me ocurr�a muchas veces pensar en la antigua\r\n"
				+ "filosof�a del alma doble, y me divert�a con la idea de un doble Dupin: el creador y el\r\n"
				+ "analista.\n");
		this.parrafo.add("\tErr�bamos una noche por una larga y sucia calle, en la vecindad del Palais Royal.\r\n"
				+ "Sumergidos en nuestras meditaciones, no hab�amos pronunciado una sola s�laba durante un\r\n"
				+ "cuarto de hora por lo menos. Bruscamente, Dupin pronunci� estas palabras:\r\n"
				+ "\t�S�, es un hombrecillo muy peque�o, y estar�a mejor en el Th��tre des Vari�t�s.\r\n"
				+ "\t�No cabe duda �repuse inconscientemente, sin advertir (pues tan absorto hab�a\r\n"
				+ "estado en mis reflexiones) la extraordinaria forma en que Dupin coincid�a con mis\r\n"
				+ "pensamientos. Pero, un instante despu�s, me di cuenta y me sent� profundamente\r\n"
				+ "asombrado.\r\n"
				+ "\t�Dupin �dije gravemente�, esto va m�s all� de mi comprensi�n. Le confieso sin\r\n"
				+ "rodeos que estoy at�nito y que apenas puedo dar cr�dito a mis sentidos. �C�mo es posible\r\n"
				+ "que haya sabido que yo estaba pensando en...?\r\n"
				+ "Aqu� me detuve, para asegurarme sin lugar a dudas de si realmente sab�a en qui�n\r\n"
				+ "estaba yo pensando.\r\n"
				+ "\t�En Chantilly �dijo Dupin�. �Por qu� se interrumpe? Estaba usted dici�ndose que\r\n"
				+ "su peque�a estatura le veda los papeles tr�gicos.\r\n"
				+ "Tal era, exactamente, el tema de mis reflexiones. Chantilly era un ex remend�n de la\r\n"
				+ "rue Saint-Denis que, apasionado por el teatro, hab�a encarnado el papel de Jerjes en la\r\n"
				+ "tragedia hom�nima de Cr�billon, logrando tan s�lo que la gente se burlara de �l.\r\n"
				+ "\t�En nombre del cielo �exclam�, d�game cu�l es el m�todo... si es que hay un\r\n"
				+ "m�todo... que le ha permitido leer en lo m�s profundo de m�.\r\n"
				+ "En realidad, me sent�a a�n m�s asombrado de lo que estaba dispuesto a reconocer.\r\n"
				+ "\t�El frutero �replic� mi amigo� fue quien lo llev� a la conclusi�n de que el\r\n"
				+ "remend�n de suelas no ten�a estatura suficiente para Jerjes et id genus omne.\r\n"
				+ "\t��El frutero! �Me asombra usted! No conozco ning�n frutero.\r\n"
				+ "\t�El hombre que tropez� con usted cuando entr�bamos en esta calle... har� un cuarto\r\n"
				+ "de hora.\n");
		this.parrafo.add("\tRecord� entonces que un frutero, que llevaba sobre la cabeza una gran cesta de\r\n"
				+ "manzanas, hab�a estado a punto de derribarme accidentalmente cuando pas�bamos de la rue\r\n"
				+ "C... a la que recorr�amos ahora. Pero me era imposible comprender qu� ten�a eso que ver\r\n"
				+ "con Chantilly.\r\n"
				+ "\t�Se lo explicar� �me dijo Dupin, en quien no hab�a la menor part�cula de\r\n"
				+ "charlatanerie� y, para que pueda comprender claramente, remontaremos primero el curso\r\n"
				+ "de sus reflexiones desde el momento en que le habl� hasta el de su choque con el frutero en\r\n"
				+ "cuesti�n. Los eslabones principales de la cadena son los siguientes: Chantilly, Ori�n, el\r\n"
				+ "doctor Nichols, Epicuro, la estereotom�a, el pavimento, el frutero.\n");
		this.parrafo.add("\tPocas personas hay que, en alg�n momento de su vida, no se hayan entretenido en\r\n"
				+ "remontar el curso de las ideas mediante las cuales han llegado a alguna conclusi�n. Con\r\n"
				+ "frecuencia, esta tarea est� llena de inter�s, y aquel que la emprende se queda asombrado por\r\n"
				+ "la distancia aparentemente ilimitada e inconexa entre el punto de partida y el de llegada.\r\n"
				+ "\t�Cu�l habr� sido entonces mi asombro al o�r las palabras que acababa de pronunciar\r\n"
				+ "Dupin y reconocer que correspond�an a la verdad!\r\n"
				+ "\t�Si no me equivoco �continu� �l�, hab�amos estado hablando de caballos\r\n"
				+ "justamente al abandonar la rue C... �ste fue nuestro �ltimo tema de conversaci�n. Cuando\r\n"
				+ "cruz�bamos hacia esta calle, un frutero que tra�a una gran canasta en la cabeza pas�\r\n"
				+ "r�pidamente a nuestro lado y le empal� a usted contra una pila de adoquines\r\n"
				+ "correspondiente a un pedazo de la calle en reparaci�n. Usted pis� una de las piedras sueltas,\r\n"
				+ "resbal�, torci�ndose ligeramente el tobillo; mostr� enojo o malhumor, murmur� algunas\r\n"
				+ "palabras, se volvi� para mirar la pila de adoquines y sigui� andando en silencio. Yo no\r\n"
				+ "estaba especialmente atento a sus actos, pero en los �ltimos tiempos la observaci�n se ha\r\n"
				+ "convertido para m� en una necesidad.\n");
		this.parrafo.add("\t�Mantuvo usted los ojos clavados en el suelo, observando con aire quisquilloso los\r\n"
				+ "agujeros y los surcos del pavimento (por lo cual comprend� que segu�a pensando en las\r\n"
				+ "piedras), hasta que llegamos al peque�o pasaje llamado Lamartine, que con fines\r\n"
				+ "experimentales ha sido pavimentado con bloques ensamblados y remachados. Aqu� su\r\n"
				+ "rostro se anim� y, al notar que sus labios se mov�an, no tuve dudas de que murmuraba la\r\n"
				+ "palabra �estereotom�a�, t�rmino que se ha aplicado pretenciosamente a esta clase de\r\n"
				+ "pavimento. Sab�a que para usted ser�a imposible decir �estereotom�a� sin verse llevado a\r\n"
				+ "pensar en �tomos y pasar de ah� a las teor�as de Epicuro; ahora bien, cuando discutimos no\r\n"
				+ "hace mucho este tema, recuerdo haberle hecho notar de qu� curiosa manera �por lo dem�s\r\n"
				+ "desconocida� las vagas conjeturas de aquel noble griego se han visto confirmadas en la\r\n"
				+ "reciente cosmogon�a de las nebulosas; comprend�, por tanto, que usted no dejar�a de alzar\r\n"
				+ "los ojos hacia la gran nebulosa de Ori�n, y estaba seguro de que lo har�a. Efectivamente,\r\n"
				+ "mir� usted hacia lo alto y me sent� seguro de haber seguido correctamente sus pasos hasta\r\n"
				+ "ese momento. Pero en la amarga cr�tica a Chantilly que apareci� en el Mus�e de ayer, el\r\n"
				+ "escritor sat�rico hace algunas penosas alusiones al cambio de nombre del remend�n antes\r\n"
				+ "de calzar los coturnos, y cita un verso latino sobre el cual hemos hablado muchas veces. Me\r\n"
				+ "refiero al verso:\r\n" + "\t\tPerdidit antiquum litera prima sonum.\r\n"
				+ "\t�Le dije a usted que se refer�a a Ori�n, que en un tiempo se escribi� Uri�n; y dada\r\n"
				+ "cierta acritud que se mezcl� en aquella discusi�n, estaba seguro de que usted no la hab�a\r\n"
				+ "olvidado. Era claro, pues, que no dejar�a de combinar las dos ideas de Ori�n y Chantilly.\r\n"
				+ "Que as� lo hizo, lo supe por la sonrisa que pas� por sus labios. Pensaba usted en la\r\n"
				+ "inmolaci�n del pobre zapatero. Hasta ese momento hab�a caminado algo encorvado, pero\r\n"
				+ "de pronto le vi erguirse en toda su estatura. Me sent� seguro de que estaba pensando en la\r\n"
				+ "diminuta figura de Chantilly. Y en este punto interrump� sus meditaciones para hacerle\r\n"
				+ "notar que, en efecto, el tal Chantilly era muy peque�o y que estar�a mejor en el Th��tre des\r\n"
				+ "Vari�t�s.\n");
		this.parrafo.add("\tPoco tiempo despu�s de este episodio, le�amos una edici�n nocturna de la Gazette des\r\n"
				+ "Tribunaux cuando los siguientes p�rrafos atrajeron nuestra atenci�n:\n");
		this.parrafo.add("\t�EXTRA�OS ASESINATOS.�Esta ma�ana, hacia las tres, los habitantes del quartier\r\n"
				+ "Saint-Roch fueron arrancados de su sue�o por los espantosos alaridos procedentes del\r\n"
				+ "cuarto piso de una casa situada en la rue Morgue, ocupada por madame L�Espanaye y su\r\n"
				+ "hija, mademoiselle Camille L�Espanaye. Como fuera imposible lograr el acceso a la casa,\r\n"
				+ "despu�s de perder alg�n tiempo, se forz� finalmente la puerta con una ganz�a y ocho o diez\r\n"
				+ "vecinos penetraron en compa��a de dos gendarmes. Por ese entonces los gritos hab�an\r\n"
				+ "cesado, pero cuando el grupo remontaba el primer tramo de la escalera se oyeron dos o m�s\r\n"
				+ "voces que discut�an violentamente y que parec�an proceder de la parte superior de la casa.\r\n"
				+ "Al llegar al segundo piso, las voces callaron a su vez, reinando una profunda calma. Los\r\n"
				+ "vecinos se separaron y empezaron a recorrer las habitaciones una por una. Al llegar a una\r\n"
				+ "gran c�mara situada en la parte posterior del cuarto piso (cuya puerta, cerrada por dentro\r\n"
				+ "con llave, debi� ser forzada), se vieron en presencia de un espect�culo que les produjo tanto\r\n"
				+ "horror como estupefacci�n.\r\n"
				+ "\t�EL aposento se hallaba en el mayor desorden: los muebles, rotos, hab�an sido\r\n"
				+ "lanzados en todas direcciones. El colch�n del �nico lecho aparec�a tirado en mitad del piso.\r\n"
				+ "Sobre una silla hab�a una navaja manchada de sangre. Sobre la chimenea aparec�an dos o\r\n"
				+ "tres largos y espesos mechones de cabello humano igualmente empapados en sangre y que\r\n"
				+ "daban la impresi�n de haber sido arrancados de ra�z. Se encontraron en el piso cuatro\r\n"
				+ "napoleones, un aro de topacio, tres cucharas grandes de plata, tres m�s peque�as de m�tal\r\n"
				+ "d�Alger, y dos sacos que conten�an casi cuatro mil francos en oro. Los cajones de una\r\n"
				+ "c�moda situada en un �ngulo hab�an sido abiertos y aparentemente saqueados, aunque\r\n"
				+ "quedaban en ellos numerosas prendas. Descubri�se una peque�a caja fuerte de hierro\r\n"
				+ "debajo de la cama (y no del colch�n). Estaba abierta y con la llave en la cerradura. No\r\n"
				+ "conten�a nada, aparte de unas viejas cartas y papeles igualmente sin importancia.\r\n"
				+ "\t�No se ve�a huella alguna de madame L�Espanaye, pero al notarse la presencia de una\r\n"
				+ "ins�lita cantidad de holl�n al pie de la chimenea se procedi� a registrarla, encontr�ndose\r\n"
				+ "(�cosa horrible de describir!) el cad�ver de su hija, cabeza abajo, el cual hab�a sido metido a\r\n"
				+ "la fuerza en la estrecha abertura y considerablemente empujado hacia arriba. El cuerpo\r\n"
				+ "estaba a�n caliente. Al examinarlo se advirtieron en �l numerosas excoriaciones,\r\n"
				+ "producidas, sin duda, por la violencia con que fuera introducido y por la que requiri�\r\n"
				+ "arrancarlo de all�. Ve�anse profundos ara�azos en el rostro, y en la garganta aparec�an\r\n"
				+ "contusiones negruzcas y profundas huellas de u�as, como si la v�ctima hubiera sido\r\n"
				+ "estrangulada.\r\n"
				+ "\t�Luego de una cuidadosa b�squeda en cada porci�n de la casa, sin que apareciera nada\r\n"
				+ "nuevo, los vecinos se introdujeron en un peque�o patio pavimentado de la parte posterior\r\n"
				+ "del edificio y encontraron el cad�ver de la anciana se�ora, la cual hab�a sido degollada tan\r\n"
				+ "salvajemente que, al tratar de levantar el cuerpo, la cabeza se desprendi� del tronco.\r\n"
				+ "Horribles mutilaciones aparec�an en la cabeza y en el cuerpo, y este �ltimo apenas\r\n"
				+ "presentaba forma humana.\r\n"
				+ "\t�Hasta el momento no se ha encontrado la menor clave que permita solucionar tan\r\n"
				+ "horrible misterio.�\n");
		this.parrafo.add("\tLa edici�n del d�a siguiente conten�a los siguientes detalles adicionales:");
		this.parrafo.add("\t�La tragedia de la rue Morgue.�Diversas personas han sido interrogadas con relaci�n\r\n"
				+ "a este terrible y extraordinario suceso, pero nada ha trascendido que pueda arrojar alguna\r\n"
				+ "luz sobre �l.\n " + "Para leer las declaracion escriba el nombre del testigo:\n" + "-Pauline-"
				+ "-Pierre-" + "-Isidore-" + "-Henri-" + "-Odenheimer-" + "-Jules-" + "-Adolphe-" + "-William-"
				+ "-Alfonso-" + "-Alberto-" + "-Paul-" + "-Alexandre-" + "--\n");

		this.declaracion.add("\t�Pauline Dubourg, lavandera, manifiesta que conoc�a desde hac�a tres a�os a las dos\r\n"
				+ "v�ctimas, de cuya ropa se ocupaba. La anciana y su hija parec�an hallarse en buenos\r\n"
				+ "t�rminos y se mostraban sumamente cari�osas entre s�. Pagaban muy bien. No sab�a nada\r\n"
				+ "sobre su modo de vida y sus medios de subsistencia. Cre�a que madame L. dec�a la\r\n"
				+ "buenaventura. Pasaba por tener dinero guardado. Nunca encontr� a otras personas en la\r\n"
				+ "casa cuando iba a buscar la ropa o la devolv�a. Estaba segura de que no ten�an ning�n\r\n"
				+ "criado o criada. Opinaba que en la casa no hab�a ning�n mueble, salvo en el cuarto piso.\n");
		this.declaracion.add("\t�Pierre Moreau, vendedor de tabaco, declara que desde hace cuatro a�os vend�a\r\n"
				+ "regularmente peque�as cantidades de tabaco y de rap� a madame L�Espanaye. Naci� en la\r\n"
				+ "vecindad y ha residido siempre en ella. La extinta y su hija ocupaban desde hac�a m�s de\r\n"
				+ "seis a�os la casa donde se encontraron los cad�veres. Anteriormente viv�a en ella un joyero,\r\n"
				+ "que alquilaba las habitaciones superiores a diversas personas. La casa era de propiedad de\r\n"
				+ "madame L., quien se sinti� disgustada por los abusos que comet�a su inquilino y ocup�\r\n"
				+ "personalmente la casa, neg�ndose a alquilar parte alguna. La anciana se�ora daba se�ales\r\n"
				+ "de senilidad. El testigo vio a su hija unas cinco o seis veces durante esos seis a�os. Ambas\r\n"
				+ "llevaban una vida muy retirada y pasaban por tener dinero. Hab�a o�do decir a los vecinos\r\n"
				+ "que madame L. dec�a la buenaventura, pero no lo cre�a. Nunca vio entrar a nadie, salvo a la\r\n"
				+ "anciana y su hija, a un mozo de servicio que estuvo all� una o dos veces, y a un m�dico que\r\n"
				+ "hizo ocho o diez visitas.\r\n"
				+ "\t�Muchos otros vecinos han proporcionado testimonios coincidentes. No se ha hablado\r\n"
				+ "de nadie que frecuentara la casa. Se ignora si madame L. y su hija ten�an parientes vivos.\r\n"
				+ "Pocas veces se abr�an las persianas de las ventanas delanteras. Las de la parte posterior\r\n"
				+ "estaban siempre cerradas, salvo las de la gran habitaci�n en la parte trasera del cuarto piso.\r\n"
				+ "La casa se hallaba en excelente estado y no era muy antigua.\n");
		this.declaracion
				.add("\t�Isidore Muset, gendarme, declara que fue llamado hacia las tres de la ma�ana y que, al\r\n"
						+ "llegar a la casa, encontr� a unas veinte o treinta personas reunidas que se esforzaban por\r\n"
						+ "entrar. Violent� finalmente la entrada (con una bayoneta y no con una ganz�a). No le cost�\r\n"
						+ "mucho abrirla, pues se trataba de una puerta de dos batientes que no ten�a pasadores ni\r\n"
						+ "arriba ni abajo. Los alaridos continuaron hasta que se abri� la puerta, cesando luego de\r\n"
						+ "golpe. Parec�an gritos de persona (o personas) que sufrieran los m�s agudos dolores; eran\r\n"
						+ "gritos agudos y prolongados, no breves y precipitados. El testigo trep� el primero las\r\n"
						+ "escaleras. Al llegar al primer descanso oy� dos voces que discut�an con fuerza y\r\n"
						+ "agriamente; una de ellas era ruda y la otra mucho m�s aguda y muy extra�a. Pudo entender\r\n"
						+ "algunas palabras provenientes de la primera voz, que correspond�a a un franc�s. Estaba\r\n"
						+ "seguro de que no se trataba de una voz de mujer. Pudo distinguir las palabras sacr� y\r\n"
						+ "diable. La voz m�s aguda era de un extranjero. No podr�a asegurar si se trataba de un\r\n"
						+ "hombre o una mujer. No entendi� lo que dec�a, pero ten�a la impresi�n de que hablaba en\r\n"
						+ "espa�ol. El estado de la habitaci�n y de los cad�veres fue descrito por el testigo en la\r\n"
						+ "misma forma que lo hicimos ayer.\n");
		this.declaracion
				.add("\t�Henri Duval, vecino, de profesi�n platero, declara que formaba parte del primer grupo\r\n"
						+ "que entr� en la casa. Corrobora en general la declaraci�n de Muset. Tan pronto forzaron la\r\n"
						+ "puerta, volvieron a cerrarla para mantener alejada a la muchedumbre, que, pese a lo\r\n"
						+ "avanzado de la hora, se estaba reuniendo r�pidamente. El testigo piensa que la voz m�s\r\n"
						+ "aguda pertenec�a a un italiano. Est� seguro de que no se trataba de un franc�s. No puede\r\n"
						+ "asegurar que se tratara de una voz masculina. Pudo ser la de una mujer. No est�\r\n"
						+ "familiarizado con la lengua italiana. No alcanz� a distinguir las palabras, pero por la\r\n"
						+ "entonaci�n est� convencido de que quien hablaba era italiano. Conoc�a a madame L. y a su\r\n"
						+ "hija. Hab�a conversado frecuentemente con ellas. Estaba seguro de que la voz aguda no\r\n"
						+ "pertenec�a a ninguna de las difuntas.\n");
		this.declaracion.add("\t�Odenheimer, restaurateur. Este testigo se ofreci� voluntariamente a declarar. Como\r\n"
				+ "no habla franc�s, testimoni� mediante un int�rprete. Es originario de Amsterdam. Pasaba\r\n"
				+ "frente a la casa cuando se oyeron los gritos. Duraron varios minutos, probablemente diez.\r\n"
				+ "Eran prolongados y agudos, tan horribles como penosos de o�r. El testigo fue uno de los\r\n"
				+ "que entraron en el edificio. Corrobor� las declaraciones anteriores en todos sus detalles,\r\n"
				+ "salvo uno. Estaba seguro de que la voz m�s aguda pertenec�a a un hombre y que se trataba\r\n"
				+ "de un franc�s. No pudo distinguir las palabras pronunciadas. Eran fuertes y precipitadas,\r\n"
				+ "desiguales y pronunciadas aparentemente con tanto miedo como c�lera. La voz era �spera;\r\n"
				+ "no tanto aguda como �spera. El testigo no la calificar�a de aguda. La voz m�s gruesa dijo\r\n"
				+ "varias veces: sacr�, diable, y una vez Mon Dieu!\n");
		this.declaracion.add("\t�Jules Mignaud, banquero, de la firma Mignaud e hijos, en la calle Deloraine. Es el\r\n"
				+ "mayor de los Mignaud. Madame L�Espanaye pose�a algunos bienes. Hab�a abierto una\r\n"
				+ "cuenta en su banco durante la primavera del a�o 18... (ocho a�os antes). Hac�a frecuentes\r\n"
				+ "dep�sitos de peque�as sumas. No hab�a retirado nada hasta tres d�as antes de su muerte, en\r\n"
				+ "que personalmente extrajo la suma de 4.000 francos. La suma le fue pagada en oro y un\r\n"
				+ "empleado la llev� a su domicilio.\n");
		this.declaracion.add("\t�Adolphe Lebon, empleado de Mignaud e hijos, declara que el d�a en cuesti�n\r\n"
				+ "acompa�� hasta su residencia a madame L�Espanaye, llevando los 4.000 francos en dos\r\n"
				+ "sacos. Una vez abierta la puerta, mademoiselle L. vino a tomar uno de los sacos, mientras la\r\n"
				+ "anciana se�ora se encargaba del otro. Por su parte, el testigo salud� y se retir�. No vio a\r\n"
				+ "persona alguna en la calle en ese momento. Se trata de una calle poco importante, muy\r\n"
				+ "solitaria.\n");
		this.declaracion
				.add("\t�William Bird, sastre, declara que formaba parte del grupo que entr� en la casa. Es de\r\n"
						+ "nacionalidad inglesa. Lleva dos a�os de residencia en Par�s. Fue uno de los primeros en\r\n"
						+ "subir las escaleras. Oy� voces que disputaban. La m�s ruda era la de un franc�s. Pudo\r\n"
						+ "distinguir varias palabras, pero ya no las recuerda todas. Oy� claramente: sacr� y mon\r\n"
						+ "Dieu. En ese momento se o�a un ruido como si varias personas estuvieran luchando, era un\r\n"
						+ "sonido de forcejeo, como si algo fuese arrastrado. La voz aguda era muy fuerte, mucho m�s\r\n"
						+ "que la voz ruda. Est� seguro de que no se trataba de la voz de un ingl�s. Parec�a la de un\r\n"
						+ "alem�n. Pod�a ser una voz de mujer. El testigo no comprende el alem�n.\r\n"
						+ "\t�Cuatro de los testigos nombrados m�s arriba fueron nuevamente interrogados,\r\n"
						+ "declarando que la puerta del aposento donde se encontr� el cad�ver de mademoiselle L.\r\n"
						+ "estaba cerrada por dentro cuando llegaron hasta ella. Reinaba un profundo silencio; no se\r\n"
						+ "escuchaban quejidos ni rumores de ninguna especie. No se vio a nadie en el momento de\r\n"
						+ "forzar la puerta. Las ventanas, tanto de la habitaci�n del frente como de la trasera, estaban\r\n"
						+ "cerradas y firmemente aseguradas por dentro. Entre ambas habitaciones hab�a una puerta\r\n"
						+ "cerrada, pero la llave no estaba echada. La puerta que comunicaba la habitaci�n del frente\r\n"
						+ "con el corredor hab�a sido cerrada con llave por dentro. Un cuarto peque�o situado en el\r\n"
						+ "frente del cuarto piso, al comienzo del corredor, apareci� abierto, con la puerta entornada.\r\n"
						+ "La habitaci�n estaba llena de camas viejas, cajones y objetos por el estilo. Se procedi� a\r\n"
						+ "revisarlos uno por uno, no se dej� sin examinar una sola pulgada de la casa. Se enviaron\r\n"
						+ "deshollinadores para que exploraran las chimeneas. La casa tiene cuatro pisos, con\r\n"
						+ "mansardes. Una trampa que da al techo estaba firmemente asegurada con clavos y no\r\n"
						+ "parece haber sido abierta durante a�os. Los testigos no est�n de acuerdo sobre el tiempo\r\n"
						+ "transcurrido entre el momento en que escucharon las voces que disputaban y la apertura de\r\n"
						+ "la puerta de la habitaci�n. Algunos sostienen que transcurrieron tres minutos; otros calculan\r\n"
						+ "cinco. Cost� mucho violentar la puerta.\n");
		this.declaracion.add("\t�Alfonso Garcio, empresario de pompas f�nebres, habita en la rue Morgue. Es de\r\n"
				+ "nacionalidad espa�ola. Formaba parte del grupo que entr� en la casa. No subi� las\r\n"
				+ "escaleras. Tiene los nervios delicados y teme las consecuencias de toda agitaci�n. Oy� las\r\n"
				+ "voces que disputaban. La m�s ruda pertenec�a a un franc�s. No pudo comprender lo que\r\n"
				+ "dec�a. La voz aguda era la de un ingl�s; est� seguro de esto. No comprende el ingl�s, pero\r\n"
				+ "juzga bas�ndose en la entonaci�n.\n");
		this.declaracion
				.add("\t�Alberto Montani, confitero, declara que fue de los primeros en subir las escaleras. Oy�\r\n"
						+ "las voces en cuesti�n. la voz ruda era la de un franc�s. Pudo distinguir varias palabras. El\r\n"
						+ "que hablaba parec�a reprochar alguna cosa. No pudo comprender las palabras dichas por la\r\n"
						+ "voz m�s aguda, que hablaba r�pida y desigualmente. Piensa que se trata de un ruso.\r\n"
						+ "Corrobora los testimonios restantes. Es de nacionalidad italiana. Nunca habl� con un nativo\r\n"
						+ "de Rusia.\r\n"
						+ "\t�Nuevamente interrogados, varios testigos certificaron que las chimeneas de todas las\r\n"
						+ "habitaciones eran demasiado angostas para admitir el paso de un ser humano. Se pasaron\r\n"
						+ "�deshollinadores� �cepillos cil�ndricos como los que usan los que limpian chimeneas�\r\n"
						+ "por todos los tubos existentes en la casa. No existe ning�n pasaje en los fondos por el cual\r\n"
						+ "alguien hubiera podido descender mientras el grupo sub�a las escaleras. El cuerpo de\r\n"
						+ "mademoiselle L�Espanaye estaba tan firmemente encajado en la chimenea, que no pudo ser\r\n"
						+ "extra�do hasta que cuatro o cinco personas unieron sus esfuerzos.\n");
		this.declaracion.add("\t�Paul Dumas, m�dico, declara que fue llamado al amanecer para examinar los\r\n"
				+ "cad�veres de las v�ctimas. Los mismos hab�an sido colocados sobre el colch�n del lecho\r\n"
				+ "correspondiente a la habitaci�n donde se encontr� a mademoiselle L. El cuerpo de la joven\r\n"
				+ "aparec�a lleno de contusiones y excoriaciones. El hecho de que hubiese sido metido en la\r\n"
				+ "chimenea bastaba para explicar tales marcas. La garganta estaba enormemente excoriada.\r\n"
				+ "Varios profundos ara�azos aparec�an debajo del ment�n, conjuntamente con una serie de\r\n"
				+ "manchas l�vidas resultantes, con toda evidencia, de la presi�n de unos dedos. El rostro\r\n"
				+ "estaba horriblemente p�lido y los ojos se sal�an de las �rbitas. La lengua aparec�a a medias\r\n"
				+ "cortada. En la regi�n del est�mago se descubri� una gran contusi�n, producida,\r\n"
				+ "aparentemente, por la presi�n de una rodilla. Seg�n opini�n del doctor Dumas,\r\n"
				+ "mademoiselle L�Espanaye hab�a sido estrangulada por una o varias personas.\r\n"
				+ "\t�El cuerpo de la madre estaba horriblemente mutilado. Todos los huesos de la pierna y\r\n"
				+ "el brazo derechos se hallaban fracturados en mayor o menor grado. La tibia izquierda hab�a\r\n"
				+ "quedado reducida a astillas, as� como todas las costillas del lado izquierdo. El cuerpo\r\n"
				+ "aparec�a cubierto de contusiones y estaba descolorido. Resultaba imposible precisar el arma\r\n"
				+ "con que se hab�an inferido tales heridas. Un pesado garrote de mano, o una ancha barra de\r\n"
				+ "hierro, quiz� una silla, cualquier arma grande, pesada y contundente, en manos de un\r\n"
				+ "hombre sumamente robusto, pod�a haber producido esos resultados. Imposible que una\r\n"
				+ "mujer pudiera infligir tales heridas con cualquier arma que fuese. La cabeza de la difunta\r\n"
				+ "aparec�a separada del cuerpo y, al igual que el resto, terriblemente contusa. Era evidente\r\n"
				+ "que la garganta hab�a sido seccionada con un instrumento muy afilado, probablemente una\r\n"
				+ "navaja.\n");
		this.declaracion.add("\t�Alexandre Etienne, cirujano, fue llamado al mismo tiempo que el doctor Dumas para\r\n"
				+ "examinar los cuerpos. Confirm� el testimonio y las opiniones de este �ltimo.\n");

		this.parrafo.add("\tLa edici�n vespertina del diario declaraba que en el quartier Saint-Roch reinaba una\r\n"
				+ "intensa excitaci�n, que se hab�a practicado un nuevo y minucioso examen del lugar del\r\n"
				+ "hecho, mientras se interrogaba a nuevos testigos, pero que no se sab�a nada nuevo. Un\r\n"
				+ "p�rrafo final agregaba, sin embargo, que un tal Adolphe Lebon acababa de ser arrestado y\r\n"
				+ "encarcelado, aunque nada parec�a acusarlo, a juzgar por los hechos detallados.\r\n"
				+ "\tDupin se mostraba singularmente interesado en el desarrollo del asunto; o por lo menos\r\n"
				+ "as� me pareci� por sus maneras, pues no hizo el menor comentario. Tan s�lo despu�s de\r\n"
				+ "haberse anunciado el arresto de Lebon me pidi� mi parecer acerca de los asesinatos.\r\n"
				+ "\tNo pude sino sumarme al de todo Par�s y declarar que los consideraba un misterio\r\n"
				+ "insoluble. No ve�a modo alguno de seguir el rastro al asesino.\n");
		this.parrafo.add("\t�No debemos pensar en los modos posibles que surgen de una investigaci�n tan\r\n"
				+ "rudimentaria �dijo Dupin�. La polic�a parisiense, tan alabada por su penetraci�n, es muy\r\n"
				+ "astuta pero nada m�s. No procede con m�todo, salvo el del momento. Toma muchas\r\n"
				+ "disposiciones ostentosas, pero con frecuencia �stas se hallan tan mal adaptadas a su\r\n"
				+ "objetivo que recuerdan a Monsieur Jourdain, que ped�a sa robe de chambre... pour mieux\r\n"
				+ "entendre la musique. Los resultados obtenidos son con frecuencia sorprendentes, pero en su\r\n"
				+ "mayor�a se logran por simple diligencia y actividad. Cuando �stas son insuficientes, todos\r\n"
				+ "sus planes fracasan. Vidocq, por ejemplo, era hombre de excelentes conjeturas y\r\n"
				+ "perseverante. Pero como su pensamiento carec�a de suficiente educaci�n, erraba\r\n"
				+ "continuamente por el excesivo ardor de sus investigaciones. Da�aba su visi�n por mirar el\r\n"
				+ "objeto desde demasiado cerca. Quiz� alcanzaba a ver uno o dos puntos con singular\r\n"
				+ "acuidad, pero procediendo as� perd�a el conjunto de la cuesti�n. En el fondo se trataba de un\r\n"
				+ "exceso de profundidad, y la verdad no siempre est� dentro de un pozo. Por el contrario,\r\n"
				+ "creo que, en lo que se refiere al conocimiento m�s importante, es invariablemente\r\n"
				+ "superficial. La profundidad corresponde a los valles, donde la buscamos, y no a las cimas\r\n"
				+ "monta�osas, donde se la encuentra. Las formas y fuentes de este tipo de error se\r\n"
				+ "ejemplifican muy bien en la contemplaci�n de los cuerpos celestes. Si se observa una\r\n"
				+ "estrella de una ojeada, oblicuamente, volviendo hacia ella la porci�n exterior de la retina\r\n"
				+ "(mucho m�s sensible a las impresiones luminosas d�biles que la parte interior), se ver� la\r\n"
				+ "estrella con claridad y se apreciar� plenamente su brillo, el cual se empa�a apenas la\r\n"
				+ "contemplamos de lleno. Es verdad que en este �ltimo caso llegan a nuestros ojos mayor\r\n"
				+ "cantidad de rayos, pero la porci�n exterior posee una capacidad de recepci�n mucho m�s\r\n"
				+ "refinada. Por causa de una indebida profundidad confundimos y debilitamos el\r\n"
				+ "pensamiento, y Venus misma puede llegar a borrarse del firmamento si la escrutamos de\r\n"
				+ "manera demasiado sostenida, demasiado concentrada o directa.\n");
		this.parrafo.add("\t�En cuanto a esos asesinatos, procedamos personalmente a un examen antes de\r\n"
				+ "formarnos una opini�n. La encuesta nos servir� de entretenimiento (me pareci� que el\r\n"
				+ "t�rmino era extra�o, aplicado al caso, pero no dije nada). Adem�s, Lebon me prest� cierta\r\n"
				+ "vez un servicio por el cual le estoy agradecido. Iremos a estudiar el terreno con nuestros\r\n"
				+ "propios ojos. Conozco a G..., el prefecto de polic�a, y no habr� dificultad en obtener el\r\n"
				+ "permiso necesario.\n");
		this.parrafo.add("La autorizaci�n fue acordada, y nos encaminamos inmediatamente a la rue Morgue. Se\r\n"
				+ "trata de uno de esos m�seros pasajes que corren entre la rue Richelieu y la rue Saint-Roch.\r\n"
				+ "Atardec�a cuando llegamos, pues el barrio estaba considerablemente distanciado del de\r\n"
				+ "nuestra residencia. Encontramos f�cilmente la casa, ya que a�n hab�a varias personas\r\n"
				+ "mirando las persianas cerradas desde la acera opuesta. Era una t�pica casa parisiense, con\r\n"
				+ "una puerta de entrada y una casilla de cristales con ventana corrediza, correspondiente a la\r\n"
				+ "loge du concierge. Antes de entrar recorrimos la calle, doblamos por un pasaje y, volviendo\r\n"
				+ "a doblar, pasamos por la parte trasera del edificio, mientras Dupin -examinaba- la entera\r\n"
				+ "vecindad, as� como la casa, con una atenci�n minuciosa cuyo objeto me resultaba imposible\r\n"
				+ "de adivinar.");
		this.parrafo.add("\tVolviendo sobre nuestros pasos retornamos a la parte delantera y, luego de llamar y\r\n"
				+ "mostrar nuestras credenciales, fuimos admitidos por los agentes de guardia. Subimos las\r\n"
				+ "escaleras, hasta llegar a la habitaci�n donde se hab�a encontrado el cuerpo de mademoiselle\r\n"
				+ "L�Espanaye y donde a�n yac�an ambas v�ctimas. Como es natural, el desorden del aposento\r\n"
				+ "hab�a sido respetado. No vi nada que no estuviese detallado en la Gazette des Tribunaux.\r\n"
				+ "Dupin lo inspeccionaba todo, sin exceptuar los cuerpos de las v�ctimas. Pasamos luego a las\r\n"
				+ "otras habitaciones y al patio; un gendarme nos acompa�aba a todas partes. El examen nos\r\n"
				+ "tuvo ocupados hasta que oscureci�, y era de noche cuando salimos. En el camino de vuelta,\r\n"
				+ "mi amigo se detuvo algunos minutos en las oficinas de uno de los diarios parisienses.\n");
		this.parrafo.add("\tHe dicho ya que sus caprichos eran muchos y variados, y que je les m�nageais (pues no\r\n"
				+ "hay traducci�n posible de la frase). En esta oportunidad Dupin rehus� toda conversaci�n\r\n"
				+ "vinculada con los asesinatos, hasta el d�a siguiente a mediod�a. Entonces, s�bitamente, me\r\n"
				+ "pregunt� si hab�a observado alguna cosa -peculiar- en el escenario de aquellas atrocidades.\n");
		this.parrafo.add("\t�Me temo �repuso Dupin� que la Gazette no haya penetrado en el ins�lito horror de\r\n"
				+ "este asunto. Pero dejemos de lado las vanas opiniones de ese diario. Tengo la impresi�n de\r\n"
				+ "que se considera insoluble este misterio por las mism�simas razones que deber�an inducir a\r\n"
				+ "considerarlo f�cilmente solucionable; me refiero a lo excesivo, a lo outr� de sus\r\n"
				+ "caracter�sticas. La polic�a se muestra confundida por la aparente falta de m�vil, y no por el\r\n"
				+ "asesinato en s�, sino por su atrocidad. Est� asimismo perpleja por la aparente imposibilidad\r\n"
				+ "de conciliar las voces que se oyeron disputando, con el hecho de que en lo alto s�lo se\r\n"
				+ "encontr� a la difunta mademoiselle L�Espanaye, aparte de que era imposible escapar de la\r\n"
				+ "casa sin que el grupo que ascend�a la escalera lo notara. El salvaje desorden del aposento; el\r\n"
				+ "cad�ver metido, cabeza abajo, en la chimenea; la espantosa mutilaci�n del cuerpo de la\r\n"
				+ "anciana, son elementos que, junto con los ya mencionados y otros que no necesito\r\n"
				+ "mencionar, han bastado para paralizar la acci�n de los investigadores policiales y confundir\r\n"
				+ "por completo su tan alabada perspicacia. Han ca�do en el grueso pero com�n error de\r\n"
				+ "confundir lo ins�lito con lo abstruso. Pero, justamente a trav�s de esas desviaciones del\r\n"
				+ "plano ordinario de las cosas, la raz�n se abrir� paso, si ello es posible, en la b�squeda de la\r\n"
				+ "verdad. En investigaciones como la que ahora efectuamos no deber�a preguntarse tanto\r\n"
				+ "�qu� ha ocurrido�, como �qu� hay en lo ocurrido que no se parezca a nada ocurrido\r\n"
				+ "anteriormente�. En una palabra, la facilidad con la cual llegar� o he llegado a la soluci�n de\r\n"
				+ "este misterio se halla en raz�n directa de su aparente insolubilidad a ojos de la polic�a.\n");
		this.parrafo.add("\tMe qued� mirando a mi amigo con silenciosa estupefacci�n.\r\n"
				+ "\t�Estoy esperando ahora �continu� Dupin, mirando hacia la puerta de nuestra\r\n"
				+ "habitaci�n� a alguien que, si bien no es el perpetrador de esas carnicer�as, debe de haberse\r\n"
				+ "visto envuelto de alguna manera en su ejecuci�n. Es probable que sea inocente de la parte\r\n"
				+ "m�s horrible de los cr�menes. Conf�o en que mi suposici�n sea acertada, pues en ella se\r\n"
				+ "apoya toda mi esperanza de descifrar completamente el enigma. Espero la llegada de ese\r\n"
				+ "hombre en cualquier momento... y en esta habitaci�n. Cierto que puede no venir, pero lo\r\n"
				+ "m�s probable es que llegue. Si as� fuera, habr� que retenerlo. He ah� unas pistolas; los dos\r\n"
				+ "sabemos lo que se puede hacer con ellas cuando la ocasi�n se presenta.\n");
		this.parrafo.add("\tTom� las pistolas, sabiendo apenas lo que hac�a y, sin poder creer lo que estaba\r\n" + 
				"oyendo, mientras Dupin, como si monologara, continuaba sus reflexiones. Ya he\r\n" + 
				"mencionado su actitud abstra�da en esos momentos. Sus palabras se dirig�an a m�, pero su\r\n" + 
				"voz, aunque no era forzada, ten�a esa entonaci�n que se emplea habitualmente para dirigirse\r\n" + 
				"a alguien que se halla muy lejos. Sus ojos, privados de expresi�n, s�lo miraban la pared.\n");
		this.parrafo.add("\t�Las voces que disputaban y fueron o�das por el grupo que trepaba la escalera �\r\n" + 
				"dijo� no eran las de las dos mujeres, como ha sido bien probado por los testigos. Con esto\r\n" + 
				"queda eliminada toda posibilidad de que la anciana se�ora haya matado a su hija,\r\n" + 
				"suicid�ndose posteriormente. Menciono esto por razones met�dicas, ya que la fuerza de\r\n" + 
				"madame de L�Espanaye hubiera sido por completo insuficiente para introducir el cuerpo de\r\n" + 
				"su hija en la chimenea, tal como fue encontrado, am�n de que la naturaleza de las heridas\r\n" + 
				"observadas en su cad�ver excluye toda idea de suicidio. El asesinato, pues, fue cometido\r\n" + 
				"por terceros, y a �stos pertenec�an las voces que se escucharon mientras disputaban.\r\n" + 
				"Perm�tame ahora llamarle la atenci�n, no sobre las declaraciones referentes a dichas voces,\r\n" + 
				"sino a algo -peculiar- en esas declaraciones. �No lo advirti� usted?\n");
		this.parrafo.add("\t�Tal es el testimonio en s� �dijo Dupin�, pero no su peculiaridad. Usted no ha\r\n" + 
				"observado nada caracter�stico. Y, sin embargo, hab�a algo que observar. Como bien ha\r\n" + 
				"dicho, los testigos coinciden sobre la voz ruda. Pero, con respecto a la voz aguda, la\r\n" + 
				"peculiaridad no consiste en que est�n en desacuerdo, sino en que un italiano, un ingl�s, un\r\n" + 
				"espa�ol, un holand�s y un franc�s han tratado de describirla, y cada uno de ellos se ha\r\n" + 
				"referido a una voz extranjera. Cada uno de ellos est� seguro de que no se trata de la voz de\r\n" + 
				"un compatriota. Cada uno la vincula, no a la voz de una persona perteneciente a una naci�n\r\n" + 
				"cuyo idioma conoce, sino a la inversa. El franc�s supone que es la voz de un espa�ol, y\r\n" + 
				"agrega que �podr�a haber distinguido algunas palabras s� hubiera sabido espa�ol�. El\r\n" + 
				"holand�s sostiene que se trata de un franc�s, pero nos enteramos de que como no habla\r\n" + 
				"franc�s, testimoni� mediante un int�rprete. El ingl�s piensa que se trata de la voz de un\r\n" + 
				"alem�n, pero el testigo no comprende el alem�n. El espa�ol �est� seguro� de que se trata de\r\n" + 
				"un ingl�s, pero �juzga bas�ndose en la entonaci�n�, ya que no comprende el ingl�s. El\r\n" + 
				"italiano cree que es la voz de un ruso, pero nunca habl� con un nativo de Rusia. Un\r\n" + 
				"segundo testigo franc�s difiere del primero y est� seguro de que se trata de la voz de un\r\n" + 
				"italiano. No est� familiarizado con la lengua italiana, pero al igual que el espa�ol, �est�\r\n" + 
				"convencido por la entonaci�n�. Ahora bien: �cuan extra�amente ins�lita tiene que haber\r\n" + 
				"sido esa voz para que pudieran reunirse semejantes testimonios! �Una voz en cuyos tonos\r\n" + 
				"los ciudadanos de las cinco grandes divisiones de Europa no pudieran reconocer nada\r\n" + 
				"familiar! Me dir� usted que pod�a tratarse de la voz de un asi�tico o un africano. Ni unos ni\r\n" + 
				"otros abundan en Par�s, pero, sin negar esa posibilidad, me limitar� a llamarle la atenci�n\r\n" + 
				"sobre tres puntos. Un testigo califica la voz de ��spera, m�s que aguda�. Otros dos se�alan\r\n" + 
				"que era �precipitada y desigual�. Ninguno de los testigos se refiri� a palabras reconocibles,\r\n" + 
				"a sonidos que parecieran palabras.\n");
		this.parrafo.add("\t�No s� �continu� Dupin� la impresi�n que pudo haber causado hasta ahora en su\r\n" + 
				"entendimiento, pero no vacilo en decir que cabe extraer deducciones leg�timas de esta parte\r\n" + 
				"del testimonio �la que se refiere a las voces ruda y aguda�, suficientes para crear una\r\n" + 
				"sospecha que debe de orientar todos los pasos futuros de la investigaci�n del misterio. Digo\r\n" + 
				"�deducciones leg�timas�, sin expresar plenamente lo que pienso. Quiero dar a entender que\r\n" + 
				"las deducciones son las �nicas que corresponden, y que la sospecha surge inevitablemente\r\n" + 
				"como resultado de las mismas. No le dir� todav�a cu�l es esta sospecha. Pero tenga presente\r\n" + 
				"que, por lo que a m� se refiere, bast� para dar forma definida y tendencia determinada a mis\r\n" + 
				"investigaciones en el lugar del hecho.\n");
		this.parrafo.add("\t�Transport�monos ahora con la fantas�a a esa habitaci�n. �Qu� buscaremos en primer\r\n" + 
				"lugar? Los medios de evasi�n empleados por los asesinos. Supongo que bien puedo decir\r\n" + 
				"que ninguno de los dos cree en acontecimientos sobrenaturales. Madame y mademoiselle\r\n" + 
				"L�Espanaye no fueron asesinadas por esp�ritus. Los autores del hecho eran de carne y\r\n" + 
				"hueso, y escaparon por medios materiales. �C�mo, pues? Afortunadamente, s�lo hay una\r\n" + 
				"manera de razonar sobre este punto, y esa manera debe conducirnos a una conclusi�n\r\n" + 
				"definida. Examinemos uno por uno los posibles medios de escape. Resulta evidente que los\r\n" + 
				"asesinos se hallaban en el cuarto donde se encontr� a mademoiselle L�Espanaye, o por lo\r\n" + 
				"menos en la pieza contigua, en momentos en que el grupo sub�a las escaleras. Vale decir\r\n" + 
				"que debemos buscar las salidas en esos dos aposentos. La polic�a ha levantado los pisos, los\r\n" + 
				"techos y la mamposter�a de las paredes en todas direcciones. Ninguna salida secreta pudo\r\n" + 
				"escapar a sus observaciones. Pero como no me f�o de sus ojos, mir� el lugar con los m�os.\r\n" + 
				"Efectivamente, no hab�a salidas secretas. Las dos puertas que comunican las habitaciones\r\n" + 
				"con el corredor estaban bien cerradas, con las llaves por dentro. Veamos ahora las\r\n" + 
				"chimeneas. Aunque de di�metro ordinario en los primeros ocho o diez pies por encima de\r\n" + 
				"los hogares, los tubos no permitir�an m�s arriba el paso del cuerpo de un gato grande.\r\n" + 
				"Quedando as� establecida la total imposibilidad de escape por las v�as mencionadas nos\r\n" + 
				"vemos reducidos a las ventanas. Nadie podr�a haber huido por la del cuarto delantero, ya\r\n" + 
				"que la muchedumbre reunida lo hubiese visto. Los asesinos tienen que haber pasado, pues,\r\n" + 
				"por las de la pieza trasera. Llevados a esta conclusi�n de manera tan inequ�voca, no nos\r\n" + 
				"corresponde, en nuestra calidad de razonadores, rechazarla por su aparente imposibilidad.\r\n" + 
				"Lo �nico que cabe hacer es probar que esas aparentes �imposibilidades� no son tales en\r\n" + 
				"realidad.\n");
		this.parrafo.add("\t�Hay dos ventanas en el aposento. Contra una de ellas no hay ning�n mueble que la\r\n" + 
				"obstruya, y es claramente visible. La porci�n inferior de la otra queda oculta por la cabecera\r\n" + 
				"del pesado lecho, que ha sido arrimado a ella. La primera ventana apareci� firmemente\r\n" + 
				"asegurada desde dentro. Resisti� los m�s violentos esfuerzos de quienes trataron de\r\n" + 
				"levantarla. En el marco, a la izquierda, hab�a una gran perforaci�n de barreno, y en ella un\r\n" + 
				"solid�simo clavo hundido casi hasta la cabeza. Al examinar la otra ventana se vio que hab�a\r\n" + 
				"un clavo colocado en forma similar; todos los esfuerzos por levantarla fueron igualmente\r\n" + 
				"in�tiles. La polic�a, pues, se sinti� plenamente segura de que la huida no se hab�a producido\r\n" + 
				"por ese lado. Y, por tanto, consider� superfluo extraer los clavos y abrir las ventanas.\n");
		this.parrafo.add("\t�Mi examen fue algo m�s detallado, y eso por la raz�n que acabo de darle: all� era el\r\n" + 
				"caso de probar que todas las aparentes imposibilidades no eran tales en realidad.\r\n" + 
				"\t�Segu� razonando en la siguiente forma... a posteriori. Los asesinos escaparon desde\r\n" + 
				"una de esas ventanas. Por tanto, no pudieron asegurar nuevamente los marcos desde el\r\n" + 
				"interior, tal como fueron encontrados (consideraci�n que, dado lo obvio de su car�cter,\r\n" + 
				"interrumpi� la b�squeda de la polic�a en ese terreno). Los marcos estaban asegurados. Es\r\n" + 
				"necesario, pues, que tengan una manera de asegurarse por s� mismos. La conclusi�n no\r\n" + 
				"admit�a escapatoria. Me acerqu� a la ventana que ten�a libre acceso, extraje con alguna\r\n" + 
				"dificultad el clavo y trat� de levantar el marco. Tal como lo hab�a anticipado, resisti� a\r\n" + 
				"todos mis esfuerzos. Comprend� entonces que deb�a de haber alg�n resorte oculto, y la\r\n" + 
				"corroboraci�n de esta idea me convenci� de que por lo menos mis premisas eran correctas,\r\n" + 
				"aunque el detalle referente a los clavos continuara siendo misterioso. Un examen detallado\r\n" + 
				"no tard� en revelarme el resorte secreto. Lo oprim� y, satisfecho de mi descubrimiento, me\r\n" + 
				"abstuve de levantar el marco.\n");
		this.parrafo.add("\t�Volv� a poner el clavo en su sitio y lo observ� atentamente. Una persona que escapa\r\n" + 
				"por la ventana pod�a haberla cerrado nuevamente, y el resorte habr�a asegurado el marco.\r\n" + 
				"Pero, �c�mo reponer el clavo? La conclusi�n era evidente y estrechaba una vez m�s el\r\n" + 
				"campo de mis investigaciones. Los asesinos ten�an que haber escapado por la otra ventana.\r\n" + 
				"Suponiendo, pues, que los resortes fueran id�nticos en las dos ventanas, como parec�a\r\n" + 
				"probable, necesariamente ten�a que haber una diferencia entre los clavos, o por lo menos en\r\n" + 
				"su manera de estar colocados. Trepando al armaz�n de la cama, mir� minuciosamente el\r\n" + 
				"marco de sost�n de la segunda ventana. Pas� la mano por la parte posterior, descubriendo\r\n" + 
				"en seguida el resorte que, tal como hab�a supuesto, era id�ntico a su vecino. Mir� luego el\r\n" + 
				"clavo. Era tan s�lido como el otro y aparentemente estaba fijo de la misma manera y\r\n" + 
				"hundido casi hasta la cabeza.\n");
		this.parrafo.add("\t�Pensar� usted que me sent� perplejo, pero si as� fuera no ha comprendido la naturaleza\r\n" + 
				"de mis inducciones. Para usar una frase deportiva, hasta entonces no hab�a cometido falta.\r\n" + 
				"No hab�a perdido la pista un solo instante. Los eslabones de la cadena no ten�an ninguna\r\n" + 
				"falla. Hab�a perseguido el secreto hasta su �ltima conclusi�n: y esa conclusi�n era el clavo.\r\n" + 
				"Ya he dicho que ten�a todas las apariencias de su vecino de la otra ventana; pero el hecho,\r\n" + 
				"por m�s concluyente que pareciera, resultaba de una absoluta nulidad comparado con la\r\n" + 
				"consideraci�n de que all�, en ese punto, se acababa el hilo conductor. �Tiene que haber algo\r\n" + 
				"defectuoso en el clavo�, pens�. Al tocarlo, su cabeza qued� entre mis dedos juntamente con\r\n" + 
				"un cuarto de pulgada de la espiga. El resto de la espiga se hallaba dentro del agujero, donde\r\n" + 
				"se hab�a roto. La fractura era muy antigua, pues los bordes aparec�an herrumbrados, y\r\n" + 
				"parec�a haber sido hecho de un martillazo, que hab�a hundido parcialmente la cabeza del\r\n" + 
				"clavo en el marco inferior de la ventana. Volv� a colocar cuidadosamente la parte de la\r\n" + 
				"cabeza en el lugar de donde la hab�a sacado, y vi que el clavo daba la exacta impresi�n de\r\n" + 
				"estar entero; la fisura resultaba invisible. Apretando el resorte, levant� ligeramente el\r\n" + 
				"marco; la cabeza del clavo subi� con �l, sin moverse de su lecho. Cerr� la ventana, y el\r\n" + 
				"clavo dio otra vez la impresi�n de estar dentro.\n");
		this.parrafo.add("\t�Hasta ahora, el enigma quedaba explicado. El asesino hab�a huido por la ventana que\r\n" + 
				"daba a la cabecera del lecho. Cerr�ndose por s� misma (o quiz� ex profeso) la ventana hab�a\r\n" + 
				"quedado asegurada por su resorte. Y la resistencia ofrecida por �ste hab�a inducido a la\r\n" + 
				"polic�a a suponer que se trataba del clavo, dejando as� de lado toda investigaci�n\r\n" + 
				"suplementaria.\n");
		this.parrafo.add("\t�La segunda cuesti�n consiste en el modo del descenso. Mi paseo con usted por la\r\n" + 
				"parte trasera de la casa me satisfizo al respecto. A unos cinco pies y medio de la ventana en\r\n" + 
				"cuesti�n corre una varilla de pararrayos. Desde esa varilla hubiera resultado imposible\r\n" + 
				"alcanzar la ventana, y mucho menos introducirse por ella. Observ�, sin embargo, que las\r\n" + 
				"persianas del cuarto piso pertenecen a esa curiosa especie que los carpinteros parisienses\r\n" + 
				"denominan ferrades; es un tipo rara vez empleado en la actualidad, pero que se ve con\r\n" + 
				"frecuencia en casas muy viejas de Lyon y Bordeaux. Se las fabrica como una puerta\r\n" + 
				"ordinaria (de una sola hoja, y no de doble batiente), con la diferencia de que la parte\r\n" + 
				"inferior tiene celos�as o tablillas que ofrecen excelente asidero para las manos. En este caso\r\n" + 
				"las persianas alcanzan un ancho de tres pies y medio. Cuando las vimos desde la parte\r\n" + 
				"posterior de la casa, ambas estaban entornadas, es decir, en �ngulo recto con relaci�n a la\r\n" + 
				"pared. Es probable que tambi�n los polic�as hayan examinado los fondos del edificio; pero,\r\n" + 
				"si as� lo hicieron, miraron las ferrades en el �ngulo indicado, sin darse cuenta de su gran\r\n" + 
				"anchura; por lo menos no la tomaron en cuenta. Sin duda, seguros de que por esa parte era\r\n" + 
				"imposible toda fuga, se limitaron a un examen muy sumario. Para m�, sin embargo, era\r\n" + 
				"claro que si se abr�a del todo la persiana correspondiente a la ventana situada sobre el lecho,\r\n" + 
				"su borde quedar�a a unos dos pies de la varilla del pararrayos. Tambi�n era evidente que,\r\n" + 
				"desplegando tanta agilidad como coraje, se pod�a llegar hasta la ventana trepando por la\r\n" + 
				"varilla. Estir�ndose hasta una distancia de dos pies y medio (ya que suponemos la persiana\r\n" + 
				"enteramente abierta), un ladr�n habr�a podido sujetarse firmemente de las tablillas de la\r\n" + 
				"celos�a. Abandonando entonces su sost�n en la varilla, afirmando los pies en la pared y\r\n" + 
				"lanz�ndose vigorosamente hacia adelante habr�a podido hacer girar la persiana hasta que se\r\n" + 
				"cerrara; si suponemos que la ventana estaba abierta en este momento, habr�a logrado entrar\r\n" + 
				"as� en la habitaci�n.\n");
		this.parrafo.add("\t�Le pido que tenga especialmente en cuenta que me refiero a un ins�lito grado de\r\n" + 
				"vigor, capaz de llevar a cabo una haza�a tan azarosa y dif�cil. Mi intenci�n consiste en\r\n" + 
				"demostrarle, primeramente, que el hecho pudo ser llevado a cabo; pero, en segundo lugar, y\r\n" + 
				"muy especialmente, insisto en llamar su atenci�n sobre el car�cter extraordinario, casi\r\n" + 
				"sobrenatural, de ese vigor capaz de cosa semejante.\r\n" + 
				"\t�Usando t�rminos judiciales, usted me dir� sin duda que para �redondear mi caso�\r\n" + 
				"deber�a subestimar y no poner de tal modo en evidencia la agilidad que se requiere para\r\n" + 
				"dicha proeza. Pero la pr�ctica de los tribunales no es la de la raz�n. Mi objetivo final es tan\r\n" + 
				"s�lo la verdad. Y mi prop�sito inmediato consiste en inducirlo a que yuxtaponga la ins�lita\r\n" + 
				"agilidad que he mencionado a esa voz tan extra�amente aguda (o �spera) y desigual sobre\r\n" + 
				"cuya nacionalidad no pudieron ponerse de acuerdo los testigos y en cuyos acentos no se\r\n" + 
				"logr� distinguir ning�n -vocablo articulado-.\n");
		this.parrafo.add("\t�Habr� notado usted �dijo� que he pasado de la cuesti�n de la salida de la casa a la\r\n" + 
				"del modo de entrar en ella. Era mi intenci�n mostrar que ambas cosas se cumplieron en la\r\n" + 
				"misma forma y en el mismo lugar. Volvamos ahora al interior del cuarto y examinemos lo\r\n" + 
				"que all� aparece. Se ha dicho que los cajones de la c�moda hab�an sido saqueados, aunque\r\n" + 
				"quedaron en ellos numerosas prendas. Esta conclusi�n es absurda. No pasa de una simple\r\n" + 
				"conjetura, bastante tonta por lo dem�s. �C�mo podemos asegurar que las ropas halladas en\r\n" + 
				"los cajones no eran las que �stos conten�an habitualmente? Madame L�Espanaye y su hija\r\n" + 
				"llevaban una vida muy retirada, no ve�an a nadie, sal�an raras veces, y pocas ocasiones se\r\n" + 
				"les presentaban de cambiar de tocado. Lo que se encontr� en los cajones era de tan buena\r\n" + 
				"calidad como cualquiera de los efectos que pose�an las damas. Si un ladr�n se llev� una\r\n" + 
				"parte, �por qu� no tom� lo mejor... por qu� no se llev� todo? En una palabra: �por qu�\r\n" + 
				"abandon� cuatro mil francos en oro, para cargarse con un hato de ropa? El oro fue\r\n" + 
				"abandonado. La suma mencionada por monsieur Mignaud, el banquero, apareci� en su casi\r\n" + 
				"totalidad en los sacos tirados por el suelo. Le pido, por tanto, que descarte de sus\r\n" + 
				"pensamientos la desatinada idea de un m�vil, nacida en el cerebro de los polic�as por esa\r\n" + 
				"parte del testimonio que se refiere al dinero entregado en la puerta de la casa. Coincidencias\r\n" + 
				"diez veces m�s notables que �sta (la entrega del dinero y el asesinato de sus poseedores tres\r\n" + 
				"d�as m�s tarde) ocurren a cada hora de nuestras vidas sin que nos preocupemos por ellas.\r\n" + 
				"En general, las coincidencias son grandes obst�culos en el camino de esos pensadores que\r\n" + 
				"todo lo ignoran de la teor�a de las probabilidades, esa teor�a a la cual los objetivos m�s\r\n" + 
				"eminentes de la investigaci�n humana deben los m�s altos ejemplos. En esta instancia, si el\r\n" + 
				"oro hubiese sido robado, el hecho de que la suma hubiese sido entregada tres d�as antes\r\n" + 
				"habr�a constituido algo m�s que una coincidencia. Antes bien, hubiera corroborado la\r\n" + 
				"noci�n de un m�vil. Pero, dadas las verdaderas circunstancias del caso, si hemos de\r\n" + 
				"suponer que el oro era el m�vil del crimen, tenemos entonces que admitir que su\r\n" + 
				"perpetrador era lo bastante indeciso y lo bastante est�pido como para olvidar el oro y el\r\n" + 
				"m�vil al mismo tiempo.\n");
		this.parrafo.add("\t�Teniendo, pues, presentes los puntos sobre los cuales he llamado su atenci�n �la voz\r\n" + 
				"singular, la ins�lita agilidad y la sorprendente falta de m�vil en un asesinato tan atroz como\r\n" + 
				"�ste�, echemos una ojeada a la carnicer�a en s�. Estamos ante una mujer estrangulada por\r\n" + 
				"la presi�n de unas manos e introducida en el ca��n de la chimenea con la cabeza hacia\r\n" + 
				"abajo. Los asesinos ordinarios no emplean semejantes m�todos. Y mucho menos esconden\r\n" + 
				"al asesinado en esa forma. En el hecho de introducir el cad�ver en la chimenea admitir�\r\n" + 
				"usted que hay algo excesivamente inmoderado, algo por completo inconciliable con\r\n" + 
				"nuestras nociones sobre los actos humanos, incluso si suponemos que su autor es el m�s\r\n" + 
				"depravado de los hombres. Piense, asimismo, en la fuerza prodigiosa que hizo falta para\r\n" + 
				"introducir el cuerpo hacia arriba, cuando para hacerlo descender fue necesario el concurso\r\n" + 
				"de varias personas.\n");
		this.parrafo.add("\t�Volv�monos ahora a las restantes se�ales que pudo dejar ese maravilloso vigor. En el\r\n" + 
				"hogar de la chimenea se hallaron espesos (muy espesos) mechones de cabello humano\r\n" + 
				"canoso. Hab�an sido arrancados de ra�z. Bien sabe usted la fuerza que se requiere para\r\n" + 
				"arrancar en esa forma veinte o treinta cabellos. Y adem�s vio los mechones en cuesti�n tan\r\n" + 
				"bien como yo. Sus ra�ces (cosa horrible) mostraban pedazos del cuero cabelludo, prueba\r\n" + 
				"evidente de la prodigiosa fuerza ejercida para arrancar quiz� medio mill�n de cabellos de\r\n" + 
				"un tir�n. La garganta de la anciana se�ora no solamente estaba cortada, sino que la cabeza\r\n" + 
				"hab�a quedado completamente separada del cuerpo; el instrumento era una simple navaja.\r\n" + 
				"Lo invito a considerar la brutal ferocidad de estas acciones. No dir� nada de las contusiones\r\n" + 
				"que presentaba el cuerpo de Madame L�Espanaye. Monsieur Dumas y su valioso ayudante,\r\n" + 
				"monsieur Etienne, han decidido que fueron producidas por un instrumento contundente, y\r\n" + 
				"hasta ah� la opini�n de dichos caballeros es muy correcta. El instrumento contundente fue\r\n" + 
				"evidentemente el pavimento de piedra del patio, sobre el cual cay� la v�ctima desde la\r\n" + 
				"ventana que da sobre la cama. Por simple que sea, esto escap� a la polic�a por la misma\r\n" + 
				"raz�n que se les escap� el ancho de las persianas: frente a la presencia de clavos se\r\n" + 
				"quedaron ciegos ante la posibilidad de que las ventanas hubieran sido abiertas alguna vez.\n");
		this.parrafo.add("\t�Si ahora, en adici�n a estas cosas, ha reflexionado usted adecuadamente sobre el\r\n" + 
				"extra�o desorden del aposento, hemos llegado al punto de poder combinar las nociones de\r\n" + 
				"una asombrosa agilidad, una fuerza sobrehumana, una ferocidad brutal, una carnicer�a sin\r\n" + 
				"motivo, una grotesquerie en el horror por completo ajeno a lo humano, y una voz de tono\r\n" + 
				"extranjero para los o�dos de hombres de distintas nacionalidades y privada de todo silabeo\r\n" + 
				"inteligible. �Qu� resultado obtenemos? �Qu� -impresi�n- he producido en su imaginaci�n?\n");
		this.parrafo.add("\t�No he dicho que lo fuera �repuso mi amigo�. Pero antes de que resolvamos este\r\n" + 
				"punto, le ruego que mire el bosquejo que he trazado en este papel. Es un facs�mil de lo que\r\n" + 
				"en una parte de las declaraciones de los testigos se describi� como �contusiones negruzcas,\r\n" + 
				"y profundas huellas de u�as� en la garganta de mademoiselle L�Espanaye, y en otra\r\n" + 
				"(declaraci�n de los se�ores Dumas y Etienne) como �una serie de manchas l�vidas que,\r\n" + 
				"evidentemente, resultaban de la presi�n de unos dedos�.\r\n" + 
				"\t�Notar� usted �continu� mi amigo, mientras desplegaba el papel� que este dise�o\r\n" + 
				"indica una presi�n firme y fija. No hay se�al alguna de deslizamiento. Cada dedo mantuvo\r\n" + 
				"(probablemente hasta la muerte de la v�ctima) su terrible presi�n en el sitio donde se hundi�\r\n" + 
				"primero. Le ruego ahora que trate de colocar todos sus dedos a la vez en las respectivas\r\n" + 
				"impresiones, tal como aparecen en el dibujo.\n");
		this.parrafo.add("\tLo intent� sin el menor resultado.\r\n" + 
				"\t�Quiz� no estemos procediendo debidamente �dijo Dupin�. El papel es una\r\n" + 
				"superficie plana, mientras que la garganta humana es cil�ndrica. He aqu� un rodillo de\r\n" + 
				"madera, cuya circunferencia es aproximadamente la de una garganta. Envu�lvala con el\r\n" + 
				"dibujo y repita el experimento.\r\n" + 
				"\tAs� lo hice, pero las dificultades eran a�n mayores.\r\n" + 
				"\t�Esta marca �dije� no es la de una mano humana.\r\n" + 
				"\t�Lea ahora �replic� Dupin� este pasaje de Cuvier.\r\n" + 
				"\tEra una minuciosa descripci�n anat�mica y descriptiva del gran orangut�n leonado de\r\n" + 
				"las islas de la India oriental. La gigantesca estatura, la prodigiosa fuerza y agilidad, la\r\n" + 
				"terrible ferocidad y las tendencias imitativas de estos mam�feros son bien conocidas.\r\n" + 
				"Instant�neamente comprend� todo el horror del asesinato.\r\n" + 
				"\t�La descripci�n de los dedos �dije al terminar la lectura�concuerda exactamente\r\n" + 
				"con este dibujo. S�lo un orangut�n, entre todos los animales existentes, es capaz de\r\n" + 
				"producir las marcas que aparecen en su dise�o. Y el mech�n de pelo coincide en un todo\r\n" + 
				"con el pelaje de la bestia descrita por Cuvier. De todas maneras, no alcanzo a comprender\r\n" + 
				"los detalles de este aterrador misterio. Adem�s, se escucharon dos voces que disputaban y\r\n" + 
				"una de ellas era, sin duda, la de un franc�s.\n");
		this.parrafo.add("\t�Cierto, Y recordar� usted que, casi un�nimemente, los testigos declararon haber o�do\r\n" + 
				"decir a esa voz las palabras: Mon Dieu! Dadas las circunstancias, uno de los testigos\r\n" + 
				"(Montani, el confitero) acert� al sostener que la exclamaci�n ten�a un tono de reproche o\r\n" + 
				"reconvenci�n. Sobre esas dos palabras, pues, he apoyado todas mis esperanzas de una\r\n" + 
				"soluci�n total del enigma. Un franc�s estuvo al tanto del asesinato. Es posible �e incluso\r\n" + 
				"muy probable� que fuera inocente de toda participaci�n en el sangriento episodio. El\r\n" + 
				"orangut�n pudo hab�rsele escapado. Quiz� sigui� sus huellas hasta la habitaci�n; pero,\r\n" + 
				"dadas las terribles circunstancias que se sucedieron, le fue imposible capturarlo otra vez. El\r\n" + 
				"animal anda todav�a suelto. No continuar� con estas conjeturas (pues no tengo derecho a\r\n" + 
				"darles otro nombre), ya que las sombras de reflexi�n que les sirven de base poseen apenas\r\n" + 
				"suficiente profundidad para ser alcanzadas por mi intelecto, y no pretender� mostrarlas con\r\n" + 
				"claridad a la inteligencia de otra persona. Las llamaremos conjeturas, pues, y nos\r\n" + 
				"referiremos a ellas como tales. Si el franc�s en cuesti�n es, como lo supongo, inocente de\r\n" + 
				"tal atrocidad, este aviso que deje anoche cuando volv�amos a casa en las oficinas de Le\r\n" + 
				"Monde (un diario consagrado a cuestiones mar�timas y muy le�do por los navegantes) lo\r\n" + 
				"har� acudir a nuestra casa.\n");
		this.parrafo.add("\tMe alcanz� un papel, donde le�:\r\n" + 
				"\n\tCAPTURADO.�En el Bois de Boulogne, en la ma�ana del... (la ma�ana del asesinato),\r\n" + 
				"se ha capturado un gran orangut�n leonado de la especie de Borneo. Su due�o (de quien se\r\n" + 
				"sabe que es un marinero perteneciente a un barco malt�s) puede reclamarlo, previa\r\n" + 
				"identificaci�n satisfactoria y pago de los gastos resultantes de su captura y cuidado.\r\n" + 
				"Presentarse al n�mero... calle... Faubourg Saint-Germain... tercer piso.\r\n" + 
				"\n\t�Pero, �c�mo es posible �pregunt� que sepa usted que el hombre es un marinero y\r\n" + 
				"que pertenece a un barco maltes?\r\n" + 
				"\t�No lo s� �dijo Dupin� y no estoy seguro de ello. Pero he aqu� un trocito de cinta\r\n" + 
				"que, a juzgar por su forma y su grasienta condici�n, debi� de ser usado para atar el pelo en\r\n" + 
				"una de esas largas queues de que tan orgullosos se muestran los marineros. Adem�s, el\r\n" + 
				"nudo pertenece a esa clase que pocas personas son capaces de hacer, salvo los marinos, y es\r\n" + 
				"caracter�stico de los malteses. Encontr� esta cinta al pie de la varilla del pararrayos.\r\n" + 
				"Imposible que perteneciera a una de las v�ctimas. De todos modos, si me equivoco al\r\n" + 
				"deducir de la cinta que el franc�s era un marinero perteneciente a un barco maltes, no he\r\n" + 
				"causado ning�n da�o al estamparlo en el aviso. Si me equivoco, el hombre pensar� que me\r\n" + 
				"he confundido por alguna raz�n que no se tomar� el trabajo de averiguar. Pero si estoy en lo\r\n" + 
				"cierto, hay mucho de ganado. Conocedor, aunque inocente de los asesinatos, el franc�s\r\n" + 
				"vacilar�, como es natural, antes de responder al aviso y reclamar el orangut�n. He aqu�\r\n" + 
				"c�mo razonar�: �Soy inocente y pobre; mi orangut�n es muy valioso y para un hombre\r\n" + 
				"como yo representa una verdadera fortuna. �Por qu� perderlo a causa de una tonta\r\n" + 
				"aprensi�n? Est� ah�, a mi alcance. Lo han encontrado en el Bois de Boulogne, a mucha\r\n" + 
				"distancia de la escena del crimen. �C�mo podr�a sospechar alguien que ese animal es el\r\n" + 
				"culpable? La polic�a est� desorientada y no ha podido encontrar la m�s peque�a huella. Si\r\n" + 
				"llegaran a seguir la pista del mono, les ser� imposible probar que supe algo de los cr�menes\r\n" + 
				"o echarme alguna culpa como testigo de ellos. Adem�s, soy conocido. El redactor del aviso\r\n" + 
				"me designa como due�o del animal. Ignoro hasta d�nde llega su conocimiento. Si renuncio\r\n" + 
				"a reclamar algo de tanto valor, que se sabe de mi pertenencia, las sospechas recaer�n, por lo\r\n" + 
				"menos, sobre el animal. Contestar� al aviso, recobrar� el orangut�n y lo tendr� encerrado\r\n" + 
				"hasta que no se hable m�s del asunto.�\n");
		this.parrafo.add("\tEn ese momento o�mos pasos en la escalera.\r\n" + 
				"\t�Prepare las pistolas �dijo Dupin�, pero no las use ni las exhiba hasta que le haga\r\n" + 
				"una se�a.\r\n" + 
				"\tLa puerta de entrada de la casa hab�a quedado abierta y el visitante hab�a entrado sin\r\n" + 
				"llamar, subiendo algunos pelda�os de la escalera. Pero, de pronto, pareci� vacilar y lo\r\n" + 
				"o�mos bajar. Dupin corr�a ya a la puerta cuando advertimos que volv�a a subir. Esta vez no\r\n" + 
				"vacil�, sino que, luego de trepar decididamente la escalera, golpe� en nuestra puerta.\r\n" + 
				"\t��Adelante! �dijo Dupin con voz cordial y alegre.\r\n" + 
				"\tEl hombre que entr� era, con toda evidencia, un marino, alto, robusto y musculoso, con\r\n" + 
				"un semblante en el que cierta expresi�n audaz no resultaba desagradable. Su rostro, muy\r\n" + 
				"atezado, aparec�a en gran parte oculto por las patillas y los bigotes. Tra�a consigo un grueso\r\n" + 
				"bast�n de roble, pero al parecer �sa era su �nica arma. Inclin�se torpemente, d�ndonos las\r\n" + 
				"buenas noches en franc�s; a pesar de un cierto acento suizo de Neufchatel, se ve�a que era\r\n" + 
				"de origen parisiense.\n");
		this.parrafo.add("\t�Si�ntese usted, amigo m�o �dijo Dupin�. Supongo que viene en busca del\r\n" + 
				"orangut�n. Palabra, se lo envidio un poco; es un magn�fico animal, que presumo debe de\r\n" + 
				"tener gran valor. �Qu� edad le calcula usted?\r\n" + 
				"\tEl marinero respir� profundamente, con el aire de quien se siente aliviado de un peso\r\n" + 
				"intolerable, y contest� con tono reposado:\r\n" + 
				"\t�No podr�a decirlo, pero no tiene m�s de cuatro o cinco a�os. �Lo guarda usted aqu�?\r\n" + 
				"\t��Oh, no! Carecemos de lugar adecuado. Est� en una caballeriza de la rue Dubourg,\r\n" + 
				"cerca de aqu�. Podr�a usted llev�rselo ma�ana por la ma�ana. Supongo que estar� en\r\n" + 
				"condiciones de probar su derecho de propiedad.\r\n" + 
				"\t�Por supuesto que s�, se�or.\r\n" + 
				"\t�Lamentar� separarme de �l �dijo Dupin.\r\n" + 
				"\t�No quisiera que usted se hubiese molestado por nada �declar� el marinero�. Estoy\r\n" + 
				"dispuesto a pagar una recompensa por el hallazgo del animal. Una suma razonable, se\r\n" + 
				"entiende.\r\n" + 
				"\t�Pues bien �repuso mi amigo�, eso me parece muy justo. D�jeme pensar: �qu� le\r\n" + 
				"pedir�? �Ah, ya s�! He aqu� cu�l ser� mi recompensa: me contar� usted todo lo que sabe\r\n" + 
				"sobre esos cr�menes en la rue Morgue.\r\n" + 
				"\tDupin pronunci� las �ltimas palabras en voz muy baja y con gran tranquilidad.\r\n" + 
				"Despu�s, con igual calma, fue hacia la puerta, la cerr� y guard� la llave en el bolsillo.\r\n" + 
				"Sacando luego una pistola, la puso sin la menor prisa sobre la mesa.\r\n" + 
				"\tEl rostro del marinero enrojeci� como si un acceso de sofocaci�n se hubiera apoderado\r\n" + 
				"de �l. Levant�ndose, aferr� su bast�n, pero un segundo despu�s se dej� caer de nuevo en el\r\n" + 
				"asiento, temblando violentamente y p�lido como la muerte. No dijo una palabra. Lo\r\n" + 
				"compadec� desde lo m�s profundo de mi coraz�n.\n");
		this.parrafo.add("\t�Amigo m�o, se est� usted alarmando sin necesidad �dijo cordialmente Dupin�. Le\r\n" + 
				"aseguro que no tenemos intenci�n de causarle el menor da�o. Lejos de nosotros querer\r\n" + 
				"perjudicarlo: le doy mi palabra de caballero y de franc�s. Estoy perfectamente enterado de\r\n" + 
				"que es usted inocente de las atrocidades de la rue Morgue. Pero ser�a in�til negar que, en\r\n" + 
				"cierto modo, se halla implicado en ellas. Fund�ndose en lo que le he dicho, supondr� que\r\n" + 
				"poseo medios de informaci�n sobre este asunto, medios que le ser�a imposible imaginar. El\r\n" + 
				"caso se plantea de la siguiente manera: usted no ha cometido nada que no debiera haber\r\n" + 
				"cometido, nada que lo haga culpable. Ni siquiera se le puede acusar de robo, cosa que pudo\r\n" + 
				"llevar a cabo impunemente. No tiene nada que ocultar ni raz�n para hacerlo. Por otra parte,\r\n" + 
				"el honor m�s elemental lo obliga a confesar todo lo que sabe. Hay un hombre inocente en la\r\n" + 
				"c�rcel, acusado de un crimen cuyo perpetrador puede usted denunciar.\r\n" + 
				"\tMientras Dupin pronunciaba estas palabras, el marinero hab�a recobrado en buena parte\r\n" + 
				"su compostura, aunque su aire decidido del comienzo hab�ase desvanecido por completo.\r\n" + 
				"\t��Dios venga en mi ayuda! �dijo, despu�s de una pausa�. S�, le dir� todo lo que s�\r\n" + 
				"sobre este asunto, aunque no espero que crea ni la mitad de lo que voy a contarle... �Estar�a\r\n" + 
				"loco si pensara que van a creerme! Y, sin embargo, soy inocente, y lo confesar� todo\r\n" + 
				"aunque me cueste la vida.\n");
		this.parrafo.add("\tEn sustancia, lo que nos dijo fue lo siguiente: Poco tiempo atr�s, hab�a hecho un viaje\r\n" + 
				"al archipi�lago �ndico. Un grupo del que formaba parte desembarc� en Borneo y penetr� en\r\n" + 
				"el interior a fin de hacer una excursi�n placentera. Entre �l y un compa�ero capturaron al\r\n" + 
				"orangut�n. Como su compa�ero falleciera, qued� due�o �nico del animal. Despu�s de\r\n" + 
				"considerables dificultades, ocasionadas por la indomable ferocidad de su cautivo durante el\r\n" + 
				"viaje de vuelta, logr� finalmente encerrarlo en su casa de Par�s, donde, para aislarlo de la\r\n" + 
				"inc�moda curiosidad de sus vecinos, lo manten�a cuidadosamente recluido, mientras el\r\n" + 
				"animal curaba de una herida en la pata que se hab�a hecho con una astilla a bordo del\r\n" + 
				"buque. Una vez curado, el marinero estaba dispuesto a venderlo.\r\n" + 
				"\tUna noche, o m�s bien una madrugada, en que volv�a de una peque�a juerga de\r\n" + 
				"marineros, nuestro hombre se encontr� con que el orangut�n hab�a penetrado en su\r\n" + 
				"dormitorio, luego de escaparse de la habitaci�n contigua donde su captor hab�a cre�do\r\n" + 
				"tenerlo s�lidamente encerrado. Navaja en mano y embadurnado de jab�n, hab�ase sentado\r\n" + 
				"frente a un espejo y trataba de afeitarse, tal como, sin duda, hab�a visto hacer a su amo\r\n" + 
				"espi�ndolo por el ojo de la cerradura. Aterrado al ver arma tan peligrosa en manos de un\r\n" + 
				"animal que, en su ferocidad, era harto capaz de utilizarla, el marinero se qued� un instante\r\n" + 
				"sin saber qu� hacer. Por lo regular, lograba contener al animal, aun en sus arrebatos m�s\r\n" + 
				"terribles, con ayuda de un l�tigo, y pens� acudir otra vez a ese recurso. Pero al verlo, el\r\n" + 
				"orangut�n se lanz� de un salto a la puerta, baj� las escaleras y, desde ellas, saltando por una\r\n" + 
				"ventana que desgraciadamente estaba abierta, se dej� caer a la calle.\n");
		this.parrafo.add("\tDesesperado, el franc�s se precipit� en su seguimiento. Navaja en mano, el mono se\r\n" + 
				"deten�a para mirar y hacer muecas a su perseguidor, dej�ndolo acercarse casi hasta su lado.\r\n" + 
				"Entonces echaba a correr otra vez. Sigui� as� la caza durante largo tiempo. Las calles\r\n" + 
				"estaban profundamente tranquilas, pues eran casi las tres de la madrugada. Al atravesar el\r\n" + 
				"pasaje de los fondos de la rue Morgue, la atenci�n del fugitivo se vio atra�da por la luz que\r\n" + 
				"sal�a de la ventana abierta del aposento de madame L�Espanaye, en el cuarto piso de su\r\n" + 
				"casa. Precipit�ndose hacia el edificio, descubri� la varilla del pararrayos, trep� por ella con\r\n" + 
				"inconcebible agilidad, aferr� la persiana que se hallaba completamente abierta y pegada a la\r\n" + 
				"pared, y en esta forma se lanz� hacia adelante hasta caer sobre la cabecera de la cama. Todo\r\n" + 
				"esto hab�a ocurrido en menos de un minuto. Al saltar en la habitaci�n, las patas del\r\n" + 
				"orangut�n rechazaron nuevamente la persiana, la cual qued� abierta.\r\n" + 
				"\tEl marinero, a todo esto, se sent�a tranquilo y preocupado al mismo tiempo. Renac�an\r\n" + 
				"sus esperanzas de volver a capturar a la bestia, ya que le ser�a dif�cil escapar de la trampa\r\n" + 
				"en que acababa de meterse, salvo que bajara otra vez por el pararrayos, ocasi�n en que ser�a\r\n" + 
				"posible atraparlo. Por otra parte, se sent�a ansioso al pensar en lo que podr�a estar haciendo\r\n" + 
				"en la casa. Esta �ltima reflexi�n indujo al hombre a seguir al fugitivo. Para un marinero no\r\n" + 
				"hay dificultad en trepar por una varilla de pararrayos; pero, cuando hubo llegado a la altura\r\n" + 
				"de la ventana, que quedaba muy alejada a su izquierda, no pudo seguir adelante; lo m�s que\r\n" + 
				"alcanz� fue a echarse a un lado para observar el interior del aposento. Apenas hubo mirado,\r\n" + 
				"estuvo a punto de caer a causa del horror que lo sobrecogi�. Fue en ese momento cuando\r\n" + 
				"empezaron los espantosos alaridos que arrancaron de su sue�o a los vecinos de la rue\r\n" + 
				"Morgue. Madame L�Espanaye y su hija, vestidas con sus camisones de dormir, hab�an\r\n" + 
				"estado aparentemente ocupadas en arreglar algunos papeles en la caja fuerte ya\r\n" + 
				"mencionada, la cual hab�a sido corrida al centro del cuarto. Hall�base abierta, y a su lado,\r\n" + 
				"en el suelo, los papeles que conten�a. Las v�ctimas deb�an de haber estado sentadas dando la\r\n" + 
				"espalda a la ventana, y, a juzgar por el tiempo transcurrido entre la entrada de la bestia y los\r\n" + 
				"gritos, parec�a probable que en un primer momento no hubieran advertido su presencia. El\r\n" + 
				"golpear de la persiana pudo ser atribuido por ellas al viento.\n");
		this.parrafo.add("\tEn el momento en que el marinero mir� hacia el interior del cuarto, el gigantesco\r\n" + 
				"animal hab�a aferrado a madame L�Espanaye por el cabello (que la dama ten�a suelto, como\r\n" + 
				"si se hubiera estado peinando) y agitaba la navaja cerca de su cara imitando los\r\n" + 
				"movimientos de un barbero. La hija yac�a postrada e inm�vil, v�ctima de un desmayo. Los\r\n" + 
				"gritos y los esfuerzos de la anciana se�ora, durante los cuales le fueron arrancados los\r\n" + 
				"mechones de la cabeza, tuvieron por efecto convertir los prop�sitos probablemente\r\n" + 
				"pac�ficos del orangut�n en otros llenos de furor. Con un solo golpe de su musculoso brazo\r\n" + 
				"separ� casi completamente la cabeza del cuerpo de la v�ctima. La vista de la sangre\r\n" + 
				"transform� su c�lera en frenes�. Rechinando los dientes y echando fuego por los ojos, salt�\r\n" + 
				"sobre el cuerpo de la joven y, hundi�ndole las terribles garras en la garganta, las mantuvo\r\n" + 
				"as� hasta que hubo expirado. Las furiosas miradas de la bestia cayeron entonces sobre la\r\n" + 
				"cabecera del lecho, sobre el cual el rostro de su amo, paralizado por el horror, alcanzaba\r\n" + 
				"apenas a divisarse. La furia del orangut�n, que, sin duda, no olvidaba el temido l�tigo, se\r\n" + 
				"cambi� instant�neamente en miedo. Seguro de haber merecido un castigo, pareci� deseoso\r\n" + 
				"de ocultar sus sangrientas acciones, y se lanz� por el cuarto lleno de nerviosa agitaci�n,\r\n" + 
				"echando abajo y rompiendo los muebles a cada salto y arrancando el lecho de su bastidor.\r\n" + 
				"Finalmente se apoder� del cad�ver de mademoiselle L�Espanaye y lo meti� en el ca��n de\r\n" + 
				"la chimenea, tal como fue encontrado luego, tom� luego el de la anciana y lo tir� de cabeza\r\n" + 
				"por la ventana.\r\n" + 
				"\tEn momentos en que el mono se acercaba a la ventana con su mutilada carga, el\r\n" + 
				"marinero se ech� aterrorizado hacia atr�s y, desliz�ndose sin precauci�n alguna hasta el\r\n" + 
				"suelo, corri� inmediatamente a su casa, temeroso de las consecuencias de semejante\r\n" + 
				"atrocidad y olvidando en su terror toda preocupaci�n por la suerte del orangut�n. Las\r\n" + 
				"palabras que los testigos oyeron en la escalera fueron las exclamaciones de espanto del\r\n" + 
				"franc�s, mezcladas con los diab�licos sonidos que profer�a la bestia.\r\n" + 
				"\tPoco me queda por agregar. El orangut�n debi� de escapar por la varilla del pararrayos\r\n" + 
				"un segundo antes de que la puerta fuera forzada. Sin duda, cerr� la ventana a su paso. M�s\r\n" + 
				"tarde fue capturado por su mismo due�o, quien lo vendi� al Jardin des Plantes en una\r\n" + 
				"elevada suma.\n");
		this.parrafo.add("\tLebon fue puesto en libertad inmediatamente despu�s que hubimos narrado todas las\r\n" + 
				"circunstancias del caso �con algunos comentarios por parte de Dupin� en el bureau del\r\n" + 
				"prefecto de polic�a. Este funcionario, aunque muy bien dispuesto hacia mi amigo, no pudo\r\n" + 
				"ocultar del todo el fastidio que le produc�a el giro que hab�a tomado el asunto, y desliz� uno\r\n" + 
				"o dos sarcasmos sobre la conveniencia de que cada uno se ocupara de sus propios asuntos.\n");
		this.parrafo.add("�D�jelo usted hablar �me dijo Dupin, que no se hab�a molestado en replicarle�.\r\n" + 
				"Deje que se desahogue; eso aliviar� su conciencia. Me doy por satisfecho con haberlo\r\n" + 
				"derrotado en su propio terreno. De todos modos, el hecho de que haya fracasado en la\r\n" + 
				"soluci�n del misterio no es ninguna raz�n para asombrarse; en verdad, nuestro amigo el\r\n" + 
				"prefecto es demasiado astuto para ser profundo. No hay fibra en su ciencia: mucha cabeza y\r\n" + 
				"nada de cuerpo, como las im�genes de la diosa Laverna, o, a lo sumo, mucha cabeza y\r\n" + 
				"lomos, como un bacalao. Pero despu�s de todo es un buen hombre. Lo estimo\r\n" + 
				"especialmente por cierta forma maestra de gazmo�er�a, a la cual debe su reputaci�n. Me\r\n" + 
				"refiero a la manera que tiene de nier ce qui est, et d� expliquer ce qui n�est pas (negar lo que es y explicar lo que no es)"
				+ "FIN");
		
		

	}

}
