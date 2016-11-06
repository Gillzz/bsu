package by.bsu.controller;

import by.bsu.model.TaxiCar;
import by.bsu.service.TaxiCarService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by Asus on 03.11.2016.
 */
@Controller
public class SpringController {
    private static final Logger logger = Logger.getLogger(SpringController.class);

    @Autowired
    private TaxiCarService service;

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/jsp/taxiCarsList.jsp";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(@ModelAttribute TaxiCar taxiCar)  throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()){
            logger.debug("Create method is executed");
        }
        logger.info("Going to run create method");
        if (taxiCar != null) {
            service.create(taxiCar);
        } else {
            logger.fatal("Invalid argument!");
            throw new IllegalArgumentException();
        }
        logger.info("Exiting the method");
        return "redirect:/getTaxiCars";
    }

    @RequestMapping(value = "/getTaxiCars", method = RequestMethod.GET)
    public ModelAndView getTaxiCars()  throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()){
            logger.debug("GetTaxiCars method is executed");
        }
        logger.info("Going to run getTaxiCars method");
        List<TaxiCar> taxiCarsList = service.getTaxiCars();
        logger.info("Exiting the method");
        return new ModelAndView("taxiCarsList", "taxiCarsList", taxiCarsList);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(@ModelAttribute TaxiCar taxiCar) throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()) {
            logger.debug("Update method is executed");
        }
        logger.info("Going to run update method");
        if (taxiCar != null) {
            service.update(taxiCar);
        } else {
            logger.fatal("Invalid argument!");
            throw new IllegalArgumentException();
        }
        logger.info("Exiting the method");
        return "redirect:/getTaxiCars";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam TaxiCar taxiCar) throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()){
            logger.debug("Delete method is executed");
        }
        logger.info("Going to run delete method");
        if (taxiCar != null) {
            service.delete(taxiCar);
        } else {
            logger.fatal("Invalid argument!");
            throw new IllegalArgumentException();
        }
        logger.info("Exiting the method");
        return "redirect:/getTaxiCars";
    }

    @RequestMapping(value = "/sortByModel", method = RequestMethod.GET)
    public String sortCarsByModel() throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()){
            logger.debug("Delete method is executed");
        }
        service.getSortedModels();
        logger.info("Going to run delete method");
        return "redirect:/getTaxiCars";
    }

    @RequestMapping(value = "/sortByAge", method = RequestMethod.GET)
    public String sortCarsByAge() throws ClassNotFoundException, SQLException {
        if(logger.isDebugEnabled()){
            logger.debug("Delete method is executed");
        }
        service.getSortedCarAge();
        logger.info("Going to run delete method");
        return "redirect:/getTaxiCars";
    }
}
