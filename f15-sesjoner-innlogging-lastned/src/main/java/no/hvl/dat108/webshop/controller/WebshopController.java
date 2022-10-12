package no.hvl.dat108.webshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/webshop")
public class WebshopController {
	
	private String REQUIRES_LOGIN_MESSAGE = "Forespørselen din krever at du er innlogget";

	/* 
	 * GET /webshop er forespørselen for å vise webshop-siden.
	 */
	@GetMapping
    public String visWebshoppen(HttpSession session, RedirectAttributes ra) {
		return "webshopView";
    }

	/* 
	 * POST /webshop er forespørselen for å handle en/flere varer.
	 */
	@PostMapping
    public String leggVarerIHandlekurv(
    		@RequestParam(name="vare", required=false) List<String> varer,
    		HttpSession session, RedirectAttributes ra) {
		return "redirect:" + "webshop";
    }
}
