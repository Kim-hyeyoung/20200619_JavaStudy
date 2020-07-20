/*
 * ������
 * 	=container : component�� ������ ��� ȭ�� ���
 * 		= JFrame
 * 		= JWindow
 * 		= JDialog
 * 		=========== �ܵ� ���� ����
 * 		= JPanel
 * 		=========== �ܵ� ���� �Ұ���
 * 	=component : �� ���� ��ɸ� ������ ����
 * 		= JLabel : �Ϲ� ���ڿ� ���, �̹��� ���
 *  	��ư
 *  	=�Ϲݹ�ư : JButton
 *  	=��۹�ư : JRadioButton, JCheckBox
 *  	=�޴�
 *  		�Է�â
 *  			=�����Է� : JTextField
 *  			=��й�ȣ : JPasswordField
 *  			=������ �Է� : JTextArea => �Ұ�,�������
 *  			=������ �Է� : JTextPane => ä��
 *  		���â
 *  			=����â : JComboBox
 *  			=��ü������� : JList
 *  			=JTree
 *  			=JTable
 *  		ȭ�����
 *  			=JTabbedPane
 *  			=JSplitPane => div
 *  			=JInteralFrame
 *  ================================================ interface
 *  	��ġ(Layout), ����� ���� ��ġ
 *  	=BorderLayout : 5���� ��ġ ����(��,�Ʒ�,���,����,������)
 *  	=FlowLayout
 *  	=GridLayout
 *  	=CardLayout
 *  	=����� ���� : setBounds
 */
import javax.swing.*;
import java.awt.*;
public class MainForm extends JFrame{
	private CardLayout card=new CardLayout();//���� Ŭ����
	//ȭ�� UI => �����ڿ��� ���� => �����ϸ� �ٷ� ��������ϱ� ����
	//������ : �ѹ��� ȣ�� ����, ���۰� ���ÿ� ȣ���Ѵ�
	�α��� login=new �α���();
	public MainForm()
	{
		setLayout(card);
		add("LOGIN",login);
		/*
		 * Layout ����
		 	JFrame, JWindow, JDialog =>BorderLayout
		 	JPanel => FlowLayout 
		 	����� ���� ��� => setLayout(null)
		 */
		setBounds(400, 600, 1024, 950);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
		

	}

}
