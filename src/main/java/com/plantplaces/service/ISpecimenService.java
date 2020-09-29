package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchByID(int ID);

	void save(SpecimenDTO specimentDTO);

}