package MyUtils;


import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.FlatScrewMaterial;

import java.util.Map;

public class FlatRoofMatCalcFunctions {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = InitializeMaps.getAllFlatPlankMaterial();
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap; //Fejl med at fylde hashmappet op (flatscrewmaterial)

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

    public static int calcOverSternFor(int carportWidth){

        double defaultLengthPlank = flatPlankMaterialMap.get(3).getMaterialLength();

        int totalOverSternFor = (int) Math.ceil(carportWidth/defaultLengthPlank);

        return totalOverSternFor;

    }


}
