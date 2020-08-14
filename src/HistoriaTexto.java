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
				.add("\tMientras residía en París, durante la primavera y parte del verano de 18..., me relacioné\r\n"
						+ "con un cierto C. Auguste Dupin. Este joven caballero procedía de una familia excelente —y\r\n"
						+ "hasta ilustre—, pero una serie de desdichadas circunstancias lo habían reducido a tal\r\n"
						+ "pobreza que la energía de su carácter sucumbió ante la desgracia, llevándolo a alejarse del\r\n"
						+ "mundo y a no preocuparse por recuperar su fortuna. Gracias a la cortesía de sus acreedores\r\n"
						+ "le quedó una pequeña parte del patrimonio, y la renta que le producía bastaba, mediante una\r\n"
						+ "rigurosa economía, para subvenir a sus necesidades, sin preocuparse de lo superfluo. Los\r\n"
						+ "libros constituían su solo lujo, y en París es fácil procurárselos.\n");
		this.parrafo.add("\tNuestro primer encuentro tuvo lugar en una oscura librería de la rue Montmartre, donde\r\n"
				+ "la casualidad de que ambos anduviéramos en busca de un mismo libro —tan raro como\r\n"
				+ "notable— sirvió para aproximarnos. Volvimos a encontrarnos una y otra vez. Me sentí\r\n"
				+ "profundamente interesado por la menuda historia de familia que Dupin me contaba\r\n"
				+ "detalladamente, con todo ese candor a que se abandona un francés cuando se trata de su\r\n"
				+ "propia persona. Me quedé asombrado, al mismo tiempo, por la extraordinaria amplitud de\r\n"
				+ "su cultura; pero, sobre todo, sentí encenderse mi alma ante el exaltado fervor y la vívida\r\n"
				+ "frescura de su imaginación. Dado lo que yo buscaba en ese entonces en París, sentí que la\r\n"
				+ "compañía de un hombre semejante me resultaría un tesoro inestimable, y no vacilé en\r\n"
				+ "decírselo. Quedó por fin decidido que viviríamos juntos durante mi permanencia en la\r\n"
				+ "ciudad, y, como mi situación financiera era algo menos comprometida que la suya, logré\r\n"
				+ "que quedara a mi cargo alquilar y amueblar —en un estilo que armonizaba con la\r\n"
				+ "melancolía un tanto fantástica de nuestro carácter— una decrépita y grotesca mansión\r\n"
				+ "abandonada a causa de supersticiones sobre las cuales no inquirimos, y que se acercaba a su\r\n"
				+ "ruina en una parte aislada y solitaria del Faubourg Saint-Germain.\n");
		this.parrafo.add("\tSi nuestra manera de vivir en esa casa hubiera llegado al conocimiento del mundo, éste\r\n"
				+ "nos hubiera considerado como locos —aunque probablemente como locos inofensivos—.\r\n"
				+ "Nuestro aislamiento era perfecto. No admitíamos visitantes. El lugar de nuestro retiro era\r\n"
				+ "un secreto celosamente guardado para mis antiguos amigos; en cuanto a Dupin, hacía\r\n"
				+ "muchos años que había dejado de ver gentes o de ser conocido en París. Sólo vivíamos para\r\n"
				+ "nosotros.\n");
		this.parrafo.add("\tUna rareza de mi amigo (¿qué otro nombre darle?) consistía en amar la noche por la\r\n"
				+ "noche misma; a esta bizarrerie, como a todas las otras, me abandoné a mi vez sin esfuerzo,\r\n"
				+ "entregándome a sus extraños caprichos con perfecto abandono. La negra divinidad no podía\r\n"
				+ "permanecer siempre con nosotros, pero nos era dado imitarla. A las primeras luces del alba,\r\n"
				+ "cerrábamos las pesadas persianas de nuestra vieja casa y encendíamos un par de bujías que,\r\n"
				+ "fuertemente perfumadas, sólo lanzaban débiles y mortecinos rayos. Con ayuda de ellas\r\n"
				+ "ocupábamos nuestros espíritus en soñar, leyendo, escribiendo o conversando, hasta que el\r\n"
				+ "reloj nos advertía la llegada de la verdadera oscuridad. Salíamos entonces a la calle\r\n"
				+ "tomados del brazo, continuando la conversación del día o vagando al azar hasta muy tarde,\r\n"
				+ "mientras buscábamos entre las luces y las sombras de la populosa ciudad esa infinidad de\r\n"
				+ "excitantes espirituales que puede proporcionar la observación silenciosa.\n");
		this.parrafo.add("\tEn esas oportunidades, no dejaba yo de reparar y admirar (aunque dada su profunda\r\n"
				+ "idealidad cabía esperarlo) una peculiar aptitud analítica de Dupin. Parecía complacerse\r\n"
				+ "especialmente en ejercitarla —ya que no en exhibirla— y no vacilaba en confesar el placer\r\n"
				+ "que le producía. Se jactaba, con una risita discreta, de que frente a él la mayoría de los\r\n"
				+ "hombres tenían como una ventana por la cual podía verse su corazón y estaba pronto a\r\n"
				+ "demostrar sus afirmaciones con pruebas tan directas como sorprendentes del íntimo\r\n"
				+ "conocimiento que de mí tenía. En aquellos momentos su actitud era fría y abstraída; sus\r\n"
				+ "ojos miraban como sin ver, mientras su voz, habitualmente de un rico registro de tenor,\r\n"
				+ "subía a un falsete que hubiera parecido petulante de no mediar lo deliberado y lo preciso de\r\n"
				+ "sus palabras. Al observarlo en esos casos, me ocurría muchas veces pensar en la antigua\r\n"
				+ "filosofía del alma doble, y me divertía con la idea de un doble Dupin: el creador y el\r\n"
				+ "analista.\n");
		this.parrafo.add("\tErrábamos una noche por una larga y sucia calle, en la vecindad del Palais Royal.\r\n"
				+ "Sumergidos en nuestras meditaciones, no habíamos pronunciado una sola sílaba durante un\r\n"
				+ "cuarto de hora por lo menos. Bruscamente, Dupin pronunció estas palabras:\r\n"
				+ "\t—Sí, es un hombrecillo muy pequeño, y estaría mejor en el Théâtre des Variétés.\r\n"
				+ "\t—No cabe duda —repuse inconscientemente, sin advertir (pues tan absorto había\r\n"
				+ "estado en mis reflexiones) la extraordinaria forma en que Dupin coincidía con mis\r\n"
				+ "pensamientos. Pero, un instante después, me di cuenta y me sentí profundamente\r\n"
				+ "asombrado.\r\n"
				+ "\t—Dupin —dije gravemente—, esto va más allá de mi comprensión. Le confieso sin\r\n"
				+ "rodeos que estoy atónito y que apenas puedo dar crédito a mis sentidos. ¿Cómo es posible\r\n"
				+ "que haya sabido que yo estaba pensando en...?\r\n"
				+ "Aquí me detuve, para asegurarme sin lugar a dudas de si realmente sabía en quién\r\n"
				+ "estaba yo pensando.\r\n"
				+ "\t—En Chantilly —dijo Dupin—. ¿Por qué se interrumpe? Estaba usted diciéndose que\r\n"
				+ "su pequeña estatura le veda los papeles trágicos.\r\n"
				+ "Tal era, exactamente, el tema de mis reflexiones. Chantilly era un ex remendón de la\r\n"
				+ "rue Saint-Denis que, apasionado por el teatro, había encarnado el papel de Jerjes en la\r\n"
				+ "tragedia homónima de Crébillon, logrando tan sólo que la gente se burlara de él.\r\n"
				+ "\t—En nombre del cielo —exclamé—, dígame cuál es el método... si es que hay un\r\n"
				+ "método... que le ha permitido leer en lo más profundo de mí.\r\n"
				+ "En realidad, me sentía aún más asombrado de lo que estaba dispuesto a reconocer.\r\n"
				+ "\t—El frutero —replicó mi amigo— fue quien lo llevó a la conclusión de que el\r\n"
				+ "remendón de suelas no tenía estatura suficiente para Jerjes et id genus omne.\r\n"
				+ "\t—¡El frutero! ¡Me asombra usted! No conozco ningún frutero.\r\n"
				+ "\t—El hombre que tropezó con usted cuando entrábamos en esta calle... hará un cuarto\r\n"
				+ "de hora.\n");
		this.parrafo.add("\tRecordé entonces que un frutero, que llevaba sobre la cabeza una gran cesta de\r\n"
				+ "manzanas, había estado a punto de derribarme accidentalmente cuando pasábamos de la rue\r\n"
				+ "C... a la que recorríamos ahora. Pero me era imposible comprender qué tenía eso que ver\r\n"
				+ "con Chantilly.\r\n"
				+ "\t—Se lo explicaré —me dijo Dupin, en quien no había la menor partícula de\r\n"
				+ "charlatanerie— y, para que pueda comprender claramente, remontaremos primero el curso\r\n"
				+ "de sus reflexiones desde el momento en que le hablé hasta el de su choque con el frutero en\r\n"
				+ "cuestión. Los eslabones principales de la cadena son los siguientes: Chantilly, Orión, el\r\n"
				+ "doctor Nichols, Epicuro, la estereotomía, el pavimento, el frutero.\n");
		this.parrafo.add("\tPocas personas hay que, en algún momento de su vida, no se hayan entretenido en\r\n"
				+ "remontar el curso de las ideas mediante las cuales han llegado a alguna conclusión. Con\r\n"
				+ "frecuencia, esta tarea está llena de interés, y aquel que la emprende se queda asombrado por\r\n"
				+ "la distancia aparentemente ilimitada e inconexa entre el punto de partida y el de llegada.\r\n"
				+ "\t¡Cuál habrá sido entonces mi asombro al oír las palabras que acababa de pronunciar\r\n"
				+ "Dupin y reconocer que correspondían a la verdad!\r\n"
				+ "\t—Si no me equivoco —continuó él—, habíamos estado hablando de caballos\r\n"
				+ "justamente al abandonar la rue C... Éste fue nuestro último tema de conversación. Cuando\r\n"
				+ "cruzábamos hacia esta calle, un frutero que traía una gran canasta en la cabeza pasó\r\n"
				+ "rápidamente a nuestro lado y le empaló a usted contra una pila de adoquines\r\n"
				+ "correspondiente a un pedazo de la calle en reparación. Usted pisó una de las piedras sueltas,\r\n"
				+ "resbaló, torciéndose ligeramente el tobillo; mostró enojo o malhumor, murmuró algunas\r\n"
				+ "palabras, se volvió para mirar la pila de adoquines y siguió andando en silencio. Yo no\r\n"
				+ "estaba especialmente atento a sus actos, pero en los últimos tiempos la observación se ha\r\n"
				+ "convertido para mí en una necesidad.\n");
		this.parrafo.add("\t»Mantuvo usted los ojos clavados en el suelo, observando con aire quisquilloso los\r\n"
				+ "agujeros y los surcos del pavimento (por lo cual comprendí que seguía pensando en las\r\n"
				+ "piedras), hasta que llegamos al pequeño pasaje llamado Lamartine, que con fines\r\n"
				+ "experimentales ha sido pavimentado con bloques ensamblados y remachados. Aquí su\r\n"
				+ "rostro se animó y, al notar que sus labios se movían, no tuve dudas de que murmuraba la\r\n"
				+ "palabra “estereotomía”, término que se ha aplicado pretenciosamente a esta clase de\r\n"
				+ "pavimento. Sabía que para usted sería imposible decir “estereotomía” sin verse llevado a\r\n"
				+ "pensar en átomos y pasar de ahí a las teorías de Epicuro; ahora bien, cuando discutimos no\r\n"
				+ "hace mucho este tema, recuerdo haberle hecho notar de qué curiosa manera —por lo demás\r\n"
				+ "desconocida— las vagas conjeturas de aquel noble griego se han visto confirmadas en la\r\n"
				+ "reciente cosmogonía de las nebulosas; comprendí, por tanto, que usted no dejaría de alzar\r\n"
				+ "los ojos hacia la gran nebulosa de Orión, y estaba seguro de que lo haría. Efectivamente,\r\n"
				+ "miró usted hacia lo alto y me sentí seguro de haber seguido correctamente sus pasos hasta\r\n"
				+ "ese momento. Pero en la amarga crítica a Chantilly que apareció en el Musée de ayer, el\r\n"
				+ "escritor satírico hace algunas penosas alusiones al cambio de nombre del remendón antes\r\n"
				+ "de calzar los coturnos, y cita un verso latino sobre el cual hemos hablado muchas veces. Me\r\n"
				+ "refiero al verso:\r\n" + "\t\tPerdidit antiquum litera prima sonum.\r\n"
				+ "\t»Le dije a usted que se refería a Orión, que en un tiempo se escribió Urión; y dada\r\n"
				+ "cierta acritud que se mezcló en aquella discusión, estaba seguro de que usted no la había\r\n"
				+ "olvidado. Era claro, pues, que no dejaría de combinar las dos ideas de Orión y Chantilly.\r\n"
				+ "Que así lo hizo, lo supe por la sonrisa que pasó por sus labios. Pensaba usted en la\r\n"
				+ "inmolación del pobre zapatero. Hasta ese momento había caminado algo encorvado, pero\r\n"
				+ "de pronto le vi erguirse en toda su estatura. Me sentí seguro de que estaba pensando en la\r\n"
				+ "diminuta figura de Chantilly. Y en este punto interrumpí sus meditaciones para hacerle\r\n"
				+ "notar que, en efecto, el tal Chantilly era muy pequeño y que estaría mejor en el Théâtre des\r\n"
				+ "Variétés.\n");
		this.parrafo.add("\tPoco tiempo después de este episodio, leíamos una edición nocturna de la Gazette des\r\n"
				+ "Tribunaux cuando los siguientes párrafos atrajeron nuestra atención:\n");
		this.parrafo.add("\t«EXTRAÑOS ASESINATOS.—Esta mañana, hacia las tres, los habitantes del quartier\r\n"
				+ "Saint-Roch fueron arrancados de su sueño por los espantosos alaridos procedentes del\r\n"
				+ "cuarto piso de una casa situada en la rue Morgue, ocupada por madame L’Espanaye y su\r\n"
				+ "hija, mademoiselle Camille L’Espanaye. Como fuera imposible lograr el acceso a la casa,\r\n"
				+ "después de perder algún tiempo, se forzó finalmente la puerta con una ganzúa y ocho o diez\r\n"
				+ "vecinos penetraron en compañía de dos gendarmes. Por ese entonces los gritos habían\r\n"
				+ "cesado, pero cuando el grupo remontaba el primer tramo de la escalera se oyeron dos o más\r\n"
				+ "voces que discutían violentamente y que parecían proceder de la parte superior de la casa.\r\n"
				+ "Al llegar al segundo piso, las voces callaron a su vez, reinando una profunda calma. Los\r\n"
				+ "vecinos se separaron y empezaron a recorrer las habitaciones una por una. Al llegar a una\r\n"
				+ "gran cámara situada en la parte posterior del cuarto piso (cuya puerta, cerrada por dentro\r\n"
				+ "con llave, debió ser forzada), se vieron en presencia de un espectáculo que les produjo tanto\r\n"
				+ "horror como estupefacción.\r\n"
				+ "\t»EL aposento se hallaba en el mayor desorden: los muebles, rotos, habían sido\r\n"
				+ "lanzados en todas direcciones. El colchón del único lecho aparecía tirado en mitad del piso.\r\n"
				+ "Sobre una silla había una navaja manchada de sangre. Sobre la chimenea aparecían dos o\r\n"
				+ "tres largos y espesos mechones de cabello humano igualmente empapados en sangre y que\r\n"
				+ "daban la impresión de haber sido arrancados de raíz. Se encontraron en el piso cuatro\r\n"
				+ "napoleones, un aro de topacio, tres cucharas grandes de plata, tres más pequeñas de métal\r\n"
				+ "d’Alger, y dos sacos que contenían casi cuatro mil francos en oro. Los cajones de una\r\n"
				+ "cómoda situada en un ángulo habían sido abiertos y aparentemente saqueados, aunque\r\n"
				+ "quedaban en ellos numerosas prendas. Descubrióse una pequeña caja fuerte de hierro\r\n"
				+ "debajo de la cama (y no del colchón). Estaba abierta y con la llave en la cerradura. No\r\n"
				+ "contenía nada, aparte de unas viejas cartas y papeles igualmente sin importancia.\r\n"
				+ "\t»No se veía huella alguna de madame L’Espanaye, pero al notarse la presencia de una\r\n"
				+ "insólita cantidad de hollín al pie de la chimenea se procedió a registrarla, encontrándose\r\n"
				+ "(¡cosa horrible de describir!) el cadáver de su hija, cabeza abajo, el cual había sido metido a\r\n"
				+ "la fuerza en la estrecha abertura y considerablemente empujado hacia arriba. El cuerpo\r\n"
				+ "estaba aún caliente. Al examinarlo se advirtieron en él numerosas excoriaciones,\r\n"
				+ "producidas, sin duda, por la violencia con que fuera introducido y por la que requirió\r\n"
				+ "arrancarlo de allí. Veíanse profundos arañazos en el rostro, y en la garganta aparecían\r\n"
				+ "contusiones negruzcas y profundas huellas de uñas, como si la víctima hubiera sido\r\n"
				+ "estrangulada.\r\n"
				+ "\t»Luego de una cuidadosa búsqueda en cada porción de la casa, sin que apareciera nada\r\n"
				+ "nuevo, los vecinos se introdujeron en un pequeño patio pavimentado de la parte posterior\r\n"
				+ "del edificio y encontraron el cadáver de la anciana señora, la cual había sido degollada tan\r\n"
				+ "salvajemente que, al tratar de levantar el cuerpo, la cabeza se desprendió del tronco.\r\n"
				+ "Horribles mutilaciones aparecían en la cabeza y en el cuerpo, y este último apenas\r\n"
				+ "presentaba forma humana.\r\n"
				+ "\t»Hasta el momento no se ha encontrado la menor clave que permita solucionar tan\r\n"
				+ "horrible misterio.»\n");
		this.parrafo.add("\tLa edición del día siguiente contenía los siguientes detalles adicionales:");
		this.parrafo.add("\t«La tragedia de la rue Morgue.—Diversas personas han sido interrogadas con relación\r\n"
				+ "a este terrible y extraordinario suceso, pero nada ha trascendido que pueda arrojar alguna\r\n"
				+ "luz sobre él.\n " + "Para leer las declaracion escriba el nombre del testigo:\n" + "-Pauline-"
				+ "-Pierre-" + "-Isidore-" + "-Henri-" + "-Odenheimer-" + "-Jules-" + "-Adolphe-" + "-William-"
				+ "-Alfonso-" + "-Alberto-" + "-Paul-" + "-Alexandre-" + "--\n");

		this.declaracion.add("\t»Pauline Dubourg, lavandera, manifiesta que conocía desde hacía tres años a las dos\r\n"
				+ "víctimas, de cuya ropa se ocupaba. La anciana y su hija parecían hallarse en buenos\r\n"
				+ "términos y se mostraban sumamente cariñosas entre sí. Pagaban muy bien. No sabía nada\r\n"
				+ "sobre su modo de vida y sus medios de subsistencia. Creía que madame L. decía la\r\n"
				+ "buenaventura. Pasaba por tener dinero guardado. Nunca encontró a otras personas en la\r\n"
				+ "casa cuando iba a buscar la ropa o la devolvía. Estaba segura de que no tenían ningún\r\n"
				+ "criado o criada. Opinaba que en la casa no había ningún mueble, salvo en el cuarto piso.\n");
		this.declaracion.add("\t»Pierre Moreau, vendedor de tabaco, declara que desde hace cuatro años vendía\r\n"
				+ "regularmente pequeñas cantidades de tabaco y de rapé a madame L’Espanaye. Nació en la\r\n"
				+ "vecindad y ha residido siempre en ella. La extinta y su hija ocupaban desde hacía más de\r\n"
				+ "seis años la casa donde se encontraron los cadáveres. Anteriormente vivía en ella un joyero,\r\n"
				+ "que alquilaba las habitaciones superiores a diversas personas. La casa era de propiedad de\r\n"
				+ "madame L., quien se sintió disgustada por los abusos que cometía su inquilino y ocupó\r\n"
				+ "personalmente la casa, negándose a alquilar parte alguna. La anciana señora daba señales\r\n"
				+ "de senilidad. El testigo vio a su hija unas cinco o seis veces durante esos seis años. Ambas\r\n"
				+ "llevaban una vida muy retirada y pasaban por tener dinero. Había oído decir a los vecinos\r\n"
				+ "que madame L. decía la buenaventura, pero no lo creía. Nunca vio entrar a nadie, salvo a la\r\n"
				+ "anciana y su hija, a un mozo de servicio que estuvo allí una o dos veces, y a un médico que\r\n"
				+ "hizo ocho o diez visitas.\r\n"
				+ "\t»Muchos otros vecinos han proporcionado testimonios coincidentes. No se ha hablado\r\n"
				+ "de nadie que frecuentara la casa. Se ignora si madame L. y su hija tenían parientes vivos.\r\n"
				+ "Pocas veces se abrían las persianas de las ventanas delanteras. Las de la parte posterior\r\n"
				+ "estaban siempre cerradas, salvo las de la gran habitación en la parte trasera del cuarto piso.\r\n"
				+ "La casa se hallaba en excelente estado y no era muy antigua.\n");
		this.declaracion
				.add("\t»Isidore Muset, gendarme, declara que fue llamado hacia las tres de la mañana y que, al\r\n"
						+ "llegar a la casa, encontró a unas veinte o treinta personas reunidas que se esforzaban por\r\n"
						+ "entrar. Violentó finalmente la entrada (con una bayoneta y no con una ganzúa). No le costó\r\n"
						+ "mucho abrirla, pues se trataba de una puerta de dos batientes que no tenía pasadores ni\r\n"
						+ "arriba ni abajo. Los alaridos continuaron hasta que se abrió la puerta, cesando luego de\r\n"
						+ "golpe. Parecían gritos de persona (o personas) que sufrieran los más agudos dolores; eran\r\n"
						+ "gritos agudos y prolongados, no breves y precipitados. El testigo trepó el primero las\r\n"
						+ "escaleras. Al llegar al primer descanso oyó dos voces que discutían con fuerza y\r\n"
						+ "agriamente; una de ellas era ruda y la otra mucho más aguda y muy extraña. Pudo entender\r\n"
						+ "algunas palabras provenientes de la primera voz, que correspondía a un francés. Estaba\r\n"
						+ "seguro de que no se trataba de una voz de mujer. Pudo distinguir las palabras sacré y\r\n"
						+ "diable. La voz más aguda era de un extranjero. No podría asegurar si se trataba de un\r\n"
						+ "hombre o una mujer. No entendió lo que decía, pero tenía la impresión de que hablaba en\r\n"
						+ "español. El estado de la habitación y de los cadáveres fue descrito por el testigo en la\r\n"
						+ "misma forma que lo hicimos ayer.\n");
		this.declaracion
				.add("\t»Henri Duval, vecino, de profesión platero, declara que formaba parte del primer grupo\r\n"
						+ "que entró en la casa. Corrobora en general la declaración de Muset. Tan pronto forzaron la\r\n"
						+ "puerta, volvieron a cerrarla para mantener alejada a la muchedumbre, que, pese a lo\r\n"
						+ "avanzado de la hora, se estaba reuniendo rápidamente. El testigo piensa que la voz más\r\n"
						+ "aguda pertenecía a un italiano. Está seguro de que no se trataba de un francés. No puede\r\n"
						+ "asegurar que se tratara de una voz masculina. Pudo ser la de una mujer. No está\r\n"
						+ "familiarizado con la lengua italiana. No alcanzó a distinguir las palabras, pero por la\r\n"
						+ "entonación está convencido de que quien hablaba era italiano. Conocía a madame L. y a su\r\n"
						+ "hija. Había conversado frecuentemente con ellas. Estaba seguro de que la voz aguda no\r\n"
						+ "pertenecía a ninguna de las difuntas.\n");
		this.declaracion.add("\t»Odenheimer, restaurateur. Este testigo se ofreció voluntariamente a declarar. Como\r\n"
				+ "no habla francés, testimonió mediante un intérprete. Es originario de Amsterdam. Pasaba\r\n"
				+ "frente a la casa cuando se oyeron los gritos. Duraron varios minutos, probablemente diez.\r\n"
				+ "Eran prolongados y agudos, tan horribles como penosos de oír. El testigo fue uno de los\r\n"
				+ "que entraron en el edificio. Corroboró las declaraciones anteriores en todos sus detalles,\r\n"
				+ "salvo uno. Estaba seguro de que la voz más aguda pertenecía a un hombre y que se trataba\r\n"
				+ "de un francés. No pudo distinguir las palabras pronunciadas. Eran fuertes y precipitadas,\r\n"
				+ "desiguales y pronunciadas aparentemente con tanto miedo como cólera. La voz era áspera;\r\n"
				+ "no tanto aguda como áspera. El testigo no la calificaría de aguda. La voz más gruesa dijo\r\n"
				+ "varias veces: sacré, diable, y una vez Mon Dieu!\n");
		this.declaracion.add("\t»Jules Mignaud, banquero, de la firma Mignaud e hijos, en la calle Deloraine. Es el\r\n"
				+ "mayor de los Mignaud. Madame L’Espanaye poseía algunos bienes. Había abierto una\r\n"
				+ "cuenta en su banco durante la primavera del año 18... (ocho años antes). Hacía frecuentes\r\n"
				+ "depósitos de pequeñas sumas. No había retirado nada hasta tres días antes de su muerte, en\r\n"
				+ "que personalmente extrajo la suma de 4.000 francos. La suma le fue pagada en oro y un\r\n"
				+ "empleado la llevó a su domicilio.\n");
		this.declaracion.add("\t»Adolphe Lebon, empleado de Mignaud e hijos, declara que el día en cuestión\r\n"
				+ "acompañó hasta su residencia a madame L’Espanaye, llevando los 4.000 francos en dos\r\n"
				+ "sacos. Una vez abierta la puerta, mademoiselle L. vino a tomar uno de los sacos, mientras la\r\n"
				+ "anciana señora se encargaba del otro. Por su parte, el testigo saludó y se retiró. No vio a\r\n"
				+ "persona alguna en la calle en ese momento. Se trata de una calle poco importante, muy\r\n"
				+ "solitaria.\n");
		this.declaracion
				.add("\t»William Bird, sastre, declara que formaba parte del grupo que entró en la casa. Es de\r\n"
						+ "nacionalidad inglesa. Lleva dos años de residencia en París. Fue uno de los primeros en\r\n"
						+ "subir las escaleras. Oyó voces que disputaban. La más ruda era la de un francés. Pudo\r\n"
						+ "distinguir varias palabras, pero ya no las recuerda todas. Oyó claramente: sacré y mon\r\n"
						+ "Dieu. En ese momento se oía un ruido como si varias personas estuvieran luchando, era un\r\n"
						+ "sonido de forcejeo, como si algo fuese arrastrado. La voz aguda era muy fuerte, mucho más\r\n"
						+ "que la voz ruda. Está seguro de que no se trataba de la voz de un inglés. Parecía la de un\r\n"
						+ "alemán. Podía ser una voz de mujer. El testigo no comprende el alemán.\r\n"
						+ "\t»Cuatro de los testigos nombrados más arriba fueron nuevamente interrogados,\r\n"
						+ "declarando que la puerta del aposento donde se encontró el cadáver de mademoiselle L.\r\n"
						+ "estaba cerrada por dentro cuando llegaron hasta ella. Reinaba un profundo silencio; no se\r\n"
						+ "escuchaban quejidos ni rumores de ninguna especie. No se vio a nadie en el momento de\r\n"
						+ "forzar la puerta. Las ventanas, tanto de la habitación del frente como de la trasera, estaban\r\n"
						+ "cerradas y firmemente aseguradas por dentro. Entre ambas habitaciones había una puerta\r\n"
						+ "cerrada, pero la llave no estaba echada. La puerta que comunicaba la habitación del frente\r\n"
						+ "con el corredor había sido cerrada con llave por dentro. Un cuarto pequeño situado en el\r\n"
						+ "frente del cuarto piso, al comienzo del corredor, apareció abierto, con la puerta entornada.\r\n"
						+ "La habitación estaba llena de camas viejas, cajones y objetos por el estilo. Se procedió a\r\n"
						+ "revisarlos uno por uno, no se dejó sin examinar una sola pulgada de la casa. Se enviaron\r\n"
						+ "deshollinadores para que exploraran las chimeneas. La casa tiene cuatro pisos, con\r\n"
						+ "mansardes. Una trampa que da al techo estaba firmemente asegurada con clavos y no\r\n"
						+ "parece haber sido abierta durante años. Los testigos no están de acuerdo sobre el tiempo\r\n"
						+ "transcurrido entre el momento en que escucharon las voces que disputaban y la apertura de\r\n"
						+ "la puerta de la habitación. Algunos sostienen que transcurrieron tres minutos; otros calculan\r\n"
						+ "cinco. Costó mucho violentar la puerta.\n");
		this.declaracion.add("\t»Alfonso Garcio, empresario de pompas fúnebres, habita en la rue Morgue. Es de\r\n"
				+ "nacionalidad española. Formaba parte del grupo que entró en la casa. No subió las\r\n"
				+ "escaleras. Tiene los nervios delicados y teme las consecuencias de toda agitación. Oyó las\r\n"
				+ "voces que disputaban. La más ruda pertenecía a un francés. No pudo comprender lo que\r\n"
				+ "decía. La voz aguda era la de un inglés; está seguro de esto. No comprende el inglés, pero\r\n"
				+ "juzga basándose en la entonación.\n");
		this.declaracion
				.add("\t»Alberto Montani, confitero, declara que fue de los primeros en subir las escaleras. Oyó\r\n"
						+ "las voces en cuestión. la voz ruda era la de un francés. Pudo distinguir varias palabras. El\r\n"
						+ "que hablaba parecía reprochar alguna cosa. No pudo comprender las palabras dichas por la\r\n"
						+ "voz más aguda, que hablaba rápida y desigualmente. Piensa que se trata de un ruso.\r\n"
						+ "Corrobora los testimonios restantes. Es de nacionalidad italiana. Nunca habló con un nativo\r\n"
						+ "de Rusia.\r\n"
						+ "\t»Nuevamente interrogados, varios testigos certificaron que las chimeneas de todas las\r\n"
						+ "habitaciones eran demasiado angostas para admitir el paso de un ser humano. Se pasaron\r\n"
						+ "“deshollinadores” —cepillos cilíndricos como los que usan los que limpian chimeneas—\r\n"
						+ "por todos los tubos existentes en la casa. No existe ningún pasaje en los fondos por el cual\r\n"
						+ "alguien hubiera podido descender mientras el grupo subía las escaleras. El cuerpo de\r\n"
						+ "mademoiselle L’Espanaye estaba tan firmemente encajado en la chimenea, que no pudo ser\r\n"
						+ "extraído hasta que cuatro o cinco personas unieron sus esfuerzos.\n");
		this.declaracion.add("\t»Paul Dumas, médico, declara que fue llamado al amanecer para examinar los\r\n"
				+ "cadáveres de las víctimas. Los mismos habían sido colocados sobre el colchón del lecho\r\n"
				+ "correspondiente a la habitación donde se encontró a mademoiselle L. El cuerpo de la joven\r\n"
				+ "aparecía lleno de contusiones y excoriaciones. El hecho de que hubiese sido metido en la\r\n"
				+ "chimenea bastaba para explicar tales marcas. La garganta estaba enormemente excoriada.\r\n"
				+ "Varios profundos arañazos aparecían debajo del mentón, conjuntamente con una serie de\r\n"
				+ "manchas lívidas resultantes, con toda evidencia, de la presión de unos dedos. El rostro\r\n"
				+ "estaba horriblemente pálido y los ojos se salían de las órbitas. La lengua aparecía a medias\r\n"
				+ "cortada. En la región del estómago se descubrió una gran contusión, producida,\r\n"
				+ "aparentemente, por la presión de una rodilla. Según opinión del doctor Dumas,\r\n"
				+ "mademoiselle L’Espanaye había sido estrangulada por una o varias personas.\r\n"
				+ "\t»El cuerpo de la madre estaba horriblemente mutilado. Todos los huesos de la pierna y\r\n"
				+ "el brazo derechos se hallaban fracturados en mayor o menor grado. La tibia izquierda había\r\n"
				+ "quedado reducida a astillas, así como todas las costillas del lado izquierdo. El cuerpo\r\n"
				+ "aparecía cubierto de contusiones y estaba descolorido. Resultaba imposible precisar el arma\r\n"
				+ "con que se habían inferido tales heridas. Un pesado garrote de mano, o una ancha barra de\r\n"
				+ "hierro, quizá una silla, cualquier arma grande, pesada y contundente, en manos de un\r\n"
				+ "hombre sumamente robusto, podía haber producido esos resultados. Imposible que una\r\n"
				+ "mujer pudiera infligir tales heridas con cualquier arma que fuese. La cabeza de la difunta\r\n"
				+ "aparecía separada del cuerpo y, al igual que el resto, terriblemente contusa. Era evidente\r\n"
				+ "que la garganta había sido seccionada con un instrumento muy afilado, probablemente una\r\n"
				+ "navaja.\n");
		this.declaracion.add("\t»Alexandre Etienne, cirujano, fue llamado al mismo tiempo que el doctor Dumas para\r\n"
				+ "examinar los cuerpos. Confirmó el testimonio y las opiniones de este último.\n");

		this.parrafo.add("\tLa edición vespertina del diario declaraba que en el quartier Saint-Roch reinaba una\r\n"
				+ "intensa excitación, que se había practicado un nuevo y minucioso examen del lugar del\r\n"
				+ "hecho, mientras se interrogaba a nuevos testigos, pero que no se sabía nada nuevo. Un\r\n"
				+ "párrafo final agregaba, sin embargo, que un tal Adolphe Lebon acababa de ser arrestado y\r\n"
				+ "encarcelado, aunque nada parecía acusarlo, a juzgar por los hechos detallados.\r\n"
				+ "\tDupin se mostraba singularmente interesado en el desarrollo del asunto; o por lo menos\r\n"
				+ "así me pareció por sus maneras, pues no hizo el menor comentario. Tan sólo después de\r\n"
				+ "haberse anunciado el arresto de Lebon me pidió mi parecer acerca de los asesinatos.\r\n"
				+ "\tNo pude sino sumarme al de todo París y declarar que los consideraba un misterio\r\n"
				+ "insoluble. No veía modo alguno de seguir el rastro al asesino.\n");
		this.parrafo.add("\t—No debemos pensar en los modos posibles que surgen de una investigación tan\r\n"
				+ "rudimentaria —dijo Dupin—. La policía parisiense, tan alabada por su penetración, es muy\r\n"
				+ "astuta pero nada más. No procede con método, salvo el del momento. Toma muchas\r\n"
				+ "disposiciones ostentosas, pero con frecuencia éstas se hallan tan mal adaptadas a su\r\n"
				+ "objetivo que recuerdan a Monsieur Jourdain, que pedía sa robe de chambre... pour mieux\r\n"
				+ "entendre la musique. Los resultados obtenidos son con frecuencia sorprendentes, pero en su\r\n"
				+ "mayoría se logran por simple diligencia y actividad. Cuando éstas son insuficientes, todos\r\n"
				+ "sus planes fracasan. Vidocq, por ejemplo, era hombre de excelentes conjeturas y\r\n"
				+ "perseverante. Pero como su pensamiento carecía de suficiente educación, erraba\r\n"
				+ "continuamente por el excesivo ardor de sus investigaciones. Dañaba su visión por mirar el\r\n"
				+ "objeto desde demasiado cerca. Quizá alcanzaba a ver uno o dos puntos con singular\r\n"
				+ "acuidad, pero procediendo así perdía el conjunto de la cuestión. En el fondo se trataba de un\r\n"
				+ "exceso de profundidad, y la verdad no siempre está dentro de un pozo. Por el contrario,\r\n"
				+ "creo que, en lo que se refiere al conocimiento más importante, es invariablemente\r\n"
				+ "superficial. La profundidad corresponde a los valles, donde la buscamos, y no a las cimas\r\n"
				+ "montañosas, donde se la encuentra. Las formas y fuentes de este tipo de error se\r\n"
				+ "ejemplifican muy bien en la contemplación de los cuerpos celestes. Si se observa una\r\n"
				+ "estrella de una ojeada, oblicuamente, volviendo hacia ella la porción exterior de la retina\r\n"
				+ "(mucho más sensible a las impresiones luminosas débiles que la parte interior), se verá la\r\n"
				+ "estrella con claridad y se apreciará plenamente su brillo, el cual se empaña apenas la\r\n"
				+ "contemplamos de lleno. Es verdad que en este último caso llegan a nuestros ojos mayor\r\n"
				+ "cantidad de rayos, pero la porción exterior posee una capacidad de recepción mucho más\r\n"
				+ "refinada. Por causa de una indebida profundidad confundimos y debilitamos el\r\n"
				+ "pensamiento, y Venus misma puede llegar a borrarse del firmamento si la escrutamos de\r\n"
				+ "manera demasiado sostenida, demasiado concentrada o directa.\n");
		this.parrafo.add("\t»En cuanto a esos asesinatos, procedamos personalmente a un examen antes de\r\n"
				+ "formarnos una opinión. La encuesta nos servirá de entretenimiento (me pareció que el\r\n"
				+ "término era extraño, aplicado al caso, pero no dije nada). Además, Lebon me prestó cierta\r\n"
				+ "vez un servicio por el cual le estoy agradecido. Iremos a estudiar el terreno con nuestros\r\n"
				+ "propios ojos. Conozco a G..., el prefecto de policía, y no habrá dificultad en obtener el\r\n"
				+ "permiso necesario.\n");
		this.parrafo.add("La autorización fue acordada, y nos encaminamos inmediatamente a la rue Morgue. Se\r\n"
				+ "trata de uno de esos míseros pasajes que corren entre la rue Richelieu y la rue Saint-Roch.\r\n"
				+ "Atardecía cuando llegamos, pues el barrio estaba considerablemente distanciado del de\r\n"
				+ "nuestra residencia. Encontramos fácilmente la casa, ya que aún había varias personas\r\n"
				+ "mirando las persianas cerradas desde la acera opuesta. Era una típica casa parisiense, con\r\n"
				+ "una puerta de entrada y una casilla de cristales con ventana corrediza, correspondiente a la\r\n"
				+ "loge du concierge. Antes de entrar recorrimos la calle, doblamos por un pasaje y, volviendo\r\n"
				+ "a doblar, pasamos por la parte trasera del edificio, mientras Dupin -examinaba- la entera\r\n"
				+ "vecindad, así como la casa, con una atención minuciosa cuyo objeto me resultaba imposible\r\n"
				+ "de adivinar.");
		this.parrafo.add("\tVolviendo sobre nuestros pasos retornamos a la parte delantera y, luego de llamar y\r\n"
				+ "mostrar nuestras credenciales, fuimos admitidos por los agentes de guardia. Subimos las\r\n"
				+ "escaleras, hasta llegar a la habitación donde se había encontrado el cuerpo de mademoiselle\r\n"
				+ "L’Espanaye y donde aún yacían ambas víctimas. Como es natural, el desorden del aposento\r\n"
				+ "había sido respetado. No vi nada que no estuviese detallado en la Gazette des Tribunaux.\r\n"
				+ "Dupin lo inspeccionaba todo, sin exceptuar los cuerpos de las víctimas. Pasamos luego a las\r\n"
				+ "otras habitaciones y al patio; un gendarme nos acompañaba a todas partes. El examen nos\r\n"
				+ "tuvo ocupados hasta que oscureció, y era de noche cuando salimos. En el camino de vuelta,\r\n"
				+ "mi amigo se detuvo algunos minutos en las oficinas de uno de los diarios parisienses.\n");
		this.parrafo.add("\tHe dicho ya que sus caprichos eran muchos y variados, y que je les ménageais (pues no\r\n"
				+ "hay traducción posible de la frase). En esta oportunidad Dupin rehusó toda conversación\r\n"
				+ "vinculada con los asesinatos, hasta el día siguiente a mediodía. Entonces, súbitamente, me\r\n"
				+ "preguntó si había observado alguna cosa -peculiar- en el escenario de aquellas atrocidades.\n");
		this.parrafo.add("\t—Me temo —repuso Dupin— que la Gazette no haya penetrado en el insólito horror de\r\n"
				+ "este asunto. Pero dejemos de lado las vanas opiniones de ese diario. Tengo la impresión de\r\n"
				+ "que se considera insoluble este misterio por las mismísimas razones que deberían inducir a\r\n"
				+ "considerarlo fácilmente solucionable; me refiero a lo excesivo, a lo outré de sus\r\n"
				+ "características. La policía se muestra confundida por la aparente falta de móvil, y no por el\r\n"
				+ "asesinato en sí, sino por su atrocidad. Está asimismo perpleja por la aparente imposibilidad\r\n"
				+ "de conciliar las voces que se oyeron disputando, con el hecho de que en lo alto sólo se\r\n"
				+ "encontró a la difunta mademoiselle L’Espanaye, aparte de que era imposible escapar de la\r\n"
				+ "casa sin que el grupo que ascendía la escalera lo notara. El salvaje desorden del aposento; el\r\n"
				+ "cadáver metido, cabeza abajo, en la chimenea; la espantosa mutilación del cuerpo de la\r\n"
				+ "anciana, son elementos que, junto con los ya mencionados y otros que no necesito\r\n"
				+ "mencionar, han bastado para paralizar la acción de los investigadores policiales y confundir\r\n"
				+ "por completo su tan alabada perspicacia. Han caído en el grueso pero común error de\r\n"
				+ "confundir lo insólito con lo abstruso. Pero, justamente a través de esas desviaciones del\r\n"
				+ "plano ordinario de las cosas, la razón se abrirá paso, si ello es posible, en la búsqueda de la\r\n"
				+ "verdad. En investigaciones como la que ahora efectuamos no debería preguntarse tanto\r\n"
				+ "«qué ha ocurrido», como «qué hay en lo ocurrido que no se parezca a nada ocurrido\r\n"
				+ "anteriormente». En una palabra, la facilidad con la cual llegaré o he llegado a la solución de\r\n"
				+ "este misterio se halla en razón directa de su aparente insolubilidad a ojos de la policía.\n");
		this.parrafo.add("\tMe quedé mirando a mi amigo con silenciosa estupefacción.\r\n"
				+ "\t—Estoy esperando ahora —continuó Dupin, mirando hacia la puerta de nuestra\r\n"
				+ "habitación— a alguien que, si bien no es el perpetrador de esas carnicerías, debe de haberse\r\n"
				+ "visto envuelto de alguna manera en su ejecución. Es probable que sea inocente de la parte\r\n"
				+ "más horrible de los crímenes. Confío en que mi suposición sea acertada, pues en ella se\r\n"
				+ "apoya toda mi esperanza de descifrar completamente el enigma. Espero la llegada de ese\r\n"
				+ "hombre en cualquier momento... y en esta habitación. Cierto que puede no venir, pero lo\r\n"
				+ "más probable es que llegue. Si así fuera, habrá que retenerlo. He ahí unas pistolas; los dos\r\n"
				+ "sabemos lo que se puede hacer con ellas cuando la ocasión se presenta.\n");
		this.parrafo.add("\tTomé las pistolas, sabiendo apenas lo que hacía y, sin poder creer lo que estaba\r\n" + 
				"oyendo, mientras Dupin, como si monologara, continuaba sus reflexiones. Ya he\r\n" + 
				"mencionado su actitud abstraída en esos momentos. Sus palabras se dirigían a mí, pero su\r\n" + 
				"voz, aunque no era forzada, tenía esa entonación que se emplea habitualmente para dirigirse\r\n" + 
				"a alguien que se halla muy lejos. Sus ojos, privados de expresión, sólo miraban la pared.\n");
		this.parrafo.add("\t—Las voces que disputaban y fueron oídas por el grupo que trepaba la escalera —\r\n" + 
				"dijo— no eran las de las dos mujeres, como ha sido bien probado por los testigos. Con esto\r\n" + 
				"queda eliminada toda posibilidad de que la anciana señora haya matado a su hija,\r\n" + 
				"suicidándose posteriormente. Menciono esto por razones metódicas, ya que la fuerza de\r\n" + 
				"madame de L’Espanaye hubiera sido por completo insuficiente para introducir el cuerpo de\r\n" + 
				"su hija en la chimenea, tal como fue encontrado, amén de que la naturaleza de las heridas\r\n" + 
				"observadas en su cadáver excluye toda idea de suicidio. El asesinato, pues, fue cometido\r\n" + 
				"por terceros, y a éstos pertenecían las voces que se escucharon mientras disputaban.\r\n" + 
				"Permítame ahora llamarle la atención, no sobre las declaraciones referentes a dichas voces,\r\n" + 
				"sino a algo -peculiar- en esas declaraciones. ¿No lo advirtió usted?\n");
		this.parrafo.add("\t—Tal es el testimonio en sí —dijo Dupin—, pero no su peculiaridad. Usted no ha\r\n" + 
				"observado nada característico. Y, sin embargo, había algo que observar. Como bien ha\r\n" + 
				"dicho, los testigos coinciden sobre la voz ruda. Pero, con respecto a la voz aguda, la\r\n" + 
				"peculiaridad no consiste en que estén en desacuerdo, sino en que un italiano, un inglés, un\r\n" + 
				"español, un holandés y un francés han tratado de describirla, y cada uno de ellos se ha\r\n" + 
				"referido a una voz extranjera. Cada uno de ellos está seguro de que no se trata de la voz de\r\n" + 
				"un compatriota. Cada uno la vincula, no a la voz de una persona perteneciente a una nación\r\n" + 
				"cuyo idioma conoce, sino a la inversa. El francés supone que es la voz de un español, y\r\n" + 
				"agrega que “podría haber distinguido algunas palabras sí hubiera sabido español”. El\r\n" + 
				"holandés sostiene que se trata de un francés, pero nos enteramos de que como no habla\r\n" + 
				"francés, testimonió mediante un intérprete. El inglés piensa que se trata de la voz de un\r\n" + 
				"alemán, pero el testigo no comprende el alemán. El español “está seguro” de que se trata de\r\n" + 
				"un inglés, pero “juzga basándose en la entonación”, ya que no comprende el inglés. El\r\n" + 
				"italiano cree que es la voz de un ruso, pero nunca habló con un nativo de Rusia. Un\r\n" + 
				"segundo testigo francés difiere del primero y está seguro de que se trata de la voz de un\r\n" + 
				"italiano. No está familiarizado con la lengua italiana, pero al igual que el español, “está\r\n" + 
				"convencido por la entonación”. Ahora bien: ¡cuan extrañamente insólita tiene que haber\r\n" + 
				"sido esa voz para que pudieran reunirse semejantes testimonios! ¡Una voz en cuyos tonos\r\n" + 
				"los ciudadanos de las cinco grandes divisiones de Europa no pudieran reconocer nada\r\n" + 
				"familiar! Me dirá usted que podía tratarse de la voz de un asiático o un africano. Ni unos ni\r\n" + 
				"otros abundan en París, pero, sin negar esa posibilidad, me limitaré a llamarle la atención\r\n" + 
				"sobre tres puntos. Un testigo califica la voz de “áspera, más que aguda”. Otros dos señalan\r\n" + 
				"que era «precipitada y desigual». Ninguno de los testigos se refirió a palabras reconocibles,\r\n" + 
				"a sonidos que parecieran palabras.\n");
		this.parrafo.add("\t»No sé —continuó Dupin— la impresión que pudo haber causado hasta ahora en su\r\n" + 
				"entendimiento, pero no vacilo en decir que cabe extraer deducciones legítimas de esta parte\r\n" + 
				"del testimonio —la que se refiere a las voces ruda y aguda—, suficientes para crear una\r\n" + 
				"sospecha que debe de orientar todos los pasos futuros de la investigación del misterio. Digo\r\n" + 
				"«deducciones legítimas», sin expresar plenamente lo que pienso. Quiero dar a entender que\r\n" + 
				"las deducciones son las únicas que corresponden, y que la sospecha surge inevitablemente\r\n" + 
				"como resultado de las mismas. No le diré todavía cuál es esta sospecha. Pero tenga presente\r\n" + 
				"que, por lo que a mí se refiere, bastó para dar forma definida y tendencia determinada a mis\r\n" + 
				"investigaciones en el lugar del hecho.\n");
		this.parrafo.add("\t«Transportémonos ahora con la fantasía a esa habitación. ¿Qué buscaremos en primer\r\n" + 
				"lugar? Los medios de evasión empleados por los asesinos. Supongo que bien puedo decir\r\n" + 
				"que ninguno de los dos cree en acontecimientos sobrenaturales. Madame y mademoiselle\r\n" + 
				"L’Espanaye no fueron asesinadas por espíritus. Los autores del hecho eran de carne y\r\n" + 
				"hueso, y escaparon por medios materiales. ¿Cómo, pues? Afortunadamente, sólo hay una\r\n" + 
				"manera de razonar sobre este punto, y esa manera debe conducirnos a una conclusión\r\n" + 
				"definida. Examinemos uno por uno los posibles medios de escape. Resulta evidente que los\r\n" + 
				"asesinos se hallaban en el cuarto donde se encontró a mademoiselle L’Espanaye, o por lo\r\n" + 
				"menos en la pieza contigua, en momentos en que el grupo subía las escaleras. Vale decir\r\n" + 
				"que debemos buscar las salidas en esos dos aposentos. La policía ha levantado los pisos, los\r\n" + 
				"techos y la mampostería de las paredes en todas direcciones. Ninguna salida secreta pudo\r\n" + 
				"escapar a sus observaciones. Pero como no me fío de sus ojos, miré el lugar con los míos.\r\n" + 
				"Efectivamente, no había salidas secretas. Las dos puertas que comunican las habitaciones\r\n" + 
				"con el corredor estaban bien cerradas, con las llaves por dentro. Veamos ahora las\r\n" + 
				"chimeneas. Aunque de diámetro ordinario en los primeros ocho o diez pies por encima de\r\n" + 
				"los hogares, los tubos no permitirían más arriba el paso del cuerpo de un gato grande.\r\n" + 
				"Quedando así establecida la total imposibilidad de escape por las vías mencionadas nos\r\n" + 
				"vemos reducidos a las ventanas. Nadie podría haber huido por la del cuarto delantero, ya\r\n" + 
				"que la muchedumbre reunida lo hubiese visto. Los asesinos tienen que haber pasado, pues,\r\n" + 
				"por las de la pieza trasera. Llevados a esta conclusión de manera tan inequívoca, no nos\r\n" + 
				"corresponde, en nuestra calidad de razonadores, rechazarla por su aparente imposibilidad.\r\n" + 
				"Lo único que cabe hacer es probar que esas aparentes “imposibilidades” no son tales en\r\n" + 
				"realidad.\n");
		this.parrafo.add("\t»Hay dos ventanas en el aposento. Contra una de ellas no hay ningún mueble que la\r\n" + 
				"obstruya, y es claramente visible. La porción inferior de la otra queda oculta por la cabecera\r\n" + 
				"del pesado lecho, que ha sido arrimado a ella. La primera ventana apareció firmemente\r\n" + 
				"asegurada desde dentro. Resistió los más violentos esfuerzos de quienes trataron de\r\n" + 
				"levantarla. En el marco, a la izquierda, había una gran perforación de barreno, y en ella un\r\n" + 
				"solidísimo clavo hundido casi hasta la cabeza. Al examinar la otra ventana se vio que había\r\n" + 
				"un clavo colocado en forma similar; todos los esfuerzos por levantarla fueron igualmente\r\n" + 
				"inútiles. La policía, pues, se sintió plenamente segura de que la huida no se había producido\r\n" + 
				"por ese lado. Y, por tanto, consideró superfluo extraer los clavos y abrir las ventanas.\n");
		this.parrafo.add("\t»Mi examen fue algo más detallado, y eso por la razón que acabo de darle: allí era el\r\n" + 
				"caso de probar que todas las aparentes imposibilidades no eran tales en realidad.\r\n" + 
				"\t«Seguí razonando en la siguiente forma... a posteriori. Los asesinos escaparon desde\r\n" + 
				"una de esas ventanas. Por tanto, no pudieron asegurar nuevamente los marcos desde el\r\n" + 
				"interior, tal como fueron encontrados (consideración que, dado lo obvio de su carácter,\r\n" + 
				"interrumpió la búsqueda de la policía en ese terreno). Los marcos estaban asegurados. Es\r\n" + 
				"necesario, pues, que tengan una manera de asegurarse por sí mismos. La conclusión no\r\n" + 
				"admitía escapatoria. Me acerqué a la ventana que tenía libre acceso, extraje con alguna\r\n" + 
				"dificultad el clavo y traté de levantar el marco. Tal como lo había anticipado, resistió a\r\n" + 
				"todos mis esfuerzos. Comprendí entonces que debía de haber algún resorte oculto, y la\r\n" + 
				"corroboración de esta idea me convenció de que por lo menos mis premisas eran correctas,\r\n" + 
				"aunque el detalle referente a los clavos continuara siendo misterioso. Un examen detallado\r\n" + 
				"no tardó en revelarme el resorte secreto. Lo oprimí y, satisfecho de mi descubrimiento, me\r\n" + 
				"abstuve de levantar el marco.\n");
		this.parrafo.add("\t»Volví a poner el clavo en su sitio y lo observé atentamente. Una persona que escapa\r\n" + 
				"por la ventana podía haberla cerrado nuevamente, y el resorte habría asegurado el marco.\r\n" + 
				"Pero, ¿cómo reponer el clavo? La conclusión era evidente y estrechaba una vez más el\r\n" + 
				"campo de mis investigaciones. Los asesinos tenían que haber escapado por la otra ventana.\r\n" + 
				"Suponiendo, pues, que los resortes fueran idénticos en las dos ventanas, como parecía\r\n" + 
				"probable, necesariamente tenía que haber una diferencia entre los clavos, o por lo menos en\r\n" + 
				"su manera de estar colocados. Trepando al armazón de la cama, miré minuciosamente el\r\n" + 
				"marco de sostén de la segunda ventana. Pasé la mano por la parte posterior, descubriendo\r\n" + 
				"en seguida el resorte que, tal como había supuesto, era idéntico a su vecino. Miré luego el\r\n" + 
				"clavo. Era tan sólido como el otro y aparentemente estaba fijo de la misma manera y\r\n" + 
				"hundido casi hasta la cabeza.\n");
		this.parrafo.add("\t»Pensará usted que me sentí perplejo, pero si así fuera no ha comprendido la naturaleza\r\n" + 
				"de mis inducciones. Para usar una frase deportiva, hasta entonces no había cometido falta.\r\n" + 
				"No había perdido la pista un solo instante. Los eslabones de la cadena no tenían ninguna\r\n" + 
				"falla. Había perseguido el secreto hasta su última conclusión: y esa conclusión era el clavo.\r\n" + 
				"Ya he dicho que tenía todas las apariencias de su vecino de la otra ventana; pero el hecho,\r\n" + 
				"por más concluyente que pareciera, resultaba de una absoluta nulidad comparado con la\r\n" + 
				"consideración de que allí, en ese punto, se acababa el hilo conductor. “Tiene que haber algo\r\n" + 
				"defectuoso en el clavo”, pensé. Al tocarlo, su cabeza quedó entre mis dedos juntamente con\r\n" + 
				"un cuarto de pulgada de la espiga. El resto de la espiga se hallaba dentro del agujero, donde\r\n" + 
				"se había roto. La fractura era muy antigua, pues los bordes aparecían herrumbrados, y\r\n" + 
				"parecía haber sido hecho de un martillazo, que había hundido parcialmente la cabeza del\r\n" + 
				"clavo en el marco inferior de la ventana. Volví a colocar cuidadosamente la parte de la\r\n" + 
				"cabeza en el lugar de donde la había sacado, y vi que el clavo daba la exacta impresión de\r\n" + 
				"estar entero; la fisura resultaba invisible. Apretando el resorte, levanté ligeramente el\r\n" + 
				"marco; la cabeza del clavo subió con él, sin moverse de su lecho. Cerré la ventana, y el\r\n" + 
				"clavo dio otra vez la impresión de estar dentro.\n");
		this.parrafo.add("\t»Hasta ahora, el enigma quedaba explicado. El asesino había huido por la ventana que\r\n" + 
				"daba a la cabecera del lecho. Cerrándose por sí misma (o quizá ex profeso) la ventana había\r\n" + 
				"quedado asegurada por su resorte. Y la resistencia ofrecida por éste había inducido a la\r\n" + 
				"policía a suponer que se trataba del clavo, dejando así de lado toda investigación\r\n" + 
				"suplementaria.\n");
		this.parrafo.add("\t»La segunda cuestión consiste en el modo del descenso. Mi paseo con usted por la\r\n" + 
				"parte trasera de la casa me satisfizo al respecto. A unos cinco pies y medio de la ventana en\r\n" + 
				"cuestión corre una varilla de pararrayos. Desde esa varilla hubiera resultado imposible\r\n" + 
				"alcanzar la ventana, y mucho menos introducirse por ella. Observé, sin embargo, que las\r\n" + 
				"persianas del cuarto piso pertenecen a esa curiosa especie que los carpinteros parisienses\r\n" + 
				"denominan ferrades; es un tipo rara vez empleado en la actualidad, pero que se ve con\r\n" + 
				"frecuencia en casas muy viejas de Lyon y Bordeaux. Se las fabrica como una puerta\r\n" + 
				"ordinaria (de una sola hoja, y no de doble batiente), con la diferencia de que la parte\r\n" + 
				"inferior tiene celosías o tablillas que ofrecen excelente asidero para las manos. En este caso\r\n" + 
				"las persianas alcanzan un ancho de tres pies y medio. Cuando las vimos desde la parte\r\n" + 
				"posterior de la casa, ambas estaban entornadas, es decir, en ángulo recto con relación a la\r\n" + 
				"pared. Es probable que también los policías hayan examinado los fondos del edificio; pero,\r\n" + 
				"si así lo hicieron, miraron las ferrades en el ángulo indicado, sin darse cuenta de su gran\r\n" + 
				"anchura; por lo menos no la tomaron en cuenta. Sin duda, seguros de que por esa parte era\r\n" + 
				"imposible toda fuga, se limitaron a un examen muy sumario. Para mí, sin embargo, era\r\n" + 
				"claro que si se abría del todo la persiana correspondiente a la ventana situada sobre el lecho,\r\n" + 
				"su borde quedaría a unos dos pies de la varilla del pararrayos. También era evidente que,\r\n" + 
				"desplegando tanta agilidad como coraje, se podía llegar hasta la ventana trepando por la\r\n" + 
				"varilla. Estirándose hasta una distancia de dos pies y medio (ya que suponemos la persiana\r\n" + 
				"enteramente abierta), un ladrón habría podido sujetarse firmemente de las tablillas de la\r\n" + 
				"celosía. Abandonando entonces su sostén en la varilla, afirmando los pies en la pared y\r\n" + 
				"lanzándose vigorosamente hacia adelante habría podido hacer girar la persiana hasta que se\r\n" + 
				"cerrara; si suponemos que la ventana estaba abierta en este momento, habría logrado entrar\r\n" + 
				"así en la habitación.\n");
		this.parrafo.add("\t»Le pido que tenga especialmente en cuenta que me refiero a un insólito grado de\r\n" + 
				"vigor, capaz de llevar a cabo una hazaña tan azarosa y difícil. Mi intención consiste en\r\n" + 
				"demostrarle, primeramente, que el hecho pudo ser llevado a cabo; pero, en segundo lugar, y\r\n" + 
				"muy especialmente, insisto en llamar su atención sobre el carácter extraordinario, casi\r\n" + 
				"sobrenatural, de ese vigor capaz de cosa semejante.\r\n" + 
				"\t»Usando términos judiciales, usted me dirá sin duda que para «redondear mi caso»\r\n" + 
				"debería subestimar y no poner de tal modo en evidencia la agilidad que se requiere para\r\n" + 
				"dicha proeza. Pero la práctica de los tribunales no es la de la razón. Mi objetivo final es tan\r\n" + 
				"sólo la verdad. Y mi propósito inmediato consiste en inducirlo a que yuxtaponga la insólita\r\n" + 
				"agilidad que he mencionado a esa voz tan extrañamente aguda (o áspera) y desigual sobre\r\n" + 
				"cuya nacionalidad no pudieron ponerse de acuerdo los testigos y en cuyos acentos no se\r\n" + 
				"logró distinguir ningún -vocablo articulado-.\n");
		this.parrafo.add("\t—Habrá notado usted —dijo— que he pasado de la cuestión de la salida de la casa a la\r\n" + 
				"del modo de entrar en ella. Era mi intención mostrar que ambas cosas se cumplieron en la\r\n" + 
				"misma forma y en el mismo lugar. Volvamos ahora al interior del cuarto y examinemos lo\r\n" + 
				"que allí aparece. Se ha dicho que los cajones de la cómoda habían sido saqueados, aunque\r\n" + 
				"quedaron en ellos numerosas prendas. Esta conclusión es absurda. No pasa de una simple\r\n" + 
				"conjetura, bastante tonta por lo demás. ¿Cómo podemos asegurar que las ropas halladas en\r\n" + 
				"los cajones no eran las que éstos contenían habitualmente? Madame L’Espanaye y su hija\r\n" + 
				"llevaban una vida muy retirada, no veían a nadie, salían raras veces, y pocas ocasiones se\r\n" + 
				"les presentaban de cambiar de tocado. Lo que se encontró en los cajones era de tan buena\r\n" + 
				"calidad como cualquiera de los efectos que poseían las damas. Si un ladrón se llevó una\r\n" + 
				"parte, ¿por qué no tomó lo mejor... por qué no se llevó todo? En una palabra: ¿por qué\r\n" + 
				"abandonó cuatro mil francos en oro, para cargarse con un hato de ropa? El oro fue\r\n" + 
				"abandonado. La suma mencionada por monsieur Mignaud, el banquero, apareció en su casi\r\n" + 
				"totalidad en los sacos tirados por el suelo. Le pido, por tanto, que descarte de sus\r\n" + 
				"pensamientos la desatinada idea de un móvil, nacida en el cerebro de los policías por esa\r\n" + 
				"parte del testimonio que se refiere al dinero entregado en la puerta de la casa. Coincidencias\r\n" + 
				"diez veces más notables que ésta (la entrega del dinero y el asesinato de sus poseedores tres\r\n" + 
				"días más tarde) ocurren a cada hora de nuestras vidas sin que nos preocupemos por ellas.\r\n" + 
				"En general, las coincidencias son grandes obstáculos en el camino de esos pensadores que\r\n" + 
				"todo lo ignoran de la teoría de las probabilidades, esa teoría a la cual los objetivos más\r\n" + 
				"eminentes de la investigación humana deben los más altos ejemplos. En esta instancia, si el\r\n" + 
				"oro hubiese sido robado, el hecho de que la suma hubiese sido entregada tres días antes\r\n" + 
				"habría constituido algo más que una coincidencia. Antes bien, hubiera corroborado la\r\n" + 
				"noción de un móvil. Pero, dadas las verdaderas circunstancias del caso, si hemos de\r\n" + 
				"suponer que el oro era el móvil del crimen, tenemos entonces que admitir que su\r\n" + 
				"perpetrador era lo bastante indeciso y lo bastante estúpido como para olvidar el oro y el\r\n" + 
				"móvil al mismo tiempo.\n");
		this.parrafo.add("\t»Teniendo, pues, presentes los puntos sobre los cuales he llamado su atención —la voz\r\n" + 
				"singular, la insólita agilidad y la sorprendente falta de móvil en un asesinato tan atroz como\r\n" + 
				"éste—, echemos una ojeada a la carnicería en sí. Estamos ante una mujer estrangulada por\r\n" + 
				"la presión de unas manos e introducida en el cañón de la chimenea con la cabeza hacia\r\n" + 
				"abajo. Los asesinos ordinarios no emplean semejantes métodos. Y mucho menos esconden\r\n" + 
				"al asesinado en esa forma. En el hecho de introducir el cadáver en la chimenea admitirá\r\n" + 
				"usted que hay algo excesivamente inmoderado, algo por completo inconciliable con\r\n" + 
				"nuestras nociones sobre los actos humanos, incluso si suponemos que su autor es el más\r\n" + 
				"depravado de los hombres. Piense, asimismo, en la fuerza prodigiosa que hizo falta para\r\n" + 
				"introducir el cuerpo hacia arriba, cuando para hacerlo descender fue necesario el concurso\r\n" + 
				"de varias personas.\n");
		this.parrafo.add("\t»Volvámonos ahora a las restantes señales que pudo dejar ese maravilloso vigor. En el\r\n" + 
				"hogar de la chimenea se hallaron espesos (muy espesos) mechones de cabello humano\r\n" + 
				"canoso. Habían sido arrancados de raíz. Bien sabe usted la fuerza que se requiere para\r\n" + 
				"arrancar en esa forma veinte o treinta cabellos. Y además vio los mechones en cuestión tan\r\n" + 
				"bien como yo. Sus raíces (cosa horrible) mostraban pedazos del cuero cabelludo, prueba\r\n" + 
				"evidente de la prodigiosa fuerza ejercida para arrancar quizá medio millón de cabellos de\r\n" + 
				"un tirón. La garganta de la anciana señora no solamente estaba cortada, sino que la cabeza\r\n" + 
				"había quedado completamente separada del cuerpo; el instrumento era una simple navaja.\r\n" + 
				"Lo invito a considerar la brutal ferocidad de estas acciones. No diré nada de las contusiones\r\n" + 
				"que presentaba el cuerpo de Madame L’Espanaye. Monsieur Dumas y su valioso ayudante,\r\n" + 
				"monsieur Etienne, han decidido que fueron producidas por un instrumento contundente, y\r\n" + 
				"hasta ahí la opinión de dichos caballeros es muy correcta. El instrumento contundente fue\r\n" + 
				"evidentemente el pavimento de piedra del patio, sobre el cual cayó la víctima desde la\r\n" + 
				"ventana que da sobre la cama. Por simple que sea, esto escapó a la policía por la misma\r\n" + 
				"razón que se les escapó el ancho de las persianas: frente a la presencia de clavos se\r\n" + 
				"quedaron ciegos ante la posibilidad de que las ventanas hubieran sido abiertas alguna vez.\n");
		this.parrafo.add("\t»Si ahora, en adición a estas cosas, ha reflexionado usted adecuadamente sobre el\r\n" + 
				"extraño desorden del aposento, hemos llegado al punto de poder combinar las nociones de\r\n" + 
				"una asombrosa agilidad, una fuerza sobrehumana, una ferocidad brutal, una carnicería sin\r\n" + 
				"motivo, una grotesquerie en el horror por completo ajeno a lo humano, y una voz de tono\r\n" + 
				"extranjero para los oídos de hombres de distintas nacionalidades y privada de todo silabeo\r\n" + 
				"inteligible. ¿Qué resultado obtenemos? ¿Qué -impresión- he producido en su imaginación?\n");
		this.parrafo.add("\t—No he dicho que lo fuera —repuso mi amigo—. Pero antes de que resolvamos este\r\n" + 
				"punto, le ruego que mire el bosquejo que he trazado en este papel. Es un facsímil de lo que\r\n" + 
				"en una parte de las declaraciones de los testigos se describió como «contusiones negruzcas,\r\n" + 
				"y profundas huellas de uñas» en la garganta de mademoiselle L’Espanaye, y en otra\r\n" + 
				"(declaración de los señores Dumas y Etienne) como «una serie de manchas lívidas que,\r\n" + 
				"evidentemente, resultaban de la presión de unos dedos».\r\n" + 
				"\t«Notará usted —continuó mi amigo, mientras desplegaba el papel— que este diseño\r\n" + 
				"indica una presión firme y fija. No hay señal alguna de deslizamiento. Cada dedo mantuvo\r\n" + 
				"(probablemente hasta la muerte de la víctima) su terrible presión en el sitio donde se hundió\r\n" + 
				"primero. Le ruego ahora que trate de colocar todos sus dedos a la vez en las respectivas\r\n" + 
				"impresiones, tal como aparecen en el dibujo.\n");
		this.parrafo.add("\tLo intenté sin el menor resultado.\r\n" + 
				"\t—Quizá no estemos procediendo debidamente —dijo Dupin—. El papel es una\r\n" + 
				"superficie plana, mientras que la garganta humana es cilíndrica. He aquí un rodillo de\r\n" + 
				"madera, cuya circunferencia es aproximadamente la de una garganta. Envuélvala con el\r\n" + 
				"dibujo y repita el experimento.\r\n" + 
				"\tAsí lo hice, pero las dificultades eran aún mayores.\r\n" + 
				"\t—Esta marca —dije— no es la de una mano humana.\r\n" + 
				"\t—Lea ahora —replicó Dupin— este pasaje de Cuvier.\r\n" + 
				"\tEra una minuciosa descripción anatómica y descriptiva del gran orangután leonado de\r\n" + 
				"las islas de la India oriental. La gigantesca estatura, la prodigiosa fuerza y agilidad, la\r\n" + 
				"terrible ferocidad y las tendencias imitativas de estos mamíferos son bien conocidas.\r\n" + 
				"Instantáneamente comprendí todo el horror del asesinato.\r\n" + 
				"\t—La descripción de los dedos —dije al terminar la lectura—concuerda exactamente\r\n" + 
				"con este dibujo. Sólo un orangután, entre todos los animales existentes, es capaz de\r\n" + 
				"producir las marcas que aparecen en su diseño. Y el mechón de pelo coincide en un todo\r\n" + 
				"con el pelaje de la bestia descrita por Cuvier. De todas maneras, no alcanzo a comprender\r\n" + 
				"los detalles de este aterrador misterio. Además, se escucharon dos voces que disputaban y\r\n" + 
				"una de ellas era, sin duda, la de un francés.\n");
		this.parrafo.add("\t—Cierto, Y recordará usted que, casi unánimemente, los testigos declararon haber oído\r\n" + 
				"decir a esa voz las palabras: Mon Dieu! Dadas las circunstancias, uno de los testigos\r\n" + 
				"(Montani, el confitero) acertó al sostener que la exclamación tenía un tono de reproche o\r\n" + 
				"reconvención. Sobre esas dos palabras, pues, he apoyado todas mis esperanzas de una\r\n" + 
				"solución total del enigma. Un francés estuvo al tanto del asesinato. Es posible —e incluso\r\n" + 
				"muy probable— que fuera inocente de toda participación en el sangriento episodio. El\r\n" + 
				"orangután pudo habérsele escapado. Quizá siguió sus huellas hasta la habitación; pero,\r\n" + 
				"dadas las terribles circunstancias que se sucedieron, le fue imposible capturarlo otra vez. El\r\n" + 
				"animal anda todavía suelto. No continuaré con estas conjeturas (pues no tengo derecho a\r\n" + 
				"darles otro nombre), ya que las sombras de reflexión que les sirven de base poseen apenas\r\n" + 
				"suficiente profundidad para ser alcanzadas por mi intelecto, y no pretenderé mostrarlas con\r\n" + 
				"claridad a la inteligencia de otra persona. Las llamaremos conjeturas, pues, y nos\r\n" + 
				"referiremos a ellas como tales. Si el francés en cuestión es, como lo supongo, inocente de\r\n" + 
				"tal atrocidad, este aviso que deje anoche cuando volvíamos a casa en las oficinas de Le\r\n" + 
				"Monde (un diario consagrado a cuestiones marítimas y muy leído por los navegantes) lo\r\n" + 
				"hará acudir a nuestra casa.\n");
		this.parrafo.add("\tMe alcanzó un papel, donde leí:\r\n" + 
				"\n\tCAPTURADO.—En el Bois de Boulogne, en la mañana del... (la mañana del asesinato),\r\n" + 
				"se ha capturado un gran orangután leonado de la especie de Borneo. Su dueño (de quien se\r\n" + 
				"sabe que es un marinero perteneciente a un barco maltés) puede reclamarlo, previa\r\n" + 
				"identificación satisfactoria y pago de los gastos resultantes de su captura y cuidado.\r\n" + 
				"Presentarse al número... calle... Faubourg Saint-Germain... tercer piso.\r\n" + 
				"\n\t—Pero, ¿cómo es posible —pregunté— que sepa usted que el hombre es un marinero y\r\n" + 
				"que pertenece a un barco maltes?\r\n" + 
				"\t—No lo sé —dijo Dupin— y no estoy seguro de ello. Pero he aquí un trocito de cinta\r\n" + 
				"que, a juzgar por su forma y su grasienta condición, debió de ser usado para atar el pelo en\r\n" + 
				"una de esas largas queues de que tan orgullosos se muestran los marineros. Además, el\r\n" + 
				"nudo pertenece a esa clase que pocas personas son capaces de hacer, salvo los marinos, y es\r\n" + 
				"característico de los malteses. Encontré esta cinta al pie de la varilla del pararrayos.\r\n" + 
				"Imposible que perteneciera a una de las víctimas. De todos modos, si me equivoco al\r\n" + 
				"deducir de la cinta que el francés era un marinero perteneciente a un barco maltes, no he\r\n" + 
				"causado ningún daño al estamparlo en el aviso. Si me equivoco, el hombre pensará que me\r\n" + 
				"he confundido por alguna razón que no se tomará el trabajo de averiguar. Pero si estoy en lo\r\n" + 
				"cierto, hay mucho de ganado. Conocedor, aunque inocente de los asesinatos, el francés\r\n" + 
				"vacilará, como es natural, antes de responder al aviso y reclamar el orangután. He aquí\r\n" + 
				"cómo razonará: «Soy inocente y pobre; mi orangután es muy valioso y para un hombre\r\n" + 
				"como yo representa una verdadera fortuna. ¿Por qué perderlo a causa de una tonta\r\n" + 
				"aprensión? Está ahí, a mi alcance. Lo han encontrado en el Bois de Boulogne, a mucha\r\n" + 
				"distancia de la escena del crimen. ¿Cómo podría sospechar alguien que ese animal es el\r\n" + 
				"culpable? La policía está desorientada y no ha podido encontrar la más pequeña huella. Si\r\n" + 
				"llegaran a seguir la pista del mono, les será imposible probar que supe algo de los crímenes\r\n" + 
				"o echarme alguna culpa como testigo de ellos. Además, soy conocido. El redactor del aviso\r\n" + 
				"me designa como dueño del animal. Ignoro hasta dónde llega su conocimiento. Si renuncio\r\n" + 
				"a reclamar algo de tanto valor, que se sabe de mi pertenencia, las sospechas recaerán, por lo\r\n" + 
				"menos, sobre el animal. Contestaré al aviso, recobraré el orangután y lo tendré encerrado\r\n" + 
				"hasta que no se hable más del asunto.»\n");
		this.parrafo.add("\tEn ese momento oímos pasos en la escalera.\r\n" + 
				"\t—Prepare las pistolas —dijo Dupin—, pero no las use ni las exhiba hasta que le haga\r\n" + 
				"una seña.\r\n" + 
				"\tLa puerta de entrada de la casa había quedado abierta y el visitante había entrado sin\r\n" + 
				"llamar, subiendo algunos peldaños de la escalera. Pero, de pronto, pareció vacilar y lo\r\n" + 
				"oímos bajar. Dupin corría ya a la puerta cuando advertimos que volvía a subir. Esta vez no\r\n" + 
				"vaciló, sino que, luego de trepar decididamente la escalera, golpeó en nuestra puerta.\r\n" + 
				"\t—¡Adelante! —dijo Dupin con voz cordial y alegre.\r\n" + 
				"\tEl hombre que entró era, con toda evidencia, un marino, alto, robusto y musculoso, con\r\n" + 
				"un semblante en el que cierta expresión audaz no resultaba desagradable. Su rostro, muy\r\n" + 
				"atezado, aparecía en gran parte oculto por las patillas y los bigotes. Traía consigo un grueso\r\n" + 
				"bastón de roble, pero al parecer ésa era su única arma. Inclinóse torpemente, dándonos las\r\n" + 
				"buenas noches en francés; a pesar de un cierto acento suizo de Neufchatel, se veía que era\r\n" + 
				"de origen parisiense.\n");
		this.parrafo.add("\t—Siéntese usted, amigo mío —dijo Dupin—. Supongo que viene en busca del\r\n" + 
				"orangután. Palabra, se lo envidio un poco; es un magnífico animal, que presumo debe de\r\n" + 
				"tener gran valor. ¿Qué edad le calcula usted?\r\n" + 
				"\tEl marinero respiró profundamente, con el aire de quien se siente aliviado de un peso\r\n" + 
				"intolerable, y contestó con tono reposado:\r\n" + 
				"\t—No podría decirlo, pero no tiene más de cuatro o cinco años. ¿Lo guarda usted aquí?\r\n" + 
				"\t—¡Oh, no! Carecemos de lugar adecuado. Está en una caballeriza de la rue Dubourg,\r\n" + 
				"cerca de aquí. Podría usted llevárselo mañana por la mañana. Supongo que estará en\r\n" + 
				"condiciones de probar su derecho de propiedad.\r\n" + 
				"\t—Por supuesto que sí, señor.\r\n" + 
				"\t—Lamentaré separarme de él —dijo Dupin.\r\n" + 
				"\t—No quisiera que usted se hubiese molestado por nada —declaró el marinero—. Estoy\r\n" + 
				"dispuesto a pagar una recompensa por el hallazgo del animal. Una suma razonable, se\r\n" + 
				"entiende.\r\n" + 
				"\t—Pues bien —repuso mi amigo—, eso me parece muy justo. Déjeme pensar: ¿qué le\r\n" + 
				"pediré? ¡Ah, ya sé! He aquí cuál será mi recompensa: me contará usted todo lo que sabe\r\n" + 
				"sobre esos crímenes en la rue Morgue.\r\n" + 
				"\tDupin pronunció las últimas palabras en voz muy baja y con gran tranquilidad.\r\n" + 
				"Después, con igual calma, fue hacia la puerta, la cerró y guardó la llave en el bolsillo.\r\n" + 
				"Sacando luego una pistola, la puso sin la menor prisa sobre la mesa.\r\n" + 
				"\tEl rostro del marinero enrojeció como si un acceso de sofocación se hubiera apoderado\r\n" + 
				"de él. Levantándose, aferró su bastón, pero un segundo después se dejó caer de nuevo en el\r\n" + 
				"asiento, temblando violentamente y pálido como la muerte. No dijo una palabra. Lo\r\n" + 
				"compadecí desde lo más profundo de mi corazón.\n");
		this.parrafo.add("\t—Amigo mío, se está usted alarmando sin necesidad —dijo cordialmente Dupin—. Le\r\n" + 
				"aseguro que no tenemos intención de causarle el menor daño. Lejos de nosotros querer\r\n" + 
				"perjudicarlo: le doy mi palabra de caballero y de francés. Estoy perfectamente enterado de\r\n" + 
				"que es usted inocente de las atrocidades de la rue Morgue. Pero sería inútil negar que, en\r\n" + 
				"cierto modo, se halla implicado en ellas. Fundándose en lo que le he dicho, supondrá que\r\n" + 
				"poseo medios de información sobre este asunto, medios que le sería imposible imaginar. El\r\n" + 
				"caso se plantea de la siguiente manera: usted no ha cometido nada que no debiera haber\r\n" + 
				"cometido, nada que lo haga culpable. Ni siquiera se le puede acusar de robo, cosa que pudo\r\n" + 
				"llevar a cabo impunemente. No tiene nada que ocultar ni razón para hacerlo. Por otra parte,\r\n" + 
				"el honor más elemental lo obliga a confesar todo lo que sabe. Hay un hombre inocente en la\r\n" + 
				"cárcel, acusado de un crimen cuyo perpetrador puede usted denunciar.\r\n" + 
				"\tMientras Dupin pronunciaba estas palabras, el marinero había recobrado en buena parte\r\n" + 
				"su compostura, aunque su aire decidido del comienzo habíase desvanecido por completo.\r\n" + 
				"\t—¡Dios venga en mi ayuda! —dijo, después de una pausa—. Sí, le diré todo lo que sé\r\n" + 
				"sobre este asunto, aunque no espero que crea ni la mitad de lo que voy a contarle... ¡Estaría\r\n" + 
				"loco si pensara que van a creerme! Y, sin embargo, soy inocente, y lo confesaré todo\r\n" + 
				"aunque me cueste la vida.\n");
		this.parrafo.add("\tEn sustancia, lo que nos dijo fue lo siguiente: Poco tiempo atrás, había hecho un viaje\r\n" + 
				"al archipiélago índico. Un grupo del que formaba parte desembarcó en Borneo y penetró en\r\n" + 
				"el interior a fin de hacer una excursión placentera. Entre él y un compañero capturaron al\r\n" + 
				"orangután. Como su compañero falleciera, quedó dueño único del animal. Después de\r\n" + 
				"considerables dificultades, ocasionadas por la indomable ferocidad de su cautivo durante el\r\n" + 
				"viaje de vuelta, logró finalmente encerrarlo en su casa de París, donde, para aislarlo de la\r\n" + 
				"incómoda curiosidad de sus vecinos, lo mantenía cuidadosamente recluido, mientras el\r\n" + 
				"animal curaba de una herida en la pata que se había hecho con una astilla a bordo del\r\n" + 
				"buque. Una vez curado, el marinero estaba dispuesto a venderlo.\r\n" + 
				"\tUna noche, o más bien una madrugada, en que volvía de una pequeña juerga de\r\n" + 
				"marineros, nuestro hombre se encontró con que el orangután había penetrado en su\r\n" + 
				"dormitorio, luego de escaparse de la habitación contigua donde su captor había creído\r\n" + 
				"tenerlo sólidamente encerrado. Navaja en mano y embadurnado de jabón, habíase sentado\r\n" + 
				"frente a un espejo y trataba de afeitarse, tal como, sin duda, había visto hacer a su amo\r\n" + 
				"espiándolo por el ojo de la cerradura. Aterrado al ver arma tan peligrosa en manos de un\r\n" + 
				"animal que, en su ferocidad, era harto capaz de utilizarla, el marinero se quedó un instante\r\n" + 
				"sin saber qué hacer. Por lo regular, lograba contener al animal, aun en sus arrebatos más\r\n" + 
				"terribles, con ayuda de un látigo, y pensó acudir otra vez a ese recurso. Pero al verlo, el\r\n" + 
				"orangután se lanzó de un salto a la puerta, bajó las escaleras y, desde ellas, saltando por una\r\n" + 
				"ventana que desgraciadamente estaba abierta, se dejó caer a la calle.\n");
		this.parrafo.add("\tDesesperado, el francés se precipitó en su seguimiento. Navaja en mano, el mono se\r\n" + 
				"detenía para mirar y hacer muecas a su perseguidor, dejándolo acercarse casi hasta su lado.\r\n" + 
				"Entonces echaba a correr otra vez. Siguió así la caza durante largo tiempo. Las calles\r\n" + 
				"estaban profundamente tranquilas, pues eran casi las tres de la madrugada. Al atravesar el\r\n" + 
				"pasaje de los fondos de la rue Morgue, la atención del fugitivo se vio atraída por la luz que\r\n" + 
				"salía de la ventana abierta del aposento de madame L’Espanaye, en el cuarto piso de su\r\n" + 
				"casa. Precipitándose hacia el edificio, descubrió la varilla del pararrayos, trepó por ella con\r\n" + 
				"inconcebible agilidad, aferró la persiana que se hallaba completamente abierta y pegada a la\r\n" + 
				"pared, y en esta forma se lanzó hacia adelante hasta caer sobre la cabecera de la cama. Todo\r\n" + 
				"esto había ocurrido en menos de un minuto. Al saltar en la habitación, las patas del\r\n" + 
				"orangután rechazaron nuevamente la persiana, la cual quedó abierta.\r\n" + 
				"\tEl marinero, a todo esto, se sentía tranquilo y preocupado al mismo tiempo. Renacían\r\n" + 
				"sus esperanzas de volver a capturar a la bestia, ya que le sería difícil escapar de la trampa\r\n" + 
				"en que acababa de meterse, salvo que bajara otra vez por el pararrayos, ocasión en que sería\r\n" + 
				"posible atraparlo. Por otra parte, se sentía ansioso al pensar en lo que podría estar haciendo\r\n" + 
				"en la casa. Esta última reflexión indujo al hombre a seguir al fugitivo. Para un marinero no\r\n" + 
				"hay dificultad en trepar por una varilla de pararrayos; pero, cuando hubo llegado a la altura\r\n" + 
				"de la ventana, que quedaba muy alejada a su izquierda, no pudo seguir adelante; lo más que\r\n" + 
				"alcanzó fue a echarse a un lado para observar el interior del aposento. Apenas hubo mirado,\r\n" + 
				"estuvo a punto de caer a causa del horror que lo sobrecogió. Fue en ese momento cuando\r\n" + 
				"empezaron los espantosos alaridos que arrancaron de su sueño a los vecinos de la rue\r\n" + 
				"Morgue. Madame L’Espanaye y su hija, vestidas con sus camisones de dormir, habían\r\n" + 
				"estado aparentemente ocupadas en arreglar algunos papeles en la caja fuerte ya\r\n" + 
				"mencionada, la cual había sido corrida al centro del cuarto. Hallábase abierta, y a su lado,\r\n" + 
				"en el suelo, los papeles que contenía. Las víctimas debían de haber estado sentadas dando la\r\n" + 
				"espalda a la ventana, y, a juzgar por el tiempo transcurrido entre la entrada de la bestia y los\r\n" + 
				"gritos, parecía probable que en un primer momento no hubieran advertido su presencia. El\r\n" + 
				"golpear de la persiana pudo ser atribuido por ellas al viento.\n");
		this.parrafo.add("\tEn el momento en que el marinero miró hacia el interior del cuarto, el gigantesco\r\n" + 
				"animal había aferrado a madame L’Espanaye por el cabello (que la dama tenía suelto, como\r\n" + 
				"si se hubiera estado peinando) y agitaba la navaja cerca de su cara imitando los\r\n" + 
				"movimientos de un barbero. La hija yacía postrada e inmóvil, víctima de un desmayo. Los\r\n" + 
				"gritos y los esfuerzos de la anciana señora, durante los cuales le fueron arrancados los\r\n" + 
				"mechones de la cabeza, tuvieron por efecto convertir los propósitos probablemente\r\n" + 
				"pacíficos del orangután en otros llenos de furor. Con un solo golpe de su musculoso brazo\r\n" + 
				"separó casi completamente la cabeza del cuerpo de la víctima. La vista de la sangre\r\n" + 
				"transformó su cólera en frenesí. Rechinando los dientes y echando fuego por los ojos, saltó\r\n" + 
				"sobre el cuerpo de la joven y, hundiéndole las terribles garras en la garganta, las mantuvo\r\n" + 
				"así hasta que hubo expirado. Las furiosas miradas de la bestia cayeron entonces sobre la\r\n" + 
				"cabecera del lecho, sobre el cual el rostro de su amo, paralizado por el horror, alcanzaba\r\n" + 
				"apenas a divisarse. La furia del orangután, que, sin duda, no olvidaba el temido látigo, se\r\n" + 
				"cambió instantáneamente en miedo. Seguro de haber merecido un castigo, pareció deseoso\r\n" + 
				"de ocultar sus sangrientas acciones, y se lanzó por el cuarto lleno de nerviosa agitación,\r\n" + 
				"echando abajo y rompiendo los muebles a cada salto y arrancando el lecho de su bastidor.\r\n" + 
				"Finalmente se apoderó del cadáver de mademoiselle L’Espanaye y lo metió en el cañón de\r\n" + 
				"la chimenea, tal como fue encontrado luego, tomó luego el de la anciana y lo tiró de cabeza\r\n" + 
				"por la ventana.\r\n" + 
				"\tEn momentos en que el mono se acercaba a la ventana con su mutilada carga, el\r\n" + 
				"marinero se echó aterrorizado hacia atrás y, deslizándose sin precaución alguna hasta el\r\n" + 
				"suelo, corrió inmediatamente a su casa, temeroso de las consecuencias de semejante\r\n" + 
				"atrocidad y olvidando en su terror toda preocupación por la suerte del orangután. Las\r\n" + 
				"palabras que los testigos oyeron en la escalera fueron las exclamaciones de espanto del\r\n" + 
				"francés, mezcladas con los diabólicos sonidos que profería la bestia.\r\n" + 
				"\tPoco me queda por agregar. El orangután debió de escapar por la varilla del pararrayos\r\n" + 
				"un segundo antes de que la puerta fuera forzada. Sin duda, cerró la ventana a su paso. Más\r\n" + 
				"tarde fue capturado por su mismo dueño, quien lo vendió al Jardin des Plantes en una\r\n" + 
				"elevada suma.\n");
		this.parrafo.add("\tLebon fue puesto en libertad inmediatamente después que hubimos narrado todas las\r\n" + 
				"circunstancias del caso —con algunos comentarios por parte de Dupin— en el bureau del\r\n" + 
				"prefecto de policía. Este funcionario, aunque muy bien dispuesto hacia mi amigo, no pudo\r\n" + 
				"ocultar del todo el fastidio que le producía el giro que había tomado el asunto, y deslizó uno\r\n" + 
				"o dos sarcasmos sobre la conveniencia de que cada uno se ocupara de sus propios asuntos.\n");
		this.parrafo.add("—Déjelo usted hablar —me dijo Dupin, que no se había molestado en replicarle—.\r\n" + 
				"Deje que se desahogue; eso aliviará su conciencia. Me doy por satisfecho con haberlo\r\n" + 
				"derrotado en su propio terreno. De todos modos, el hecho de que haya fracasado en la\r\n" + 
				"solución del misterio no es ninguna razón para asombrarse; en verdad, nuestro amigo el\r\n" + 
				"prefecto es demasiado astuto para ser profundo. No hay fibra en su ciencia: mucha cabeza y\r\n" + 
				"nada de cuerpo, como las imágenes de la diosa Laverna, o, a lo sumo, mucha cabeza y\r\n" + 
				"lomos, como un bacalao. Pero después de todo es un buen hombre. Lo estimo\r\n" + 
				"especialmente por cierta forma maestra de gazmoñería, a la cual debe su reputación. Me\r\n" + 
				"refiero a la manera que tiene de nier ce qui est, et d’ expliquer ce qui n’est pas (negar lo que es y explicar lo que no es)"
				+ "FIN");
		
		

	}

}
