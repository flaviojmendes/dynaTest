package demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by flavio on 17/02/17.
 */
@Service
public class BeerCalculatorService {

    Integer beersPerPerson = 3;

    public int calculateFor(Integer quantity) {
        return quantity * beersPerPerson;
    }

}
