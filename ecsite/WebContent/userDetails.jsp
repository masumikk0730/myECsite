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
<title>UserDetails</title>

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
      <p>UserDetails</p>
    </div>
    <div>
      <s:if test="userInfoDTO==null">
        <h3>ユーザーの詳細情報はありません。</h3>
      </s:if>
      <s:elseif test="message==null">
        <h3>ユーザー情報は以下になります。</h3>
        <table border="1">
          <tr>
            <th>id</th>
            <td><s:property value="userInfoDTO.id"/></td>
          </tr>
          <tr>
            <th>ユーザID</th>
            <td><s:property value="userInfoDTO.loginId"/></td>
          </tr>
          <tr>
            <th>ユーザーPASS</th>
            <td><s:property value="userInfoDTO.loginPass"/></td>
          </tr>
          <tr>
            <th>ユーザー名</th>
            <td><s:property value="userInfoDTO.userName"/></td>
          </tr>
          <tr>
            <th>登録日</th>
            <td><s:property value="userInfoDTO.insert_date"/></td>
          </tr>
          <tr>
            <th>更新日</th>
            <td><s:property value="userInfoDTO.update_date"/></td>
          </tr>
        </table>
        <s:form action="UserDeleteConfirmAction">
          <s:hidden name="id" value="%{id}"/>
          <s:submit value="削除"/>
        </s:form>
      </s:elseif>
      <div id="text-right">
        <p>ユーザー一覧は<a href='<s:url action="UserListAction"/>'>こちら</a><p>
      </div>
    </div>
  </div>
  <div id="footer">
    <div id="pr">
    </div>
  </div>

</body>
</html>