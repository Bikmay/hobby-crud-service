package com.bikmay.hobi.rest.repo

import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface HobbyRepository : JpaRepository<HobbyEntity, Long> {
//    @Query("select * from hobbys")
//    fun getAll():List<HobbyEntity>
}