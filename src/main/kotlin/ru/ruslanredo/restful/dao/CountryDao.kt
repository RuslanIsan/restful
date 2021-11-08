package ru.ruslanredo.restful.dao

import org.springframework.data.repository.CrudRepository
import ru.ruslanredo.restful.model.Country

interface CountryDao: CrudRepository<Country, Int> {
}