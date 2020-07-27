package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;
import java.text.*;//SimpleDateFormate

import com.sist.back.*;
public class BoardMainFrame extends JFrame implements ActionListener{
	//CardLayout card=new CardLayout();
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	//���α׷� ���� => ArrayList => BoardManager
	BoardManager bm=new BoardManager();
	public BoardMainFrame()
	{
		tp.addTab("�Խ��� ���", bp);
		tp.addTab("�۾���", bi);
		tp.setTabPlacement(tp.BOTTOM);
		//tp.setSelectedIndex(1);
		add("Center",tp);
		setSize(640, 480);
		setVisible(true);
		
		bp.b.addActionListener(this); //���� ��ư
		bi.b1.addActionListener(this); //�۾��� ��ư
		bi.b2.addActionListener(this); //��� ��ư
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMainFrame();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bp.b)//���۹�ư�� ������ ��
		{
			//�۾��� ȭ������ �̵�
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1)//�۾��� ��ư�� ������ ��
		{
			//ArrayList�� ����
			//�Է��� ������ �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword());
			//password�� char[]�� �Ǿ����� => valueOf�� ���ڿ��� ����
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); //ArrayList�� ����
			listPrint();
			tp.setSelectedIndex(0);
		}
		else if(e.getSource()==bi.b2)//��� ��ư�� ������ ��
		{
			//������� �̵�
			tp.setSelectedIndex(0);
		}
		
	}
	public void listPrint()
	{
		//ArrayList�ޱ�
		ArrayList<BoardVO> list=bm.select();
		//���̺� ���
		//���̺� ����
		for(int i=bp.model.getRowCount()-1;i>=0;i--)
		{
			bp.model.removeRow(i);
		}
		//�迭0������ ����� 0���� ��������..������������ ������ ��!
		//���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //MM : ��   /  mm : ��
		for(BoardVO vo:list)
		{
			String[] data= {String.valueOf(vo.getNo()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),
					String.valueOf(vo.getHit())
							
			};
			bp.model.addRow(data);
		}
	}

	
	
	
	
	
	
}
