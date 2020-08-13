
/**
 * Using buttons to keep count
 *
 * Kush Patel
 * April 24, 2020
 */
import java.awt. *;
import java.awt.event. *;
import javax.swing. *;

public class KeepCount extends JPanel implements ActionListener
{
    int count = 0;
    JLabel output;
    public static void main (String args [])
    {
    	KeepCount content = new KeepCount ();
        
        JFrame window = new JFrame ("Count Me In");
        window.setContentPane (content);
        window.setLocation (100, 100);
        window.setSize (400, 600);
        window.setVisible (true);
    }
    public KeepCount ()
    {
        JLabel title = new JLabel ("Count me in!");
        title.setFont (new Font ("Century Gothic", Font.BOLD, 46));
        title.setForeground (new Color (0,0,0));
        add (title);
        
        output = new JLabel ("0");
        output.setFont (new Font ("Century Gothic", Font.PLAIN, 300));
        output.setForeground (new Color (0,0,179));
        add (output);

        JLabel inst = new JLabel ("Press the button, we'll keep count for you");
        inst.setFont (new Font ("Century Gothic", Font.BOLD, 16));
        inst.setForeground (new Color (0,0,0));
        add (inst);
        
        JButton plus = new JButton ("+");
        plus.setFont (new Font ("Century Gothic", Font.BOLD, 60));
        plus.setBackground (new Color (0,255,0));
        plus.setActionCommand ("opt1");
        plus.addActionListener (this);
        add (plus);
        
        JButton minus = new JButton ("-");
        minus.setFont (new Font ("Century Gothic", Font.BOLD, 60));
        minus.setBackground (new Color (255,0,0));
        minus.setActionCommand ("opt2");
        minus.addActionListener (this);
        add (minus);
    }
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand ().equals ("opt1"))
        {
            count++;
            output.setText (""+count);
        }
        else
        {
            count-=1;
            output.setText ("" + count);
        }
    }
}
