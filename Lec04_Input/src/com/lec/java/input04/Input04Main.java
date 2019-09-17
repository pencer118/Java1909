package com.lec.java.input04;

import javax.swing.JOptionPane;

public class Input04Main {

	public static void main(String[] args) {
		System.out.println("JOptionPane 사용한 입력");
		
		String name;
		name = JOptionPane.showInputDialog("너의 이름은?");
		System.out.println("입력한 이름은:" + name);

	}

}
