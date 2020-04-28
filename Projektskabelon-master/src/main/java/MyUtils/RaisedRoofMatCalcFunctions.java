package MyUtils;

import FunctionLayer.RaisedPlankMaterial;

import java.util.Map;

public class RaisedRoofMatCalcFunctions {

    private static Map<Integer, RaisedPlankMaterial> raisedPlankMaterialMap = InitializeMaps.getAllRaisedPlankMaterial();

    public static int calcVindskederRejsning(int carportWidth) {

        double defaultLengthPlank = raisedPlankMaterialMap.get(1).getMaterialLength();

        int totalVindskeder = (int) Math.ceil((carportWidth * 2) / defaultLengthPlank);

        return totalVindskeder;
    }

    public static int calcSternSiderCarport(int carportLength) {

        double defaultLengthPlank = raisedPlankMaterialMap.get(1).getMaterialLength();

        int totalSternCarport = (int) Math.ceil((carportLength * 2) / defaultLengthPlank);

        return totalSternCarport;
    }

    public static int calcSternSiderSkur(int carportLength) {

        double defaultLengthPlank = raisedPlankMaterialMap.get(1).getMaterialLength();

        int totalSternSkur = (int) Math.ceil((carportLength * 2) / defaultLengthPlank);

        return totalSternSkur;
    }

    public static int calcBygSelvSpær(int carportWidth) {

        double defaultLengthPlank = raisedPlankMaterialMap.get(1).getMaterialLength();

        int totalBygSelvSpaer = (int) Math.ceil((carportWidth * 2) / defaultLengthPlank);

        return totalBygSelvSpaer;
    }

    public static int calcStolper(int carportLength) {

        double defaultLengthPost = raisedPlankMaterialMap.get(1).getMaterialLength();

        int totalStolper = (int) Math.ceil((carportLength * 2) / defaultLengthPost);

        return totalStolper;
    }

}
