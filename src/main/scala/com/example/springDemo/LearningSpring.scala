package com.example.springDemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class LearningSpringApplication

object LearningSpringApplication {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[LearningSpringApplication])
  }
}

