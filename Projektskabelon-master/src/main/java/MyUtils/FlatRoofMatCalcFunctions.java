package MyUtils;


import FunctionLayer.PlankMaterial;
import FunctionLayer.FlatScrewMaterial;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FlatRoofMatCalcFunctions {

    private static ArrayList<PlankMaterial> plankMaterialList = InitializeLists.getAllFlatPlankMaterial();
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap; //Fejl med at fylde hashmappet op (flatscrewmaterial)
    private static Map<Object, Integer> flatPlankMaterialsNeeded = new LinkedHashMap<>();

    public static void calcUnderSternForBag(int carportWidth) {

        double defaultLengthPlank = plankMaterialList.get(0).getMaterialLength();


        int totalUnderSternNeeded = (int) Math.ceil((carportWidth * 2) / defaultLengthPlank);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(0), totalUnderSternNeeded);
    }

    public static void calcUnderSternSider(int carportLength) {

        double defaultLengthPlank = plankMaterialList.get(1).getMaterialLength();

        int totalSiderSternNeeded = (int) Math.ceil((carportLength * 2) / defaultLengthPlank);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(1), totalSiderSternNeeded);

    }

    public static void calcOverSternFor(int carportWidth) {

        double defaultLengthPlank = plankMaterialList.get(2).getMaterialLength();

        int totalOverSternNeeded = (int) Math.ceil(carportWidth / defaultLengthPlank);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(2), totalOverSternNeeded);

    }

    public static void calcOverSternSider(int carportLength) {

        double defaultLengthPlank = plankMaterialList.get(3).getMaterialLength();

        int totalOverSternSiderNeeded = (int) Math.ceil((carportLength * 2) / defaultLengthPlank);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(3), totalOverSternSiderNeeded);

    }

    public static void calcLægte() {

        final int LÆGTE_PCS = 1;

        flatPlankMaterialsNeeded.put(plankMaterialList.get(4), LÆGTE_PCS);
    }

    public static void calcLøsholtGavl(int skurWidth) {

        int løsHolterNeeded = 0;

        int antalStolperGavle = (int) ((Math.floor(skurWidth / 2) / 100) * 2);

        if (antalStolperGavle < 4) {
            antalStolperGavle = 4;
        }

        switch (antalStolperGavle) {
            case 4:
                løsHolterNeeded = 6;
                break;
            case 6:
                løsHolterNeeded = 12;
                break;
            case 8:
                løsHolterNeeded = 24;
                break;
        }


        flatPlankMaterialsNeeded.put(plankMaterialList.get(5), løsHolterNeeded);

    }


    public static void calcLøsholtSide(int skurLength) {

        int løsHolterNeeded = 0;

        int antalStolperSide = (int) ((Math.floor(skurLength / 2) / 100) * 2);

        if (antalStolperSide < 4) {
            antalStolperSide = 4;
        }

        switch (antalStolperSide) {
            case 4:
                løsHolterNeeded = 6;
                break;
            case 6:
                løsHolterNeeded = 12;
                break;
            case 8:
                løsHolterNeeded = 24;
                break;
        }


        flatPlankMaterialsNeeded.put(plankMaterialList.get(6), løsHolterNeeded);


    }

    









}





