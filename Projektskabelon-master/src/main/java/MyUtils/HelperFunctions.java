package MyUtils;

public class HelperFunctions {

    public static boolean checkSkurSize(int skurLength, int skurWidth, int carportLength, int carportWidth){

        boolean isValid = false;

        if(skurLength < carportLength && skurWidth < carportWidth){
            isValid = true;
        }

        if(skurLength == 0 || skurWidth == 0){
            isValid = true;
        }

        return isValid;


    }
}
