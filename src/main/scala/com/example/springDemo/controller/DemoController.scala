package com.example.springDemo.controller

import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RestController}

@RestController
class DemoController {

  @GetMapping(Array("/say-hello/{name}"))
  def demo(@PathVariable name: String= "World"): String =
    s"Hello, ${name}!"
}
