package com.bikmay.hobi.rest.controller

import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import com.bikmay.hobi.rest.service.HobbyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/hobby")
class HobbyController(val service:HobbyService) {
    @GetMapping("/all")
    fun getAll():List<HobbyEntity> = service.getAll()
}