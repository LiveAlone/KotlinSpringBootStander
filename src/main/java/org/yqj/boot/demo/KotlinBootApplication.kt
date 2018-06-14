package org.yqj.boot.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

/**
 * @author yaoqijun on 2018-06-14.
 */

@SpringBootApplication
class KotlinBootApplication

fun main(args: Array<String>) {
//    SpringApplication.run(KotlinBootApplication::class.java, *args);
    SpringApplicationBuilder().banner(DemoBanner()).sources(KotlinBootApplication::class.java).run(*args);
}