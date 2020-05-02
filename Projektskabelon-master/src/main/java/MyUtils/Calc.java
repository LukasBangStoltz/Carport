package MyUtils;

import FunctionLayer.BomPart;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();
    private static List<Material> materialList = InitializeLists.getMaterialList();


    //int order_id, int carportPart_id, String name, String dimension, int materialLength, int quantity, String unit, int price

    // material id = 1
    public static void understernForOgBag(int carportWidth) {

        int quantity = 4;
        double lengthNeeded = carportWidth * 0.60;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 1){
               if(lengthNeeded <= mv.getLength()){
                   finalLengthNeeded = mv.getLength();
                   break;
               }
            }

        }

        System.out.println(lengthNeeded);
        System.out.println(finalLengthNeeded);
    }

    // material id = 1
    public static void understernSider(int carportLength){
        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 1){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }
        }
        System.out.println(lengthNeeded);
        System.out.println(finalLengthNeeded);

    }

    // material id = 2
    public static void oversternFor(int carportWidth){

        int quantity = 2;
        double lengthNeeded = carportWidth * 0.60;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 2){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }

        }
    }

    // material id = 2
    public static void oversternSider(int carportLength){

        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 2){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }

        }
    }

    // material id = 3
    public static void lægteTilZDørSkur(){
        int quantity = 1;
        int materialNeeded;
        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 3){
                materialNeeded = mv.getMaterial_id();
                break;
            }

        }

    }

    // material id = 4
    public static void remmeSider(int carportLength){
        int quantity = 2;
        double lengthNeeded = carportLength * 0.76;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 4){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }

        }
    }

    // material id = 4
    public static void spærTilRem(int carportWidth, int carportLength){

        int spærNeeded = 0;
        int spaceBetweenSpær = 55;
        int spærLengthNeeded = 0;

        spærNeeded = carportLength / spaceBetweenSpær;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 4){
                if(carportWidth <= mv.getLength()){
                    spærLengthNeeded = mv.getLength();
                    break;
                }
            }
        }
    }

    // material id = 5
    public static void stolper(int carportWidth){

    }

    // material id = 6
    public static void vandbrædtSider(int carportLength){
        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 6){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }
        }

    }

    // material id = 6
    public static void vandbrædtFor(int carportLength){
        int quantity = 2;
        double lengthNeeded = carportLength * 0.60;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if(mv.getMaterial_id() == 6){
                if(lengthNeeded <= mv.getLength()){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }
        }

    }



}
