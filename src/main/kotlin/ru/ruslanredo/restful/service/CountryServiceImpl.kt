package ru.ruslanredo.restful.service

import org.springframework.stereotype.Service
import ru.ruslanredo.restful.model.Country

@Service
class CountryServiceImpl : CountryService {

    override fun getAllCountries(): List<Country> {
        TODO("Not yet implemented")
    }
}