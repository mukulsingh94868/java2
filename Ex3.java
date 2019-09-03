import java.awt.*;
import java.awt.event.*;
public class Ex3 extends Frame implements
ActionListener
{
TextField t1,t2,t3;
Button b1,b2,b3,b4;
Ex3()
{
t1=new TextField();
t1.setBounds(50,50,150,30);
t2=new TextField();
t2.setBounds(50,100,150,30);
t3=new Textfield();
t3.setBounds(50,150,150,30);
b1=new Button("+");
b1.setBounds(50,200,50,30);
b2=new Button("-");
b2.setBounds(150,200,50,30);
b3=new Button("*");
b3.setBounds(50,250,50,30);
b4=new Button("/");
b4.setBounds(150,250,50,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
setSize(600,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
String s2=t2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0;
if(e.getSource()==b1)
{
c=a+b;
}
else if(e.getSource()==b2)
{
c=a-b;
}
else if(e.getSource()==b3)
{
c=a*b;
}
else if(e.getSource()==b4)
{
c=a/b;
}
String result=String.value of(c);
t3.setText(result);
}
public static void main(String args[])
{
Ex3 c =new Ex3();
}
}
