package MyUtils;


import FunctionLayer.*;

import java.util.Map;

public class InitializeMaps {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = null;
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap = null;
    private static Map<Integer, RaisedPlankMaterial> raisedPlankMaterialMap = null;
    private static Map<Integer, RaisedScrewMaterial> raisedScrewMaterialMap = null;
    private static Map<Integer, RaisedRoofMaterial> raisedRoofMaterialMap = null;

    public static Map<Integer, FlatPlankMaterial> getAllFlatPlankMaterial() {

        if (flatPlankMaterialMap == null) {

            try {
                flatPlankMaterialMap = LogicFacade.GetAllFlatPlanksMat();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return flatPlankMaterialMap;

    }

    public static Map<Integer, FlatScrewMaterial> getAllFlatScrewMaterial() {

        if (flatScrewMaterialMap == null) {

            try {
                flatScrewMaterialMap = LogicFacade.GetAllFlatScrewMaterial();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return flatScrewMaterialMap;

    }

    public static Map<Integer, RaisedPlankMaterial> getAllRaisedPlankMaterial() {

        if (raisedPlankMaterialMap == null) {

            try {
                raisedPlankMaterialMap = LogicFacade.GetAllRaisedPlankMaterial();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return raisedPlankMaterialMap;

    }

}
