
public class SquareNDiamond
{

    public static void main(String[] args)
    {
        int input = Integer.parseInt(args[0]);   
        int s = input;
        int d = 0;
        int g = 0;
        int h = input;

        for(int x = 0; x <= input; x++){

            if(x == 0 || x == input){
                for(int y = 0; y <= input; y++){
                    System.out.print("* ");

                }
            }
            else{       
                for(int y = 0; y <= input; y++){
                    if(y == 0 || y == input){        
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();    
        }

        for(int z = 0; z <= input; z++){

            for(int a = 0; a <= input; a++){
                if(a == s){
                    System.out.print("*");
                    s--;
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int aa = 0; aa <= input; aa++){
                if(d == 0){

                }
                else if(aa == d && d != 0){
                    System.out.print("*");
                }
                else if(aa != 0){
                    System.out.print(" ");
                }
            }
            System.out.println();
            d++;
        }
        for(int w = 0; w <= input; w++){

            for(int c = 0; c <= input; c++){
                if(g != 0){
                if(c == g){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }

            }
            for(int r = 0; r <= input; r++){
                if(h != input && r != 0){
                
                if(h == r && h != 0){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");

                }
            }
            }
            if(g != 0 && h != input){
            System.out.println();
            }
    g++;
    h--;
}

}
}
