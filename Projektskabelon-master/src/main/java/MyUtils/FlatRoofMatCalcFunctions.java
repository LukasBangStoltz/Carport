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

    public static void calcLøsholtGavl(int shedWidth) {

        int løsHolterNeeded = 0;

        int antalStolperGavle = (int) ((Math.floor(shedWidth / 2) / 100) * 2);

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


    public static void calcLøsholtSide(int shedLength) {

        int løsHolterNeeded = 0;

        int antalStolperSide = (int) ((Math.floor(shedLength / 2) / 100) * 2);

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

    public static void calcRemmeSiderCarport(int carportLength){

        int defaultPlankLength = plankMaterialList.get(7).getMaterialLength();

        int antalRemmeSiderCarport = (int) Math.ceil((carportLength * 2) / defaultPlankLength);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(7), antalRemmeSiderCarport);
    }

    public static void calcRemmeSiderSkur(int shedLength){

        int defaulPlankLength = plankMaterialList.get(8).getMaterialLength();

        int antalRemmeSiderSkur = (int) Math.ceil((shedLength * 2) / defaulPlankLength);

        flatPlankMaterialsNeeded.put(plankMaterialList.get(8), antalRemmeSiderSkur);

    }

    public static void calcSpær(int carportLength){

        int antalSpær = (int) Math.ceil((carportLength * 2)) / 100;

        flatPlankMaterialsNeeded.put(plankMaterialList.get(9), antalSpær);
    }

    public static void calcStolperWithoutShed(int carportLength){

        int antalStolper = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;

        if(antalStolper == 2){
            antalStolper = 4;
        }

        flatPlankMaterialsNeeded.put(plankMaterialList.get(8), antalStolper);

    }

  /*  public static void calcStolperWithShed(int carportLength, int shedLength){

        int antalStolperCarport = (int) Math.ceil((((((carportLength - 110) - shedLength) / 300) * 2)) + 2);
        int antalStolperShed = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;

        if(antalStolper == 2){
            antalStolper = 4;
        }

        flatPlankMaterialsNeeded.put(plankMaterialList.get(8), antalStolper);

    }*/

}





