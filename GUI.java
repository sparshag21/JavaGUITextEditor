import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import FileFunctions.*;
public class GUI implements ActionListener
{
	JFrame jframe;
	JTextField jtf;
	JButton save, read;
	JTextArea jta;
	FileFunctions ff = new FileFunctions();
	public GUI() {
		jframe = new JFrame("MYGUI");
		jframe.setSize(500,400); //(width,height)
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); //jframe.DO_NOTHING_ON_CLOSE
		jta = new JTextArea();
		jframe.add(jta);
		save = new JButton("Save");
		read = new JButton("Read");
		JPanel jpan = new JPanel();
		jpan.add(save);
		jpan.add(read);
		jframe.add(jpan,BorderLayout.NORTH);
		jtf = new JTextField();
		jframe.add(jtf,BorderLayout.SOUTH);
		save.addActionListener(this);
		read.addActionListener(this);
		// jframe.add(read);
		jframe.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		// System.out.println("Called");
		if(ae.getActionCommand().equals("Read")) {
			String filename = jtf.getText();
			String data = ff.read(filename);
			jta.setText(data);

		}
		else if(ae.getActionCommand().equals("Save")) {
			String filename = jtf.getText();
			String data = jta.getText();
			try {ff.write(filename,data); } catch(Exception e) { System.out.println(e); }
		}
	}
	public static void main(String[] args) throws Exception{
		GUI g = new GUI();
	}
}