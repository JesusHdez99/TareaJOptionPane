
/**Programa1
 *Pedir el radio de una circunferencia y calcular su longitud.
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema1 {
public static void main(String args[])
 {
final double pi = 3.141592;
int r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio de la Circunferencia"));  
JOptionPane.showMessageDialog(null," La longitud de la circunferencia es : "+ (r * 2 * pi ));
}
}