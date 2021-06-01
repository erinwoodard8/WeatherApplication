package com.tts.WeatherApplication.Controller;
import com.tts.WeatherApplication.Model.Request;
import com.tts.WeatherApplication.Model.Response;
import com.tts.WeatherApplication.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());
        model.addAttribute("searches", weatherService.getSearches());
        return "index";


    }

    @PostMapping(value = "/results")
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        return "results";
    }
}
