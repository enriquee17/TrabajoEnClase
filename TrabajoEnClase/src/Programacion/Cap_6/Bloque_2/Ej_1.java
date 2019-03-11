package Programacion.Cap_6.Bloque_2;



import javax.swing.JOptionPane;

public class Ej_1

{

    public static void main(String[]args){
    	ecuacionSegundoGrado();
       
    }
    
    static public void ecuacionSegundoGrado() {
    	

         int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce paramtro a")); //variable a almacenada es trasformada a int

         int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce paramtro b")); //variable b almacenada es trasformada a int

         int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce paramtro c")); //variable v almacenada es trasformada a int

         //Obtien los valores x1,x2 de la ecuacion

         double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

         double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

         //imprime los valores

         System.out.println("La solucion de x1: "+x1);

         System.out.println("La solucion de x2: "+x2);

    }

}

