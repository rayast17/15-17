package association;

import java.util.ArrayList;
import java.util.Arrays;

public class GalleryTest {

	public static void main(String[] args) {

		Gallery gallery = new Gallery();
		gallery.name = "The art in Motion";

		Painter davinci = new Painter();
		davinci.name = "Leonardo da Vinci";
		Painter basquiat = new Painter();
		basquiat.name = "Jean-Michel Basquiat";
		Painter picasso = new Painter();
		picasso.name = "Pablo Picasso";

		Painting painting1 = new Painting();
		painting1.painter = davinci;
		painting1.name = "Mona Lisa";
		Painting painting2 = new Painting();
		painting2.painter = davinci;
		painting2.name = "The Last Supper";
		Painting painting3 = new Painting();
		painting3.painter = basquiat;
		painting3.name = "Untitled";
		Painting painting4 = new Painting();
		painting4.painter = basquiat;
		painting4.name = "Crown";
		Painting painting5 = new Painting();
		painting5.painter = picasso;
		painting5.name = "The Old Guitarist";
		Painting painting6 = new Painting();
		painting6.painter = picasso;
		painting6.name = "The Weeping Woman";

		davinci.painting = new ArrayList<Painting>(Arrays.asList(painting1, painting2));
		basquiat.painting = new ArrayList<Painting>(Arrays.asList(painting3, painting4));
		picasso.painting = new ArrayList<Painting>(Arrays.asList(painting5, painting6));

		Gallery.painting = new ArrayList<Painting>(
				Arrays.asList(painting1, painting2, painting3, painting4, painting5, painting6));

		System.out.println("Gallery: " + gallery.name);
		for (Painting painting : Gallery.painting) {
			System.out.println(painting.name + " painted by " + painting.painter.name);
		}
	}

}