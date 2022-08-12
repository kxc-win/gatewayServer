package com.serverApp.query;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class AppServerApi {

    @ApiOperation("测试rest")
    @RequestMapping(value = "/testApi", method = RequestMethod.GET)
    public String testApi() {
      return "hello world!";

    }


}
