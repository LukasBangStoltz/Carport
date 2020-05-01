package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class GenerateBom {

    private List<BomPart> listOfBomParts = new ArrayList<>();

    public List<BomPart> getListOfBomParts() {
        return listOfBomParts;
    }

    public void setListOfBomParts(List<BomPart> listOfBomParts) {
        this.listOfBomParts = listOfBomParts;
    }
}
