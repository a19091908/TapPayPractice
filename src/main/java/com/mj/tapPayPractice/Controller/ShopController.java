package com.mj.tapPayPractice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mj.tapPayPractice.Model.Shopping;

@Controller
public class ShopController {

	@GetMapping("/shopPage")
		public String doShopping(Model model) {
			model.addAttribute("shopping", new Shopping());
        return "shopPage";
    }
	
	@PostMapping("/doSave")
    public String doLogin(@ModelAttribute Shopping shopping){
		System.out.println(shopping.getShop());
		System.out.println(shopping.getGoods());
		System.out.println(shopping.getPrice());
		
        return "result";
    }
}
