package ecole.suptech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entities.Employe;

@RestController
@RequestMapping("api")
public class EmployeController {
@GetMapping("/bonjour")

 public String bonjour(@RequestParam String nom) {
	return "Bonjour " +nom;
}

@GetMapping("/bonsoir/{nom}")
	public String bonsoir(@PathVariable String nom) {
	return "BONSOIR " + nom;
}

@PostMapping ("/salut")
	public Employe salut(@RequestBody Employe employe) {
		employe.setSalaire(employe.getSalaire()+2000);
		return employe;
}
}
