import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.text.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

  
@SuppressWarnings("serial")
class login extends JFrame implements ActionListener {
  JButton SUBMIT;
  JPanel panel;
  JLabel label2;

   login()  {
   label2 = new JLabel();
   label2.setBounds(250, 200, 400, 52);
   label2.setText("OUR MINI OS PROJECT");
   label2.setFont(new Font("Arial", Font.BOLD, 24));
   label2.setForeground(Color.WHITE);
  
   SUBMIT=new JButton("LOGIN");
   SUBMIT.setBackground(Color.DARK_GRAY);
   SUBMIT.setForeground(Color.WHITE);
   SUBMIT.setFocusPainted(false);
   SUBMIT.setFocusable(false);
   SUBMIT.setBounds(325, 300, 105, 34);
   
   panel=new JPanel();
   panel.setLayout(null);
//    panel.add(label1);
   panel.add(label2);
   panel.add(SUBMIT);
   getContentPane().add(panel,BorderLayout.CENTER);
   getContentPane().setBackground(Color.BLACK);;
   getContentPane().setForeground(Color.white);;
   panel.setBackground(Color.BLACK);
   panel.setForeground(Color.WHITE);
   SUBMIT.addActionListener(this);
   setTitle("WELCOME TO OUR MINI OS PROJECT");
   }
  public void actionPerformed(ActionEvent ae)
   {

   this.dispose();
   Desktop d=new Desktop();
   d.setVisible(true);

 }
 }
  class logindemo
 {
   private JPanel contentPane;
   public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
   			try {
   				login frame=new login();
				   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				   frame.setSize(800,500);
				   frame.setLocationRelativeTo(null);
   					frame.setVisible(true);
					frame.setResizable(false);
   			    }
		        catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			    }
  		 }

	});
}
}

@SuppressWarnings("serial")
class Desktop extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desktop frame = new Desktop();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				   frame.setSize(800,500);
				   frame.setLocationRelativeTo(null);
   					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 Desktop()  {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
		setLocationRelativeTo(null);
   		setVisible(true);
		setResizable(false);
		setTitle("Desktop");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);

		JButton com = new JButton("File Manager");
		com.setIcon(new ImageIcon("mycomputer.jpg"));
		com.setIconTextGap(10);
		com.setVerticalTextPosition(SwingConstants.BOTTOM);
		com.setHorizontalTextPosition(SwingConstants.CENTER);
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPC c = new MyPC();
			}
		});

		com.setBounds(10, 29, 200, 150);
		com.setBackground(Color.DARK_GRAY);
		com.setForeground(Color.WHITE);
		com.setFocusable(false);
		com.setBorderPainted(false);
		contentPane.add(com);
		
		JButton text=new JButton("EDITOR");
		text.setIcon(new ImageIcon("editor.jpg"));
		text.setVerticalTextPosition(SwingConstants.BOTTOM);
		text.setHorizontalTextPosition(SwingConstants.CENTER);
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editor t = new Editor();
				t.setVisible(true);
			}
		});
		text.setBounds(530, 29, 200, 150);
		text.setBackground(Color.DARK_GRAY);
		text.setForeground(Color.WHITE);
		text.setFocusable(false);
		text.setBorderPainted(false);
		contentPane.add(text);

		
		JButton ter = new JButton("TERMINAL");
		ter.setIcon(new ImageIcon("terminal.jpg"));
		ter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Terminal term = Terminal.getInstance();
        			term.open(0, 0, 1000, 600);
			}
		});
		ter.setBounds(280, 29, 200, 150);
		ter.setVerticalTextPosition(SwingConstants.BOTTOM);
		ter.setHorizontalTextPosition(SwingConstants.CENTER);
		ter.setBackground(Color.DARK_GRAY);
		ter.setForeground(Color.WHITE);
		ter.setFocusable(false);
		ter.setBorderPainted(false);
		contentPane.add(ter);

		
		JButton disk = new JButton("Disk Scheduling Algorithms");
		disk.setIcon(new ImageIcon("disk.jpg"));
		disk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
				public void run() {
				try {
					gui_disk window = new gui_disk();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
			}
		});
		disk.setBounds(72, 257, 200, 150);
		disk.setVerticalTextPosition(SwingConstants.BOTTOM);
		disk.setHorizontalTextPosition(SwingConstants.CENTER);
		disk.setBackground(Color.DARK_GRAY);
		disk.setForeground(Color.WHITE);
		disk.setFocusable(false);
		disk.setBorderPainted(false);
		contentPane.add(disk);
		
		JButton game = new JButton("Snake Game");
		game.setIcon(new ImageIcon("snake.jpg"));
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game g = new Game();
				g.setVisible(true);
			}
		});
		// game.setBounds(275, 207, 135, 96);
		game.setBounds(450, 257, 200, 150);
		game.setVerticalTextPosition(SwingConstants.BOTTOM);
		game.setHorizontalTextPosition(SwingConstants.CENTER);
		game.setBackground(Color.DARK_GRAY);
		game.setForeground(Color.WHITE);
		game.setFocusable(false);
		game.setBorderPainted(false);
		contentPane.add(game);
		
	}

}
