<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Email Template</title>
</head>
<style>
    th {
        padding: 10px;
    }


    td {
        padding: 15px;
    }
</style>

<body style="color:#000000;   
  height: 100%;  
  background-position: center;  
  background-repeat: no-repeat;  
  background-size: cover;">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center"><br> <br>
                <table width="600" border="0" cellspacing="0" cellpadding="0" style="float:left">
                    <tr>
                        <td align="left" valign="top"
                            style=" font-family: Arial, Helvetica, sans-serif; font-size: 13px; padding: 0px 15px 10px 15px;">
                            <div style="font-size: 24px; ">
                                <b>SUMMARY</b><br /><br />
                            </div>
                            <div style="text-align:left">

                                <table style="background-color: black;">
                                    <tr style="background-color: #24c01eb6;">
                                        <th colspan="1">
                                        </th>
                                        </th>
                                        <th colspan="1"></th>
                                        <th colspan="3">DataSync</th>
                                        <th colspan="2">DataCompare</th>
                                        <th colspan="2">Payload</th>
                                    </tr>
                                    <tr style="background-color: #24c01eb6;">

                                        <th>Flow Types</th>
                                        <th>ORDER TYPES</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                        <th>INPROGRESS</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                    </tr>
                                    <#list summary as item>
                                        <tr style="background-color: #ffffff;">
                                            <td>${item.ordersCount}</td>
                                            <td>${item.type}</td>
                                            <td>${item.datasync_success}</td>
                                            <td>${item.datasync_failure}</td>
                                            <td>${item.datasync_inprocessing}</td>
                                            <td>${item.datacompare_success}</td>
                                            <td>${item.datacompare_failure}</td>
                                            <td>0</td>
                                            <td>0</td>
                                        </tr>

                                    </#list>

                                </table>
                            </div>
                            <div style="font-size: 24px; 
                            margin-top: 20px;">
                                <b>DATA SYNC</b><br /><br />
                            </div>
                            <div style="text-align:left">

                                <table style="background-color: black;">
                                    <tr style="background-color: #3a80e2f9;">
                                        <th>Flow Types</th>
                                        <th>TYPE_DEF_NAME</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                        <th>INPROCESSING</th>
                                    </tr>
                                    <#list datasync as item>
                                        <tr style="background-color: #ffffff;">
                                            <td>${item.Flow_Type}</td>
                                            <td>${item.type_def_name}</td>
                                            <td>${item.success}</td>
                                            <td>${item.failure}</td>
                                            <td>${item.in_processing}</td>
                                        </tr>
                                    </#list>

                                </table>
                            </div>
                            <div style="font-size: 24px; 
                            margin-top: 20px;">
                                <b>DATA COMPARE</b><br /><br />
                            </div>
                            <div style="text-align:left">
                                <table style="background-color: black;">
                                    <tr style="background-color: #3a80e2f9;">
                                        <th>Flow Types</th>
                                        <th>MILESTONE</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                    </tr>
                                    <#list datacompare as item>
                                        <tr style="background-color: #ffffff;">
                                            <td>${item.Flow_Type}</td>
                                            <td>${item.milestones}</td>
                                            <td>${item.success}</td>
                                            <td>${item.failure}</td>

                                        </tr>
                                    </#list>
                                </table>
                            </div>
                            <div style="font-size: 24px; 
                            margin-top: 20px;">
                                <b>API COMPARE</b><br /><br />
                            </div>
                            <div style="text-align:left">
                                <table style="background-color: black;">
                                    <tr style="background-color: #3a80e2f9;">
                                        <th>Flow Types</th>
                                        <th>API TYPE</th>
                                        <th>SUCCESS</th>
                                        <th>FAILURE</th>
                                    </tr>
                                    <#list apiCompare as item>
                                        <tr style="background-color: #ffffff;">
                                            <td>${item.Flow_Type}</td>
                                            <td>${item.api_type}</td>
                                            <td>${item.success}</td>
                                            <td>${item.failed}</td>

                                        </tr>
                                    </#list>
                                </table>
                            </div>
                        </td>
                    </tr>
                </table> <br /> <br />
            </td>
        </tr>
    </table>
</body>

</html>