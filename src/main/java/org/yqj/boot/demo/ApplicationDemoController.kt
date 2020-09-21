package org.yqj.boot.demo

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import java.net.InetAddress

/**
 * @author yaoqijun on 2018-06-14.
 */
@Controller
class ApplicationDemoController{

    @RequestMapping(value = ["/"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun rootPage(): String{
        return "host is " + InetAddress.getLocalHost().getHostName() + " with ip address " + InetAddress.getLocalHost().getHostAddress();
    }
}