package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * @author Administrator
 * Routes for PlantPlaces.com
 */
@Controller
public class PlantPlacesController {
	@Autowired
	private ISpecimenService specimenServiceStub;
	/***
	 * Handle the GET /start end point
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String Read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		model.addAttribute("specimenDTO", specimenDTO);
		
		return "start";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String ReadJSON() {
		return "start";
	}
	/***
	 * Handle the GET /start end point
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String ReadBlue() {
		return "start";
	}
	/***
	 * Handle the GET /start end point
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView ReadSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
		specimenDTO.setSpecimenID(90);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}
	/***
	 * Handle the POST /start end point
	 * @return
	 */
	@PostMapping(value="/start")
	public String Create() {
		return "start";
	}
	
	/**
	 * Handle the / end point
	 * @return
	 */
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
}
