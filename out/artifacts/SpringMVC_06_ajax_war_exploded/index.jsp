<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/13
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.min.js"></script>

    <script>
      function a(){
        $.post({
            url: "${pageContext.request.contextPath}/a1",
            data: {"name": $("#username").val()},
            success: function(data) {
              alert(data);
            }
        })
      }
    </script>

  </head>
  <body>

  <%-- 失去焦点的时候，发起一个请求到后台 --%>
  <input type="text" id="username" onblur="a()">


  </body>
</html>
