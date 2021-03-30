/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre para fichas blancas");
        String x = entrada.next();
        System.out.println("Ingrese nombre para fichas negras");
        String y = entrada.next();
        System.out.println("Fichas blancas: "+ x +"," + " Fichas negras: " + y );
        int W = 1;
        Vector <String> B = new Vector <String>();
        Vector <String> N = new Vector <String>();
        String[] denominacion = {"P" ,"P", "P", "P", "P", "P", "P", "P", "N", "N", "B", "B", "R", "R", "Q", "K"};
        System.out.println("Estas son las denominaciones: P P P P P P P P N N B B R R Q K");
        for(int i = 0 ; i < 16 ; i++){
            String c = denominacion[i];
            B.add(c);
            N.add(c);
        }
        Vector <String> b = new Vector <String>();
        Vector <String> n = new Vector <String>();
        String[] fiblanca = {"Pa2" ,"Pb2", "Pc2", "Pd2", "Pe2", "Pf2" ,"Pg2", "Ph2" ,"Nb1" ,"Ng1", "Bc1" ,"Bf1", "Ra1", "Rh1", "Qd1", "Ke1"};
        String[] finegra = {"Pa7" ,"Pb7" ,"Pc7", "Pd7" ,"Pe7" ,"Pf7", "Pg7", "Ph7", "Nb8", "Ng8" ,"Bc8", "Bf8", "Ra8", "Rh8" ,"Qe8" ,"Kd8"};
        System.out.println("Estas son las fichas blancas :  Pa2 Pb2 Pc2 Pd2 Pe2 Pf2 Pg2 Ph2 Nb1 Ng1 Bc1 Bf1 Ra1 Rh1 Qd1 Ke1 ");
        for(int i = 0; i < 16 ; i++){
            String c = fiblanca[i];
            b.add(c);
        }
        System.out.println("Estas son las fichas negras :  Pa7 Pb7 Pc7 Pd7 Pe7 Pf7 Pg7 Ph7 Nb8 Ng8 Bc8 Bf8 Ra8 Rh8 Qe8 Kd8 ");
        for(int i = 0; i < 16 ; i++){
            String c = finegra[i];
            n.add(c);
        }
        
        int contador = 0;
        Vector <String> HistB = new Vector<String>();
        Vector <String> HistN = new Vector<String>();
        Vector <String> Rangos = new Vector<String>();
        String[] ran ={"a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "f1", "f2", "f3", "f4", "f5", "f6" ,"f7", "f8", "g1", "g2", "g3", "g4" ,"g5" ,"g6", "g7", "g8" ,"h1", "h2", "h3" ,"h4", "h5", "h6" ,"h7" ,"h8"};
        System.out.print("Estos son los rangos: a1 a2 a3 a4 a5 a6 a7 a8 b1 b2 b3 b4 b5 b6 b7 b8 c1 c2 c3 c4 c5 c6 c7 c8 d1 d2 d3 d4 d5 d6 d7 d8 e1 e2 e3 e4 e5 e6 e7 e8 f1 f2 f3 f4 f5 f6 f7 f8 g1 g2 g3 g4 g5 g6 g7 g8 h1 h2 h3 h4 h5 h6 h7 h8");
        for(int i = 0; i < 64 ; i++){
            String c = ran[i];
            Rangos.add(c);
        }
        
        Vector <String> Bfuera = new Vector<String>();
        Vector <String> Nfuera = new Vector <String>();
        
        /* Aquí comienza el juego */
        while(W == 1){
            contador = contador+1;
            System.out.println("Empieza la ronda" + " "+ contador);
            System.out.println("Ingrese la denominación de la ficha blanca que desee mover (N,P,B,R,Q,K)");
            String blancaD = entrada.next();
            int DB = B.indexOf(blancaD);
            while(DB == -1){
                System.out.println("Esta denominación de ficha ya no está disponible, use una de las siguientes: ");
                int tama = B.size();
                for(int i = 0 ; i < tama ; i++){
                    System.out.print(B.get(i));
                }
                System.out.print(" ");
                blancaD = entrada.next();
                DB = B.indexOf(blancaD);
            }
            System.out.println("Ingrese la posición de la ficha blanca que desea mover (desde a-1 hasta h-8)");
            String blancaP = entrada.next();
            String blancaInicial = blancaD+blancaP;
            int z = b.indexOf(blancaInicial);
            while(z == -1){
                System.out.println("No hay ninguna ficha blanca en esta posición, use alguna de las siguientes para la denominación: " + blancaD);
                int tama = b.size();
                for(int i = 0; i < tama ;i++){
                    System.out.print(b.get(i)+"  ");
                }
                blancaP = entrada.next();
                blancaInicial= blancaD+blancaP;
                z = b.indexOf(blancaInicial);
            }
            int IDblancaInicial = z;
            System.out.println("Ahora ingrese la posición(de a1 hasta h8) a la cual desea mover la ficha blanca:  "+blancaInicial);
            String blancaPF = entrada.next();
            int m = Rangos.indexOf(blancaPF);
            while(m == -1){
                System.out.println("No estas en el rango permitido, digita un caracter del rango del tablero de ajedrez establecido");
                blancaPF = entrada.next();
                m = Rangos.indexOf(blancaPF);
            }
            String blancaFinal = blancaD+blancaPF;
            HistB.add(blancaFinal);
            b.set(IDblancaInicial,blancaFinal);
            System.out.println(Arrays.asList(b));
            System.out.println(blancaInicial+"  "+blancaFinal);
            int xx = 0;
            String nComida = "";
            int nRemove = 0;
            String Nremove = "";
            for(int i = 0; i < n.size() ; i++ ){
                if(blancaPF.equals(n.get(i).substring(1, 3))){
                    xx = xx + 1;
                    nComida = n.get(i);
                    nRemove = i;
                    Nremove = n.get(i).substring(0,1);
                }
            }
            if(xx == 1){
                System.out.println("la ficha blanca   :"+blancaInicial+"  se ha movido a la posición "+blancaPF+" Y se ha comido la ficha negra  "+nComida);
            }
            if(nComida.equals("")){
                
            }
            else{
                Nfuera.add(nComida);
            }
            N.removeElement(Nremove);
            String repuestoN = n.get(nRemove);
            n.removeElementAt(nRemove);
            System.out.println("Éstas son las fichas negras restantes");
            System.out.println(Arrays.asList(n));
            System.out.println(Arrays.asList(N));
            
            /* desde qui las negras */
            
            System.out.println("Ingrese la denominación de la ficha negra que desee mover (N,P,B,R,Q,K)");
            String negraD = entrada.next();
            int DN = N.indexOf(negraD);
            while(DN == -1){
                System.out.println("Esta denominación de ficha ya no está disponible, use una de las siguientes: ");
                int tama = N.size();
                for(int i = 0 ; i < tama ; i++){
                    System.out.print(N.get(i));
                }
                System.out.print(" ");
                negraD = entrada.next();
                DN = N.indexOf(negraD);
            }
            System.out.println("Ingrese la posición de la ficha negra que desea mover (desde a-1 hasta h-8)");
            String negraP = entrada.next();
            String negraInicial = negraD+negraP;
            int zN = n.indexOf(negraInicial);
            while(zN == -1){
                System.out.println("No hay ninguna ficha negra en esta posición, use alguna de las siguientes para la denominación: " + negraD);
                int tama = n.size();
                for(int i = 0; i < tama ;i++){
                    System.out.print(n.get(i)+"  ");
                }
                negraP = entrada.next();
                negraInicial= negraD+negraP;
                zN = n.indexOf(negraInicial);
            }
            int IDnegraInicial = zN;
            System.out.println("Ahora ingrese la posición(de a1 hasta h8) a la cual desea mover la ficha negra:  "+negraInicial);
            String negraPF = entrada.next();
            int mm = Rangos.indexOf(negraPF);
            while(mm == -1){
                System.out.println("No estas en el rango permitido, digita un caracter del rango del tablero de ajedrez establecido");
                negraPF = entrada.next();
                mm = Rangos.indexOf(negraPF);
            }
            String negraFinal = negraD+negraPF;
            HistN.add(negraFinal);
            n.set(IDnegraInicial,negraFinal);
            System.out.println(Arrays.asList(n));
            System.out.println(negraInicial+"  "+negraFinal);
            int xxx = 0;
            String bComida = "";
            int bRemove = 0;
            String Bremove = "";
            for(int i = 0; i < b.size() ; i++ ){
                if(negraPF.equals(b.get(i).substring(1, 3))){
                    xxx = xxx + 1;
                    bComida = b.get(i);
                    bRemove = i;
                    Bremove = b.get(i).substring(0,1);
                }
            }
            if(xxx == 1){
                System.out.println("la ficha negra   :"+negraInicial+"  se ha movido a la posición "+negraPF+" Y se ha comido la ficha blanca  "+bComida);
            }
            if(bComida.equals("")){
                
            }
            else{
                Bfuera.add(bComida);
            }
            B.removeElement(Bremove);
            String repuestoB = b.get(bRemove);
            b.removeElementAt(bRemove);
            System.out.println("Éstas son las fichas blancas restantes");
            System.out.println(Arrays.asList(b));
            System.out.println(Arrays.asList(B));
            
            /*Eliminación de ronda */
            System.out.println("Desea Elimiar esta ronda Si o No");
            String EL = entrada.next();
            if(EL.equals("Si") || EL.equals("si") || EL.equals("SI")){
                b.set(IDblancaInicial,blancaInicial);
                N.add(Nremove);
                n.add(repuestoN);
                int tamaB = HistB.size();
                HistB.removeElementAt(tamaB-1);
                Nfuera.removeElement(nComida);
                
                
                n.set(IDnegraInicial,negraInicial);
                B.add(Bremove);
                b.add(repuestoB);
                int tamaN = HistN.size();
                HistN.removeElementAt(tamaN-1);
                Bfuera.removeElement(bComida);
           }
             
           
            /* Ver Lista de jugadas*/
            System.out.println("Desea ver el hisorial de fichas movidas ?, Poner Si o No");
            String pregunta = entrada.next();
            if(pregunta.equals("si") || pregunta.equals("Si") || pregunta.equals("SI")){
                System.out.println("Las fichas Blancas movidas son :  " + Arrays.asList(HistB) );
                System.out.println("Las fichas Negras movidas son :  "+ Arrays.asList(HistN));
            }
            
            /* Ver fichas capturadas */
            System.out.println(" Desea ver las fichas capturadas por Color ?, Poner Si o No");
            String pregunta1 = entrada.next();
           if(pregunta1.equals("si") || pregunta1.equals("Si") || pregunta1.equals("SI")){
               Collections.sort(Bfuera);
               System.out.println("Las fichas Blancas capturadas son" + Arrays.asList(Bfuera) );
               Collections.sort(Nfuera);
               System.out.println("Las fichas Negras capturadas son  "+ Arrays.asList(Nfuera));
            }
           
           /* Aqui para consultar cualquier ronda */
           System.out.print("Desea consultar alguna ronda ?, poner Si o No ");
           String pregunta2 = entrada.next();
           if(pregunta2.equals("si") || pregunta2.equals("Si") || pregunta2.equals("SI")){
               System.out.println("Que ronda quiere consultar ( Número enteros por favor) ");
               int ronda = entrada.nextInt();
               if(ronda <= contador && ronda >0){
                   if(HistB.size() >= 1){
                       System.out.println("la ficha blanca movida fue : "+ HistB.get(ronda -1));
                       System.out.println("La ficha negra movida fue : "+ HistN.get(ronda-1));
                   }
                   else if(HistN.size() == 0 && HistB.size()==0){
                       System.out.println("No se han registrado movidas");
                   }
               }
               else{
                   System.out.println("Esa ronda no existe");
               }
           }
            System.out.println("Desea editar ésta ronda Si o No ? deberá volver a ingresar los movimientos de las fichas blancas y negras, además de darle No a la opcion finalizar.");
            String desicion= entrada.next();
            if(desicion.equals("Si") || desicion.equals("SI") || desicion.equals("si")){
                b.set(IDblancaInicial,blancaInicial);
                N.add(Nremove);
                n.add(repuestoN);
                int tamaB = HistB.size();
                HistB.removeElementAt(tamaB-1);
                Nfuera.removeElement(nComida);
                
                
                n.set(IDnegraInicial,negraInicial);
                B.add(Bremove);
                b.add(repuestoB);
                int tamaN = HistN.size();
                HistN.removeElementAt(tamaN-1);
                Bfuera.removeElement(bComida);
                
                contador = contador -1;
           }           

           
            System.out.println("Finalizamos ? , ponga (Si) para finalizar");
            String si = entrada.next();
            if(si.equals("si") || si.equals("Si") || si.equals("SI")){
                return ;
            }
    }
    
}
}
