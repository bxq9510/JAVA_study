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
	// interface 구현, 특정한 기능을 사용하도록 구현.
	// interface가 제공하는 기능을 중심으로 공부하면 됨.
	// ActionListener는 컴포넌트가 발생하는 이벤트를 처리하는 인터페이스
	
	private Label lb1  = new Label("자바프로그램");
	private Label lb2  = new Label("자바프로그램");
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

	private JButton listBtn = new JButton("목록");
	private JButton insertBtn = new JButton("등록");
	private JButton deleteBtn = new JButton("삭제");
	private JButton updateBtn = new JButton("수정");
	private JButton searchBtn = new JButton("검색");
	private JButton saveBtn = new JButton("저장");
	
	private DAO_hmember mydao = new DAO_hmember();
	
	public CenterFrame() {
		init(); // 호출
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
		
		main_North_P.setLayout(new BorderLayout()); // 레이아웃 변경
		main_North_P_South.add(listBtn);
		main_North_P_South.add(insertBtn);
		main_North_P_South.add(deleteBtn);
		main_North_P_South.add(updateBtn);
		main_North_P_South.add(searchBtn);
		
		main_North_P.add("North", lb1);
		main_North_P.add("Center", main_North_P_South);
		
		inputIdTF.addActionListener(this); // 2.컴포넌트를 리스너에 등록해서 이벤트를 감지
		saveBtn.addActionListener(this);   //   이벤트가 감지되면 이벤트를 처리할 객체
							   			   //   actionPerformed(ActionEvent e) 처리
		this.add("North", main_North_P);
		this.add("South", inputIdTF);
		this.add("Center", main_Center_P);
		
		// GUI 화면구성하기
		this.setBounds(200, 300, 300, 500); // 창의 위치와 크기
		this.setVisible(true); // 창을 키는것, 끌때는 프로그램 종료와 다름
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // 프레임의 종료버튼을 누르면 프로그램도 종료
	}

	@Override // implements ActionListener 기능을 정의하는 메서드
			  // ActionListener에서 정의하고 있는 함수를 내가 구현하고자 하는 방식으로 정의한 것.
	public void actionPerformed(ActionEvent e) {
		// 컴포넌트가 이벤트를 처리하면 이를 처리하는 기능을 정의한 메서드
		String str = e.getActionCommand(); // e는 이벤트를 발생한 객체
		if(str.equals("저장")){
			// 저장처리, DB에 저장
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