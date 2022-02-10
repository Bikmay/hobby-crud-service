package com.bikmay.hobi.rest.repo.entity

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import javax.persistence.*

@Table(name = "hobbys")
@Entity
data class HobbyEntity(
    val name:String = "name"){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0;
}