
/**Programa6
 *Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien..
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema6 {
public static void main(String args[])
 {
int cal=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion: ")); 
switch (cal)
{
case 0:
JOptionPane.showMessageDialog(null," Muy mal ");
break;
case 1:
JOptionPane.showMessageDialog(null,"Mal");
break;
case 2:
JOptionPane.showMessageDialog(null,"Mal.");
break;
case 3:
JOptionPane.showMessageDialog(null,"Insuficiente");
break;
case 4:
JOptionPane.showMessageDialog(null,"Insuficiente");
break;
case 5:
JOptionPane.showMessageDialog(null,"Insuficiente");
break;
case 6:
JOptionPane.showMessageDialog(null,"Pasable");
break;
case 7:
JOptionPane.showMessageDialog(null,"Regular");
break;
case 8:
JOptionPane.showMessageDialog(null,"Suficiente");
break;
case 9:
JOptionPane.showMessageDialog(null,"Muy bien");
break;
case 10:
JOptionPane.showMessageDialog(null,"Excelente");
break;
default:
JOptionPane.showMessageDialog(null,"introdujo una calificacion erronea");
}
}
}
 
