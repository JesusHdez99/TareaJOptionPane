
/**Problema 10
 *Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 * @author yisus
 */

import javax.swing.JOptionPane;
public class Problemaa10 {
public static void main(String args[])
{
int a;
 do{
a =Integer.parseInt(JOptionPane.showInputDialog("  ingrese un numero: "));
 
 if (a % 2 == 0)
JOptionPane.showMessageDialog(null," el numero es par ");
else
JOptionPane.showMessageDialog(null," el numero es impar ");
}
 while(a == 0);
 }
}