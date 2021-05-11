import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example for students");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);

        JButton button = new JButton("Press me and the troll will be banned!");

        String imgUrl = "pics/trollface.jpg";
        String imgUrl2 = "pics/antitroll.jpg";

        JLabel pic = new JLabel(new ImageIcon(imgUrl));
        JLabel pic2 = new JLabel(new ImageIcon(imgUrl2));

        frame.getContentPane().add(pic);
        frame.getContentPane().add(pic2);
        pic2.setVisible(false);

        frame.add(button);

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,pic);

        frame.pack();
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getText().equals("Press me and the troll will be banned!")){
                    pic.setVisible(false);
                    button.setText("Oh no, the troll had been banned. Press me to unban the troll!");
                    frame.getContentPane().add(BorderLayout.CENTER,pic2);
                    pic2.setVisible(true);

                }else{
                    pic.setVisible(true);
                    button.setText("Press me and the troll will be banned!");
                }
            }
        });
    }
    }

