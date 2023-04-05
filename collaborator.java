import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class collaborator extends JFrame {
    public collaborator() {
        initialize();
    }

    public void initialize() {
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        JPanel panel=createPanel();
        // this.add(panel,SwingConstants.CENTER);
		panel.setLayout(null);
		setContentPane(panel);

    }
    private JPanel createPanel() {
        JPanel panel =new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setForeground(Color.white);
        panel.setBackground(Color.BLACK);
        panel.setSize(800,500);
        JLabel label1=new JLabel("COLLABORATORS");
        JLabel label2=new JLabel("Chandra Prakash");
        JLabel label3=new JLabel("Chenreddy Sumana");
        JLabel label4=new JLabel("Chippada Kodandaram (RAM)");
        JLabel label5=new JLabel("Daivik Naagar");
		label1.setBounds(250, 0, 600, 150);
		label2.setBounds(290, 80, 600, 150);
		label3.setBounds(290, 120, 600, 150);
		label4.setBounds(290, 160, 600, 150);
		label5.setBounds(290, 200, 600, 150);
        label1.setFont(new Font("Arial", Font.BOLD, 32));
        label1.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial", Font.ITALIC, 24));
        label2.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial", Font.ITALIC, 24));
        label3.setForeground(Color.WHITE);
        label4.setFont(new Font("Arial", Font.ITALIC, 24));
        label4.setForeground(Color.WHITE);
        label5.setFont(new Font("Arial", Font.ITALIC, 24));
        label5.setForeground(Color.WHITE);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                collaborator c=new collaborator();
                c.setVisible();
            }
        });
    }
    public void setVisible() {
        setVisible(true);
    }

}
