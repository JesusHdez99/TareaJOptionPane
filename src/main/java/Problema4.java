
/**Programa4
 *Pedir dos numeros y decir cual es el mayor
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema4 {
public static void main(String args[])
 {
int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));  
int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); 
if(a>b){
JOptionPane.showMessageDialog(null," el numero mayor es: "+a);
}
else{
    JOptionPane.showMessageDialog(null," el numero mayor es: "+b, 
            "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
}
 }
}
