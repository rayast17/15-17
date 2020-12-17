package association;

import java.util.ArrayList;
import java.util.Arrays;

public class Painting {

	protected String name;
	protected Painter painter;
	ArrayList<Paint> paint;

	Painting() {
		paint = new ArrayList<Paint>(Arrays.asList(
				new Paint(1),
				new Paint(2),
				new Paint(3)));
	}

}