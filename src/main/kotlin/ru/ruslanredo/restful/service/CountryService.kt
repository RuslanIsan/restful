package ru.ruslanredo.restful.service

import ru.ruslanredo.restful.dto.CountryDto
import ru.ruslanredo.restful.model.Country

interface CountryService {

    fun getAllCountries(): List<Country>

    fun getById(id: Int): Country

    fun create(country: CountryDto)

    fun update(id: Int, country: CountryDto)
}