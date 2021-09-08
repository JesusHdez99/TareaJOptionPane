
/**Programa5
 *Pedir tres números y mostrarlos ordenados de mayor a menor.
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema5 {
public static void main(String args[])
 {
int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));  
int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero")); 
int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero")); 
 JOptionPane.showMessageDialog(null,"Los números ordenados de mayor a menor son:");
 if(a>b && b>c)
 {   
 JOptionPane.showMessageDialog(null," " + a + " " + b + " " + c + " ");
 }
 else if (a>b && c>b)
 {
 JOptionPane.showMessageDialog(null," " + a + " " + c + " " + b + " ");
 }
 else if (b>c && c>a)
 {
 JOptionPane.showMessageDialog(null," " + b + " " + c + " " + a + " ");
 }
 else if (b>c && a>c)
 {
 JOptionPane.showMessageDialog(null," " + b + " " + a + " " + c + " ");
 }
 else if (c>a && b>a)
 {
 JOptionPane.showMessageDialog(null," " + c + " " + b + " " + a + " ");
 }
 else if (c>b && a>b)
 {
 JOptionPane.showMessageDialog(null," " + c + " " + a + " " + b + " ");
 }
 }
}
   

