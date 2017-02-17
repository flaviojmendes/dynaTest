package demo.controller;

import demo.service.BeerCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flavio on 17/02/17.
 */

@RestController
@RequestMapping("/beerCalculator")
public class BeerCalculatorController {

    @Autowired
    private BeerCalculatorService beerCalculatorService;

    @RequestMapping(value= "/for/{quantity}", method = RequestMethod.GET)
    public int calculateFor(@PathVariable("quantity") Integer quantity){
        return beerCalculatorService.calculateFor(quantity);
    }

}
