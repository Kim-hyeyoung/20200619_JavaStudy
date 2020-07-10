import javax.swing.*; //window ���� Ŭ����
import javax.swing.border.LineBorder;

import java.awt.*; //���̾ƿ�(ȭ�� ��ġ)
import java.awt.event.*; //��ư,�ؽ�Ʈ ���� => ���� �̺�Ʈ
import java.net.URL;
//�ڹٿ��� �����ϴ� �������� ��� ����� ����Ѵ�
//�ڹٿ��� ����� �ϳ��� ���� (���� ���)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("ã��");
	JMenuItem exit=new JMenuItem("����");
	
	// ����� �����츦 �����ش� => ������
	CardLayout card=new CardLayout();
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	int curpage=1;
	int totalpage=194;
	//����� �ʱ�ȭ
	
	MovieMainForm() {
		//�޴�����
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); //�޴��� ���м�
		menu.add(exit);
		bar.add(menu);
		
		//�����쿡 ����
		setJMenuBar(bar);
		//���̾ƿ� ����
		setLayout(card);
		add("ML",ml);
		add("MF",mf);
		add("MD",md);
		//������ ũ�� ����
		setSize(1300, 1000);
		//������ �����ֱ�
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); //���� ��ư
		ml.b2.addActionListener(this); //���� ��ư
		
		moviePrint(1);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].addMouseListener(this);
			}
		}
		
	
	}
	void moviePrint(int page)
	{
		MovieVO[] movies=MovieManager.movieListData(page);
		int k=0;
		for(MovieVO vo:movies)
		{
			try
			{
				//������ �б�
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url),ml.movie[0][0].getWidth(),ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img)); //1���� �迭�� 2�������� [x][y]���� k/5���� [x] k%5���� [y]
				k++;
			}catch(Exception ex) {}
		}
		
		ml.pLa.setText(curpage+" page / "+totalpage+"pages");
	}
	static Image getImage(ImageIcon ii,int w,int h)
	{
		Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm(); //�����ڴ� �ݵ�� new�� ȣ��!!!

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
		else if(e.getSource()==ml.b1) //������ư Ŭ���� ����
		{
			if(curpage>1)
			{
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource()==ml.b2) //������ư Ŭ���� ����
		{
			if(curpage<totalpage)
			{
				curpage++;
				moviePrint(curpage);
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) { //Ŭ���ϸ鼭 �����̱�
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) { //���콺 ���ٴ�� �ٲ�°�
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(e.getSource()==ml.movie[i][j])
				{
					LineBorder line=new LineBorder(Color.cyan,5);
					ml.movie[i][j].setBorder(line);
				}
				
			}
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) { //���콺 ���ٴ�ٰ� ���� ���󺹱�
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}
