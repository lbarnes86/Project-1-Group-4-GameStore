package com.company.GameStore.controller;

import com.company.GameStore.models.Consoles;
import com.company.GameStore.models.Games;
import com.company.GameStore.models.Tshirts;
import com.company.GameStore.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TshirtsController {

    @Autowired
    private ServiceLayer serviceLayer;

    @RequestMapping(value = "/tshirts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirts> getAllTshirts() {
        return serviceLayer.getAllTshirts();

    }

    @RequestMapping(value = "/tshirts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Tshirts createTshirt(@RequestBody Tshirts tshirts ) {
        return serviceLayer.addATshirts(tshirts);
    }

    @RequestMapping(value="/tshirts/{color}", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirts> getTshirtsByColor(@PathVariable String color) {

        return serviceLayer.getTshirtsByColor(color);
    }

    @RequestMapping(value="/tshirts/{size}", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirts> getTshirtBySize(@PathVariable String size) {

        return serviceLayer.getTshirtsBySize(size);
    }

    @RequestMapping(value="/tshirts/{color}", method=RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public Tshirts updateTshirts(@RequestBody Tshirts tshirts) {
        return serviceLayer.updateTshirts(tshirts);
    }
//    @RequestMapping(value="/tshirts/{color}", method=RequestMethod.PUT)
//    @ResponseStatus(HttpStatus.OK)
//    public List<Tshirts> updateTshirtsByColor(@PathVariable String color) {
//        return serviceLayer.updateTshirtsByColor();
//    }


    @RequestMapping(value="/tshirts/{color}", method=RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirts> deleteTshirts(@PathVariable int id) {
        serviceLayer.deleteTshirts(id);
        return deleteTshirts(id);
    }

//    @RequestMapping(value="/tshirts/{color}", method=RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.OK)
//    public List<Tshirts> deleteTshirtsByColor(@PathVariable String color) {
//        return serviceLayer.removeTshirtsByColor();
//    }


}
