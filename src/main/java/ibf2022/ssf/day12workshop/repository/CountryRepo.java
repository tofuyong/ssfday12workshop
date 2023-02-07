package ibf2022.ssf.day12workshop.repository;

import java.util.ArrayList;
import java.util.List;

import ibf2022.ssf.day12workshop.model.Country;

public class CountryRepo {
    
    List<Country> countryList;

    public List<Country> getAllCountries() {

        countryList = new ArrayList<>();
        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);
        cty = new Country("MY", "Malaysia", 33000000);
        countryList.add(cty);
        cty = new Country("CN", "China", 143000000);
        countryList.add(cty);
        cty = new Country("HK", "Hong Kong", 70000000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty) {

        if(countryList == null) {
            countryList = new ArrayList<>();
        }

        countryList.add(cty); //no DB, so this will have to do for now
        return true;
    }
}
