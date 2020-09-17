package com.plantplaces.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * Routes for PlantPlaces.com
 */
@Controller
public class PlantPlacesController {
	/***
	 * Handle the /start endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String Start() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
}
