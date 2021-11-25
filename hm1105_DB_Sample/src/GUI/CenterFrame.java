package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import DAO.DAO_hmember;
import DTO.Member_DTO;

public class CenterFrame extends JFrame implements ActionListener{
	// interface ����, Ư���� ����� ����ϵ��� ����.
	// interface�� �����ϴ� ����� �߽����� �����ϸ� ��.
	// ActionListener�� ������Ʈ�� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �������̽�
	
	private Label lb1  = new Label("�ڹ����α׷�");
	private Label lb2  = new Label("�ڹ����α׷�");
	private Label idLb  = new Label("I  D");
	private Label pwdLb  = new Label("Pass");
	private Label nameLb  = new Label("Name");
	
	private JButton inputBtn = new JButton("input");
	private JTextField inputIdTF = new JTextField(8);
	private JTextField idTF = new JTextField(8);
	private JTextField pwdTF = new JTextField(8);
	private JTextField nameTF = new JTextField(8);
	
	private JPanel main_North_P = new JPanel();
	private JPanel main_North_P_South = new JPanel();
	private JPanel main_Center_P = new JPanel();
	private JPanel main_Center_P_Center = new JPanel();
	private JPanel main_Center_P_Center_N = new JPanel();
	private JPanel main_Center_P_Center_C = new JPanel();
	private JPanel main_Center_P_Center_S = new JPanel();

	private JButton listBtn = new JButton("���");
	private JButton insertBtn = new JButton("���");
	private JButton deleteBtn = new JButton("����");
	private JButton updateBtn = new JButton("����");
	private JButton searchBtn = new JButton("�˻�");
	private JButton saveBtn = new JButton("����");
	
	private DAO_hmember mydao = new DAO_hmember();
	
	public CenterFrame() {
		init(); // ȣ��
	}

	private void init() {
		main_North_P.setBackground(Color.CYAN);
		main_North_P_South.setBackground(Color.pink);
		main_Center_P.setBackground(Color.green);
		// main_Center_P_Center.setBackground(Color.orange);
		main_Center_P.setLayout(new BorderLayout());
		main_Center_P.add("East",saveBtn);
		main_Center_P.add("Center",main_Center_P_Center);
		
		main_Center_P_Center_N.add(idLb);
		main_Center_P_Center_N.add(idTF);
		main_Center_P_Center.add("North", main_Center_P_Center_N);
		main_Center_P_Center_C.add(pwdLb);
		main_Center_P_Center_C.add(pwdTF);
		main_Center_P_Center.add("North", main_Center_P_Center_C);
		main_Center_P_Center_S.add(nameLb);
		main_Center_P_Center_S.add(nameTF);
		main_Center_P_Center.add("North", main_Center_P_Center_S);
		
		main_North_P.setLayout(new BorderLayout()); // ���̾ƿ� ����
		main_North_P_South.add(listBtn);
		main_North_P_South.add(insertBtn);
		main_North_P_South.add(deleteBtn);
		main_North_P_South.add(updateBtn);
		main_North_P_South.add(searchBtn);
		
		main_North_P.add("North", lb1);
		main_North_P.add("Center", main_North_P_South);
		
		inputIdTF.addActionListener(this); // 2.������Ʈ�� �����ʿ� ����ؼ� �̺�Ʈ�� ����
		saveBtn.addActionListener(this);   //   �̺�Ʈ�� �����Ǹ� �̺�Ʈ�� ó���� ��ü
							   			   //   actionPerformed(ActionEvent e) ó��
		this.add("North", main_North_P);
		this.add("South", inputIdTF);
		this.add("Center", main_Center_P);
		
		// GUI ȭ�鱸���ϱ�
		this.setBounds(200, 300, 300, 500); // â�� ��ġ�� ũ��
		this.setVisible(true); // â�� Ű�°�, ������ ���α׷� ����� �ٸ�
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // �������� �����ư�� ������ ���α׷��� ����
	}

	@Override // implements ActionListener ����� �����ϴ� �޼���
			  // ActionListener���� �����ϰ� �ִ� �Լ��� ���� �����ϰ��� �ϴ� ������� ������ ��.
	public void actionPerformed(ActionEvent e) {
		// ������Ʈ�� �̺�Ʈ�� ó���ϸ� �̸� ó���ϴ� ����� ������ �޼���
		String str = e.getActionCommand(); // e�� �̺�Ʈ�� �߻��� ��ü
		if(str.equals("����")){
			// ����ó��, DB�� ����
			Member_DTO newm = new Member_DTO();
			newm.setId(idTF.getText());
			newm.setPwd(pwdTF.getText());
			newm.setName(nameTF.getText());
			mydao.add(newm);
			// String txt = idTF.getText()+" / "+pwdTF.getText()+" / "+nameTF.getText();
			// inputIdTF.setText(txt);
		}else {
			String textName = inputIdTF.getText();
			lb1.setText(textName);
			inputIdTF.setText("");
		}
	}
	
}