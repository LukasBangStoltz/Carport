package MyUtils;


import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.FlatScrewMaterial;

import java.util.Map;

public class FlatRoofMatCalcFunctions {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = InitializeMaps.getAllFlatPlankMaterial();
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap = InitializeMaps.getAllFlatScrewMaterial();

    public static int calcUnderSternForBag(int carportWidth) {

        double defaultLengthPlank = flatPlankMaterialMap.get(1).getMaterialLength();

        int totalUnderSternNeeded = (int) Math.ceil( (carportWidth * 2) / defaultLengthPlank);

        return totalUnderSternNeeded;

    }
    public static int calcUnderSternSider(int carportLength){

        double defaultLengthPlank = flatPlankMaterialMap.get(2).getMaterialLength();

        int totalSiderSternNeeded = (int) Math.ceil((carportLength * 2)/defaultLengthPlank);

        return totalSiderSternNeeded;



    }


}
