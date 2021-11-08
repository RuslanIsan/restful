package ru.ruslanredo.restful.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ruslanredo.restful.model.Country
import ru.ruslanredo.restful.service.CountryService

@RestController
@RequestMapping("/v1/countries")
class CountryController(
    private val countryService: CountryService
) {

    @GetMapping
    fun getAllCountries(): List<Country> = countryService.getAllCountries()
}
