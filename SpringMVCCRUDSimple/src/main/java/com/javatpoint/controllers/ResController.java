package com.javatpoint.controllers;   
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.beans.Res;
import com.javatpoint.dao.ResDao;

@Controller  
public class ResController {  
    @Autowired  
    ResDao dao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/resform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Res());
    	return "resform"; 
    }  
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("res") Res res){  
        dao.save(res);  
        return "redirect:/viewres";//will redirect to viewres request mapping  
    }  
    /* It provides list of reservations in model object */  
    @RequestMapping("/viewres")  
    public String viewres(Model m){  
        List<Res> list=dao.getReservations();  
        m.addAttribute("list",list);
        return "viewres";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editres/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Res res=dao.getResById(id);  
        m.addAttribute("command",res);
        return "reseditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("res") Res res){  
        dao.update(res);  
        return "redirect:/viewres";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewres */  
    @RequestMapping(value="/deleteres/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/viewres";  
    }   
}  