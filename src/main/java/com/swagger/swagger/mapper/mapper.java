/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.swagger.mapper;

import request.eventReportRequest;
import response.eventReport;
import response.location;

/**
 *
 * @author root
 */
public class mapper {
    
 //   public static eventReport mapperResponse(eventReportRequest request){
    public static eventReport mapperResponse(String eventReport){
        
         String[] request = eventReport.split(";");
    	
        location location = new location(Float.parseFloat(request[6]),Float.parseFloat(request[6]));
        eventReport er = new eventReport(Float.parseFloat(request[7]), Float.parseFloat(request[8]), Float.parseFloat(request[9]),
        		request[10], location);
        
        return er;
        
    }
    
}
