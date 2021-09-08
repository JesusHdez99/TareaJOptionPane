
/**Programa2
 * Pedir dos numeros y decir si son iguales o no
 * @author yisus
 */

import javax.swing.JOptionPane;
public class Problema2 {
public static void main(String args[])
 {
int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));  
int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); 
if(a==b){
JOptionPane.showMessageDialog(null," Los numeros ingresados son iguales : "+a+","+b);
}
else{
    JOptionPane.showMessageDialog(null," Los numeros ingresados  NO son iguales : "+a+"," + b, 
            "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
}
 }
}