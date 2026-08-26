import java.util.Scanner;

public class VentasIterativos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion;
        double valor;
        double valorBrutoBasico=0.0;
        double valorBrutoMedio=0.0;
        double valorBrutoPremium=0.0;
        int cantidadBasico=0;
        int cantidadMedio=0;
        int cantidadPremium=0;
        double PORCENTAJE_DESCUENTO= 0.1;
        double IVA=0.19;
        double COMPRA_APLICABLE=100000;
        double PORCIENTO=100;
        boolean finalizarCompra=true;

        do {System.out.println("seleccione la opcion deseada: ");
        System.out.println("1.Básico ");
        System.out.println("2.Medio");
        System.out.println("3.Premium");
        System.out.println("4.Finalizar Compra");
        opcion=leer.nextInt();
        if (opcion==1) {System.out.println("Ha seleccionado un producto básico");
        cantidadBasico++;
        System.out.println("Ingrese el valor del producto: ");
        valor=leer.nextDouble();
        valorBrutoBasico = valorBrutoBasico + valor;} else if (opcion==2) {System.out.println("Ha elegido un producto Medio");
        cantidadMedio++;
        System.out.println("Ingrese el valor del producto: ");
        valor=leer.nextDouble();
        valorBrutoMedio=valorBrutoMedio+valor;}
        else if (opcion==3) {System.out.println("Ha elegido el producto Premium");
        cantidadPremium++;
        System.out.println("Ingrese el valor del producto: ");
        valor=leer.nextDouble();
        valorBrutoPremium=valorBrutoPremium+valor;}
        else if (opcion==4) {System.out.println("finalizar Compra");
        finalizarCompra=false;            
        }else {System.out.println("Opcion incorrecta");}
            
        } while (finalizarCompra);

        
              

        
        leer.close();
    }

    
}