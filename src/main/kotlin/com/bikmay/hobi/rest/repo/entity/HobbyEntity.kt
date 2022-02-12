package com.bikmay.hobi.rest.repo.entity

import javax.persistence.*

@Table(name = "hobbys")
@Entity
data class HobbyEntity(
    val name:String = "name"){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0;

    val description:String="";

    val imgUrl:String="";
}