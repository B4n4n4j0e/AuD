package aufgabe4;

public class Beer implements Comparable<Beer> {
	
	private double alcContent;
	private String type;
	private String brewery;

	public Beer(double alcContent, String brewery, String type) {
		
		if (alcContent < 0 || alcContent > 100){
			throw new RuntimeException("alcContent muss zwischen 0 und 100 liegen. alcContent: " + alcContent);
		}
		
		if (brewery == null || brewery.isEmpty()){
			throw new RuntimeException("String brewery ist null oder leer.");
		}
		
		if (type == null || type.isEmpty()){
			throw new RuntimeException("String type ist null oder leer.");
		}
		
		this.alcContent = alcContent;
		this.type = type;
		this.brewery = brewery;
	}

	public double getAlcContent() {
		return alcContent;
	}

	public void setAlcContent(int alcContent) {
		
		if (alcContent < 0 || alcContent > 100){
			throw new RuntimeException("alcContent muss zwischen 0 und 100 liegen. alcContent: " + alcContent);
		}
		
		this.alcContent = alcContent;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		
		if (type == null || type.isEmpty()){
			throw new RuntimeException("String type ist null oder leer.");
		}
		
		this.type = type;
	}

	public String getBrewery() {
		return brewery;
	}
	
	public void setBrewery(String brewery) {
		
		if (brewery == null || brewery.isEmpty()){
			throw new RuntimeException("String brewery ist null oder leer.");
		}
		
		this.brewery = brewery;
	}
	
	/**
	 * Methode zur Definition einer totalen Ordnung über die <code>Beer</code>-Objekte.
	 * 
	 * Die Sortierkriterien sollen dabei in der folgenden Reihenfolge berücksichtigt werden:
	 * <br/><br/>
	 * 1. <code>alcContent</code><br/>
	 * 2. <code>brewery</code><br/>
	 * 3. <code>type</code><br/>
	 * <br/>
	 * Bei Gleichheit nach dem übergeordneten Sortierkriterium sollen die <code>Beer</code>-Objekte 
	 * nach dem nächsten Sortierkriterium sortiert werden.
	 * <br/><br/>
	 * Es ist jeweils eine aufsteigende Sortierung zu definieren, d.h. für <code>alcContent</code> nach
	 * den <code>double</code>-Werten und für die beiden anderen Attribute, die jeweils Strings sind, 
	 * nach der lexikographischen Ordnung.
	 * <br/><br/>
	 * Hinweis: Eine Methode, die die lexikographische Ordnung zweier <code>Strings</code> definiert, ist in der 
	 * <code>String</code>-Klasse bereits vorhanden, muss von Ihnen also nicht selbst implementiert werden.
	 */
	@Override
	public int compareTo(Beer compareBeer) {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return -1;
	}

	@Override
	public String toString() {
		return "(" + brewery + ")";
	}
}