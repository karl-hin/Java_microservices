package com.maintest.test2.controller.controller;

import com.maintest.test2.CarForm;
import com.maintest.test2.dao.CarDao;
import com.maintest.test2.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {

    @Autowired
    private CarDao carDao;

    //carsList
    @RequestMapping(value = {"carsList"}, method = RequestMethod.GET)
    public String CarsList(Model model) {

        model.addAttribute("cars", carDao.findAll());

        return "carsList";
    }

    //Cars/{id}
    @GetMapping(value = "Car/{id}")
    public Car showACar(@PathVariable int id) {
        return carDao.findById(id);

    }

//    //Cars/addNewCar
//    @RequestMapping(value = {"addNewCar"}, method = RequestMethod.GET)
//    public String showAddCarForm(Model model) {
//
//        CarForm carForm = new CarForm();
//        model.addAttribute("carForm", carForm);
//
//        return "addNewCar";
//    }

//    @RequestMapping(value = {"carsList/addNewCar"}, method = RequestMethod.POST)
//    public String addNewCar(Model model,
//                            @ModelAttribute("carForm") CarForm carForm) {
//
//        carDao.addNewCar(carForm.getId(), carForm.getType(),carForm.getMarque(), carForm.getMarque());
//
//        return "redirect:/carsList";
//    }
}
