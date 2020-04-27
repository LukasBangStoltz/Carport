package MyUtils;

import FunctionLayer.CarportWidth;
import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import java.util.List;
import java.util.Map;

public class InitializeMaps {

    private static Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = null;

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

}
