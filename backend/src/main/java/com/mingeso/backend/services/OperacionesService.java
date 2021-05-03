package com.mingeso.backend.services;
import com.mingeso.backend.models.Operaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/operaciones")
public class OperacionesService{

    @PostMapping("/suma")
    @ResponseBody
    public Operaciones sumar(@RequestBody Operaciones operaciones){
        Operaciones result = operaciones;
        result.suma();
        return result;
    }

    @PostMapping("/resta")
    @ResponseBody
    public Operaciones restar(@RequestBody Operaciones operaciones){
        Operaciones result = operaciones;
        result.resta();
        return result;
    }
}