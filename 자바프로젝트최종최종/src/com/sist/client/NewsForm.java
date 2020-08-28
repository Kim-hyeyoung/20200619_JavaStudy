// 뉴스
package com.sist.client;
import java.util.*;
import com.sist.data.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class NewsForm extends JPanel implements ActionListener{
   JButton b1,b2;
   JLabel la;
   int curpage=1;
   JPanel p=new JPanel();
   public NewsForm()
   {
	   setLayout(new BorderLayout());
	   NewsManager m=new NewsManager();
	   
   	   JScrollPane pp=new JScrollPane();
   	   Dimension size = new Dimension(); 
   	   size.setSize(1000, 890); 
   	   p.setPreferredSize(size); 
   	   pp.setViewportView(p);
	   ArrayList<NewsVO> news=m.newsListData(1);
	   p.setLayout(new GridLayout(5, 1));
	   
	   for(NewsVO vo:news)
	   {
		   NewsCard nc=new NewsCard();
		   nc.newsPrint(vo);
		   p.add(nc);
	   }
	   add("Center",pp);
	   b1=new JButton("이전");
	   b2=new JButton("다음");
	   la=new JLabel("1 page / 11 pages");
	   JPanel ppp=new JPanel();
	   ppp.add(b1); ppp.add(la); ppp.add(b2);
	   add("South",ppp);
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				   curpage--;
				   NewsManager m=new NewsManager();
				   ArrayList<NewsVO> news=m.newsListData(curpage);
				   p.removeAll();
				   for(NewsVO vo:news)
				   {
					   NewsCard nc=new NewsCard();
					   nc.newsPrint(vo);
					   p.add(nc);
				   }
				   p.validate();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<11)
			{
				   curpage++;
				   NewsManager m=new NewsManager();
				   ArrayList<NewsVO> news=m.newsListData(curpage);
				   p.removeAll();
				   for(NewsVO vo:news)
				   {
					   NewsCard nc=new NewsCard();
					   nc.newsPrint(vo);
					   p.add(nc);
				   }
				   p.validate();
			}
		}
		la.setText(curpage+" page / 11 pages");
	}
}