package com.a00n.sudokugameowl.components.nodes;

import com.a00n.sudokugameowl.App;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleLableNode extends Label {

	public TitleLableNode(String text) {
		setText(text);
		setFont(Font.font(App.FONT_FAMILY, FontWeight.BOLD, 25));
	}
}
