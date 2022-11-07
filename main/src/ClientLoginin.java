import javax.swing.*;
import java.awt.*;

public class ClientLoginin extends JFrame{
    public static void main(String[] args){
        new ClientLoginin();
    }
    public ClientLoginin(){
        super("Welcome To Here");
        init();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void init(){
        //组装视图
        this.setLayout(new BorderLayout());
        this.setSize(800, 620);
        //获取背景图片路径
        ImageIcon bg = new ImageIcon("img/ListImg/background.jpg");
        this.setBackground(Color.cyan);
        //建立图像文本
        JLabel  label  =  new JLabel(bg);
        //设置图片的大小
        label.setBounds(0,0,this.getWidth(),this.getHeight());
        //把背景图片添加到第二层
        JPanel pan =  (JPanel)this.getContentPane();
        this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
        //将内容窗口设为透明
        pan.setOpaque(false);
    }

}
