package MyUtils;


import FunctionLayer.FlatPlankMaterial;

import java.util.Map;

public class FlatRoofMatCalcFunctions {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = InitializeMaps.getAllFlatPlankMaterial();

    public static int calcUnderSternForBag(int carportWidth) {

         double defaultLengthPlank = flatPlankMaterialMap.get(1).getMaterialLength();

        System.out.println(defaultLengthPlank);

        int totalUnderSternNeeded = (int) Math.ceil( (carportWidth * 2) / defaultLengthPlank);

        

        return totalUnderSternNeeded;

    }

}
