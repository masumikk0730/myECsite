<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content=Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content=""/>
<title>itemCreateConfirm画面</title>

<style type="text/css">
body{
    margin:0;
    padding:0;
    line-height:1.6;
    letter-spacing:1px;
    font-family:Verdana,Helvetica,sans-serif;
    font-size:12px;
    color:#333;
    background:#FEF9F0;
  }
  table{
    text-align:center;
    margin:0 auto;
  }

  /*====ecsite LAYOUT====*/
  #top{
    width:500px;
    margin:30px auto;
    padding:10px;
    border-bottom:dashed 4px #00BCD1;
    font-size:15px;
    }
  #header{
    width:100%;
    height:80px;
    background-color:#76D3DE;
    }
  #main{
    width:100%;
    height:500px;
    text-align:center;
    }
 #footer{
   width:100%;
   height:80px;
   background-color:#76D3DE;
   clear:both;
   }
   </style>
</head>
<body>
<div id="header">
    <div id="pr">
    </div>
  </div>
  <div id="main">
    <div id="top">
      <p>ItemCreateConfirm</p>
    </div>
    <div>
      <h3>登録する内容は以下でよろしいですか。</h3>
      <table>
        <s:form action="ItemCreateCompleteAction">
        <tr id="box">
          <td>
            <label>商品名:</label>
          </td>
          <td>
            <s:property value="itemName" escape="false"/>
          </td>
        </tr>
        <tr id="box">
          <td>
            <label>値段:</label>
          </td>
          <td>
            <s:property value="itemPrice" escape="false"/>
          </td>
        </tr>
        <tr id="box">
          <td>
            <label>在庫数:</label>
          </td>
          <td>
            <s:property value="itemStock" escape="false"/>
          </td>
        </tr>
        <tr>
          <td>
            <s:submit value="完了"/>
          </td>
        </tr>
      </s:form>
      </table>
    </div>
  </div>
  <div id="footer">
    <div id="pr">
    </div>
  </div>

</body>
</html>