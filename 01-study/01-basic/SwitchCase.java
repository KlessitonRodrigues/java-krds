import javax.swing.JOptionPane;

public class SwitchCase {

    public static void main() {
        String num = JOptionPane.showInputDialog("Input a vehicle id");

        switch (num) {
            case "1":
                System.out.println("truck");
                break;
            case "2":
                System.err.println("bike");
                break;
            case "3":
                System.err.println("car");
                break;
            case "4":
                System.err.println("bus");
                break;
            default:
                System.err.println("no vehicle");
        }

    }

}
