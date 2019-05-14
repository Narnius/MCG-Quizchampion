import java.util.ArrayList;
import java.util.HashMap;

public class FragenKatalog {

	HashMap<String, HashMap<Integer, ArrayList<Frage>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Frage>>>();
	ArrayList<String> kategorien = new ArrayList<String>();
	
	public FragenKatalog()
	{
		kategorienFuellen();
		for( int i = 0; i < kategorien.size(); i++ )
		{
			fragenliste.put(kategorien.get(i), new HashMap<Integer, ArrayList<Frage>>());
		}
	}
	
	private void kategorienFuellen()
	{
		/*
		int i = 1;
		
		fragenliste.add(new Frage(i, "Chemie", j, "", "", "", "", "", ''));
		i++;
		*/
		
		
		int i = 1;
		fragenliste.add(new Frage(i, "Chemie", 1, "Welches der folgenden Teilchen ist NICHT geladen?", "Ion", "Elektron", "Neutron", "Proton", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Was sind Elemente?", "Feuer, Wasser, Erde, Luft", "mit chemischen Mitteln nicht weiter zerlegbare Teilchen", "zentrale Teilgebiete der Chemie", "elektrisch geladene Metalle", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Wenn ein Element 5 Elektronen hat, wie viele Protonen hat es?", "3", "doppelt so viele", "gar keine, denn es ist negativ geladen", "5", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Woraus bestehen Salze.", "Aus einem Kation und einem Anion", "Aus einem Proton und einem Elektron", "Aus einem Gas und einer Fl�ssigkeit", "Aus Meersand oder Bergsteinen", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Was verbrennt bei einer Kerze, um die Kerzenflamme aufrechtzuerhalten?", "Der Docht", "Das Wachs", "Die Luft um die Kerze herum", "Die im Docht gespeicherte Energie wird freigesetzt, nichts davon brennt.", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Welche der folgenden Summenformeln beschreibt eine Hydroxygruppe", "CH4", "-NH2", "-OH", "-NN-", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Was ist ein Polykondensat", "Eine Art Kunststoff", "Eine Entsalzungsanlage", "Eine Art Metall", "Eine Art Gas", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Woraus bestehen Proteine?", "", "Aus Fetts�uren", "Aus Eiwei�", "Aus Aminos�uren", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Wie lautet die Summenformel von Salzs�ure?", "HCLNa2", "HCL", "HNa", "HBs", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 1, "Was sind Orbitale", "Sternwarten", "Umlaufbahnen der Monde um ihre Planeten", "Aufenthaltsbereiche der Atome in einem Molek�l", "Die Wellenfunktion eines Elektrons, die auch den wahrscheinlichen Aufenthaltsbereich desselben beschreibt", ''));
		i++;
		
		
		//Schwierigkeitsgrad 2
		
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Wie nennt man eine Reaktion, bei der Energie freigesetzt wird?", "Endotherm", "Expeliotherm", "Exotherm", "Energeti�r", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Welches der folgenden Metalle ist kein Element?", "Gold", "Silber", "Bronze", "Kupfer", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Das Gift einer Biene ist eine S�ure. Um nach einem Bienenstich den Schmerz zu lindern", "h�lt man sich eine aufgeschnittene Zwiebel auf die Stichstelle.", "h�lt man sich eine aufgeschnittene Zitrone auf die Stichstelle.", "bedeckt man die Stichstelle mit Honig.", "benutzt man haushalts�bliches Backpulver.", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Was gibt die Ordnungszahl eines Elementes im Periodensystem an?", "Die Anzahl der Protonen im Kern", "Die Siedetemperatur", "Die Bindungswertigkeit", "Die Anzahl der Valenzelektronen", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Welches der folgenden Stoffe bezeichnet man auch als Trinkalkohol?", "Methanol", "Ethanol", "Propanol", "Butanol", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Welches der folgenden Stoffe existiert?", "Photanium", "Methen", "Ethen", "Methin", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Ab wann gilt ein Stoff als sauer?", "PH-Wert unter 7", "PH-Wert �ber sieben", "PH-Wert unter Null", "Wenn er �tzend ist.", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Was ist der Oberbegriff f�r ges�ttigte, acyclische Kohlenwasserstoffe?", "Alkane", "Alkene", "Alkine", "Alkone", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Warum sind Flourchlorkohlenwasserstoffe in Deutschland verboten?", "Weil sie f�r Mensch und Tier giftig sind.", "Weil sie f�r die Ozonschicht sch�dlich sind.", "Weil sie hochenz�ndlich sind.", "Flourchlorkohlenwasserstoffe sind in Deutschland nicht verboten.", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 2, "Worin liegt die Polarit�t eines Molek�ls begr�ndet?", "In der N�he zum Magnetfeld der Erde.", "In der Richtung des Stromflusses.", "In der Ausrichtung der Elementarmagneten.", "In der Elektronegativit�t der Bestandteile.", 'D'));
		i++;
		
		
		//Schwierigkeitsgrad 3
		
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Welches Elementsymbol hat Silber?", "Ar", "Si", "S", "Ber", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Was ist Plasma", "Die Fl�ssigkeit, die in Lavalampen verwendet wird.", "Plasma existiert nicht wirklich; Die Klingen der Lichtschwerter aus Star Wars� bestehen daraus.", "Der vierte Aggregatzustand: Ionisiertes Gas", "Ein Gestein, das auf der Oberfl�che des Uranus vorkommt", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Verbrennungen sind, chemisch betrachtet,", "Reaktionen, bei denen sich Kohlenstoff bildet.", "immer Reaktionen mit Sauerstoff.", "Reaktionen, bei denen Feuer entsteht.", "Explosionen.", 'B'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Welche dieser S�uren ist die chemische Bezeichnung f�r Ameisens�ure?", "Antinins�ure", "Curicans�ure", "Tritins�ure", "Methans�ure", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Wie lautet die Chemische Bezeichnung f�r Vitamin C?", "Phenols�ure", "Aceton", "Methylalkylat", "Ascorbins�ure", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Das Verfahren, ein Stoffgemisch durch die unterschiedliche Verteilung seiner Einzelbestandteile aufzutrennen, nennt man", "Chromosomie", "Chromatolyse", "Chromatografie", "Kalligrafie", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Wie nennt man das Aufspalten gr��erer Molek�le in kleinere durch hohe Temperaturen?", "Pyrolyse", "Thermomanie", "Thermospaltung", "Thermolyse", 'A'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Welche Farberscheinung wird beim Anstrahlen einer roten Tomate mit gr�nem Licht in einem vollkommen abgedunkelten Raum sichtbar?", "Die Tomate erscheint Gelb.", "Die Tomate erscheint Rot.", "Die Tomate erscheint Gr�n.", "Die Tomate reflektiert gar kein Licht und erscheint somit Schwarz.", 'D'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Welches der folgenden S�uren kann Gold zersetzen?", "Phosphors�ure", "Kiesels�ure", "K�nigswasser", "Salzs�ure", 'C'));
		i++;
		
		fragenliste.add(new Frage(i, "Chemie", 3, "Wie viele Elemente enth�lt das Periodensystem der Elemente?", "73", "157", "389", "118", 'D'));
		i++;
		
		
		
		
		kategorien.add("Informatik");
		kategorien.add("Sport");
		kategorien.add("Games");
		kategorien.add("Rund um die Welt");
		kategorien.add("Mathematik");
		kategorien.add("Musik");
		kategorien.add("Im Labor");
		kategorien.add("Religion");
		kategorien.add("In der Natur");
		kategorien.add("Chemie");
		
	}
}
