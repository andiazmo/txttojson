/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.swagger.api;

import com.swagger.swagger.mapper.mapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import request.eventReportRequest;
import response.eventReport;
import response.location;

/**
 *
 * @author root
 */
@RestController
@RequestMapping("/txttorest")
@Api(value = "adaptator service to translate json response to rest response", description = "adaptator service to translate json response to rest response")
public class translatorapi {

    
    /**
     *
     * @param request
     * @return
     */
    @PostMapping("")
    @ApiOperation(value = "Get txt request and translate it to rest", notes = "Get txt request and translate it to rest")
    public eventReport getJsonToRest(@RequestBody String eventReport){
       
    	System.out.println("eventReport:::"+eventReport);
    	
        return mapper.mapperResponse(eventReport);

    }
    
    /**
     *
     * @return
     */
    @GetMapping("/test")
    @ApiOperation(value = "test availability api", notes = "test availability api")
    public String test(){
        
        return "OK test jsonadapter";

    }
    
    
    
}
