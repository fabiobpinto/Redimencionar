package view;
 
import java.awt.EventQueue;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
 
public class Main extends JFrame {
 
        /**
         *
         */
        private static final long serialVersionUID = -3709488714422742419L;
        private JPanel contentPane;
       
 
        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        Main frame = new Main();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }
 
        /**
         * Create the frame.
         */
        public Main() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 450, 300);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);
               
                JLabel foto = new JLabel("");
                foto.setBounds(35, 72, 152, 144);
               
                ImageIcon imagem = new ImageIcon(Main.class.getResource("/img/key.jpg"));
                Image imag = imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT);
 
                foto.setIcon(new ImageIcon(imag));
               
                               
               
                contentPane.add(foto);
 
               
        }
}
