public class exercice2{
    public static void main(String[] args){

        int age = Integer.parseInt(args[0]);

        if(age < 12){
            System.out.println("Enfant\n");
        }else if(age >= 12 && age <= 17){
            System.out.println("Adolescent\n");
            
        }else if(age >=18){
            System.out.println("Adulte\n");
        }else{
            System.out.println("saisissez un âge\n");
        }
    }
}