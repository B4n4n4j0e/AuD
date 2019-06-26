package aufgabe4;


public class BinTree {
	
	private Beer key;
	private BinTree left, right;
	
	BinTree(BinTree l, Beer x, BinTree r) {
		this.left = l;
		this.key = x;
		this.right = r;
	}

	public Beer getKey() {
		return key;
	}

	public void setKey(Beer key) {
		this.key = key;
	}

	public BinTree getLeft() {
		return left;
	}

	public void setLeft(BinTree left) {
		this.left = left;
	}

	public BinTree getRight() {
		return right;
	}

	public void setRight(BinTree right) {
		this.right = right;
	}
	
	public BinTree search(Beer x) {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return null;
	}

	public BinTree insertp(Beer x, BinTree tail) {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		
		return null;
	}
}