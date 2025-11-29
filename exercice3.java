public class exercice3{
    public static void main(String[] args){

        double note = Double.parseDouble(args[0]);

        if(note >= 16){
            System.out.println("Excellent\n");
        }else if(note >= 12 && note < 16){
            System.out.println("Bien\n");
        }else if(note >= 10 && note <12 ){
            System.out.println("Passable\n");
        }else if(note < 10){
            System.out.println("Insuffisant\n");
        }else{
            System.out.println("Saisissez une note sur 20\n");
        }
    }
}