
/**Programa7
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Suponiendo todos los meses de 30 días.
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema7 {
public static void main(String args[])
{
 int m,c ;
m=Integer.parseInt(JOptionPane.showInputDialog("ingrese el número de mes:"));  
c=Integer.parseInt(JOptionPane.showInputDialog("el año es biciesto? 1) si, 2) no")); 
switch(m){
case 1:
 JOptionPane.showMessageDialog(null,"Enero tiene 31 dias."); break;
case 2:
 if (c=='s')
 JOptionPane.showMessageDialog(null,"Febrero tiene 29 dias.");
 else JOptionPane.showMessageDialog(null,"Febrero tiene 28 dias."); break;
case 3:
 JOptionPane.showMessageDialog(null,"Marzo tiene 31 dias."); break;
case 4:
 JOptionPane.showMessageDialog(null,"Abril tiene 30 dias."); break;
case 5:
 JOptionPane.showMessageDialog(null,"Mayo tiene 31 dias."); break;
case 6:
 JOptionPane.showMessageDialog(null,"Junio tiene 30 dias."); break;
case 7:
 JOptionPane.showMessageDialog(null,"Julio tiene 31 dias."); break;
case 8:
 JOptionPane.showMessageDialog(null,"Agosto tiene 31 dias."); break;
case 9:
 JOptionPane.showMessageDialog(null,"Septiembre tiene 30 dias."); break;
case 10:
 JOptionPane.showMessageDialog(null,"Octubre tiene 31 dias."); break;
case 11:
 JOptionPane.showMessageDialog(null,"Noviembre tiene 30 dias."); break;
case 12:
 JOptionPane.showMessageDialog(null,"Diciembre tiene 31 dias."); break;
default: JOptionPane.showMessageDialog(null,"El numero del mes es incorrecto.");
}
 }
}
   
