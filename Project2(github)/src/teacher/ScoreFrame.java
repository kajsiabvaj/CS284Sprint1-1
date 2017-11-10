package teacher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ScoreFrame extends JFrame{
	
	public JLabel lbNum , lbId , lbScore ,note;
	public JPanel  p1,p2,p3,p4,p5,pScore,pNote,pAll,panel;
	public JLabel[] arrNum ,arrId;
	public JTextField[] arrScore;
	public JButton cancel , save , submit;
	public JScrollPane scroll;
	
	public ScoreFrame() {
		setLayout(new BorderLayout());
		pAll = new JPanel() ;	
		pAll.setLayout(new BorderLayout());
		
		p1 = new JPanel() ;
		p1.setLayout(new GridLayout(0,1));
		lbNum = new JLabel("ลำดับ");
		p1.add(lbNum);
		
		arrNum = new JLabel[25] ;
		for (int i = 0; i < 25; i++) {
			int y = i+1 ;
			arrNum[i] = new JLabel(""+y);
			arrNum[i].setHorizontalAlignment ( SwingConstants.CENTER );
			p1.add(arrNum[i]);
		}
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 1));
		lbId = new JLabel("รหัสนักศึกษา");
		p2.add(lbId);
		arrId = new JLabel[25] ;
		for (int i = 0; i < 25; i++) {
			arrId[i] = new JLabel("590961000"+i);
			arrId[i].setHorizontalAlignment ( SwingConstants.CENTER );
			p2.add(arrId[i]);
		}
		
		p3 = new JPanel();
		p3.setLayout(new GridLayout(0, 1));
		lbScore = new JLabel("คะแนน");
		p3.add(lbScore);
		arrScore  = new JTextField[25] ;
		for (int i = 0; i < 25; i++) {
			arrScore [i] = new JTextField("");
			arrScore [i].setHorizontalAlignment ( SwingConstants.CENTER );
			p3.add(arrScore [i]);
		}
		
		lbNum.setFont(new Font("Angsana New", Font.BOLD, 30));
		lbId.setFont(new Font("Angsana New", Font.BOLD, 30));
		lbScore.setFont(new Font("Angsana New", Font.BOLD, 30));
		
		lbNum.setPreferredSize(new Dimension(125, 30));
		lbId.setPreferredSize(new Dimension(170, 30));
		lbScore.setPreferredSize(new Dimension(125, 30));
		
		lbNum.setHorizontalAlignment ( SwingConstants.CENTER );
		lbId.setHorizontalAlignment ( SwingConstants.CENTER );
		lbScore.setHorizontalAlignment ( SwingConstants.CENTER );
		
		pScore = new JPanel();
		pScore.setLayout(new GridLayout(0,3));
		pScore.add(p1);
		pScore.add(p2);
		pScore.add(p3);
		
		cancel = new JButton("cancel"); 
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		save = new JButton("save");
		submit = new JButton("submit");
		pNote = new JPanel();
		pNote.setLayout(new GridLayout(0, 1));
		p4 = new JPanel() ;	
		p4.add(cancel);
		p4.add(save);
		p4.add(submit);
		p5 = new JPanel();
		note = new JLabel("หมายเหตุ  ปุ่ม save คือการบันทึกข้อมูล  และ ปุ่ม submit คือแจ้งคะแนนให้นักศึกษาทราบ");
		note.setFont(new Font("Angsana New", Font.BOLD, 25));
		note.setForeground(Color.RED );
		p5.add(note);
		pNote.add(p4);
		pNote.add(p5);

		pAll.add(pScore, BorderLayout.CENTER);
		pAll.add(pNote,BorderLayout.SOUTH);
		panel = new JPanel();
		panel.add(pAll);
		scroll = new JScrollPane(panel);
		this.add(scroll,BorderLayout.CENTER);
		this.setTitle("กรอกคะแนน");
		this.setSize(700, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main (String[] args) {
		new ScoreFrame();
	}
}