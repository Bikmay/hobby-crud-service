package com.bikmay.hobi.rest.service

import com.bikmay.hobi.rest.repo.HobbyRepository
import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class HobbyService(private val repo: HobbyRepository) {
    fun getAll():List<HobbyEntity> = repo.findAll()
}