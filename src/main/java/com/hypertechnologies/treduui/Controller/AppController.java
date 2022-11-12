package com.hypertechnologies.treduui.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AppController {

    @GetMapping({"/login"})
    public String login(Model model) {
        return "login";
    }

    @GetMapping({"/signup"})
    public String signup(Model model) {
        return "signup";
    }

    @GetMapping({"/dashboard"})
    public String dashboard(Model model) {
        return "dashboard";
    }

    @GetMapping({"/my-courses"})
    public String myCourses(Model model) {
        return "my-courses";
    }

    @GetMapping({"/create-course"})
    public String createCourse(Model model) {
        return "create-course";
    }

    @GetMapping({"/quiz"})
    public String quiz(Model model) {
        return "quiz";
    }

    @GetMapping({"/survey"})
    public String survey(Model model) {
        return "survey";
    }

    @GetMapping({"/settings"})
    public String settings(Model model) {
        return "settings";
    }

    @GetMapping({"/messages"})
    public String messages(Model model) {
        return "messages";
    }

    @GetMapping({"", "/home"})
    public String home(Model model) {
        return "home";
    }

    @GetMapping({"/courses"})
    public String courses(Model model) {
        return "courses";
    }

    @GetMapping({"/course"})
    public String course(Model model) {
        return "course";
    }

    @GetMapping({"/contact"})
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping({"/events"})
    public String events(Model model) {
        return "events";
    }

    @GetMapping({"/event"})
    public String event(Model model) {
        return "event";
    }

    @GetMapping({"/administration"})
    public String administration(Model model) {
        return "administration";
    }

    @GetMapping({"/about-us"})
    public String aboutUs(Model model) {
        return "about-us";
    }

    @GetMapping({"/membership-plan"})
    public String membershipPlan(Model model) {
        return "membership-plan";
    }

    @GetMapping({"/shopping-card"})
    public String shoppingCard(Model model) {
        return "shopping-card";
    }

    @GetMapping({"/shopping-checkout"})
    public String shoppingCheckOut(Model model) {
        return "shopping-checkout";
    }

    @GetMapping({"/faq"})
    public String faq(Model model) {
        return "faq";
    }

    @GetMapping({"/help-center"})
    public String helpCenter(Model model) {
        return "help-center";
    }

    @GetMapping({"/404"})
    public String notFoundErrorPage(Model model) {
        return "404";
    }
}
