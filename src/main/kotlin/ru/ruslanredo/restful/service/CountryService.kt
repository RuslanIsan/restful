package ru.ruslanredo.restful.service

import ru.ruslanredo.restful.model.Country

interface CountryService {

    fun getAllCountries(): List<Country>
}