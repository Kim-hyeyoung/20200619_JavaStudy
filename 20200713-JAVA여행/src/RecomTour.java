
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RecomTour extends JFrame implements ActionListener{
	JButton b1,b2;
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	int brow=0;
	int bcol=0;
	
			
		
	//배치함수
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else
				{
				pan[i][j].setText(String.valueOf(panCount[i][j]+1));
				pan[i][j].setEnabled(true);
				}
			}
		}
	}
	//버튼 클릭
	public RecomTour() //생성자=>클래스를 메모리에 저장할 때 가장 먼저 호출되는 메소드 
	{
		//배치
		b1=new JButton("시작");
		b2=new JButton("종료");
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		add("South",p);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,3,5,5));
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("굴림체",Font.BOLD,50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;
			}
		}
		
		add("Center",p2);
		
		
		display();
		
		setSize(1200, 900);
		setVisible(true);
		
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RecomTour();
		//생성자 호출시 반드시 앞에 new를 붙여야 함

	}
	//종료여부 확인
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==pan[i][j])
				{
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this, "Game Over!!");
						System.exit(0);
					}
					display();
				}
			}
		}
		
	}

}
