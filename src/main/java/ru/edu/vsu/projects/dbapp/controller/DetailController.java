//package ru.edu.vsu.projects.dbapp.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import ru.edu.vsu.projects.dbapp.model.Detail;
//import ru.edu.vsu.projects.dbapp.service.DetailService;
//import ru.edu.vsu.projects.dbapp.service.DetailServiceImpl;
//
//import java.util.List;
//
//@Controller
//public class DetailController {
//    private DetailService detailService;
//
//    @Autowired
//    public void setDetailService(DetailService detailService) {
//        this.detailService = detailService;
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allDetails() {
//        List<Detail> details = detailService.allDetails();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("details");
//        modelAndView.addObject("detailsList", details);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") int id) {
//        Detail detail = detailService.get(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        modelAndView.addObject("detail", detail);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public ModelAndView editDetail(@ModelAttribute("detail") Detail detail) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        detailService.edit(detail);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public ModelAndView addDetail(@ModelAttribute("detail") Detail detail) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        detailService.add(detail);
//        return modelAndView;
//    }
//
//    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
//    public ModelAndView deleteDetail(@PathVariable("id") int id) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        Detail detail = detailService.get(id);
//        detailService.delete(detail);
//        return modelAndView;
//    }
//
//}