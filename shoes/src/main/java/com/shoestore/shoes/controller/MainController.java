
package com.shoestore.shoes.controller;

import com.shoestore.shoes.domain.Shoes;
import com.shoestore.shoes.service.ShoesService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    private final ShoesService shoesService;

    public MainController(ShoesService shoesService) {
        this.shoesService = shoesService;
    }
    
    //inicio de presentacion
    @RequestMapping("/")
    public String index(Model model){
         List<Shoes>all = shoesService.all();
         model.addAttribute("shoes",all);
        return "index";
    }
    //sobre la compania
    @GetMapping("/aboutUs")
    public String aboutus(Model model){
        return "aboutus";
    }
    //listado de zapatillas
    @GetMapping("/list")
    public String list(Model model){
        List<Shoes>all = shoesService.all();
         model.addAttribute("shoes",all);
        return "listshoes";
    }
    //listado por tipe
    @RequestMapping("/listS")
    public String listS(String tipe,Model model){
        model.addAttribute("shoes",shoesService.bySex(tipe));
        return "listS";
    }
    //listado por marca
    @GetMapping("listM")
    public String listM(String mark,Model model){
        model.addAttribute("shoes",shoesService.byMark(mark));
        return "listM";
    }
    //inicio de sesion del admin 
    @GetMapping("/loginv")
    public String loginv(Model model){
        return "loginV";
    }
    //comprovacion de datos de inicio de sesion
    @PostMapping("/loaduser")
    public String loadUser(){
        return "indexAdmin";
    }
    //inicio de administrador
    @GetMapping("/indexAdmin")
    public String indexA(Model model){
        return "indexAdmin";
    }
    //creacion de modelo de nueva zapatilla
    @GetMapping("/newShoes")
    public String newShoes(Model model){
        model.addAttribute("shoes",new Shoes());
        return "newShoes";
    }
    //guradar los datos de la nueva zapatilla
    @PostMapping("/saveShoes")
    public String loadShoes(Shoes shoe){
        shoesService.save(shoe);
        return "indexAdmin";
    }
    //actualizacion de datos
    @RequestMapping("updateShoes")
    public String updateShoes(Shoes shoe){
        shoesService.update(shoe);
        return "indexAdmin";
    }
    //borrar datos
    @DeleteMapping("/deleteShoes")
    public String deleteShoes(int id){
        shoesService.delete(id);
        return "indexAdmin";
    }
}
