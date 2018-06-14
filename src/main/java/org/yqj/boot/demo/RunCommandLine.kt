package org.yqj.boot.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * @author yaoqijun on 2018-06-14.
 */
@Component
class RunCommandLine : CommandLineRunner{

    override fun run(vararg args: String?) {
        println("now command line run ")
    }
}