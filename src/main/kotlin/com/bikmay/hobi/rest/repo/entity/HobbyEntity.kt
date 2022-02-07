package com.bikmay.hobi.rest.repo.entity

import javax.persistence.Table

@Table("hobbys")
data class HobbyEntity(val id:String?,val text:String)
