<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
  <s:form action="LoginAction">
<!--   このformタグ内に入力された情報がactionに飛ぶ -->
  <s:textfield name="name"/>
  <s:password name="password"/>
  <s:submit value="ログイン"/>
  </s:form>
<!--   ユーザーが入力したユーザーネームとパスワードの値にnameとpassword -->
<!--   という名前をつけて送信する -->
</body>
</html>