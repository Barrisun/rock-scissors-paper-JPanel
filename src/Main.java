import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JPanel {

    public static void main(String[] args) {
        Random random = new Random();
        String[] play = {"Ножницы", "Бумагу", "Камень"};
        JFrame frame = new JFrame("sd");
        JLabel label = new JLabel("");
        JLabel label_text = new JLabel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension(500, 500));

        JButton rock = new JButton("Камень");
        rock.setBounds(125, 142, 200, 20);
        frame.getContentPane().add(rock);
        frame.setLocationRelativeTo(null);
        rock.setBackground(Color.lightGray);

        JButton paper = new JButton("Бумага");
        paper.setBounds(125, 165, 200, 20);
        frame.getContentPane().add(paper);
        paper.setBackground(Color.lightGray);

        JButton cut = new JButton("Ножницы");
        cut.setBounds(125, 188, 200, 20);
        frame.getContentPane().add(cut);
        cut.setBackground(Color.lightGray);

        Main panel = new Main();
        panel.setPreferredSize(new Dimension(600, 600));
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
        panel.add(rock);
        panel.add(paper);
        panel.add(cut);
        panel.setLayout(null);

        frame.getContentPane().add(label);
        frame.getContentPane().add(label_text);
        label_text.setText("Бот загадал Камень/Ножницы/Бумага,\n отгадайте, что он загадал");
        label_text.setBounds(55, 0, 400, 200);
        label.setOpaque(false);
        panel.add(label);
        panel.add(label_text);

        paper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index_play = random.nextInt(play.length);
                String final_index = play[index_play];
                System.out.println(final_index);
                String c = play[1];
                if (c == final_index) {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы угадали, " + "Бот загадал: " + final_index);
                } else {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы не угадали, " + "Бот загадал: " + final_index);
                }
            }
        });
        rock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index_play = random.nextInt(play.length);
                String final_index = play[index_play];
                System.out.println(final_index);
                String c = play[2];
                if (c == final_index) {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы угадали, " + "Бот загадал: " + final_index);
                } else {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы не угадали, " + "Бот загадал: " + final_index);
                }
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index_play = random.nextInt(play.length);
                String final_index = play[index_play];
                System.out.println(final_index);
                String c = play[0];
                if (c == final_index) {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы угадали, " + "Бот загадал: " + final_index);
                } else {
                    label.setBounds(125, 130, 250, 200);
                    label.setText("Вы не угадали, " + "Бот загадал: " + final_index);
                }
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(124, 164, 201, 21);
        g.drawRect(124, 187, 201, 21);
        g.drawRect(124, 141, 201, 21);
    }
}