package com.deckers.integrations.ecommdecouplingdemo.service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.deckers.integrations.ecommdecouplingdemo.model.DoOrderHeaders;
import com.deckers.integrations.ecommdecouplingdemo.model.DoOrderLines;
//import com.deckers.integrations.ecommdecouplingdemo.model.DummyJsonModel;
import com.deckers.integrations.ecommdecouplingdemo.model.FulfillmentRequestDTO;
import com.deckers.integrations.ecommdecouplingdemo.model.Line;
import com.deckers.integrations.ecommdecouplingdemo.model.OrdsHeader;
import com.deckers.integrations.ecommdecouplingdemo.model.OrdsLine;
import com.deckers.integrations.ecommdecouplingdemo.model.OrdsPriceAdjustment;
import com.deckers.integrations.ecommdecouplingdemo.model.OrdsProcessOrder;
import com.deckers.integrations.ecommdecouplingdemo.model.PriceAdjustment;
import com.deckers.integrations.ecommdecouplingdemo.repository.OrderRepository;

import oracle.jdbc.driver.OracleConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

@Component
public class OrderService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private HttpHeaders requestHeaders;
	
	DoOrderHeaders doOrderHeaders;
	
	final String ordsCreateHeaderApiUrl = "http://ebs-dev1-adf.deckers.com:8080/ords/access_ords/ecomaws/create_header";
	final String ordsCreateLineApiUrl = "http://ebs-dev1-adf.deckers.com:8080/ords/access_ords/ecomaws/create_lines";
	final String ordsCreatePriceAdjApiUrl = "http://ebs-dev1-adf.deckers.com:8080/ords/access_ords/ecomaws/create_line_adj";
	final String ordsProcessOrderApiUrl = "http://ebs-dev1-adf.deckers.com:8080/ords/access_ords/ecomaws/process_order";
	
	
	public void processFulfillment(FulfillmentRequestDTO fulfillmentRequestDTO) {
		
		doOrderHeaders = new DoOrderHeaders();
		
		mapDoOrderHeader(fulfillmentRequestDTO);
		
		System.out.println("LineSize:"+doOrderHeaders.getDoOrderLinesList().size());
		System.out.println("Line1:"+doOrderHeaders.getDoOrderLinesList().get(0).getOrigSysLineRef());
		orderRepository.save(doOrderHeaders);
	}

	private void mapDoOrderHeader(FulfillmentRequestDTO fulfillmentRequestDTO) {
		
		doOrderHeaders.setOrigSysDocumentRef(fulfillmentRequestDTO.getCustomerPoNumber().concat("-SpringBoot"));
		doOrderHeaders.setOrderSourceId(BigDecimal.valueOf(1003));
		doOrderHeaders.setOrgId(BigDecimal.valueOf(95));
		doOrderHeaders.setOrderedDate(fulfillmentRequestDTO.getOrderDate());
		doOrderHeaders.setOrderTypeId(BigDecimal.valueOf(1234));
		doOrderHeaders.setPriceListId(BigDecimal.valueOf(6075));
		doOrderHeaders.setTransactionalCurrCode("USD");
		doOrderHeaders.setSalesrepId(BigDecimal.valueOf(3));
		doOrderHeaders.setPaymentTermId(BigDecimal.valueOf(1158));
		doOrderHeaders.setShippingMethodCode(fulfillmentRequestDTO.getLines().get(0).getShipMethod());
		doOrderHeaders.setFreightTermsCode("Paid");
		doOrderHeaders.setFobPointCode("SHIP POINT");
		doOrderHeaders.setCustomerPoNumber(fulfillmentRequestDTO.getCustomerPoNumber());
		doOrderHeaders.setSoldToOrgId(BigDecimal.valueOf(1255753184));
		doOrderHeaders.setShipFromOrgId(BigDecimal.valueOf(109));
		doOrderHeaders.setShipToOrgId(BigDecimal.valueOf(72040006));
		doOrderHeaders.setInvoiceToOrgId(BigDecimal.valueOf(72040005));
		doOrderHeaders.setCustomerId(BigDecimal.valueOf(1255753184));
		doOrderHeaders.setBookedFlag("Y");
		doOrderHeaders.setClosedFlag("N");
		doOrderHeaders.setCancelledFlag("Y");
		doOrderHeaders.setAttribute2("RE-ORDER SPRING");
		doOrderHeaders.setAttribute5("UGG");
		doOrderHeaders.setAttribute6("Token = T14290232. Credit card removed from the order");
		doOrderHeaders.setAttribute14(fulfillmentRequestDTO.getWebsiteID());
		doOrderHeaders.setCreatedBy(BigDecimal.valueOf(12345));
		doOrderHeaders.setCreationDate(new Date());
		doOrderHeaders.setLastUpdatedBy(BigDecimal.valueOf(12345));
		doOrderHeaders.setLastUpdateDate(new Date());
		doOrderHeaders.setRequestDate(fulfillmentRequestDTO.getOrderDate());
		doOrderHeaders.setOperationCode("INSERT");
		doOrderHeaders.setOrderCategory("R");
		doOrderHeaders.setSoldFromOrgId(BigDecimal.valueOf(100));
		doOrderHeaders.setErrorFlag("N");
		doOrderHeaders.setRequestId(BigDecimal.valueOf(123456789));
		
		mapDoOrderLines(fulfillmentRequestDTO);
	}

	private void mapDoOrderLines(FulfillmentRequestDTO fulfillmentRequestDTO) {
		
		List<Line> fulfillmentRequestLines= fulfillmentRequestDTO.getLines();
		List<DoOrderLines> doOrderLinesList = new ArrayList<DoOrderLines>();
		
		doOrderHeaders.setDoOrderLinesList(doOrderLinesList);
		
		for(int i=0;i<fulfillmentRequestLines.size();i++) {
			DoOrderLines doOrderLine = new DoOrderLines();
			doOrderLine.setOrigSysLineRef(fulfillmentRequestDTO.getCustomerPoNumber().concat("-SpringBoot-").concat(String.valueOf(fulfillmentRequestLines.get(i).getLineNumber())));
			doOrderLine.setOrderSourceId(BigDecimal.valueOf(1003));
			doOrderLine.setLineNumber(fulfillmentRequestLines.get(i).getLineNumber());
			doOrderLine.setInventoryItemId(BigDecimal.valueOf(13999954));
			doOrderLine.setOrgId(BigDecimal.valueOf(100));
			doOrderLine.setCustomerPoNumber(fulfillmentRequestDTO.getCustomerPoNumber());
			doOrderLine.setPricingDate(fulfillmentRequestDTO.getOrderDate());
			doOrderLine.setPricingQuantity(fulfillmentRequestLines.get(i).getQuantity());
			doOrderLine.setOrderedQuantity(fulfillmentRequestLines.get(i).getQuantity());
			doOrderLine.setOrderQuantityUom("PR");
			doOrderLine.setShipFromOrgId(BigDecimal.valueOf(109));
			doOrderLine.setShipToOrgId(BigDecimal.valueOf(72040006));
			doOrderLine.setSoldToOrgId(BigDecimal.valueOf(1255753184));
			doOrderLine.setPriceListId(BigDecimal.valueOf(6075));
			doOrderLine.setUnitListPrice(fulfillmentRequestLines.get(i).getTotalLineCost());
			doOrderLine.setUnitSellingPrice(fulfillmentRequestLines.get(i).getTotalLineCost());
			doOrderLine.setCalculatePriceFlag("N");
			doOrderLine.setPaymentTermId(BigDecimal.valueOf(1158));
			doOrderLine.setSalesrepId(BigDecimal.valueOf(3));
			doOrderLine.setAttribute11(fulfillmentRequestLines.get(i).getuPC());
			doOrderLine.setCreatedBy(BigDecimal.valueOf(12345));
			doOrderLine.setCreationDate(new Date());
			doOrderLine.setLastUpdateDate(new Date());
			doOrderLine.setLastUpdatedBy(BigDecimal.valueOf(12345));
			doOrderLine.setOperationCode("INSERT");
			doOrderLine.setRequestDate(fulfillmentRequestDTO.getOrderDate());
			doOrderLine.setClosedFlag("N");
			doOrderLine.setErrorFlag("N");
			doOrderLine.setShippingMethodCode(fulfillmentRequestLines.get(i).getShipMethod());
			
			doOrderHeaders.addDoOrderLines(doOrderLine);
		}
		
	}
	
	public void processFulfillmentProc(FulfillmentRequestDTO fulfillmentRequestDTO) throws SQLException {
		SimpleJdbcCall updateBrokerProc = new SimpleJdbcCall(this.jdbcTemplate).withSchemaName("XXORDS")
				.withCatalogName("XXD_ONT_ECOMM_ORDER_GK_PKG")
				.withProcedureName("MAIN").declareParameters(new SqlParameter("p_header", Types.ARRAY, "HEADER_TBL_TYPE"),
						new SqlParameter("p_lines", Types.ARRAY, "LINE_TBL_TYPE"),
						new SqlParameter("p_prc_adjs", Types.ARRAY, "PRC_TBL_TYPE"),
						new SqlOutParameter("x_err_status", Types.VARCHAR),
						new SqlOutParameter("x_err_msg", Types.VARCHAR));

		Connection conn = jdbcTemplate.getDataSource().getConnection();
		OracleConnection oraConn = conn.unwrap(OracleConnection.class);

		StructDescriptor recDescriptorHeader = StructDescriptor.createDescriptor("HEADER_REC_TYPE", oraConn);
		STRUCT[] structArrayHeader = new STRUCT[1];
		Object[] attributesHeader = { "Header1", "Website1", "Locale1", "OrderType1", "OrderSource1" };
		STRUCT oracleRecHeader = new STRUCT(recDescriptorHeader, oraConn, attributesHeader);
		structArrayHeader[0] = oracleRecHeader;

		ArrayDescriptor arrayDescriptorHeader = ArrayDescriptor.createDescriptor("HEADER_TBL_TYPE", oraConn);
		ARRAY inTabHeader = new ARRAY(arrayDescriptorHeader, oraConn, structArrayHeader);

		/////
		
		StructDescriptor recDescriptorLine = StructDescriptor.createDescriptor("LINE_REC_TYPE", oraConn);
		STRUCT[] structArrayLine = new STRUCT[2];
		Object[] attributesLine1 = { 1, "LineType1", "UPC1", 1 };
		STRUCT oracleRecLine1 = new STRUCT(recDescriptorLine, oraConn, attributesLine1);
		structArrayLine[0] = oracleRecLine1;
		
		Object[] attributesLine2 = { 2, "LineType2", "UPC2", 2 };
		STRUCT oracleRecLine2 = new STRUCT(recDescriptorLine, oraConn, attributesLine2);
		structArrayLine[1] = oracleRecLine2;

		ArrayDescriptor arrayDescriptorLine = ArrayDescriptor.createDescriptor("LINE_TBL_TYPE", oraConn);
		ARRAY inTabLine = new ARRAY(arrayDescriptorLine, oraConn, structArrayLine);

		/////
		
		StructDescriptor recDescriptorPriceAdj = StructDescriptor.createDescriptor("PRC_REC_TYPE", oraConn);
		STRUCT[] structArrayPriceAdj = new STRUCT[2];
		Object[] attributesPriceAdj1 = { "UPC1", 1, "Freight1", "Service1", 101, 201 };
		STRUCT oracleRecPriceAdj1 = new STRUCT(recDescriptorPriceAdj, oraConn, attributesPriceAdj1);
		structArrayPriceAdj[0] = oracleRecPriceAdj1;
		
		Object[] attributesPriceAdj2 = { "UPC2", 2, "Freight2", "Service2", 102, 202 };
		STRUCT oracleRecPriceAdj2 = new STRUCT(recDescriptorPriceAdj, oraConn, attributesPriceAdj2);
		structArrayPriceAdj[1] = oracleRecPriceAdj2;

		ArrayDescriptor arrayDescriptorPriceAdj = ArrayDescriptor.createDescriptor("PRC_TBL_TYPE", oraConn);
		ARRAY inTabPriceAdj = new ARRAY(arrayDescriptorPriceAdj, oraConn, structArrayPriceAdj);

		/////
		
		SqlParameterSource inParams = new MapSqlParameterSource()
				.addValue("p_header", inTabHeader)
				.addValue("p_lines", inTabLine)
				.addValue("p_prc_adjs", inTabPriceAdj);

		Map result = updateBrokerProc.execute(inParams);

		String resultArr[] = new String[2];

		resultArr[0] = (String) result.get("x_err_status");
		resultArr[1] = (String) result.get("x_err_msg");
		System.out.println("x_err_status");
		System.out.println(resultArr[0]);
		System.out.println("x_err_msg");
		System.out.println(resultArr[1]);

		closeConnection(conn);

	}
	
	private void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void processFulfillmentOrds(FulfillmentRequestDTO fulfillmentRequestDTO) {
		
//		DummyJsonModel dummyObj = new DummyJsonModel();
//		dummyObj.setCustCount("2");
//		dummyObj.setCustName("Gaurav");
//		dummyObj.setCustPhone("12345");
//		dummyObj.setHotelId("111");
//		dummyObj.setHotelName("JWMarriot Chandigarh");
//		restTemplate.postForLocation("http://localhost:8900/booking/", dummyObj);
		
		Long transactionId = orderRepository.getNextSeriesId();
		
		requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		callOrdsHeaderRestApi(transactionId, fulfillmentRequestDTO);
		
		List<Line> fulfillmentRequestLines= fulfillmentRequestDTO.getLines();
		callOrdsLinesRestApi(transactionId, fulfillmentRequestLines);

		int lineCount = fulfillmentRequestLines.size();
		
		int priceAdjCount = 0;
		for(Line fulfillmentRequestLine: fulfillmentRequestLines) {
			priceAdjCount += fulfillmentRequestLine.getPriceAdjustments().size();
		}
		
		callOrdsProcessOrder(transactionId, lineCount, priceAdjCount);
	}
	
	private void callOrdsHeaderRestApi(Long transactionId, FulfillmentRequestDTO fulfillmentRequestDTO) {
		
        OrdsHeader ordsHeader = new OrdsHeader();
		ordsHeader.setDomsRequestId(fulfillmentRequestDTO.getRequestId());
		ordsHeader.setLocale(fulfillmentRequestDTO.getLocale());
		ordsHeader.setOrderSource(fulfillmentRequestDTO.getOrderType());
		ordsHeader.setOrderType(fulfillmentRequestDTO.getOrderType());
		ordsHeader.setTransactionId(transactionId.toString());
		ordsHeader.setWebsiteId(fulfillmentRequestDTO.getWebsiteID());
		
		restTemplate.postForLocation(ordsCreateHeaderApiUrl, ordsHeader);
		
		// Working commented
//		String requestJson = "{\"P_DOMS_REQUESTID\":\"" + fulfillmentRequestDTO.getRequestId() + "\", "
//				+ "\"P_WEBSITE_ID\":\"" + fulfillmentRequestDTO.getWebsiteID() + "\", "
//				+ "\"P_LOCALE\":\"" + fulfillmentRequestDTO.getCustomerPoNumber() + "\", "
//				+ "\"P_ORDERTYPE\":\"" + fulfillmentRequestDTO.getOrderType() + "\", "
//				+ "\"P_ORDERSOURCE\":\"" + fulfillmentRequestDTO.getOrderType() + "\", "
//				+ "\"P_TRANSACTION_ID\":\"" + transactionId.toString() + "\"}";

		// Working commented
		//String requestJson = "{\"P_DOMS_REQUESTID\":\"4733f555\", \"P_WEBSITE_ID\":\"UGG\", \"P_LOCALE\":\"109555\", \"P_ORDERTYPE\":\"UGGUS\", \"P_ORDERSOURCE\":\"UGGUS\", \"P_TRANSACTION_ID\":\"55555\"}";
        //HttpEntity<String> entity = new HttpEntity<String>(requestJson,requestHeaders);
        //restTemplate.postForLocation(ordsCreateHeaderApiUrl, entity);

		// Not Working
		//OrdsHeader ordsHeaderResult = restTemplate.postForObject(ordsCreateHeaderApiUrl, ordsHeader, OrdsHeader.class);
		//ResponseEntity<Void> response = restTemplate.postForObject(ordsCreateHeaderApiUrl, ordsHeader, Void.class);
		//restTemplate.postForLocation(ordsCreateHeaderApiUrl, ordsHeader);
		//HttpEntity<OrdsHeader> requestEntity = new HttpEntity<OrdsHeader>(ordsHeader, requestHeaders);
		//Void response = restTemplate.postForObject(ordsCreateHeaderApiUrl, requestEntity, Void.class);
        //restTemplate.postForLocation(ordsCreateHeaderApiUrl, requestEntity);
		//ResponseEntity<Void> response = restTemplate.postForEntity(ordsCreateHeaderApiUrl, requestEntity, Void.class);
        //ResponseEntity<Void> response = restTemplate.exchange(ordsCreateHeaderApiUrl, HttpMethod.POST, requestEntity, Void.class);
        
        // Working
        //HttpEntity<String> entity = new HttpEntity<String>(requestJson,requestHeaders);
        //Void response = restTemplate.postForObject(ordsCreateHeaderApiUrl, entity, Void.class);
        //restTemplate.postForLocation(ordsCreateHeaderApiUrl, entity);
        //ResponseEntity<Void> response = restTemplate.exchange(ordsCreateHeaderApiUrl, HttpMethod.POST, entity, Void.class);
		
	}
	
	private void callOrdsLinesRestApi(Long transactionId, List<Line> fulfillmentRequestLines) {
		
		for(Line fulfillmentRequestLine: fulfillmentRequestLines) {
//        	Working commented
//			String lineRequestJson = "{\"P_LINE_NUMBER\":\"" + fulfillmentRequestLine.getLineNumber() + "\", "
//    				+ "\"P_LINE_TYPE\":\"" + fulfillmentRequestLine.getShipMethod() + "\", "
//    				+ "\"P_UPC\":\"" + fulfillmentRequestLine.getuPC() + "\", "
//    				+ "\"P_QUANTITY\":\"" + fulfillmentRequestLine.getQuantity() + "\", "
//    				+ "\"P_TRANSACTION_ID\":\"" + transactionId.toString() + "\"}";
//        	HttpEntity<String> lineEntity = new HttpEntity<String>(lineRequestJson,requestHeaders);
//            restTemplate.postForLocation(ordsCreateLineApiUrl, lineEntity);
            
			OrdsLine ordsLine = new OrdsLine();
			ordsLine.setLineNumber(fulfillmentRequestLine.getLineNumber().toString());
			ordsLine.setLineType(fulfillmentRequestLine.getShipMethod());
			ordsLine.setQuantity(fulfillmentRequestLine.getQuantity().toString());
			ordsLine.setTransactionId(transactionId.toString());
			ordsLine.setUpc(fulfillmentRequestLine.getuPC());
			
			restTemplate.postForLocation(ordsCreateLineApiUrl, ordsLine);
			
			callOrdsPriceAdjRestApi(transactionId, fulfillmentRequestLine.getLineNumber(), fulfillmentRequestLine.getuPC(), fulfillmentRequestLine.getQuantity(), fulfillmentRequestLine.getPriceAdjustments());
        }
        
	}

	private void callOrdsPriceAdjRestApi(Long transactionId, BigDecimal lineNumber, String upc, BigDecimal quantity, List<PriceAdjustment> fulfillmentRequestPriceAdj) {
		
        for(PriceAdjustment fulfillmentPriceAdj: fulfillmentRequestPriceAdj) {
//        	Working commented
//        	String priceAdjRequestJson = "{\"P_UPC\":\"" + upc + "\", "
//    				+ "\"P_LINE_NUMBER\":\"" + lineNumber + "\", "
//    				+ "\"P_QUANTITY\":\"" + quantity + "\", "
//    				+ "\"P_FREIGHT_CARRIER\":\"" + fulfillmentPriceAdj.getCampaignId() + "\", "
//    				+ "\"P_SERVICE_LEVEL\":\"" + fulfillmentPriceAdj.getLevel() + "\", "
//    				+ "\"P_LIST_PRICE_PERUNIT\":\"" + fulfillmentPriceAdj.getGrossPrice() + "\", "
//    				+ "\"P_NET_PRICE_PERUNIT\":\"" + fulfillmentPriceAdj.getNetPrice() + "\", "
//    				+ "\"P_TRANSACTION_ID\":\"" + transactionId.toString() + "\"}";
//        	
//        	HttpEntity<String> priceAdjEntity = new HttpEntity<String>(priceAdjRequestJson,requestHeaders);
//            restTemplate.postForLocation(ordsCreatePriceAdjApiUrl, priceAdjEntity);
        	
        	OrdsPriceAdjustment ordsPriceAdj = new OrdsPriceAdjustment();
        	ordsPriceAdj.setFreightCarrier(fulfillmentPriceAdj.getCampaignId());
        	ordsPriceAdj.setLineNumber(lineNumber.toString());
        	ordsPriceAdj.setListPricePerUnit(String.valueOf(fulfillmentPriceAdj.getGrossPrice()));
        	ordsPriceAdj.setNetPricePerUnit(String.valueOf(fulfillmentPriceAdj.getNetPrice()));
        	ordsPriceAdj.setQuantity(quantity.toString());
        	ordsPriceAdj.setServiceLevel(String.valueOf(fulfillmentPriceAdj.getLevel()));
        	ordsPriceAdj.setTransactionId(transactionId.toString());
        	ordsPriceAdj.setUpc(upc);
        	
        	restTemplate.postForLocation(ordsCreatePriceAdjApiUrl, ordsPriceAdj);
        }
	}

	private void callOrdsProcessOrder(Long transactionId, int lineCount,  int priceAdjCount) {
//		String processOrderJson = "{\"P_LINE_COUNT\":\"" + lineCount + "\", "
//				+ "\"P_LINE_ADJ_COUNT\":\"" + priceAdjCount + "\", "
//				+ "\"P_TRANSACTION_ID\":\"" + transactionId.toString() + "\"}";
//		
//        HttpEntity<String> entity = new HttpEntity<String>(processOrderJson,requestHeaders);
//        restTemplate.postForLocation(ordsProcessOrderApiUrl, entity);
		
		OrdsProcessOrder ordsProcessOrder = new OrdsProcessOrder();
		ordsProcessOrder.setLineAdjCount(String.valueOf(priceAdjCount));
		ordsProcessOrder.setLineCount(String.valueOf(lineCount));
		ordsProcessOrder.setTransactionId(transactionId.toString());
		
		restTemplate.postForLocation(ordsProcessOrderApiUrl, ordsProcessOrder);
		
	}
}
