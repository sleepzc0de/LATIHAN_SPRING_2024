package id.go.kemenkeu.perpustakaan_kemenkeu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home(Model model){
        String pesan = "Hello Peserta Pelatihan Spring Kemenkeu";
        model.addAttribute("pesan", pesan);
        return "home";
    }
}