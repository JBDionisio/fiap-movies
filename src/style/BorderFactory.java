package style;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BorderFactory {

	public static Border create() {
		return new LineBorder(new Color(200, 200, 200));
	}
}