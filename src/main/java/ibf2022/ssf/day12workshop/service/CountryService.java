package ibf2022.ssf.day12workshop.service;

import java.util.List;

import ibf2022.ssf.day12workshop.model.Country;
import ibf2022.ssf.day12workshop.repository.CountryRepo;

//in this example, no service or repository annotation used, so cannot do auto wiring
public class CountryService {

    CountryRepo ctyRepo;

    public CountryService() {
        ctyRepo = new CountryRepo(); //therefore need to instantiate CountryRepo
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
