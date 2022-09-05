import java.awt.*;
class Another2awt
{
	Another2awt(){
		Frame f=new Frame();
		f.setSize(300,300);
          Button b=new Button("click_divya");
          b.setBounds(20,120,80,20);
          TextField t=new TextField();
          t.setBounds(90,180,80,20);
          f.add(b);
          f.add(t);
          f.setTitle("TITLE");
          f.setVisible(true);
          f.setLayout(null);
      }
          public static void main(String[] args) {
          	Divyaawt d=new Divyaawt();
          }
	}
