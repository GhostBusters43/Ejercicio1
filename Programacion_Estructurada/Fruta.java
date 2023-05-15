
import java.util.Scanner;
public class Fruta
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double[] Prec1 = new double[50];
        double[] Prec2 = new double[50];
        double[] Prec3 = new double[50];
        double[] Prec4 = new double[50];
        double[] Prec5 = new double[50];
        double[] canti = new double[50];
        double[] canti2 = new double[50];
        double[] canti3 = new double[50];
        double[] canti4= new double[50];
        double[] canti5 = new double[50];
        double[] total1 = new double[50];
        
        int Clientes;
        double total;
        double cant;
        double opc;
        System.out.println("Digite el numero de Clientes");
        System.out.println("Nota, solo se tomara un producto por cliente");
        Clientes = sc.nextInt();
        total=0;
        
        
        
        for(int i=0; i < Clientes; i++){
            double Preci1, Preci2, Preci3, Preci4, Preci5, a, b, c, d, e;
            a=0;
        b=0;
        c=0;
        d=0;
        e=0;
            System.out.println("Lista de Productos para el cliente " );
            System.out.println("1) Manzana- 5000 $");
            System.out.println("2) Piña - 4500 $");
            System.out.println("3) Naranja - 5000 $");
            System.out.println("4) Pera - 3000 $");
            System.out.println("5) Durazno - 2500 $");
            opc = sc.nextDouble();
            while (opc<1){         
                while (opc >5){
            System.out.println("Diguite una opcion valida " );     
            System.out.println("Lista de Productos para el cliente ");
            System.out.println("1) Manzana- 5000 $");
            System.out.println("2) Piña - 4500 $");
            System.out.println("3) Naranja - 5000 $");
            System.out.println("4) Pera - 3000 $");
            System.out.println("5) Durazno - 2500 $");
            opc = sc.nextDouble();      
    }
}
    if(opc== 1){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
 
        Preci1= 5000*cant;
        total1[i]=Preci1;
        a=a+Preci1;
        Prec1[i] = Preci1;
        Prec2[i] = Preci2;
        Prec3[i] = Preci3;
        Prec4[i] = Preci4;
        Prec5[i] = Preci5;
        canti[i] = cant;
        
        
    }
    if(opc== 2){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        
        Preci2= 4500*cant;
        total1[i]=Preci2;
        b=b+Preci2;
        Prec1[i] = Preci1;
        Prec2[i] = Preci2;
        Prec3[i] = Preci3;
        Prec4[i] = Preci4;
        Prec5[i] = Preci5;
        canti2[i] = cant;
        
        
    }

    if(opc== 3){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        
        Preci3= 5000*cant;
        total1[i]=Preci3;
        c=c+Preci3;
        Prec1[i] = Preci1;
        Prec2[i] = Preci2;
        Prec3[i] = Preci3;
        Prec4[i] = Preci4;
        Prec5[i] = Preci5;
        canti3[i] = cant;
        
        
    }

    if(opc== 4){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        
        Preci4= 3000*cant;
        total1[i]=Preci4;
        d=d+Preci4;
        Prec1[i] = Preci1;
        Prec2[i] = Preci2;
        Prec3[i] = Preci3;
        Prec4[i] = Preci4;
        Prec5[i] = Preci5;
        canti4[i] = cant;
        
        
    }

    if(opc== 5){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        Preci5= 2500*cant;
        total1[i]=Preci5;
        e=e+Preci5;
        Prec1[i] = Preci1;
        Prec2[i] = Preci2;
        Prec3[i] = Preci3;
        Prec4[i] = Preci4;
        Prec5[i] = Preci5;
        canti5[i] = cant;

    }

    
}

for(int i = 0; i < Clientes; i++){
        System.out.println("___________________________________");
        System.out.println("Manzanas (5000 $)* " + canti[i] + "= " + Prec1[i]);
            System.out.println("Piñas (4500 $)* " + canti2[i] + "= " + Prec2[i]);
            System.out.println("Naranjas (5000 $)* "+ canti3[i] + "= " + Prec3[i]);
            System.out.println("Peras * (3000 $)" + canti4[i] + "= " + Prec4[i]);
            System.out.println("Duraznos (2500 $)* " + canti5[i] + "= " + Prec5[i]);
            System.out.println("Total de la compra fue de " + total1[i]);
    }


}
}


