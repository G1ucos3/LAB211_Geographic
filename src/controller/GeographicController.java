package controller;

import java.util.ArrayList;
import model.EastAsiaCountries;
import repository.GeographicRepository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class GeographicController extends Menu {

    protected static String[] mc = {"Input the information of 11 countries in East Asia",
        "Display the information of country you're just input",
        "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending order",
        "Exit"};
    GeographicRepository gr;
    ArrayList<EastAsiaCountries> eacs;

    public GeographicController() {
        super("MENU", mc);
        gr = new GeographicRepository();
        eacs = new ArrayList();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                gr.addCountryInformation(eacs);
                break;
            case 2:               
                gr.getRecentlyEnteredInformation();
                break;
            case 3:
                gr.searchInformationByName(eacs);
                break;
            case 4:
                gr.sortInformationByAscendingOrder(eacs);
                break;
            case 5:
                System.out.println("Exit!");
                System.exit(0);

        }
    }
}
