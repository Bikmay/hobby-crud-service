package com.bikmay.hobi.rest.service

import org.springframework.stereotype.Service
import org.springframework.util.ResourceUtils
import java.io.File

@Service
class ImageService(val hobbyService: HobbyService) {
    fun getImg(fileName: String): ByteArray {
        val file: File = ResourceUtils.getFile("classpath:static/img/"+fileName)
        return file.readBytes();
    }

    fun getHobbyImg(id: Long): ByteArray {
        val url: String = hobbyService.getImgUrlById(id);
        val file:ByteArray = getImg(url);
        return file;
    }
}