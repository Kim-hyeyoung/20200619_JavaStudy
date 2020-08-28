// 컨트롤 패널
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{
   CardLayout card=new CardLayout();
   HomeForm hf=new HomeForm();
   BookListForm bf=new BookListForm();
   MainFrame m;

   public ControlPanel(MainFrame m)
   {
	   setLayout(card);
	   add("HF",hf);
	   add("BF",bf);

   }
}