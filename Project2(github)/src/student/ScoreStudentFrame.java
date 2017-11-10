package student;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreStudentFrame extends JFrame{

	public ScoreStudentFrame() {
		
		this.setTitle("คะแนนวิชา CS284");
		JPanel northPanel = new JPanel();
		JLabel subjectName = new JLabel("คะแนนวิชา CS284");
		northPanel.add(subjectName);
		this.add(northPanel,BorderLayout.NORTH);
		
		String data[][] = { { "1", "5909610098","0","0" },{ "2", "5909680109","0","0" },{ "3", "5909520032","0","0" },{ "4", "5909520024","0","0" } };
		String header[] = { "เลขที่", "เลขทะเบียน", "คะแนนดิบ","คะแนนสุทธิ" };
		JTable table = new JTable(data,header);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(300);
		table.getColumnModel().getColumn(2).setPreferredWidth(140);
		table.getColumnModel().getColumn(3).setPreferredWidth(140);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		this.add(scrollPane);
		
		JPanel buttonPanel = new JPanel();
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonPanel.add(cancelBtn);
		this.add(buttonPanel,BorderLayout.SOUTH);
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		ScoreStudentFrame sf = new ScoreStudentFrame();

	}

}
