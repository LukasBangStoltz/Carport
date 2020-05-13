package MyUtils;

import FunctionLayer.Part;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();

    public static List<Part> carportPartList = new ArrayList<>();

    // flat carport træ
    public static void understernForOgBag(int carportWidth) {

        int quantity = 4;
        double lengthNeeded = carportWidth * 0.60;

        //int quantity, String description, int material_id, int mv_id, int length, int price
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 1) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "understernbrædder til for & bagende", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));

                    break;
                }
            }

        }
    }

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

    public static void lægteTilZDørSkur() {
        int quantity = 1;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 3) {
                carportPartList.add(new Part(quantity, "til z på bagside af dør", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }

        }

    }

    // hvis skur
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

    // hvis skur
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
                    carportPartList.add(new Part(quantity, "Løsholte til skur sider", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    public static void plastmoBundskruer() {
        int quantity = 3;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 9) {

                carportPartList.add(new Part(quantity, "Skruer til tagplader", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }

    public static void hulbånd() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 10) {

                carportPartList.add(new Part(quantity, "Til vindkryds på spær", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    public static void universalHøjre() {
        int quantity = 15;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 11) {

                carportPartList.add(new Part(quantity, "Til montering af spær på rem", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void universalVenstre() {
        int quantity = 15;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 12) {

                carportPartList.add(new Part(quantity, "Til montering af spær på rem", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void skruer200stk() {
        int quantity = 1;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 13) {

                carportPartList.add(new Part(quantity, "Til montering af stern og vandbrædt", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void beslagskruer() {
        int quantity = 3;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 14) {

                carportPartList.add(new Part(quantity, "Til montering af universalbeslag + hulbånd", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }
    // fælles
    public static void bræddebolt() {
        int quantity = 18;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 14) {
                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void firkantskriver() {
        int quantity = 12;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 15) {

                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void skruer400stk() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 16) {

                carportPartList.add(new Part(quantity, "Til montering af yderste beklædning", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void skruer300stk() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 17) {

                carportPartList.add(new Part(quantity, "Til montering af inderste beklædning", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void stalddørsgreb() {
        int quantity = 1;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 18) {

                carportPartList.add(new Part(quantity, "Til lås på dør i skur", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }
    // fælles
    public static void tHængsel() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 19) {

                carportPartList.add(new Part(quantity, "Til skurdør", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    public static void vinkelbeslag() {
        int quantity = 32;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 20) {

                carportPartList.add(new Part(quantity, "Til montering af løsholter i skur", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

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

    // rasied carport træ
    public static void vindskeder(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 1.33;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 21) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Vindskeder på rejsning", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    public static void vandBrædtPåVindskeder(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 1.33;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 6) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Vandbræt på vindskeder", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }





    public static void sternbrædderTilSiderCarp(int carportLength) {
        int quantity = 2;
        double lengthNeeded = carportLength * 0.82;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 21) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Sternbrædder til siderne carport", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
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
                    break;
                }
            }
        }
    }

    public static void taglægterTilSpær(int carportWidth) {
        int quantity = 21;
        double lengthNeeded = carportWidth * 0.74;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 22) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Til montering på spær", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    public static void toplægterTilRygsten(int carportWidth) {
        int quantity = 2;
        double lengthNeeded = carportWidth * 0.575;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 22) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Til montering af rygsten", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
    }

    public static void skruer100Raised() {
        int quantity = 2;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 23) {
                carportPartList.add(new Part(quantity, "Til taglægter", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }

    // tagpakke
    public static void tagpladerLang(int carportLength) {
        int quantity = 6;
        double lengthNeeded = carportLength = 0;


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

    public static void ovenPåTagfodslægte(int carportLength) {
        int quantity = 3;
        double lengthNeeded = carportLength * 0.74;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 25) {
                if (lengthNeeded <= mv.getLength()) {

                    carportPartList.add(new Part(quantity, "Til montering oven på tagfodslægte", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    public static void dobbeltSSort(int carportWidth, int carportLength) {
        int quantity = (int) Math.ceil((carportLength * carportWidth) * 11.4 / 10000);


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 26) {
                    carportPartList.add(new Part(quantity, "Monteres på taglægter", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
            }
        }

    }

    public static void rygstenSort(int carportLength, int carportWidth) {
        int quantity = (int) Math.ceil(((carportLength * carportWidth) / 10000) * 0.8);


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 27) {
                carportPartList.add(new Part(quantity, "Monteres på toplægte", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }

    }

    public static void toplægteHolder(int carportSpærAntal) {
        int quantity = carportSpærAntal;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 28) {
                carportPartList.add(new Part(quantity, "Minteres på toppen af spæret", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }

    }

    public static void rygstenBeslag(int rygstenAntal) {
        int quantity = rygstenAntal;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 29) {
                carportPartList.add(new Part(quantity, "Til montering af rygsten", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }

    }

    public static void tagstenBindereOgNakkekrog() {
        int quantity = 2;


        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 30) {
                carportPartList.add(new Part(quantity, "Til montering af tagsten", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }

    }
}



