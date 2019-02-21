public class Exemplu8{
    public static void main(String [] args){
        char anotimp= 'p';// anotimp dat de p, v t i;
        // poti pune variabila de tipul char, string, int sau enum;
        switch(anotimp){
            case 'v':
                System.out.print("Este Cald");
                break;
             case 'i':
                System.out.print("Este frig");
                break;
             case 'p':
             case 't':
                System.out.print("Ploua");
                break;
              default:
                System.out.print(":)");// daca il punem el tine cazul oricaror altor valori decat cele precizate
                
        }
        
    }
}