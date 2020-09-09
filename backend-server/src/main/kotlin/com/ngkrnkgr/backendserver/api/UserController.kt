package com.ngkrnkgr.backendserver.api

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("api/user")
class EyeCatchController(
) {

    @GetMapping
    fun getHoge(): OutPut {
        return OutPut("Hello Next.js SpringBoot App")
    }
}
