package client;

import java.awt.event.MouseEvent;
import java.io.Serializable;

import javax.swing.ImageIcon;

public class ChatMsg implements Serializable{
	private static final long serialVersionUID = 1L;
	public String code;//100:Login , 200:채팅 메세지, 300:Logout, 400...:게임움직임 및 상태값, 500:MouseEvent
	public String UserName;
	public String data;
	public String keyboardInput;
	public ImageIcon img;
	public MouseEvent mouse_e;
	public int pen_size; // pen size
	public int [][] mapInfo;
	public int [][] characterPosition;

	public ChatMsg(String UserName, String code, String msg) {
		this.code = code;
		this.UserName = UserName;
		this.data = msg;
	}

}
