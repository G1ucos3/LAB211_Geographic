package common;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.EastAsiaCountries;

/**
 *
 * @author ASUS
 */
public class Validate {

    public String inputString(String s) {
        String str = "";
        while (str.isBlank() || str.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter " + s + " of country: ");
            str = sc.nextLine();
        }
        return str;
    }

    public float inputNumber(String s) {
        float a;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter " + s + ": ");
                a = sc.nextFloat();
                if (a <= 0) {
                    System.err.println(s + "must be greater than 0!");
                    continue;
                }
                return a;
            } catch (InputMismatchException E) {
                System.err.println("Please enter number!");
            }
        }
    }

    public boolean checkExistCode(ArrayList<EastAsiaCountries> eacs, String code) {
        for (EastAsiaCountries eac : eacs) {
            if (eac.getCountryCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
