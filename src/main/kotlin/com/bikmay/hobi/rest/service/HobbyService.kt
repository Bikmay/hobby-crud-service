package com.bikmay.hobi.rest.service

import com.bikmay.hobi.rest.repo.HobbyRepo
import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import org.springframework.stereotype.Service

@Service
class HobbyService(val repo: HobbyRepo) {
    fun getAll():List<HobbyEntity> = repo.getAll()
}