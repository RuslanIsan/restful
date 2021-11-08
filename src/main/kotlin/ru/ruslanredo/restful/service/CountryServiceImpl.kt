package ru.ruslanredo.restful.service

import org.springframework.stereotype.Service
import ru.ruslanredo.restful.dao.CountryDao
import ru.ruslanredo.restful.model.Country

@Service
class CountryServiceImpl(
    private val countryDao: CountryDao
) : CountryService {

    override fun getAllCountries(): List<Country> = countryDao.findAll().toList()
}