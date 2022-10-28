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
		  		+ "	\"meta\": {\r\n"
		  		+ "		\"timestamp\": 1666878088203,\r\n"
		  		+ "		\"cxpCorrelationId\": \"2022-10-27T19:11:28.+0530:5cf339236e9ede85:TTDCVPA09IV0323:payload:local\"\r\n"
		  		+ "	},\r\n"
		  		+ "	\"data\": {\r\n"
		  		+ "		\"summary\": {\r\n"
		  		+ "			\"orderAndType\": [],\r\n"
		  		+ "			\"datasync\": [\r\n"
		  		+ "				{\r\n"
		  		+ "					\"success\": 370,\r\n"
		  		+ "					\"failure\": 108,\r\n"
		  		+ "					\"inprocessing\": 53,\r\n"
		  		+ "					\"type\": null\r\n"
		  		+ "				}\r\n"
		  		+ "			],\r\n"
		  		+ "			\"datacompare\": [\r\n"
		  		+ "				{\r\n"
		  		+ "					\"success\": 14,\r\n"
		  		+ "					\"failure\": 50,\r\n"
		  		+ "					\"type\": null\r\n"
		  		+ "				}\r\n"
		  		+ "			],\r\n"
		  		+ "			\"apicompare\": [\r\n"
		  		+ "				{\r\n"
		  		+ "					\"success\": 0,\r\n"
		  		+ "					\"failure\": 21,\r\n"
		  		+ "					\"type\": null\r\n"
		  		+ "				}\r\n"
		  		+ "			]\r\n"
		  		+ "		},\r\n"
		  		+ "		\"dataSync\": [\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_EnforceCallBackInsert\",\r\n"
		  		+ "				\"success\": 11,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_InsertEnforceRemarks\",\r\n"
		  		+ "				\"success\": 11,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_InsertOrdRemarks\",\r\n"
		  		+ "				\"success\": 78,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 5\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_ModifyAppointmentDetails\",\r\n"
		  		+ "				\"success\": 34,\r\n"
		  		+ "				\"failure\": 7,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_SAP_5G_3PL_Delivery_Notification\",\r\n"
		  		+ "				\"success\": 17,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_SAP_5G_Order_Creation_Notification\",\r\n"
		  		+ "				\"success\": 15,\r\n"
		  		+ "				\"failure\": 1,\r\n"
		  		+ "				\"in_processing\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_SAP_Recovery_Box_Shipment_Change_Confirmation_Notification\",\r\n"
		  		+ "				\"success\": 8,\r\n"
		  		+ "				\"failure\": 6,\r\n"
		  		+ "				\"in_processing\": 6\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_SaveAndUpdateOrderPaymentAndCustOrderDetails_Alt\",\r\n"
		  		+ "				\"success\": 9,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_SkusAndRdbUpdate\",\r\n"
		  		+ "				\"success\": 16,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateConfirmAppointmentDetails\",\r\n"
		  		+ "				\"success\": 35,\r\n"
		  		+ "				\"failure\": 1,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateDRCRStatus\",\r\n"
		  		+ "				\"success\": 2,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateEnforceOrderInfo\",\r\n"
		  		+ "				\"success\": 9,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateLovInd\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 12,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateMultiOrderStatus\",\r\n"
		  		+ "				\"success\": 8,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateNodeStatusDetails\",\r\n"
		  		+ "				\"success\": 6,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateOrdLnDetailsAndInsertRemark\",\r\n"
		  		+ "				\"success\": 8,\r\n"
		  		+ "				\"failure\": 3,\r\n"
		  		+ "				\"in_processing\": 9\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateOrderLineStatusAndRemarks\",\r\n"
		  		+ "				\"success\": 15,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 12\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateReserveNodeDetails\",\r\n"
		  		+ "				\"success\": 9,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateServiceItemWriteDetails\",\r\n"
		  		+ "				\"success\": 14,\r\n"
		  		+ "				\"failure\": 14,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateStatusCIB\",\r\n"
		  		+ "				\"success\": 15,\r\n"
		  		+ "				\"failure\": 17,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetails\",\r\n"
		  		+ "				\"success\": 1,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 1\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetailsDevr\",\r\n"
		  		+ "				\"success\": 11,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 1\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetailsGiftCard\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 1,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetailsPayout\",\r\n"
		  		+ "				\"success\": 1,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetailsStatus\",\r\n"
		  		+ "				\"success\": 2,\r\n"
		  		+ "				\"failure\": 1,\r\n"
		  		+ "				\"in_processing\": 0\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeInItemDetails_Alt\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 2\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"DMS_UpdateTradeinItemDetailsPKGRPreIssueCredit\",\r\n"
		  		+ "				\"success\": 9,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"Generate_PaymentOrder_Gift_Reciepts\",\r\n"
		  		+ "				\"success\": 26,\r\n"
		  		+ "				\"failure\": 45,\r\n"
		  		+ "				\"in_processing\": 1\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"type_def_name\": \"Test_DMS_SaveInstallmentLoanDetails\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 0,\r\n"
		  		+ "				\"in_processing\": 1\r\n"
		  		+ "			}\r\n"
		  		+ "		],\r\n"
		  		+ "		\"dataCompare\": [\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"Generate_PaymentOrder_Gift_Reciepts\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 25\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"CartToOrderConversion\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"DMS_UpdateReserveNodeDetails\",\r\n"
		  		+ "				\"success\": 4,\r\n"
		  		+ "				\"failure\": 7\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"FulfillmentUpdate\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 7\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"DMS_UpdateTradeInItemDetailsDevr\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 7\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"PostOrderConfirmation\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failure\": 1\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"milestones\": \"DMS_SkusAndRdbUpdate\",\r\n"
		  		+ "				\"success\": 10,\r\n"
		  		+ "				\"failure\": 0\r\n"
		  		+ "			}\r\n"
		  		+ "		],\r\n"
		  		+ "		\"apiCompare\": [\r\n"
		  		+ "			{\r\n"
		  		+ "				\"api_type\": \"OMP_TI_PRM_REQUALIF\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failed\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"api_type\": \"SAP_CIB\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failed\": 3\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"api_type\": \"VPM_CONFRIM_APPT\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failed\": 1\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"api_type\": \"OMP_TI_PRM_ITQUALIF\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failed\": 13\r\n"
		  		+ "			},\r\n"
		  		+ "			{\r\n"
		  		+ "				\"api_type\": \"NAUTILUS_RESERVE_NOD\",\r\n"
		  		+ "				\"success\": 0,\r\n"
		  		+ "				\"failed\": 1\r\n"
		  		+ "			}\r\n"
		  		+ "		]\r\n"
		  		+ "	}\r\n"
		  		+ "}";
		  madelMap.put("summary",convertJsontoSummary(jsonString));
		  madelMap.put("datasync",convertJsontodata(jsonString,"dataSync"));
		  madelMap.put("datacompare", convertJsontodata(jsonString,"dataCompare"));
		  madelMap.put("apiCompare", convertJsontodata(jsonString,"apiCompare"));
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
	    	JSONArray finalJson=new JSONArray();
	    	List<Object> rootList=new ArrayList<>();
	    	int orderAndTypelength=orderAndTypeArr.length();
	    	int datasynclength=datasyncArr.length();
	    	int datacomparelength=datacompareArr.length();
	    	int length=0;
	    	if(orderAndTypelength>0) {
	    		length=orderAndTypelength;
	    	}else if(datasynclength>0) {
	    		length=datasynclength;
	    	}else {
	    		length=datacomparelength;
	    	}
	    	
	    	for(int i=0;i<length;i++) {
	    		JSONObject mergedObj = new JSONObject();
	    		if(orderAndTypelength>0) {
	    		Iterator i1 = orderAndTypeArr.getJSONObject(i).keys();
	        
	        	String tmp_key;
	        	while(i1.hasNext()) {
	        	    tmp_key = (String) i1.next();
	        	    mergedObj.put(tmp_key, orderAndTypeArr.getJSONObject(i).get(tmp_key));
	        	}
	    		}
	    		if(datasynclength>0) {
	        	Iterator i2 = datasyncArr.getJSONObject(i).keys();
	        	String tmp_key;
	        	while(i2.hasNext()) {
	        	    tmp_key = (String) i2.next();
	        	    mergedObj.put("datasync_"+tmp_key, datasyncArr.getJSONObject(i).get(tmp_key));
	        	}
	    		}
	    		if(datacomparelength>0) {
	        	Iterator i3 = datacompareArr.getJSONObject(i).keys();
	        	String tmp_key;
	        	while(i3.hasNext()) {
	        	    tmp_key = (String) i3.next();
	        	    mergedObj.put("datacompare_"+tmp_key, datacompareArr.getJSONObject(i).get(tmp_key));
	        	}
	    		}
	        	finalJson.put(mergedObj);
	        	
	    	} 	
	    	return finalJson.toList();
	 
	    }
	

	  public List<Object> convertJsontodata(String jsonString,String convertValue){
	    	JSONObject jsonObject = new JSONObject(jsonString);
	    	JSONArray dataObject =jsonObject.getJSONObject("data").getJSONArray(convertValue);
	    
	    	return dataObject.toList();
	 
	    }
	  
}
