import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class XO extends JFrame  implements ActionListener
{
	  private JMenuBar menuBar = new JMenuBar();
	  private JMenu test = new JMenu("Menu");
	  private JMenuItem item1 = new JMenuItem("reset");
	  private JMenuItem item2 = new JMenuItem("recommencer");
	  private JMenuItem item3 = new JMenuItem("Exit");
	  
	   private JButton btn1 = new JButton();
	   private JButton btn2 = new JButton();
	   private JButton btn3 = new JButton();
	   private JButton btn4 = new JButton();
	   private JButton btn5 = new JButton();
	   private JButton btn6 = new JButton();
	   private JButton btn7 = new JButton();
	   private JButton btn8 = new JButton();
	   private JButton btn9 = new JButton();
	   
	   private JButton btnR = new JButton("Reset");
	   private JButton btnRE = new JButton("recommencer");
	   private JButton btnE = new JButton("Exit");
	   

	  private JRadioButton jr1 = new JRadioButton("X",false);
	  private JRadioButton jr2 = new JRadioButton("O",false);
	  private ButtonGroup g1 = new ButtonGroup();
	  
	  private JTextField t1 = new JTextField();
	  private JLabel label1 = new JLabel("jouer avec X");
	  private JTextField t2 = new JTextField();
	  private JLabel label2 = new JLabel("jouer evec O");
	  
    public XO()
    {

		this.setTitle("XO");
	    this.setSize(700,400);
	    this.setLocationRelativeTo(null); 
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	    
	    this.test.add(item1);
	    this.test.add(item2);
	    this.test.add(item3);
	    this.menuBar.add(test);
	    this.setJMenuBar(menuBar);
	    
	    g1.add(jr1);
	    g1.add(jr2);
	    
	    btnR.setFont(new Font("Tahoma",Font.ITALIC,20));
	    btnRE.setFont(new Font("Tahoma",Font.ITALIC,20));
	    btnE.setFont(new Font("Tahoma",Font.ITALIC,20));
	    btnE.setForeground(Color.red);
	    
	    Font police = new Font("Arial", Font.BOLD, 14);
	    t1.setFont(police);
	    t1.setPreferredSize(new Dimension(130, 30));
	    t1.setForeground(Color.black);
	    t1.setText(0+"");
	    t1.setEditable(false);
	    t1.setBorder(new LineBorder(new Color(0,0,0),2));
	    t2.setFont(police);
	    t2.setPreferredSize(new Dimension(130, 30));
	    t2.setForeground(Color.black);
	    t2.setEditable(false);
	    t2.setText(0+"");
	    t2.setBorder(new LineBorder(new Color(0,0,0),2));
	    
	    GridLayout gl = new GridLayout();
	    gl.setColumns(4);
	    gl.setRows(4);
	    JPanel panneau = new JPanel();
	    panneau.setLayout(gl);
	   
	    
	    JPanel pan1 = new JPanel();
	    pan1.add(label1);
	    pan1.add(t1);
	    
	    JPanel pan2 = new JPanel();
	    pan2.add(label2);
	    pan2.add(t2);
	    
	    panneau.add(btn1);
	    panneau.add(btn2);
	    panneau.add(btn3);
	    panneau.add(btnR);
	    panneau.add(btn4);
	    panneau.add(btn5);
	    panneau.add(btn6);
	    panneau.add(btnRE);
	    panneau.add(btn7);
	    panneau.add(btn8);
	    panneau.add(btn9);
	    panneau.add(btnE);
	    panneau.add(jr1);
	    panneau.add(jr2);
	    panneau.add(pan1);
	    panneau.add(pan2);
	    
	   
	   
	    this.setContentPane(panneau);
	    
	    btn1.addActionListener(this);
	    btn2.addActionListener(this);
	    btn3.addActionListener(this);
	    btn4.addActionListener(this);
	    btn5.addActionListener(this);
	    btn6.addActionListener(this);
	    btn7.addActionListener(this);
	    btn8.addActionListener(this);
	    btn9.addActionListener(this);
	    jr1.addActionListener(this);
	    jr2.addActionListener(this);
	  
	    btnR.addActionListener(this);
	    btnE.addActionListener(this);
	    btnRE.addActionListener(this);
	    
	    item1.addActionListener(this);
	    item2.addActionListener(this);
	    item3.addActionListener(this);
	    t1.addActionListener(this);
	    t2.addActionListener(this);
	  
	    this.setVisible(true);
    }

    
    
  
	public void actionPerformed(ActionEvent e)
	
	{
		
		
		 if(jr1.isSelected())
		  {
			 if(e.getSource()== btn1)
			 {
				  
				    btn1.setText("X");
				    
				    btn1.setEnabled(false);
				    
				    jr2.setSelected(true);
				    
			 }
			 if(e.getSource()== btn2)
			 {
				    btn2.setText("X");
				    btn2.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn3)
			 {
				    btn3.setText("X");
				    btn3.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn4)
			 {
				    btn4.setText("X");
				    btn4.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn5)
			 {
				    btn5.setText("X");
				    btn5.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn6)
			 {
				    btn6.setText("X");
				    btn6.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn7)
			 {
				    btn7.setText("X");
				    btn7.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn8)
			 {
				    btn8.setText("X");
				    btn8.setEnabled(false);
				    jr2.setSelected(true);
			 }
			 if(e.getSource()== btn9)
			 {
				    btn9.setText("X");
				    btn9.setEnabled(false);
				    jr2.setSelected(true);
			 }
		  }
		  
		else if(jr2.isSelected())
		  {
			 if(e.getSource()== btn1)
			 {
				    btn1.setText("O");
				    btn1.setEnabled(false);
				    jr1.setSelected(true);
				    
			 }
			 if(e.getSource()== btn2)
			 {
				    btn2.setText("O");
				    btn2.setEnabled(false);
				    jr1.setSelected(true);
				    
			 }
			 if(e.getSource()== btn3)
			 {
				    btn3.setText("O");
				    btn3.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn4)
			 {
				    btn4.setText("O");
				    btn4.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn5)
			 {
				    btn5.setText("O");
				    btn5.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn6)
			 {
				    btn6.setText("O");
				    btn6.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn7)
			 {
				    btn7.setText("O");
				    btn7.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn8)
			 {
				    btn8.setText("O");
				    btn8.setEnabled(false);
				    jr1.setSelected(true);
			 }
			 if(e.getSource()== btn9)
			 {
				    btn9.setText("O");
				    btn9.setEnabled(false);
				    jr1.setSelected(true);
				    
			 }
		  }
     //////////////////////////////////////////////////////
		  if(e.getSource()== btnE)
		  {
			  
			 JFrame  f = new JFrame("Exit");
			   if(JOptionPane.showConfirmDialog(f, "confirmez si vous voulez sortir","XO" ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			   {
				   System.exit(1);
			   }
		  }
		  if(e.getSource()== btnR)
		  {
			 btn1.setText(null);
			 btn1.setEnabled(true);
			 btn2.setText(null);
			 btn2.setEnabled(true);
			 btn3.setText(null);
			 btn3.setEnabled(true);
			 btn4.setText(null);
			 btn4.setEnabled(true);
			 btn5.setText(null);
			 btn5.setEnabled(true);
			 btn6.setText(null);
			 btn6.setEnabled(true);
			 btn7.setText(null);
			 btn7.setEnabled(true);
			 btn8.setText(null);
			 btn8.setEnabled(true);
			 btn9.setText(null);
			 btn9.setEnabled(true);
			 t1.setText(0+"");
			 t2.setText(0+"");
			 
		  }
		  if(e.getSource()== btnRE)
		  { 
			 btn1.setText(null);
			 btn1.setEnabled(true);
			 btn2.setText(null);
			 btn2.setEnabled(true);
			 btn3.setText(null);
			 btn3.setEnabled(true);
			 btn4.setText(null);
			 btn4.setEnabled(true);
			 btn5.setText(null);
			 btn5.setEnabled(true);
			 btn6.setText(null);
			 btn6.setEnabled(true);
			 btn7.setText(null);
			 btn7.setEnabled(true);
			 btn8.setText(null);
			 btn8.setEnabled(true);
			 btn9.setText(null);
			 btn9.setEnabled(true);
			 
			 btn1.setBackground(null);
			 btn2.setBackground(null);
			 btn3.setBackground(null);
			 btn4.setBackground(null);
			 btn5.setBackground(null);
			 btn6.setBackground(null);
			 btn7.setBackground(null);
			 btn8.setBackground(null);
			 btn9.setBackground(null);
			     
		  }
		  
		  if(e.getSource()== item1)
		  {  
			 btn1.setText(null);
			 btn1.setEnabled(true);
			 btn2.setText(null);
			 btn2.setEnabled(true);
			 btn3.setText(null);
			 btn3.setEnabled(true);
			 btn4.setText(null);
			 btn4.setEnabled(true);
			 btn5.setText(null);
			 btn5.setEnabled(true);
			 btn6.setText(null);
			 btn6.setEnabled(true);
			 btn7.setText(null);
			 btn7.setEnabled(true);
			 btn8.setText(null);
			 btn8.setEnabled(true);
			 btn9.setText(null);
			 btn9.setEnabled(true);
			 t1.setText(0+"");
			 t2.setText(0+"");
		  }
		  if(e.getSource()== item2)
		  {
			 btn1.setText(null);
			 btn1.setEnabled(true);
			 btn2.setText(null);
			 btn2.setEnabled(true);
			 btn3.setText(null);
			 btn3.setEnabled(true);
			 btn4.setText(null);
			 btn4.setEnabled(true);
			 btn5.setText(null);
			 btn5.setEnabled(true);
			 btn6.setText(null);
			 btn6.setEnabled(true);
			 btn7.setText(null);
			 btn7.setEnabled(true);
			 btn8.setText(null);
			 btn8.setEnabled(true);
			 btn9.setText(null);
			 btn9.setEnabled(true);
			 
			 btn1.setBackground(null);
			 btn2.setBackground(null);
			 btn3.setBackground(null);
			 btn4.setBackground(null);
			 btn5.setBackground(null);
			 btn6.setBackground(null);
			 btn7.setBackground(null);
			 btn8.setBackground(null);
			 btn9.setBackground(null);
			     
			  
		  }
		  if(e.getSource()== item3)
		  {
			  
			  JFrame  f1 = new JFrame("Exit");
			   if(JOptionPane.showConfirmDialog(f1, "confirmez si vous voulez sortir","XO" ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			   {
				   System.exit(1);
			   }
		  }
		
		  ////////////chose_the_winner_in_X////
		    
		  if( btn1.getText()=="X" && btn2.getText() == "X" && btn3.getText()=="X")
				  
		  {
			      btn1.setBackground(Color.cyan);
			      btn2.setBackground(Color.cyan);
			      btn3.setBackground(Color.cyan);
			     JOptionPane jop1 = new JOptionPane();
				 jop1.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 
				 int s1 = Integer.parseInt(t1.getText());
				 s1++;
				 t1.setText(s1+"");
				 
		  }
		  if(btn4.getText()=="X" && btn5.getText() == "X" && btn6.getText()=="X")
			  
		  {
			      btn4.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn6.setBackground(Color.cyan);
			     JOptionPane jop2 = new JOptionPane();
				 jop2.showMessageDialog(null, "lejouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 
				 int s2 = Integer.parseInt(t1.getText());
				 s2++;
				 t1.setText(s2+"");
				 
				 
		  }
          if(btn7.getText()=="X" && btn8.getText() == "X" && btn9.getText()=="X")  
		  {
			      btn7.setBackground(Color.cyan);
			      btn8.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane jop3 = new JOptionPane();
				 jop3.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s3 = Integer.parseInt(t1.getText());
				 s3++;
				 t1.setText(s3+"");
				
				 
		  }
          if(btn1.getText()=="X" && btn4.getText() == "X" && btn7.getText()=="X")  
		  {
			      btn1.setBackground(Color.cyan);
			      btn4.setBackground(Color.cyan);
			      btn7.setBackground(Color.cyan);
			     JOptionPane jop4 = new JOptionPane();
				 jop4.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s4 = Integer.parseInt(t1.getText());
				 s4++;
				 t1.setText(s4+"");
				 
				 
		  }
          if(btn2.getText()=="X" && btn5.getText() == "X" && btn8.getText()=="X")
		  {
			      btn2.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn8.setBackground(Color.cyan);
			     JOptionPane jop5 = new JOptionPane();
				 jop5.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s5 = Integer.parseInt(t1.getText());
				 s5++;
				 t1.setText(s5+"");
				 
		  }
		  if(btn3.getText()=="X" && btn6.getText() == "X" && btn9.getText()=="X")  
		  {
			      btn3.setBackground(Color.cyan);
			      btn6.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane jop1 = new JOptionPane();
				 jop1.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s6 = Integer.parseInt(t1.getText());
				 s6++;
				 t1.setText(s6+"");
				 
		  }
		  if(btn1.getText()=="X" && btn5.getText() == "X" && btn9.getText()=="X")  
		  {
			      btn1.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane jop6 = new JOptionPane();
				 jop6.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s7 = Integer.parseInt(t1.getText());
				 s7++;
				 t1.setText(s7+"");
				 
		  }
		  if(btn3.getText()=="X" && btn5.getText() == "X" && btn7.getText()=="X")  
		  {
			      btn3.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn7.setBackground(Color.cyan);
			     JOptionPane jop7= new JOptionPane();
				 jop7.showMessageDialog(null, "le jouer X est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int s8= Integer.parseInt(t1.getText());
				 s8++;
				 t1.setText(s8+"");
				 
		  }
		  ////////////chose_the_winner_in_O////
		  
		  if( btn1.getText()=="0" && btn2.getText() == "0" && btn3.getText()=="0")
			  
		  {
			      btn1.setBackground(Color.cyan);
			      btn2.setBackground(Color.cyan);
			      btn3.setBackground(Color.cyan);
			     JOptionPane j1 = new JOptionPane();
				 j1.showMessageDialog(null, "le jouer 0 est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c1 = Integer.parseInt(t2.getText());
				 c1++;
				 t2.setText(c1+"");
				 
				 
		  }
		  if(btn4.getText()=="O" && btn5.getText() == "O" && btn6.getText()=="O")
			  
		  {
			      btn4.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn6.setBackground(Color.cyan);
			     JOptionPane j2 = new JOptionPane();
				 j2.showMessageDialog(null, "le jouer 0 est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c2 = Integer.parseInt(t2.getText());
				 c2++;
				 t2.setText(c2+"");
		  }
          if(btn7.getText()=="O" && btn8.getText() == "O" && btn9.getText()=="O")  
		  {
			      btn7.setBackground(Color.cyan);
			      btn8.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane j3 = new JOptionPane();
				 j3.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c3 = Integer.parseInt(t2.getText());
				 c3++;
				 t2.setText(c3+"");

		  }
          if(btn1.getText()=="O" && btn4.getText() == "O" && btn7.getText()=="O")  
		  {
			      btn1.setBackground(Color.cyan);
			      btn4.setBackground(Color.cyan);
			      btn7.setBackground(Color.cyan);
			     JOptionPane j4 = new JOptionPane();
				 j4.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c4 = Integer.parseInt(t2.getText());
				 c4++;
				 t2.setText(c4+"");
		  }
          if(btn2.getText()=="O" && btn5.getText() == "O" && btn8.getText()=="O")
		  {
			      btn2.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn8.setBackground(Color.cyan);
			     JOptionPane j5 = new JOptionPane();
				 j5.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c5 = Integer.parseInt(t2.getText());
				 c5++;
				 t2.setText(c5+"");
		  }
		  if(btn3.getText()=="O" && btn6.getText() == "O" && btn9.getText()=="O")  
		  {
			      btn3.setBackground(Color.cyan);
			      btn6.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane j1 = new JOptionPane();
				 j1.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c6 = Integer.parseInt(t2.getText());
				 c6++;
				 t2.setText(c6+"");
		  }
		  if(btn1.getText()=="O" && btn5.getText() == "O" && btn9.getText()=="O")  
		  {
			      btn1.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn9.setBackground(Color.cyan);
			     JOptionPane j6 = new JOptionPane();
				 j6.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c7 = Integer.parseInt(t2.getText());
				 c7++;
				 t2.setText(c7+"");
		  }
		  if(btn3.getText()=="O" && btn5.getText() == "O" && btn7.getText()=="O")  
		  {
			      btn3.setBackground(Color.cyan);
			      btn5.setBackground(Color.cyan);
			      btn7.setBackground(Color.cyan);
			     JOptionPane j7= new JOptionPane();
				 j7.showMessageDialog(null, "le jouer O est le  gagnant", "Message", JOptionPane.INFORMATION_MESSAGE);
				 int c8 = Integer.parseInt(t2.getText());
				 c8++;
				 t2.setText(c8+"");
		}     
		  
		  
		
		
		
		
	}
}
