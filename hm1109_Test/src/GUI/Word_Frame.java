package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import DAO.Word_DAO;
import DTO.Word_DTO;

public class Word_Frame extends JFrame implements ActionListener {
	
	private Label lb1  = new Label("단어저장프로그램 Ver1.0");
	private Label eLb  = new Label("영어");
	private Label kLb  = new Label("한글");
	
	private JTextField eTF = new JTextField(15);
	private JTextField kTF = new JTextField(15);
	
	private JPanel main_North_P = new JPanel();
	private JPanel main_Center_P = new JPanel();
	private JPanel main_Center_P_Center = new JPanel();
	private JPanel main_Center_P_Center_N = new JPanel();
	private JPanel main_Center_P_Center_C = new JPanel();
	private JPanel main_Center_P_Center_S = new JPanel();

	private JButton saveBtn = new JButton("저장");
	private JButton listBtn = new JButton("전체보기");
	private JButton delBtn = new JButton("삭제");
	private JButton editBtn = new JButton("수정");
	
	private Word_DAO dao = new Word_DAO();
	
	public Word_Frame() {
		init();
	}

	private void init() {
		this.add("North", main_North_P);
		this.add("Center", main_Center_P);
		this.setBounds(200, 300, 300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		main_North_P.setBackground(Color.CYAN);
		
		main_Center_P.setLayout(new BorderLayout());
		main_North_P.add("Center", lb1);
		main_Center_P.add("Center",main_Center_P_Center);
		main_Center_P_Center_N.add(eLb);
		main_Center_P_Center_N.add(eTF);
		main_Center_P_Center.add("North", main_Center_P_Center_N);
		main_Center_P_Center_C.add(kLb);
		main_Center_P_Center_C.add(kTF);
		main_Center_P_Center.add("North", main_Center_P_Center_C);
		main_Center_P_Center_S.add(saveBtn);
		main_Center_P_Center.add("North", main_Center_P_Center_S);
		saveBtn.setPreferredSize(new Dimension(200,20));

		saveBtn.addActionListener(this); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		String str = e.getActionCommand();
		if(e.getSource().equals(saveBtn)){
			Word_DTO newm = new Word_DTO();
			newm.seteWord(eTF.getText());
			newm.setkWord(kTF.getText());
			dao.add(newm);
			eTF.setText("");
			kTF.setText("");
		}
	}
	
}
