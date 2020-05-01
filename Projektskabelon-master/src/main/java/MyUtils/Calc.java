package MyUtils;

import FunctionLayer.BomPart;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    private static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();
    private static List<Material> materialList = InitializeLists.getMaterialList();


    //int order_id, int carportPart_id, String name, String dimension, int materialLength, int quantity, String unit, int price
    public static void understernForOgBag(int carportWidth) {

        int quantity = 4;
        double lengthNeeded = carportWidth * 0.60;
        double finalLengthNeeded = 0;


        int maxValue = Integer.MAX_VALUE;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 1) {
                double afvigelse = mv.getLength() / lengthNeeded;
                if(afvigelse < maxValue){
                    finalLengthNeeded = mv.getLength();
                    break;
                }
            }

        }
        System.out.println(lengthNeeded);
        System.out.println(finalLengthNeeded);


    }
}
