package MyUtils;


import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.FlatScrewMaterial;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import java.util.Map;

public class InitializeMaps {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = null;
    private static Map<Integer, FlatScrewMaterial> flatScrewMaterialMap = null;

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

}
