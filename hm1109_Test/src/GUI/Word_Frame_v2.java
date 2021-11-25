package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import DAO.Word_DAO;
import DTO.Word_DTO;

public class Word_Frame_v2 extends JFrame implements ActionListener, ItemListener {
	
	private JPanel north_p = new JPanel();	
	private JButton b1 = new JButton("��ü����");
	private JButton b2 = new JButton("�߰�");
	private JButton b3 = new JButton("�˻�");
	
	// �ܾ� �߰� ������Ʈ
	private JPanel add_p = new JPanel();
	private JPanel add_p_c = new JPanel();
	private JLabel add_lb1 = new JLabel("               ����");
	private JTextField add_tf1 = new JTextField(8);
	private JLabel add_lb2 = new JLabel("               �ѱ�");
	private JTextField add_tf2 = new JTextField(8);
	private JButton save_btn = new JButton("SAVE");
	
	// �ܾ� ����Ʈ ������Ʈ
	private JPanel viewList_p = new JPanel();
	private List wordList = new List(7);
	private TextArea info = new TextArea(4, 20);
	
	// �ܾ� �˻� ������Ʈ
	private JPanel search_p = new JPanel();
	private JPanel search_p_c = new JPanel();
	private TextArea search_info = new TextArea(4, 20);
	private JLabel search_lb = new JLabel("      ���� �Է�");
	private JTextField search_tf = new JTextField(8);
	private JButton search_btn = new JButton("SEARCH");
	
	
	private Word_DAO hmwordDAO = null;
	private ArrayList<Word_DTO> wlist = null;
	
	public Word_Frame_v2() {
		hmwordDAO = Word_DAO.getInstance();
		menu(); // ���θ޴������
		add_panel(); // �߰�ȭ�������
		viewList_panel(); // ��ü���� ȭ�� ������
		addlis(); // ������ ���
		init(); // ������ ȭ�鿡 ���̱�
		search_panel(); // �˻�ȭ�� ������
		loadData();
	}

	private void search_panel() {
		search_p.setLayout(new BorderLayout());
		search_p_c.setLayout(new GridLayout());
		search_p_c.add(search_lb);
		search_p_c.add(search_tf);
		search_p_c.add(search_info);
		search_p.add("Center", search_p_c);
		search_p.add("South", search_btn);	
	}
	
	private void add_panel() {
		add_p.setBackground(Color.CYAN);
		add_p.setLayout(new BorderLayout());
		add_p_c.setLayout(new GridLayout(2,2));
		add_p_c.add(add_lb1);
		add_p_c.add(add_tf1);
		add_p_c.add(add_lb2);
		add_p_c.add(add_tf2);
		add_p.add("Center", add_p_c);
		add_p.add("South", save_btn);	
	}

	private void loadData() {
		wordList.removeAll();
		wlist = hmwordDAO.selectAll();
		System.out.println(wlist.size());
		for (int i = 0; i < wlist.size(); i++) {
			wordList.add(wlist.get(i).getkWord());
		}
	}
	
	private void searchData(Word_DTO w) {
		wlist = hmwordDAO.selectAll();
		System.out.println(wlist.size());
		for (int i = 0; i < wlist.size(); i++) {
			if (wlist.get(i).geteWord().equals(w.geteWord())) {
				w.setkWord(wlist.get(i).getkWord());
				searchView(w);
			}
		}
	}
	
	private void addlis() { // ������ ��� �ڿ�
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		save_btn.addActionListener(this);
		search_btn.addActionListener(this);
		
		wordList.addItemListener(this); // ����Ʈ���� ������ ���� ó��
	}

	private void menu() {
		north_p.setLayout(new GridLayout());
		north_p.add(b1);
		north_p.add(b2);
		north_p.add(b3);
	}

	private void viewList_panel() {
		viewList_p.setBackground(Color.orange);
		viewList_p.setLayout(new GridLayout());
		viewList_p.add(wordList);
		viewList_p.add(info);
	}

	private void init() {
		this.add("North", north_p);
		this.add("Center", viewList_p);
		this.setBounds(200, 300, 300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b2)) {
			this.remove(viewList_p);
			this.remove(search_p);
			this.add("Center", add_p);
			this.setVisible(false);
			this.setVisible(true);
			info.setText("");
			search_info.setText("");
		}else if (e.getSource().equals(b1)) {
			this.remove(add_p);
			this.remove(search_p);
			this.add("Center", viewList_p);
			this.setVisible(false);
			this.setVisible(true);
			info.setText("");
			search_info.setText("");
		} else if (e.getSource().equals(b3)) {
			this.remove(viewList_p);
			this.remove(add_p);
			this.add("Center", search_p);
			this.setVisible(false);
			this.setVisible(true);
			info.setText("");
			search_info.setText("");
		} else if(e.getSource().equals(save_btn)){
			String word1 = add_tf1.getText();
			String word2 = add_tf1.getText();
			if (word1.equals("")) {
				JOptionPane.showMessageDialog(null, "���ܾ�� �ʼ��Դϴ�", "���", JOptionPane.WARNING_MESSAGE);
				System.out.println("���ܾ�� �ʼ��Դϴ�");
			}else {
				Word_DTO newm = new Word_DTO();
				newm.seteWord(word1);
				newm.setkWord(word2);
				hmwordDAO.add(newm);
				add_tf1.setText("");
				add_tf2.setText("");
				loadData();
			}
		}else if(e.getSource().equals(search_btn)){
			String word = search_tf.getText();
			Word_DTO newm = new Word_DTO();
			newm.seteWord(word);
			newm = hmwordDAO.selectOne(newm);
			search_tf.setText("");
			
			if (newm.geteWord() == null) {
				search_info.append("NO DATA");
			}else {
				search_info.setText("");
				search_info.append(" ����: " + newm.geteWord() + "\n");
				search_info.append(" �ѱ�: " + newm.getkWord() + "\n");
			}
			
//			if (word.equals("")) {
//				System.out.println("�˻�� �Է��Ͻÿ�");
//			}else {
//				Word_DTO newm = new Word_DTO();
//				newm.seteWord(word);
//				searchData(newm);
//				search_tf.setText("");
//
//			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource().equals(wordList)) {
			int selIndex = wordList.getSelectedIndex();
			System.out.println(selIndex);
			Word_DTO w = wlist.get(selIndex);
			detailView(w);
		}		
	}

	private void detailView(Word_DTO w) {
		info.setText("");
		info.append(" ����: " + w.geteWord() + "\n");
		info.append(" �ѱ�: " + w.getkWord() + "\n");
	}
	
	private void searchView(Word_DTO w) {
		search_info.setText("");
		search_info.append(" ����: " + w.geteWord() + "\n");
		search_info.append(" �ѱ�: " + w.getkWord() + "\n");
	}

}