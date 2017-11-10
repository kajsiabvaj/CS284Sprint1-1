package teacher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CriteriaFrame1 extends JFrame {
	
	private JTextField totalCount;
	private JLabel lbtxt;
	private JButton bntAdd;
	private JButton bntNext;
	private JButton bntCancle;
	private JLabel label1;
	private JTextField courseName;
	
	public CriteriaFrame1(){
		
		JPanel testPanel = new JPanel();
		testPanel.setPreferredSize(new Dimension(700,180));
		
		label1 = new JLabel("ชื่อวิชา", JLabel.CENTER);
		label1.setFont(new Font("Angsana New", Font.BOLD, 30));
		courseName = new JTextField(20);
		JPanel coursePanel = new JPanel();
		coursePanel.setLayout(new BorderLayout());
		coursePanel.setPreferredSize(new Dimension(700,300));
		testPanel.add(label1);
		testPanel.add(courseName);
		coursePanel.add(testPanel,BorderLayout.SOUTH);
		this.add(coursePanel,BorderLayout.NORTH);
		
		lbtxt = new JLabel("จำนวนครั้งที่ท่านต้องการเก็บคะเเนน", JLabel.CENTER);
		lbtxt.setFont(new Font("Angsana New", Font.BOLD, 30));
		
		totalCount = new JTextField(10);
		bntAdd = new JButton("Add");
		
		//---------------------------------
		JPanel p1 = new JPanel();
		p1.add(totalCount);
		p1.add(bntAdd);
		//---------------------------------
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,0));
//		panel1.add(coursePanel);
		panel1.add(lbtxt);
		panel1.add(p1);
		
		bntNext = new JButton("Next");
		bntCancle = new JButton("Cancle");
		
		bntNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CriteriaFrame2 c2 = new CriteriaFrame2();

			}
		});
		
		
		bntCancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(700,100));
		p2.add(bntNext);
		p2.add(bntCancle);

		this.add(panel1,BorderLayout.CENTER);
		this.add(p2, BorderLayout.SOUTH);
		this.setTitle("กรอกสัดส่วนของคะเเนน");
		this.setSize(700,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CriteriaFrame1();
	}

}
