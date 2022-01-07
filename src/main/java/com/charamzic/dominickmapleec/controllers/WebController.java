package com.charamzic.dominickmapleec.controllers;

import com.charamzic.dominickmapleec.models.Subscriber;
import com.charamzic.dominickmapleec.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    private SubscriberService subscriberService;

    @Autowired
    public WebController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping("/")
    public String showHomepage(Model model) {
        model.addAttribute("subscribers", this.subscriberService.getAllSubscribers());
        return "index";
    }

    @PostMapping("/add-subscriber")
    public String addNewSubscriber(@ModelAttribute Subscriber subscriber) {
        subscriberService.save(subscriber);
        return "redirect:/";
    }
}