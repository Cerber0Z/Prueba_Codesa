package com.prueba.rest;

import com.prueba.dao.UsuarioDAO;
import com.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("users")
public class UsuarioRest {

    @Autowired
    private UsuarioDAO usuarioDAO;

    //HTTP

    @PostMapping("/savedata")
    public void saveData(@RequestBody Usuario usuario){
        usuarioDAO.save(usuario);
    }

    @GetMapping("/listalluser")
    public List<Usuario> listAlluser(){
        return usuarioDAO.findAll();
    }

    @GetMapping("getuser/{ids}")
    public List<Usuario> getuser(@PathVariable("ids") Integer ids){
        return usuarioDAO.findAllById(Collections.singleton(ids));
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        usuarioDAO.deleteById(id);
    }

    @PutMapping("/updateuser")
    public void updateUser(@RequestBody Usuario usuario){
        usuarioDAO.save(usuario);
    }
}
