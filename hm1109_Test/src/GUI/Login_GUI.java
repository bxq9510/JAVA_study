package GUI;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login_GUI extends JFrame implements ActionListener {
	
	private JLabel login_lb = new JLabel("LOGIN");
	private JTextField id_tf = new JTextField(8);
	private JButton login_btn = new JButton("LOGIN");
	
	public Login_GUI() {

		this.setLayout(new GridLayout());
		this.add(login_lb);
		this.add(id_tf);
		this.add(login_btn);
		
		login_btn.addActionListener(this);
		
		this.setBounds(100, 100, 300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(login_btn)) {
			// dao�� �Է��� ���̵� ����
			// �̋� �ش��ϴ� ���̵� �ִٸ� �α���, �ƴϸ� �����ڰ� �ƴմϴ�
			boolean b = true; // b��� ������ ������ �Ǻ��� ��� (����, �̰���)
			if (b) { // �������� ���
				new Word_Frame_v2();
				this.setVisible(false); // ������ ��, ���α׷����ᰡ �ƴ�.. â�� ���� ��
				
			}else { // �̰������� ���
				System.out.println("�̰����� �Դϴ�.");
			}
		}
	}
}
