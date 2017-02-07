package lastJava;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class LastJava extends Frame implements ActionListener, WindowListener{

	public static void main(String[] args) {
		LastJava lj = new LastJava();
		lj.setSize(300, 300);
		lj.setVisible(true);
		
	}
	
	@Override
	public Insets getInsets() {	return new Insets(65, 20, 20, 20); }

	/* 공통 */
	HashMap<String, Boolean> map;
	MenuBar mb;
	Menu m_menu;
	MenuItem mi_add, mi_reset, mi_list, mi_close;
	Panel p_main;
	Label lb_main_title;
	
	/* 예약 */
	Label lb_add_title, lb_add_msg;
	Button bt_add_result;
	Checkbox cbs[];
	
	/* 취소 */
	Label lb_reset_title, lb_reset_num, lb_reset_msg;
	TextField tf_reset_num;
	Button btn_reset_result;
	
	/* 현황 보기 */
	Label lb_list_title;
	TextArea ta_list;
	
	
	public LastJava() {
		map = new HashMap<String, Boolean>();
		map.put("101", false);
		map.put("102", false);
		map.put("103", false);
		map.put("201", false);
		map.put("202", false);
		map.put("203", false);
		map.put("301", false);
		map.put("302", false);
		map.put("303", false);
		
		mb = new MenuBar();
		this.setMenuBar(mb);
		m_menu = new Menu("메뉴");
		mb.add(m_menu);
		mi_add = new MenuItem("예약하기");
		mi_reset = new MenuItem("예약 취소하기");
		mi_list = new MenuItem("예약 현황");
		mi_close = new MenuItem("종료");
		m_menu.add(mi_add);
		m_menu.add(mi_reset);
		m_menu.add(mi_list);
		m_menu.addSeparator();
		m_menu.add(mi_close);
		
		p_main = new Panel(new BorderLayout());
		this.add(p_main);
		lb_main_title = new Label("숙박 예약 관리 프로그램 v 2.0", Label.CENTER);
		p_main.add(lb_main_title);
		
		mi_add.addActionListener(this);
		mi_reset.addActionListener(this);
		mi_list.addActionListener(this);
		mi_close.addActionListener(this);
		this.addWindowListener(this);
		
	}

	/** 예약 관련 메소드 */
	public void makeAddView(){
		p_main = new Panel(new BorderLayout(5, 5));
		//상단
		lb_add_title = new Label("숙박 예약하기", Label.CENTER);
		p_main.add(lb_add_title, "North");

		//중단
		Panel temp2 = new Panel(new GridLayout(3, 3, 10, 10));
		p_main.add(temp2, "Center");
		
		cbs = new Checkbox [9];
		
		Iterator<String> keys = map.keySet().iterator();
		
		for (int count = 0; keys.hasNext() ; count++) {
			String key = keys.next();
			boolean state = map.get(key);
			cbs[count] = new Checkbox(key, state);
			if(state){ cbs[count].setEnabled(false); }
			temp2.add(cbs[count]);
		}
		
		//하단
		Panel temp1 = new Panel(new BorderLayout(5, 5));
		p_main.add(temp1, "South");
		lb_add_msg = new Label("메세지 : ", Label.LEFT);
		bt_add_result = new Button("예약하기");
		temp1.add(lb_add_msg, "Center");
		temp1.add(bt_add_result, "East");
		
		bt_add_result.addActionListener(this);
		
	}
	
	/** 취소 메서드 */
	public void makeResetView(){
		p_main = new Panel(new BorderLayout());
		
		//상단
		lb_reset_title = new Label("예약 취소하기", Label.CENTER);
		p_main.add(lb_reset_title, "North");
		
		//중단
		Panel temp1 = new Panel(new BorderLayout());
		p_main.add(temp1, "Center");
		Panel temp2 = new Panel(new BorderLayout(5, 5));
		temp1.add(temp2, "North");
		
		lb_reset_num = new Label("방번호");
		tf_reset_num = new TextField();
		btn_reset_result = new Button("예약 취소");
		temp2.add(lb_reset_num, "West");
		temp2.add(tf_reset_num, "Center");
		temp2.add(btn_reset_result, "East");
		
		//하단
		lb_reset_msg = new Label("메세지 : ", Label.LEFT);
		p_main.add(lb_reset_msg, "South");
		
		btn_reset_result.addActionListener(this);
		
		
		
	}
	
	/** 현황 메서드 */
	public void makeListView(){
		p_main = new Panel(new BorderLayout(5, 5));
		lb_list_title = new Label("예약 현황", Label.CENTER);
		ta_list = new TextArea();
		p_main.add(lb_list_title, "North");
		p_main.add(ta_list, "Center");
		
		Iterator<String> keys = map.keySet().iterator();
		String str = "";
		while (keys.hasNext()) {
			String key = keys.next();
			boolean state = map.get(key);
			str += key + "호실의 상태 : " + (state?"예약됨":"빈방")+"\n";
		}
		ta_list.setText(str);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == mi_add){
//			p_main.removeAll();
			this.remove(p_main);
			makeAddView();
			this.add(p_main);
		}else if(obj == mi_reset){
			this.remove(p_main);
			makeResetView();
			this.add(p_main);
		}else if(obj == mi_list){
			this.remove(p_main);
			makeListView();
			this.add(p_main);
		}else if(obj == mi_close){
			System.exit(0);
		}else if(obj == bt_add_result) {
			for (int i = 0; i < cbs.length; i++) {
				String key = cbs[i].getLabel();
				boolean state = cbs[i].getState();
				map.put(key, state);
			}
			lb_add_msg.setText("메세지: 예약처리가 완료되었습니다.");
		}else if(obj == btn_reset_result) {
			String key = tf_reset_num.getText();
			String msg = "";
			if(map.get(key)){
				map.put(key, false);
				msg = "메세지: " + key + "호실의 예약이 취소되었습니다." ;
			}else{
				msg = "메세지: 예약된 방이 아닙니다.";
			}
			lb_reset_msg.setText(msg);
			
		}
		this.validate();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
