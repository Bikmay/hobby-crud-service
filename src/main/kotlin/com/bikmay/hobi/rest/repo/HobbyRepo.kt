package com.bikmay.hobi.rest.repo

import com.bikmay.hobi.rest.repo.entity.HobbyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface HobbyRepository : JpaRepository<HobbyEntity, Long> {
}