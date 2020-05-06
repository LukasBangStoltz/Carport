package MyUtils;

import FunctionLayer.Part;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();
    public static List<Material> materialsList = InitializeLists.getMaterialList();
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

                    int spaceBetweenSpær = 55;
                    int spærNeeded = carportLength / spaceBetweenSpær;

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

    //material id = 7
    public static void løsholterSkurGavle(int shedWidth) {

        int quantity = 0;

        int antalStolperGavle = (int) ((Math.floor(shedWidth / 2) / 100) * 2);

        if (antalStolperGavle < 4) {
            antalStolperGavle = 4;
        }

        switch (antalStolperGavle) {
            case 4:
                quantity = 6;
                break;
            case 6:
                quantity = 12;
                break;
            case 8:
                quantity = 24;
                break;
        }

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 7) {
                if (shedWidth <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Løsholte til skur gavle", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }


    }

    //material id = 7
    public static void løsholterSkurSider(int shedLength) {
        int quantity = 0;

        int antalStolperSide = (int) ((Math.floor(shedLength / 2) / 100) * 2);

        if (antalStolperSide < 4) {
            antalStolperSide = 4;
        }

        switch (antalStolperSide) {
            case 4:
                quantity = 6;
                break;
            case 6:
                quantity = 12;
                break;
            case 8:
                quantity = 24;
                break;
        }

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 7) {
                if (shedLength <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Løsholte til skur gavle", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    //material id = 8
    public static void tagpladerLang(int carportLength) {
        int quantity = 6;
        double lengthNeeded = carportLength;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 8) {
                if (lengthNeeded <= mv.getLength()) {

                    carportPartList.add(new Part(quantity, "Tagplader monteres på spær", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    public static void tagpladerKort(int carportLength) {
        int quantity = 6;
        double lengthNeeded = carportLength * 0.60;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 8) {
                if (lengthNeeded <= mv.getLength()) {

                    carportPartList.add(new Part(quantity, "Tagplader monteres på spær", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    public static void plastmoBundskruer() {
        int quantity = 3;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 9) {

                carportPartList.add(new Part(quantity, "Skruer til tagplader", m.getMaterialID()));
                break;
            }
        }
    }


    public static void hulbånd() {
        int quantity = 2;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 10) {

                carportPartList.add(new Part(quantity, "Til vindkryds på spær", m.getMaterialID()));
                break;
            }
        }

    }

    public static void universalHøjre() {
        int quantity = 15;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 11) {

                carportPartList.add(new Part(quantity, "Til montering af af spær på rem", m.getMaterialID()));
                break;
            }
        }

    }

    public static void universalVenstre() {
        int quantity = 15;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 12) {

                carportPartList.add(new Part(quantity, "Til montering af spær på rem", m.getMaterialID()));
                break;
            }
        }

    }

    public static void skruer200stk() {
        int quantity = 1;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 13) {

                carportPartList.add(new Part(quantity, "Til montering af stern og vandbrædt", m.getMaterialID()));
                break;
            }
        }

    }

    public static void beslagskruer() {
        int quantity = 3;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 14) {

                carportPartList.add(new Part(quantity, "Til montering af universalbeslag + hulbånd", m.getMaterialID()));
                break;
            }
        }
    }

    public static void bræddebolt() {
        int quantity = 18;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 14) {

                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", m.getMaterialID()));
                break;
            }
        }

    }

    public static void firkantskriver() {
        int quantity = 12;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 15) {

                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", m.getMaterialID()));
                break;
            }
        }

    }

    public static void skruer400stk() {
        int quantity = 2;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 16) {

                carportPartList.add(new Part(quantity, "Til montering af yderste beklædning", m.getMaterialID()));
                break;
            }
        }

    }

    public static void skruer300stk() {
        int quantity = 2;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 17) {

                carportPartList.add(new Part(quantity, "Til montering af inderste beklædning", m.getMaterialID()));
                break;
            }
        }

    }

    public static void stalddørsgreb() {
        int quantity = 1;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 18) {

                carportPartList.add(new Part(quantity, "Til lås på dør i skur", m.getMaterialID()));
                break;
            }
        }

    }

    public static void tHængsel() {
        int quantity = 2;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 19) {

                carportPartList.add(new Part(quantity, "Til skurdør", m.getMaterialID()));
                break;
            }
        }

    }

    public static void vinkelbeslag() {
        int quantity = 32;
        for (Material m : materialsList) {
            if (m.getMaterialID() == 20) {

                carportPartList.add(new Part(quantity, "Til montering af løsholter i skur", m.getMaterialID()));
                break;
            }
        }

    }

    public static void vindskeder(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 1.33;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 21) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Vindskeder på rejsning", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                }
            }
        }
    }

    public static void sternbrædderTilSiderCarp(int carportLength) {
        int quantity = 2;
        double lengthNeeded = carportLength * 1.66;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 21) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Sternbrædder til siderne carport", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                }
            }
        }
    }

    public static void sternbrædderTilSiderSkur(int shedLength) {
        int quantity = 1;
        double lengthNeeded = shedLength * 2.45;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 21) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Sternbrædder til siderne skur", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                }
            }
        }
    }

    public static void taglægterTilSpær(int carportWidth) {
        int quantity = 21;
        double lengthNeeded = carportWidth * 1.5;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 22) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Til montering på spær", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                }
            }
        }
    }

    public static void toplægterTilRygsten(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 1.16;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 22) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Til montering af rygsten", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                }
            }
        }
    }

    public static void skruer100(int carportWidth) {
        int quantity = 2;

        for (Material m : materialsList) {
            if (m.getMaterialID() == 23) {
                carportPartList.add(new Part(quantity, "Til taglægter", m.getMaterialID()));
            }
        }
    }
}



