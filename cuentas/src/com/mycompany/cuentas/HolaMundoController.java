package com.mycompany.cuentas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {
	
	@RequestMapping("holaMundoSpring")
	public String mensajeEnConsola(){
		System.out.println("Hola Mundo!!!");
		return "holamundo";
	}
}
