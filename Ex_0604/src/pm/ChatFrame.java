/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 쌍용교육센터
 */
public class ChatFrame extends javax.swing.JFrame {
    

    CardLayout card;
    
    Socket s;
    
    // 데이터를 주고 받으려면 프로토콜(객체)을 주고 받아야 하기 때문에 
    ObjectOutputStream out; 
    ObjectInputStream in;
    
    // 서버쪽에서 데이터가 넘어오는지? 항상 감시하는 스레드 
    Thread t = new Thread() {

		@Override
		public void run() {// 화면에 보여주는 일을 함 server의 쓰레드와는 다름
			bk : while(true) {
				try {
					Object obj = in.readObject(); // 서버로 부터 데이터가 올때 까지 
												  // 대기한다.
					// 넘어오는 순간 프로토콜형태로 캐스팅
					Protocol p = (Protocol)obj; 
					
					switch(p.getCmd()) {
					case 1: // 어떤 누군가가 접속했을 때 수행
							// 명단을 받아서 u_list라는 JList에 넣어준다.
							user_list.setListData(p.getUser_names());
							room_list.setListData(p.getRoom_names());
							break;
					case 3 : 
						break bk;
					case 4 : // case4번이 돌아온다면 
						// 내가 방을 만들고 다시 4번 프로토콜을 받는다.
						// 명단과 입장 메세지도 같이 받아 화면에 표현한다.
						join_list.setListData(p.getUser_names());
						ta.append(p.getMsg());
						card.show(getContentPane(), "chatRoom"); 
						break;
					}// switch의 끝 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}// while문의 끝 
			closed();
			
			System.exit(0);
		} 
    	
    };
    
    // 채팅화면에 필요한 객체
    
    JPanel card3, card3_e, card3_s;
    JButton out_bt, send_bt;
    JTextArea ta;
    JTextField input_tf;
    JList<String> join_list; // 참여자 명단 표현 
    
    public ChatFrame() {
        initComponents(); //화면 구성
        setVisible(true); // 화면 보여주기 
      
        this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 접속이 안된 상태면 바로 종료!
				// 그렇지 않다면 3번 프로토콜 생성 후 전송만 
				if(s == null)
					System.exit(0);
				else {
					Protocol p = new Protocol();
					p.setCmd(3); 
					try {
						out.writeObject(p); // 나와 유일하게 연결된 복사본에게 조용히 
						out.flush();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
        	
        });
        
        jButton5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					Protocol p = new Protocol();
					p.cmd = 3;
					try {
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
						e2.printStackTrace();
					}finally {
					System.exit(0);
					}
				}
				
			
		});
        
        jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼을 클릭했을 때 수행하는 곳!
				
				// 사용자가 입력한 대화명 가져오기 
				String n = jTextField1.getText().trim(); 
				if(n.length() < 1) {
					JOptionPane.showMessageDialog(ChatFrame.this, "대화명을 입력하세요");
					jTextField1.setText(""); // 청소 
					jTextField1.requestFocus(); // 커서 가져다 놓기 
					return;
				} else {
					// 서버 접속
					try {
						s = new Socket("192.168.10.107",5555);
						out = new ObjectOutputStream(s.getOutputStream());
						in = new ObjectInputStream(s.getInputStream());
						t.start();
						
						card.show(getContentPane(), "roomList");
						
						// 처음 접속했다는 의미로 프로토콜 데이터 보내야 한다.
						Protocol p = new Protocol();
						p.setCmd(1); 
						p.setMsg(n); // 대화명 
						
						// 준비를 다해서 서버로 보내야됨 
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
		});
        
        jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 방만들기 
				String str = JOptionPane.showInputDialog(ChatFrame.this, "방 제목을 입력하세요");
				if(str != null && str.trim().length() > 0) {
					// 방제목을 1자라도 입력한 경우
					// 방을 만들 수 있는 프로토콜 생성
					Protocol p = new Protocol();
					p.setCmd(4);
					p.setMsg(str); // 방제목 담기
					
					try {
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
        
    }
    
    public void closed() { // 종료를 위한 메서드 
    	try {
    		if(out != null) // out부터 스트림 닫기 
				out.close();
			if(in != null)
				in.close();
			if(s != null)
				s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        
        card2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_list = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        user_list = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(390, 490));
        getContentPane().setLayout(card = new java.awt.CardLayout());

        card1.setPreferredSize(new java.awt.Dimension(390, 490));
        card1.setLayout(new java.awt.BorderLayout());

        jLabel1.setMaximumSize(new java.awt.Dimension(390, 490));
        jLabel1.setMinimumSize(new java.awt.Dimension(390, 490));
        jLabel1.setName(" "); // NOI18N
        ImageIcon icon = new ImageIcon("src/image/icon1.png");
        Image img = icon.getImage().getScaledInstance(390, 400, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(img);
        jLabel1.setIcon(icon2);
        jLabel1.setPreferredSize(new java.awt.Dimension(390, 490));
        card1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.FlowLayout(2));

        jLabel2.setText("대화명:");
        jPanel2.add(jLabel2);

        jTextField1.setColumns(10);
        jPanel2.add(jTextField1);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(2));

        jButton1.setText("로그인");
        jPanel3.add(jButton1);

        jPanel1.add(jPanel3);

        card1.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(card1, "first");

        card2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(room_list);

        card2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 490));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[대기실]");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.GridLayout(4, 1));

        jButton2.setText("방만들기");
        jPanel5.add(jButton2);

        jButton3.setText("방 참여");
        jPanel5.add(jButton3);

        jButton4.setText("쪽지보내기");
        jPanel5.add(jButton4);

        jButton5.setText("종료");
        jPanel5.add(jButton5);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jScrollPane2.setViewportView(user_list);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        card2.add(jPanel4, java.awt.BorderLayout.LINE_END);

        getContentPane().add(card2, "roomList");
        
        // 채팅 화면 구성하기 -------------------------------------
        // 각 패널들의 덩어리 생각 
        
        
        card3 = new JPanel(new BorderLayout());
        card3_e = new JPanel(new BorderLayout());
        card3_s = new JPanel(new BorderLayout());
        
        card3.add(new JScrollPane(ta = new JTextArea()));
        ta.setEditable(false); // 비활성화 
        
        //우측 작업
        card3_e.add(new JLabel("[참여자]"), BorderLayout.NORTH);
        card3_e.add(new JScrollPane(join_list = new JList<String>())); // 가운데 
        card3_e.add(out_bt = new JButton("방 나가기"), BorderLayout.SOUTH);
        card3.add(card3_e,BorderLayout.EAST);
        
        // 하단 작업
        card3_s.add(input_tf = new JTextField());
        card3_s.add(send_bt = new JButton("보내기"), BorderLayout.EAST);
        card3.add(card3_s, BorderLayout.SOUTH);
        // 여기까지 card3 에각 패널들이 들어감 
        
        // card3를 현재 창에 "chatRoom"이라는 이름으로 추가 
        getContentPane().add(card3, "chatRoom");
        
        //----------------------------------------------------------
        
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
       new ChatFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> room_list;
    private javax.swing.JList<String> user_list;
    // End of variables declaration//GEN-END:variables
}
