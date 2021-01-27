package com.deckers.integrations.ecommdecouplingdemo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.deckers.integrations.ecommdecouplingdemo.model.FulfillmentRequestDTO;
import com.deckers.integrations.ecommdecouplingdemo.service.OrderService;

@RestController
public class FulfillmentController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/processFulfillment")
	public void processFulfillment(@RequestBody FulfillmentRequestDTO fulfillmentRequest) {
		System.out.println("RequestId:"+fulfillmentRequest.getRequestId());
		System.out.println("LineUPC:"+fulfillmentRequest.getLines().get(0).getuPC());
		System.out.println("PriceAdjType:"+fulfillmentRequest.getLines().get(0).getPriceAdjustments().get(0).getType());
		System.out.println("LineUPC:"+fulfillmentRequest.getLines().get(1).getuPC());
		System.out.println("PriceAdjType:"+fulfillmentRequest.getLines().get(1).getPriceAdjustments().get(1).getType());
		
		orderService.processFulfillment(fulfillmentRequest);
	}
	
	@PostMapping("/processFulfillmentProc")
	public void processFulfillmentProc(@RequestBody FulfillmentRequestDTO fulfillmentRequest) {
		System.out.println("RequestId:"+fulfillmentRequest.getRequestId());
		System.out.println("LineUPC:"+fulfillmentRequest.getLines().get(0).getuPC());
		System.out.println("PriceAdjType:"+fulfillmentRequest.getLines().get(0).getPriceAdjustments().get(0).getType());
		System.out.println("LineUPC:"+fulfillmentRequest.getLines().get(1).getuPC());
		System.out.println("PriceAdjType:"+fulfillmentRequest.getLines().get(1).getPriceAdjustments().get(1).getType());
		
		try {
			orderService.processFulfillmentProc(fulfillmentRequest);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PostMapping("/processFulfillmentOrds")
	public void processFulfillmentOrds(@RequestBody FulfillmentRequestDTO fulfillmentRequest) {
		orderService.processFulfillmentOrds(fulfillmentRequest);
	}
}
