
/**Programa9
 * Leer un número y mostrar su cuadrado, 
 * repetir el proceso hasta que se introduzca un número negativo
 * @author yisus
 */
import javax.swing.JOptionPane;
public class Problema9 {
public static void main(String args[])
{
    int a;
 do{
a =Integer.parseInt(JOptionPane.showInputDialog(" ingrese un numero: "));

 double elevado= Math.pow(a,2);
 JOptionPane.showMessageDialog(null," el cuadrado del numero "+a+"es igual a " + elevado);
}
 while(a<0);
 }
}

