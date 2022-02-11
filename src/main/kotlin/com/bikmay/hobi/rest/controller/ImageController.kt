package com.bikmay.hobi.rest.controller

import com.bikmay.hobi.rest.service.ImageService
import org.springframework.http.*
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/img")
@CrossOrigin
class ImageController(val service:ImageService) {
    @GetMapping("/hobby/{id}")
    fun getHobbyImage(@PathVariable("id") id:Long):ResponseEntity<ByteArray>{
        val file:ByteArray = service.getHobbyImg(id);
        val headers:HttpHeaders = HttpHeaders();
        headers.setCacheControl(CacheControl.noCache().headerValue);
        val resp:ResponseEntity<ByteArray> = ResponseEntity(file,headers, HttpStatus.OK);
        return resp;
    }
}