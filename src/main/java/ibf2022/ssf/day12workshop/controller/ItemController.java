package ibf2022.ssf.day12workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ibf2022.ssf.day12workshop.model.Item;
import ibf2022.ssf.day12workshop.service.ItemService;

@Controller
@RequestMapping(path = {"/shoppingcart"})
public class ItemController {
    
    @Autowired
    ItemService itmSvc;
    
    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {
        List<Item> items = itmSvc.retrieveItemList();
        model.addAttribute("cartItems", items);
        return "cartlist";
    }

}
