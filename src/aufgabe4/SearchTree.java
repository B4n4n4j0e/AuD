package aufgabe4;

import java.util.List;
import java.util.Random;

public class SearchTree {
	private BinTree root;
	private BinTree tail;

	public SearchTree() {
		tail = new BinTree(null, new Beer(0, "DUMMY", "DUMMY"), null);
		root = tail;
	}

	public BinTree getRoot() {
		return root;
	}

	public void setRoot(BinTree root) {
		this.root = root;
	}

	public BinTree getTail() {
		return tail;
	}

	public void setTail(BinTree tail) {
		this.tail = tail;
	}

	/**
	 * Prüft, ob der Baum leer ist.
	 * 
	 * @return true, wenn der Baum leer ist.
	 */
	public boolean isEmpty() {
		return root == tail;
	}

	/**
	 * Prüft, ob <code>Beer</code> <code>x</code> im Baum vorhanden ist.
	 * 
	 * @param x Auf Enthaltensein zu prüfendes <code>Beer</code>.
	 * @return true, wenn <code>x</code> enthalten ist.
	 */
	public boolean member(Beer x) {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return false;
	}

	/**
	 * Fügt <code>Beer</code> <code>x</code> in den Baum ein.
	 * 
	 * @param x Einzufügendes <code>Beer</code>.
	 */
	public void insert(Beer x) {
		// TODO: implementieren Sie die Methode
	}

	/**
	 * Gibt eine Liste mit allen <code>Beer</code>-Objekten des Baumes in einer Depth-First-Order (DFO)
	 * (genauer gesagt Preorder) zurück.
	 * 
	 * @return result DFO-Liste der <code>Beer</code>-Objekte im Baum.
	 */
	public List<Beer> getDepthFirstOrder() {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return null;
	}

	/**
	 * Gibt eine Liste mit allen <code>Beer</code>-Objekten des Baumes in einer Breadth-First-Order (BFO) 
	 * zurück.
	 * 
	 * @return result BFO-Liste der <code>Beer</code>-Objekte im Baum.
	 */
	public List<Beer> getBreadthFirstOrder() {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return null;
	}

	public static void main(String[] args) {
		SearchTree t = new SearchTree();
		
		boolean shuffle = false;
		Random random = new Random(123456);
		String src = "res/data.txt";
		
		List<Beer> beers = BeerReader.getListOfBeers(src, shuffle, random);

		// insert every Object into our tree
		for (Beer pl : beers) {
			t.insert(pl);
		}

		System.out.println(t.getDepthFirstOrder());
		System.out.println(t.getBreadthFirstOrder());
		BTreePrinter.print(t.root, t.tail);

		// Shuffle and do again
		SearchTree t2 = new SearchTree();
		shuffle = true;
		beers = BeerReader.getListOfBeers(src, shuffle, random);
		System.out.println("After shuffle: " + beers.toString());
		// insert every Object into our tree
		for (Beer pl : beers) {
			t2.insert(pl);
		}

		System.out.println(t2.getDepthFirstOrder());
		System.out.println(t2.getBreadthFirstOrder());
		BTreePrinter.print(t2.root, t2.tail);

	}

}