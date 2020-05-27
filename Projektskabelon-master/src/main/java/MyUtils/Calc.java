package MyUtils;

import FunctionLayer.Part;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.util.ArrayList;
import java.util.List;

/**
 * Indeholder alle udregningsmetoder der skal bruges for at kunne udregne materialelister, ud fra en kundes
 * givne vælg.
 */
public class Calc {

    /**
     * @param materialVariantsList indeholder alle materialer, og de forskellige længder af hvert materiale
     */
    public static List<MaterialVariants> materialVariantsList = InitializeLists.getMatVariantsList();

    /**
     * @param carportPartList inderholder, ud fra udregningsmetoderne, konkrete materiale varianter.
     */
    public static List<Part> carportPartList = new ArrayList<>();


    /**
     * @param carportWidth
     * Udregner hvilken længde i materialVariantList der skal bruges til carportens understern til for og bag
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void understernForOgBag(int carportWidth) {

        int quantity = 4;
        double lengthNeeded = carportWidth * 0.60;


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

    /**
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges til carportens understern til siderne
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void understernSider(int carportLength) {
        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 1) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "understernbrædder til siderne", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }


    }

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialVariantList der skal bruges til carportens overstern til forenden
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void oversternFor(int carportWidth) {

        int quantity = 2;
        double lengthNeeded = carportWidth * 0.60;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 2) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "oversternbrædder til forenden", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    /**
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges af overstern til siderne
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void oversternSider(int carportLength) {

        int quantity = 4;
        double lengthNeeded = carportLength * 0.70;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 2) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "oversternbrædder til siderne", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    /**
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges af remme til siderne
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void remmeSider(int carportLength) {
        int quantity = 2;
        double lengthNeeded = carportLength * 0.76;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 4) {
                if (lengthNeeded <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Remme i sider, sadles ned i stolper", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }

        }
    }

    /**
     *
     * @param carportWidth
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges til carportens spær og antal stk. ud fra den konkrete længde.
     * og tilføjer et Part obejkt til carportPartList
     * @return der returneres en int, for at kunne kører test på den
     */
    public static int spærTilRem(int carportWidth, int carportLength) {
        int spærNeeded = 0;
        int spaceBetweenSpær = 55;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 4) {
                if (carportWidth <= mv.getLength()) {

                    spærNeeded = carportLength / spaceBetweenSpær;

                    carportPartList.add(new Part(spærNeeded, "Spær, monteres på rem ", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }
        return spærNeeded;

    }

    /**
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges af vandbrædt til siderne
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialVariantList der skal bruges af vandbrædt til forenden
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * !Hvis carport har skur!
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
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


    /**
     * @param shedWidth
     * !Hvis carport har skur!
     * Udregner antal af løsholter til skurets gavle og tilføjer et Part obejkt til carportPartList
     *
     */
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

    /**
     * @param shedLength
     * !Hvis carport har skur!
     * Udregner antal af løsholter til skurets sider og tilføjer et Part obejkt til carportPartList
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void plastmoBundskruer() {
        int quantity = 3;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 9) {

                carportPartList.add(new Part(quantity, "Skruer til tagplader", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void hulbånd() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 10) {

                carportPartList.add(new Part(quantity, "Til vindkryds på spær", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void universalHøjre() {
        int quantity = 15;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 11) {

                carportPartList.add(new Part(quantity, "Til montering af spær på rem", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void universalVenstre() {
        int quantity = 15;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 12) {

                carportPartList.add(new Part(quantity, "Til montering af spær på rem", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void skruer200stk() {
        int quantity = 1;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 13) {

                carportPartList.add(new Part(quantity, "Til montering af stern og vandbrædt", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void beslagskruer() {
        int quantity = 3;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 14) {

                carportPartList.add(new Part(quantity, "Til montering af universalbeslag + hulbånd", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void bræddebolt() {
        int quantity = 18;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 14) {
                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void firkantskriver() {
        int quantity = 12;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 15) {

                carportPartList.add(new Part(quantity, "Til montering af rem på stolper", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void skruer400stk() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 16) {

                carportPartList.add(new Part(quantity, "Til montering af yderste beklædning", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void skruer300stk() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 17) {

                carportPartList.add(new Part(quantity, "Til montering af inderste beklædning", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void stalddørsgreb() {
        int quantity = 1;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 18) {

                carportPartList.add(new Part(quantity, "Til lås på dør i skur", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void tHængsel() {
        int quantity = 2;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 19) {

                carportPartList.add(new Part(quantity, "Til skurdør", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void vinkelbeslag() {
        int quantity = 32;
        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 20) {

                carportPartList.add(new Part(quantity, "Til montering af løsholter i skur", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }

    }

    /**
     * @param carportLength
     * @param toolShedLength
     * @param hasToolShed
     * Udregner antal af stolper til hele carporten, på bagrund af om man vælger med eller uden skur.
     * og tilføjer et Part obejkt til carportPartList
     * @return  der returneres en int, for at kunne kører test på den
     */
    public static int calcStolper(int carportLength, int toolShedLength, boolean hasToolShed) {

        int quantity = 0;
        if (!hasToolShed) {
            quantity = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;

            if (quantity < 4) {
                quantity = 4;

                return quantity;
            }

            return quantity;
        }

        if (hasToolShed) {

            int quantityCarport = (int) Math.ceil((((((carportLength - 110) - toolShedLength) / 300) * 2)) + 2);
            int quantityToolShed = (int) Math.ceil((((carportLength - 110) / 300) * 2)) + 2;
            quantity = quantityCarport + quantityToolShed;

            return quantity;
        }

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 5) {
                carportPartList.add(new Part(quantity, "Stolper nedgraves 90 cm i jorden", mv.getMaterial_id(),
                        mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                break;
            }
        }

        return quantity;
    }

    // rasied carport træ

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialVariantList der skal bruges til carportens vindskeder
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialVariantList der skal bruges af vandbræderne til vindskederne
     * og tilføjer et Part obejkt til carportPartList
     */
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


    /**
     * @param carportLength
     * Udregner hvilken længde i materialVariantList der skal bruges af sternbrædder til siderne
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param shedLength
     * !Hvis carport har skur!
     * Udregner hvilken længde i materialeVariantList der skal bruges af sternbrædder til siderne på skuret
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialeVariantList der skal bruges af taglægter til spær
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportWidth
     * Udregner hvilken længde i materialeVariantList der skal bruges af toplægter til rygsten
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void skruer100Raised() {
        int quantity = 2;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 23) {
                carportPartList.add(new Part(quantity, "Til taglægter", mv.getMaterial_id(),mv.getMaterialVariants_id(),mv.getLength(),mv.getPrice()));
                break;
            }
        }
    }

    /**
     * @param carportLength
     * Udregner hvilken længde i materialeVariantList der skal bruges af de lange tagplader
     * og tilføjer et Part obejkt til carportPartList
     */
    public static void tagpladerLang(int carportLength) {
        int quantity = 6;

        for (MaterialVariants mv : materialVariantsList) {
            if (mv.getMaterial_id() == 8) {
                if (carportLength <= mv.getLength()) {
                    carportPartList.add(new Part(quantity, "Tagplader monteres på spær", mv.getMaterial_id(),
                            mv.getMaterialVariants_id(), mv.getLength(), mv.getPrice()));
                    break;
                }
            }
        }

    }

    /**
     * @param carportLength
     * Udregner hvilken længde i materialeVariantList der skal bruges af de korte tagplader
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportLength
     * Udregner hvilken længde i materialeVariantList der skal bruges af !!!!!
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * @param carportWidth
     * @param carportLength
     * Udregner hvilken længde i materialeVariantList der skal bruges af dobbelSort
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     *
     * @param carportLength
     * @param carportWidth
     * Udregner hvilken længde i materialeVariantList der skal bruges af sorte rygsten
     * og tilføjer et Part obejkt til carportPartList
     */
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

    /**
     * Vi har valgt at dette materiale har en "default value" og derfor er gældene for alle carporte
     * og tilføjer et Part obejkt til carportPartList
     */
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



