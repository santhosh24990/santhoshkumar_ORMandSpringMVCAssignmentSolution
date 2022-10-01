package com.gl.crm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.gl.crm.dao.Customerdoa;
import com.gl.crm.model.Customer;

   @Controller
   @RequestMapping ("customers")
   public class controller {
	
      @Autowired	
      Customerdoa customerdoa ;

      @GetMapping("list")
      public String showcustomers(Model model)
      {
	   List<Customer> customers = customerdoa.listall();
	   model.addAttribute("customers", customers);
	   return "customer-list";
      }
 
	
      @GetMapping("showcustomerform")
	  public String showStudentForm(Model model) 
      {
	  Customer customer = new Customer();
	  model.addAttribute("customer", customer);
      return "customer-form";
	  }
 
     
      @PostMapping("save")
	  public String savecustomer(Model model , @ModelAttribute("customer")Customer customer)
      {
		customerdoa.savecustomer(customer);
		return "redirect:/customers/list";
      }

	   @GetMapping("update")
	   public String updatecustomer(Model model, @RequestParam("id") int id)
	   {
		 Customer customer = customerdoa.findbyid(id);
		 model.addAttribute("customer", customer);
		return "customer-form";
	   }

       @GetMapping("delete")
	  public String deletecustomer(Model model, @RequestParam("id") int id) 
       {
		 customerdoa.deletecustomer(id);
		 return "redirect:/customers/list";
	    }

 
}
