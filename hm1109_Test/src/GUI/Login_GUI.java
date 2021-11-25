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
			// dao에 입력한 아이디를 전송
			// 이떄 해당하는 아이디가 있다면 로그인, 아니면 가입자가 아닙니다
			boolean b = true; // b라는 변수는 위에서 판별한 결과 (가입, 미가입)
			if (b) { // 가입자일 경우
				new Word_Frame_v2();
				this.setVisible(false); // 주의할 점, 프로그램종료가 아님.. 창만 닫을 뿐
				
			}else { // 미가입자일 경우
				System.out.println("미가입자 입니다.");
			}
		}
	}
}
