package ru.ruslanredo.restful.controller

import org.springframework.web.bind.annotation.*
import ru.ruslanredo.restful.dto.CountryDto
import ru.ruslanredo.restful.model.Country
import ru.ruslanredo.restful.service.CountryService

@RestController
@RequestMapping("/v1/countries")
class CountryController(
    private val countryService: CountryService
) {

    @GetMapping
    fun getAllCountries(): List<Country> = countryService.getAllCountries()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): Country = countryService.getById(id)

    @PostMapping
    fun create(@RequestBody dto: CountryDto) {
        countryService.create(dto)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody dto: CountryDto){
        countryService.update(id, dto)
    }
}
