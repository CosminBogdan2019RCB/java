public class Exemplu1{
    public static void main(String [] args){
        byte b1;
        b1 = 10;
        System.out.println(b1);
        byte b2=10;// se da o valoare zonei de memorie atunci cand se si declara-initializare
        byte b3, b4=10, b5;
        
        int q2=0541;// clasa 8;
        System.out.println(q2);
        int q3=0xFF;
        System.out.println(q3);
        
        long q5=999999999999L;
        
        float f1 =10.5f;
        float f2 =(float) 10.0;// conversie explicita;
        
        int q6=(int) 10.5;// se va trunchea rezultand q6=10;
        
        char c1='a';
        char c2='\n';// linie noua;
        char c3='\u1515';// codul din lista unicode;
        System.out.print(c3);
        boolean t1= true;
        boolean t2= false;
        
        String z1="Hello :)";
        String z2="Hello \n \u0101 World!";
        
        
        
        }
}