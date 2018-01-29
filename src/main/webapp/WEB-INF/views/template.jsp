<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib description="Simple Template" pageEncoding="UTF-8"%>
 
<%@attribute name="title"%>
<%@attribute name="head_area" fragment="true" %>
<%@attribute name="body_area" fragment="true" %>
 
<html>
 <head>
 <title>${title}</title>
     <jsp:invoke fragment="head_area"/>
 </head>
 <body>
     <jsp:invoke fragment="body_area"/>
 </body>
</html>