package com.bikmay.hobi.rest.service

import com.bikmay.hobi.rest.repo.HobbyRepository
import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class HobbyService(private val repo: HobbyRepository) {
    fun getAll(page: Pageable): Page<HobbyEntity> = repo.findAll(page);
    fun getCount():Long = repo.count();
    //todo fix cast
    fun getImgUrlById(id:Long):String = repo.findById(id).get().imgUrl;
}