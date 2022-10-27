package com.example.htmltemplate.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@RestController
public class RestControllers {
	
	@Autowired   
    private Configuration config;  
	
	@GetMapping("/rest")
	public String getHtml(ModelMap madelMap) throws IOException, TemplateException {
		 
		  String jsonString="{\r\n"
	    			+ "    \"meta\": {\r\n"
	    			+ "        \"timestamp\": \"2022-10-26T06:09:53Z\",\r\n"
	    			+ "        \"cxpCorrelationId\": \"2022-10-25T23:09:53.-0700:66f6123f619fff9f:TSDCVPA05VI0465:payload:local\"\r\n"
	    			+ "    },\r\n"
	    			+ "    \"data\": {\r\n"
	    			+ "        \"summary\": {\r\n"
	    			+ "            \"orderAndType\": [\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"ordersCount\": 3,\r\n"
	    			+ "                    \"type\": \"5gtestest\"\r\n"
	    			+ "                },\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"ordersCount\": 4,\r\n"
	    			+ "                    \"type\": \"TradeIn\"\r\n"
	    			+ "                }\r\n"
	    			+ "            ],\r\n"
	    			+ "            \"datasync\": [\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 21,\r\n"
	    			+ "                    \"failure\": 5,\r\n"
	    			+ "                    \"inprocessing\": 0,\r\n"
	    			+ "                    \"type\": \"TradeIn\"\r\n"
	    			+ "                },\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 43,\r\n"
	    			+ "                    \"failure\": 2,\r\n"
	    			+ "                    \"inprocessing\": 0,\r\n"
	    			+ "                    \"type\": \"5g\"\r\n"
	    			+ "                }\r\n"
	    			+ "            ],\r\n"
	    			+ "            \"datacompare\": [\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 0,\r\n"
	    			+ "                    \"failure\": 3,\r\n"
	    			+ "                    \"type\": \"TradeIn\"\r\n"
	    			+ "                },\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 1,\r\n"
	    			+ "                    \"failure\": 4,\r\n"
	    			+ "                    \"type\": \"5g\"\r\n"
	    			+ "                }\r\n"
	    			+ "            ],\r\n"
	    			+ "            \"apicompare\": [\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 0,\r\n"
	    			+ "                    \"failure\": 2,\r\n"
	    			+ "                    \"type\": \"TradeIn\"\r\n"
	    			+ "                },\r\n"
	    			+ "                {\r\n"
	    			+ "                    \"success\": 0,\r\n"
	    			+ "                    \"failure\": 6,\r\n"
	    			+ "                    \"type\": \"5g\"\r\n"
	    			+ "                }\r\n"
	    			+ "            ]\r\n"
	    			+ "        },\r\n"
	    			+ "        \"dataSync\": [\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_EnforceCallBackInsert\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_InsertEnforceRemarks\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_InsertOrdRemarks\",\r\n"
	    			+ "                \"success\": 8,\r\n"
	    			+ "                \"failure\": 1,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_SAP_5G_3PL_Delivery_Notification\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 1,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_SAP_5G_Order_Creation_Notification\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_SAP_Recovery_Box_Shipment_Change_Confirmation_Notification\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_SaveAndUpdateOrderPaymentAndCustOrderDetails_Alt\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_SkusAndRdbUpdate\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateEnforceOrderInfo\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateMultiOrderStatus\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateNodeStatusDetails\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateOrdLnDetailsAndInsertRemark\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateOrderLineStatusAndRemarks\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateReserveNodeDetails\",\r\n"
	    			+ "                \"success\": 2,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateServiceItemWriteDetails\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateStatusCIB\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"type_def_name\": \"Generate_PaymentOrder_Gift_Reciepts\",\r\n"
	    			+ "                \"success\": 4,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_InsertOrdRemarks\",\r\n"
	    			+ "                \"success\": 12,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateTradeInItemDetails\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateTradeInItemDetailsDevr\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateTradeInItemDetailsGiftCard\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateTradeInItemDetailsPayout\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 5,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"type_def_name\": \"DMS_UpdateTradeinItemDetailsPKGRPreIssueCredit\",\r\n"
	    			+ "                \"success\": 3,\r\n"
	    			+ "                \"failure\": 0,\r\n"
	    			+ "                \"in_processing\": 0\r\n"
	    			+ "            }\r\n"
	    			+ "        ],\r\n"
	    			+ "        \"dataCompare\": [\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"milestones\": \"DMS_SaveAndUpdateOrderPaymentAndCustOrderDetails_Alt\",\r\n"
	    			+ "                \"success\": 1,\r\n"
	    			+ "                \"failure\": 0\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"milestones\": \"DMS_SkusAndRdbUpdate\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failure\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"milestones\": \"SubmitPayment\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failure\": 2\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"milestones\": \"FulfillmentRequest\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failure\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"milestones\": \"DMS_UpdateTradeInItemDetailsDevr\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failure\": 3\r\n"
	    			+ "            }\r\n"
	    			+ "        ],\r\n"
	    			+ "        \"apiCompare\": [\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"api_type\": \"SAP_CIB\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 2\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"api_type\": \"ENFORCE_FILL_ORDER\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"api_type\": \"SAP_RDB\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"api_type\": \"NAUTILUS_CONFIRM_NOD\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"5g\",\r\n"
	    			+ "                \"api_type\": \"NAUTILUS_RESERVE_NOD\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"api_type\": \"PAYPAL_PAYOUT\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            },\r\n"
	    			+ "            {\r\n"
	    			+ "                \"Flow_Type\": \"TradeIn\",\r\n"
	    			+ "                \"api_type\": \"GC_ACTIVATION\",\r\n"
	    			+ "                \"success\": 0,\r\n"
	    			+ "                \"failed\": 1\r\n"
	    			+ "            }\r\n"
	    			+ "        ]\r\n"
	    			+ "    }\r\n"
	    			+ "}";
		  madelMap.put("summary",convertJsontoSummary(jsonString));
		  madelMap.put("datasync",convertJsontodataSync(jsonString));
		  madelMap.put("datacompare", convertJsontodataCompare(jsonString));
		  Template t = config.getTemplate("sample.ftl");   
	         String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, madelMap);  
		return html;
	}

	  public List<Object> convertJsontoSummary(String jsonString){
	    	JSONObject jsonObject = new JSONObject(jsonString);
	    	JSONObject dataObject =jsonObject.getJSONObject("data").getJSONObject("summary");
	    
	    	JSONArray orderAndTypeArr= dataObject.getJSONArray("orderAndType");
	    	JSONArray datasyncArr= dataObject.getJSONArray("datasync");
	    	JSONArray datacompareArr= dataObject.getJSONArray("datacompare");
	    	List<Object> rootList=new ArrayList<>();
	    	for(int i=0;i<orderAndTypeArr.length();i++) {
	    		JSONObject mergedObj = new JSONObject();
	    		Iterator i1 = orderAndTypeArr.getJSONObject(i).keys();
	        	Iterator i2 = datasyncArr.getJSONObject(i).keys();
	        	Iterator i3 = datacompareArr.getJSONObject(i).keys();
	        	String tmp_key;
	        	while(i1.hasNext()) {
	        	    tmp_key = (String) i1.next();
	        	    mergedObj.put(tmp_key, orderAndTypeArr.getJSONObject(i).get(tmp_key));
	        	}
	        	while(i2.hasNext()) {
	        	    tmp_key = (String) i2.next();
	        	    mergedObj.put("datasync_"+tmp_key, datasyncArr.getJSONObject(i).get(tmp_key));
	        	}
	        	while(i3.hasNext()) {
	        	    tmp_key = (String) i3.next();
	        	    mergedObj.put("datacompare_"+tmp_key, datacompareArr.getJSONObject(i).get(tmp_key));
	        	}
	        	rootList.add(mergedObj);
	    	} 	
	    	return rootList;
	 
	    }
	

	  public List<Object> convertJsontodataSync(String jsonString){
	    	JSONObject jsonObject = new JSONObject(jsonString);
	    	JSONArray dataObject =jsonObject.getJSONObject("data").getJSONArray("dataSync");
	    
	    	return dataObject.toList();
	 
	    }
	  
	  public List<Object> convertJsontodataCompare(String jsonString){
	    	JSONObject jsonObject = new JSONObject(jsonString);
	    	JSONArray dataObject =jsonObject.getJSONObject("data").getJSONArray("dataCompare");
	    
	    	return dataObject.toList();
	 
	    }
}
