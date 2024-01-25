import javax.swing.JFrame;
import javax.swing.JLabel;



public class App extends JFrame{
    
    public App() {
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Belial");
        JLabel label = new JLabel("Hello World");
        this.add(label);
    }
    public static void main(String[] args) {
        App frame = new App();
        frame.setVisible(true);
    }
}


