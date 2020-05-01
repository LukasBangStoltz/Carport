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
}
