package id.go.kemenkeu.perpustakaan_kemenkeu.controller;

import id.go.kemenkeu.perpustakaan_kemenkeu.model.Buku;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/buku")
public class BukuController {

    @GetMapping("/daftar")
    public String daftar(Model model) {

        Buku buku1 = new Buku(1,"Buku 1","Penulis 1",2024);
        Buku buku2 = new Buku(2,"Buku 2","Penulis 2",2024);
        Buku buku3 = new Buku(3,"Buku 3","Penulis 3",2024);
        Buku buku4 = new Buku(4,"Buku 4","Penulis 4",2024);
        Buku buku5 = new Buku(5,"Buku 5","Penulis 5",2024);
        Buku buku6 = new Buku(6,"Buku 6","Penulis 6",2024);


        List<Buku> bukuList = new ArrayList<>();
        bukuList.add(buku1);
        bukuList.add(buku2);
        bukuList.add(buku3);
        bukuList.add(buku4);
        bukuList.add(buku5);
        bukuList.add(buku6);

        model.addAttribute("bukuList", bukuList);
        return "buku/daftar";
    }


    @GetMapping("/daftar2")
    public ModelAndView daftar2(ModelAndView modelAndView) {

        Buku buku1 = new Buku(1,"Buku 1","Penulis 1",2024);
        Buku buku2 = new Buku(2,"Buku 2","Penulis 2",2024);
        Buku buku3 = new Buku(3,"Buku 3","Penulis 3",2024);
        Buku buku4 = new Buku(4,"Buku 4","Penulis 4",2024);
        Buku buku5 = new Buku(5,"Buku 5","Penulis 5",2024);
        Buku buku6 = new Buku(6,"Buku 6","Penulis 6",2024);


        List<Buku> bukuList = new ArrayList<>();
        bukuList.add(buku1);
        bukuList.add(buku2);
        bukuList.add(buku3);
        bukuList.add(buku4);
        bukuList.add(buku5);
        bukuList.add(buku6);

        modelAndView.addObject("bukuList", bukuList);
        modelAndView.setViewName("buku/daftar2");
        return modelAndView;
    }
}
