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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>ItemList</title>

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
 <script type="text/javascript">
   function submitAction(url){
	   $('form')attr('action',url);
	   $('form').submit();
   }
 </script>
</head>
<body>
<div id="header">
  <div id="pr">
  </div>
</div>
<div id="main">
<div id="top">
  <p>ItemList</p>
</div>
<div>
<s:if test="itemInfoDTOList==null">
  <h3>商品情報はありません。</h3>
</s:if>
<s:elseif test="message==null">
<h3>商品一覧</h3>
<table border="1">
  <tr>
    <th>ID</th>
    <th>商品名</th>
    <th>値段</th>
    <th>在庫数</th>
    <th>登録日</th>
    <th>更新日</th>
    <th>詳細</th>
  </tr>
  <s:iterator value="itemInfoDTOList">
    <tr>
      <td><s:property value="id"/></td>
      <td><s:property value="itemName"/></td>
      <td><s:property value="itemPrice"/><span>円</span></td>
      <td><s:property value="itemStock"/><span>個</span></td>
      <td><s:property value="insert_date"/></td>
      <td><s:property value="update_date"/></td>
      <td><a href='<s:url action="ItemDetailsAction"><s:param name="id" value="%{id}"/></s:url>'>詳細</a></td>
    </tr>
  </s:iterator>
</table>
</s:elseif>
<s:if test="message !=null">
  <h3><s:property value="message"/></h3>
</s:if>
<div id="text-right">
  <p>管理者TOP画面へ戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a></p>
</div>
</div>
</div>
<div id="footer">
  <div id="pr">
  </div>
</div>
</body>
</html>