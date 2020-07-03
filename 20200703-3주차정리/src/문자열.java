/*
 *  ���ڿ��� �����ϴ� ���� (String)
 *  �⺻�� => ����, �Ǽ�, ��, ����
 *  ������ => ���� ���� ��Ҵ� �ٸ� ���� �ְ� �ּҸ� ����
 *   1) ������
 *   	String s="��������"; => ���� ���
 *   	String s=new String("");
 *   2) �ֿ���
 *   	���ڸ� ������ �� �ִ� ���(�޼ҵ�) => ���̺귯�� �ٽ�
 *   	!!������ : ������ ������� ����!!
 *   	=> length() : ���� ����
 *   	=> substring() : ���ڸ� �ڸ� ��
 *   	=> contains() : ���ڿ� �� ���Ե� �ܾ �ִ��� Ȯ��
 *   	=> startsWith, endsWith : ������Ʈ(�ڵ��ϼ�) : �˻���
 *   	=> trim() : �¿� ���� ����
 *   		String s=" Hello Java "
 *   		s.trim() => "Hello Java"
 *   		��� ���� ���� => s.replace(" ","")
 *   	=> equals() : ���ڿ� ���� �� ���  ===> ��ҹ� ����
 *   	=> split() : ���ڸ� �����ؼ� �迭�� ����(���й��� ����)
 *   	=> replace, relaceAll : ���ڸ� ������ ���
 *   	=> valueOf() : ��� ���������� ���ڿ��� ����
 *   	=> toLowerCase() : �ҹ��ڷ� ��ȯ 
 *   	=> toUpperCase() : �빮�ڷ� ��ȯ
 *   
 *   		
 */
import javax.swing.*;
import java.awt.event.*;
public class ���ڿ� extends JFrame implements ActionListener{ //�ؽ�Ʈ���� ���� ���� �� ó��
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ�() {
		add("North",tf);
		add("South",tf1);
		tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this); //tf���� ���� =>actionPerformed ȣ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���ڿ�();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)
		{
			//tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
	}

}
