package MyUtils;

import FunctionLayer.Part;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();
    public static List<Part> carportPartList = new ArrayList<>();

    // material id = 1
    public static void understernForOgBag(int carportWidth) {

        int quantity = 4;
        double lengthNeeded = carportWidth * 0.60;
        double finalLengthNeeded = 0;

        //int quantity, String description, int material_id, int mv_id, int length, int price
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 1) {
                if (lengthNeeded <= mv.getLength()) {
                    finalLengthNeeded = mv.getLength();
                    carportPartList.add(new Part(quantity, "understernbrædder til for & bagende", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));

                    break;
                }
            }

        }
    }

    // material id = 1
    public static void understernSider(int carportLength) {
        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;
        double finalLengthNeeded = 0;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 1) {
                if (lengthNeeded <= mv.getLength()) {
                    finalLengthNeeded = mv.getLength();
                    carportPartList.add(new Part(quantity, "understernbrædder til siderne", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }


    }

    // material id = 2
    public static void oversternFor(int carportWidth) {

        int quantity = 2;
        double lengthNeeded = carportWidth * 0.60;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 2) {
                if (lengthNeeded <= mv.getLength()) {
                    finalLengthNeeded = mv.getLength();
                    carportPartList.add(new Part(quantity, "oversternbrædder til forenden", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    // material id = 2
    public static void oversternSider(int carportLength) {

        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 2) {
                if (lengthNeeded <= mv.getLength()) {
                    finalLengthNeeded = mv.getLength();
                    carportPartList.add(new Part(quantity, "oversternbrædder til siderne", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    // material id = 3
    public static void lægteTilZDørSkur() {
        int quantity = 1;
        int materialNeeded;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 3) {
                materialNeeded = mv.getMaterial_id();
                carportPartList.add(new Part(quantity, "til z på bagside af dør", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }

        }

    }

    // material id = 4
    public static void remmeSider(int carportLength) {
        int quantity = 2;
        double lengthNeeded = carportLength * 0.76;
        double finalLengthNeeded = 0;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 4) {
                if (lengthNeeded <= mv.getLength()) {
                    finalLengthNeeded = mv.getLength();
                    carportPartList.add(new Part(quantity, "Remme i sider, sadles ned i stolper", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    // material id = 4
    public static void spærTilRem(int carportWidth, int carportLength) {

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 4) {
                if (carportWidth <= mv.getLength()) {

                    double spaceBetweenSpær = 55;
                    double spærNeeded = carportLength / spaceBetweenSpær;

                    carportPartList.add(new Part(spærNeeded, "Spær, monteres på rem ", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    // material id = 5
    public static void calcStolper(int carportLength, int toolShedLength, boolean hasToolShed) {

        int quantity = 0;
        if (!hasToolShed) {
            quantity = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;

            if (quantity == 2) {
                quantity = 4;
            }

        }

        if (hasToolShed) {

            int quantityCarport = (int) Math.ceil((((((carportLength - 110) - toolShedLength) / 300) * 2)) + 2);
            int quantityToolShed = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;
            quantity = quantityCarport + quantityToolShed;
        }

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 5) {
                carportPartList.add(new Part(quantity, "Stolper nedgraves 90 cm i jorden", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }
    }

    // material id = 6
    public static void vandbrædtSider(int carportLength) {
        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 6) {
                if (lengthNeeded <= mv.getLength()) {

                    carportPartList.add(new Part(quantity, "vandbrædt på stern i sider", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    // material id = 6
    public static void vandbrædtFor(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 0.60;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 6) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "vandbrædt på stern i forende", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    


}
