package MyUtils;


import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.FlatScrewMaterial;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FlatRoofMatCalcFunctions {

    private static ArrayList<FlatPlankMaterial> flatPlankMaterialList = InitializeLists.getAllFlatPlankMaterial();
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap; //Fejl med at fylde hashmappet op (flatscrewmaterial)
    private static Map<Object, Integer> flatPlankMaterialsNeeded = new LinkedHashMap<>();
    public static void calcUnderSternForBag(int carportWidth) {

        double defaultLengthPlank = flatPlankMaterialList.get(0).getMaterialLength();


        int totalUnderSternNeeded = (int) Math.ceil( (carportWidth * 2) / defaultLengthPlank);

        flatPlankMaterialsNeeded.put(flatPlankMaterialList.get(0), totalUnderSternNeeded);
    }

    public static int calcUnderSternSider(int carportLength){

        double defaultLengthPlank = flatPlankMaterialList.get(1).getMaterialLength();

        int totalSiderSternNeeded = (int) Math.ceil((carportLength * 2)/defaultLengthPlank);

        return totalSiderSternNeeded;

    }

    public static int calcOverSternFor(int carportWidth){

        double defaultLengthPlank = flatPlankMaterialList.get(2).getMaterialLength();

        int totalOverSternNeeded = (int) Math.ceil(carportWidth/defaultLengthPlank);

        return totalOverSternNeeded;

    }

    public static int calcOverSternSider(int carportLength){

        double defaultLengthPlank = flatPlankMaterialList.get(3).getMaterialLength();

        int totalOverSternSiderNeeded = (int) Math.ceil((carportLength*2)/defaultLengthPlank);

        return totalOverSternSiderNeeded;

    }




}
