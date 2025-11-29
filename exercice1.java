public class exercice1{
    public static void main(String[] args){

        int valeur = Integer.parseInt(args[0]);

        if(valeur % 2 == 0){
            System.out.println("la valeur que vous avez saisie est pair\n");
        }else{
            System.out.println("la valeur que vous avez saisie est impair\n");
        }
    }
}