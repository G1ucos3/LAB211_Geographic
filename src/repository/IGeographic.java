package repository;

import java.util.ArrayList;
import model.EastAsiaCountries;

/**
 *
 * @author ASUS
 */
public interface IGeographic {

    public void addCountryInformation(ArrayList<EastAsiaCountries> eacs);

    public void getRecentlyEnteredInformation ();

    public void searchInformationByName (ArrayList<EastAsiaCountries> eacs);

    public void sortInformationByAscendingOrder (ArrayList<EastAsiaCountries> eacs);

}
