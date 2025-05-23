package am;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Ex1_Panel extends JPanel {
	
	int x = 210;

	@Override
	protected void paintComponent(Graphics g) {
		// 현재 Jpanel과 같은 크기의 이미지 객체를 생성하자 
		Image buf = createImage(this.getWidth(), this.getHeight()); // 현재 객체는 JPanel을 상속 받기 떄문에 현재 객체도 JPanel
		
		// buf에만 그림을 그릴 수 있는 붓객체를 얻어낸다.
		Graphics buf_g = buf.getGraphics(); 
		buf_g.fillRect(x, 235, 80, 30); // buf이미지에 그림을 그린다. 
	
		// 현재 JPanel에 위에서 준비된 이미지를 붙여넣는다.
		// 사이즈가 똑같으니 0,0
		// this자리에는 컴포넌트가 들어와야 하는데 Jpanel의 부모객체에 컴포넌트가 있음으로 this가능
		g.drawImage(buf, 0, 0, this);
	}
	
	
	
}
