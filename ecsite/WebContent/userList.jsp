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
<title>UserList</title>

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
  <p>UserList</p>
</div>
<div>
<s:if test="userInfoDTOList==null">
  <h3>ユーザー情報はありません。</h3>
</s:if>
<s:elseif test="message==null">
<h3>ユーザー一覧</h3>
<table border="1">
  <tr>
    <th>ID</th>
    <th>ログインID</th>
    <th>パスワード</th>
    <th>ユーザー名</th>
    <th>登録日時</th>
    <th>更新日</th>
    <th>詳細</th>
  </tr>
  <s:iterator value="userInfoDTOList">
    <tr>
      <td><s:property value="id"/></td>
      <td><s:property value="loginId"/></td>
      <td><s:property value="loginPass"/></td>
      <td><s:property value="userName"/></td>
      <td><s:property value="insert_date"/></td>
      <td><s:property value="update_date"/></td>
      <td><a href='<s:url action="UserDetailsAction"><s:param name="loginId" value="%{loginId}"/></s:url>'>詳細</a></td>
    </tr>
  </s:iterator>
</table>
 <s:form action="UserListDeleteConfirmAction">
        <s:submit value="削除"/>
 </s:form>
</s:elseif>
<div id="text-right">
  <p>管理者TOP画面へ戻る場合は<a href='admin.jsp'>こちら</a></p>
</div>
</div>
</div>
<div id="footer">
  <div id="pr">
  </div>
</div>
</body>
</html>