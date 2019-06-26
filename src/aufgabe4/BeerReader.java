package aufgabe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BeerReader {

	/**
	 * Liest die Daten der txt-Datei unter dem Pfad <code>src</code> aus und
	 * erstellt aus diesen Daten eine Liste mit Bieren, die zurückgegeben wird.
	 * 
	 * Die Rückgabeliste soll optional geshufflet (d.h. in eine zufällige
	 * Reihenfolge gebracht) werden können.
	 * 
	 * Verwenden Sie zum Shufflen hierbei den der Methode übergebenen
	 * Zufallszahlengenerator <code>random</code>.
	 * 
	 * @param src     Pfad, unter dem sich die txt-Datei mit den Bierdaten befindet.
	 * @param shuffle true, wenn die Rückgabeliste geshufflet werden soll.
	 * @param random  Zufallszahlengenerator zum Shufflen der Rückgabeliste.
	 * @return Liste mit den Bierdaten, die ggf. geshufflet wurde.
	 */
	public static List<Beer> getListOfBeers(String src, boolean shuffle, Random random) {
		// TODO: implementieren Sie die Methode und passen Sie den Rückgabewert an
		List<String> tmp = new LinkedList<String>();

		Beer tmpBeer;
		Double alcContent;
		String type;
		String brewery;

		List<Beer> result = new LinkedList<Beer>();

		Path path = Paths.get(src);

		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String line;
			while ((line = reader.readLine()) != null) {
				tmp = Arrays.asList(line.split(";"));
				alcContent = Double.parseDouble(tmp.get(0));
				type = tmp.get(1);
				brewery = tmp.get(2);
				tmpBeer = new Beer(alcContent, type, brewery);
				result.add(tmpBeer);

			}
		} catch (IOException exception) {
			System.out.println(exception + " Problems with input, can't read file properly");
		}

		if (shuffle) {
			for (int i = result.size() - 1; i >= 1; i--) {

				int j = random.nextInt(i + 1);
				tmpBeer = result.get(i);
				result.set(i, result.get(j));
				result.set(j, tmpBeer);
			}
		}
		return result;
	}

}
