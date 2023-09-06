import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String args[]) {

        final int[] milanscore = {0};
        final int[] RMscore = {0};

        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 1));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 X 0");
        JLabel lastscorer = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");
        JPanel panel = new JPanel();

        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);

        frame.add(result);
        frame.add(lastscorer);
        frame.add(winner);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanscore[0]++;
                result.setText("Result: " + milanscore[0] + " X " + RMscore[0]);
                lastscorer.setText("Last Scorer: AC Milan");
                if (milanscore[0] > RMscore[0]) {
                    winner.setText("Winner: AC Milan");
                } else if (RMscore[0] > milanscore[0]) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RMscore[0]++;
                result.setText("Result: " + milanscore[0] + " X " + RMscore[0]);
                lastscorer.setText("Last Scorer: Real Madrid");
                if (milanscore[0] > RMscore[0]) {
                    winner.setText("Winner: AC Milan");
                } else if (RMscore[0] > milanscore[0]) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
