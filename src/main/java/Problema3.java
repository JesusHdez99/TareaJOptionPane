
/**Programa3
 * Pedir un numero e indicar si es positivo o negativo
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema3 {
public static void main(String args[])
 {
int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));  
if(a >= 0){
JOptionPane.showMessageDialog(null," el numero es positivo: "+a);
}
else{
    JOptionPane.showMessageDialog(null," el numero es negativo: "+a, 
            "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
}
 }
}