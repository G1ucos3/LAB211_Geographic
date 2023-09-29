/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import common.Validate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.EastAsiaCountries;

/**
 *
 * @author ASUS
 */
public class GeographicRepository implements IGeographic, Comparator<EastAsiaCountries> {

    Validate validate = new Validate();
    EastAsiaCountries current = new EastAsiaCountries();

    @Override
    public void addCountryInformation(ArrayList<EastAsiaCountries> eacs) {
        EastAsiaCountries eac = new EastAsiaCountries();
        String code = validate.inputString("code");
        if (validate.checkExistCode(eacs, code)) {
            System.out.println("Already exist!");
            return;

        }
        eac.setCountryCode(code);
        eac.setCountryName(validate.inputString("name"));
        eac.setTotalArea(validate.inputNumber("total Area"));
        eac.setCountryTerrain(validate.inputString("terrain"));
        eacs.add(eac);
        this.current = eac;
    }

    @Override
    public void getRecentlyEnteredInformation() {
        System.out.printf("%s%11s%21s%16s\n", "ID", "Name", "Total Area", "Terrain");

        current.display();
    }

    @Override
    public void searchInformationByName(ArrayList<EastAsiaCountries> eacs) {
        int count = 0;
        if (eacs.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        String name = validate.inputString("name");
        for (EastAsiaCountries eac : eacs) {
            if (eac.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                System.out.printf("%s%11s%21s%16s\n", "ID", "Name", "Total Area", "Terrain");
                eac.display();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
    }

    @Override
    public void sortInformationByAscendingOrder(ArrayList<EastAsiaCountries> eacs) {
        if (eacs.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        GeographicRepository gr = new GeographicRepository();
        Collections.sort(eacs, gr);
        System.out.printf("%s%11s%21s%16s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries eac : eacs) {
            eac.display();
            System.out.println("");
        }
    }

    @Override
    public int compare(EastAsiaCountries eac1, EastAsiaCountries eac2) {
        return eac1.getCountryName().compareTo(eac2.getCountryName());
    }

}
