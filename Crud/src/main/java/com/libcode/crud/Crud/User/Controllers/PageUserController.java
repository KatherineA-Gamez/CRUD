package com.libcode.crud.Crud.User.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.libcode.crud.Crud.User.Entities.User;
import com.libcode.crud.Crud.User.Repository.UserRepository;



@Controller
@RequestMapping("/")
public class PageUserController
{
    @Autowired
    private UserRepository uRepository;
    @GetMapping("/users")
    public String listUsers(Model model)
    {
        model.addAttribute("users", uRepository.findAll());
        return "list-Users";
    }

    @GetMapping("/nuevo")
    public String nuevoUser(Model model) {
        model.addAttribute("usuario", new User());
        return "form-user";
    }
    
    @PostMapping("/nuevo")
    public String guardarUser(@ModelAttribute User user) {
        uRepository.save(user);
        return "redirect:/users"; 
    }

    @GetMapping("/editar/{id}")
    public String editarUser(Model model, @PathVariable Long id) {
      User usuario= uRepository.findById(id).get();
      model.addAttribute("usuario", usuario);
        return "form-user"; 
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUser(@PathVariable Long id) {
      uRepository.delete(new User(id));
      return "redirect:/users";  
    }
}
