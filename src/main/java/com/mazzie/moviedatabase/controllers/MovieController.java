package com.mazzie.moviedatabase.controllers;



import com.mazzie.moviedatabase.entities.DBUser;
import com.mazzie.moviedatabase.repositories.DBUserRepository;
import com.mazzie.moviedatabase.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("/")
public class MovieController {
    @Autowired
    MovieService movieService;


    @GetMapping(value = "/")
    public ModelAndView getAllMovies() {
        var mav = new ModelAndView("index.html");
        mav.addObject("movies", movieService.listAllMovies());
        return mav;
    }

    @GetMapping(value = "/loggedin")
    public ModelAndView getAllMoviesAfterLogin() {
        var mav = new ModelAndView("loggedin.html");
        mav.addObject("movies", movieService.listAllMovies());
        return mav;
    }

    @GetMapping(value = "/logout")
    public ModelAndView getAllMoviesAfterLogout() {
        var mav = new ModelAndView("index.html");
        mav.addObject("movies", movieService.listAllMovies());
        return mav;
    }

    @GetMapping(value = "/index.html")
    public ModelAndView getAllMoviesDefault() {
        var mav = new ModelAndView("index.html");
        mav.addObject("movies", movieService.listAllMovies());
        return mav;
    }
    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new DBUser());

        return "signup";
    }


}
