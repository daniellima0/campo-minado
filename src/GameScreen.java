import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen {
	public GameScreen() {
		JFrame frame = new JFrame();
		frame.setTitle("Campo Minado");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(420,567));
		frame.setResizable(false);

		JPanel window = new JPanel();
		window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
		window.setBorder(BorderFactory.createLineBorder(Color.black));
		window.setBackground(Color.WHITE);
		
		JPanel topbar = new JPanel();
		topbar.setMaximumSize(new Dimension(420, 105));
		topbar.setBackground(Color.WHITE);
		
		JLabel temp = new JLabel("dificuldade, tempo, número de bandeiras vem aqui");		
		topbar.add(temp);
		
		Grid grid = new Grid();

		window.add(topbar);
		window.add(grid);
		
		
		frame.add(window);
		frame.pack(); //nao sei o que eh mas se tirar n funciona
		frame.setVisible(true);
	}
}
