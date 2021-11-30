package co.micol.prj.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shopController {
	
	@RequestMapping("/shopgrid.do")
	public String shopgrid() {
		
		return "shop/shopgrid";
	}
}
