package com.bikmay.hobi.rest.controller

import com.bikmay.hobi.rest.dto.Count
import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import com.bikmay.hobi.rest.service.HobbyService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hobby")
@CrossOrigin
class HobbyController(val service:HobbyService) {
    @GetMapping("/paging/{size}/{page}")
    fun getAll(@PathVariable("size") size:Int,@PathVariable("page") page:Int): Page<HobbyEntity> {
        return service.getAll(PageRequest.of(page,size));
    }
    @GetMapping("/count")
    fun getCount():Count{
        val response: Count = Count(service.getCount());
        return response;
    }
}