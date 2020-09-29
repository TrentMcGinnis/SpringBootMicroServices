package com.plantplaces.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String Read() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchByID(43);
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
	public String ReadSilver() {
		return "start";
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
