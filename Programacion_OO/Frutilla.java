
import java.util.Scanner;
public class Frutilla
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Clientes;
    Pro[] Pros = new Pro[50];
    double total;
    double cant;
    double opc;
    System.out.println("Digite el numero de Clientes");
        System.out.println("Nota, solo se tomara un producto por cliente");
        Clientes = sc.nextInt();
        total=0;
    
    
    for(int i=0; i < Clientes; i++){
            double Preci1, Preci2, Preci3, Preci4, Preci5;
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
         Pro nose = new Pro();
        Preci1= 5000*cant;
        nose.total1=Preci1;
        nose.Prec1= Preci1;
        nose.Prec2 = Preci2;
        nose.Prec3 = Preci3;
        nose.Prec4 = Preci4;
        nose.Prec5 = Preci5;
        nose.canti1 = cant;
         Pros[i] = nose;

        
        
    }
    if(opc== 2){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        Pro nose = new Pro();
        Preci2= 4500*cant;
        nose.total1=Preci2;
        nose.Prec1= Preci1;
        nose.Prec2 = Preci2;
        nose.Prec3 = Preci3;
        nose.Prec4 = Preci4;
        nose.Prec5 = Preci5;
        nose.canti2 = cant;
         Pros[i] = nose;
        
        
    }

    if(opc== 3){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        Pro nose = new Pro();
        Preci3= 5000*cant;
        nose.total1=Preci3;
        nose.Prec1= Preci1;
        nose.Prec2 = Preci2;
        nose.Prec3 = Preci3;
        nose.Prec4 = Preci4;
        nose.Prec5 = Preci5;
        nose.canti3 = cant;
         Pros[i] = nose;

        
        
    }

    if(opc== 4){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        Pro nose = new Pro();
        Preci4= 3000*cant;
        nose.total1=Preci4;
        nose.Prec1= Preci1;
        nose.Prec2 = Preci2;
        nose.Prec3 = Preci3;
        nose.Prec4 = Preci4;
        nose.Prec5 = Preci5;
        nose.canti4 = cant;
         Pros[i] = nose;

        
        
    }

    if(opc== 5){
        System.out.println("Diguite la cantidad que desea comprar " );  
        cant= sc.nextInt();
        Preci1=0;
        Preci2=0;
        Preci3=0;
        Preci4=0;
        Preci5=0;
        Pro nose = new Pro();
        Preci5= 2500*cant;
        nose.total1=Preci5;
        nose.Prec1= Preci1;
        nose.Prec2 = Preci2;
        nose.Prec3 = Preci3;
        nose.Prec4 = Preci4;
        nose.Prec5 = Preci5;
        nose.canti5 = cant;
         Pros[i] = nose;

    }
    
    
      }   
      
      for(int i = 0; i < Clientes; i++){
    
        System.out.println("___________________________________");
        System.out.println("Manzanas (5000 $)* " + Pros[i].canti1 + "= " + Pros[i].Prec1);
            System.out.println("Piñas (4500 $)* " + Pros[i].canti2 + "= " + Pros[i].Prec2);
            System.out.println("Naranjas (5000 $)* "+ Pros[i].canti3 + "= " + Pros[i].Prec3);
            System.out.println("Peras * (3000 $)" + Pros[i].canti4 + "= " + Pros[i].Prec4);
            System.out.println("Duraznos (2500 $)* " + Pros[i].canti5 + "= " + Pros[i].Prec5);
            System.out.println("Total de la compra fue de " + Pros[i].total1);
    }
      
      
    
    }
    

    
}
