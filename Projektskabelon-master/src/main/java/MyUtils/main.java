package MyUtils;

import DBAccess.BomLineMapper;
import FunctionLayer.FlatPlankMaterial;
import FunctionLayer.LoginSampleException;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws LoginSampleException {

        Map<FlatPlankMaterial, Integer> yalla = new HashMap<>();

        yalla.put(new FlatPlankMaterial("flot navn", "flot beskrivelse", 10, 1), 4);
        BomLineMapper.insertPlanksToBomLine(yalla, 2);
    }
}

