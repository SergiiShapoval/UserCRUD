<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="taglib.jsp"%>
<h1>Add/Edit user</h1>
<form:errors path="user.*" class="text-warning"/>
<form:form action="/user.do" method="POST" commandName="user" >
  <table class="table table-responsive table-condensed table-hover table-responsive">
    <tr>
      <td>ID</td>
      <td><form:input path="id"  class="form-control disabled" disabled="true"/></td>
    </tr>
    <tr>
      <td>Name</td>
      <td><form:input path="name" class="form-control"/></td>
    </tr>
    <tr>
      <td>Age</td>
      <td><form:input path="age" class="form-control" /></td>
    </tr>
    <tr>
      <td>Is admin?</td>
      <td><%--<form:input path="isAdmin" class="form-control"/>--%>
        <form:radiobutton
                          path = "isAdmin"
               id = "true"
               value = "true"
               />
        <label for = "true">true</label>
        <form:radiobutton
               path = "isAdmin"
               id = "false"
               value = "false"
               />
        <label for = "false">false</label>

      </td>

    </tr>

    <tr>
      <td colspan="2">
        <button type="submit" name="action" value="Add" class="btn btn-default btn-block" > <span class="glyphicon glyphicon-saved" aria-hidden="true"></span> Save</button>
          <%--
                  <button type="submit" name="action" value="Edit" class="btn btn-default btn-block"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Edit</button>
                  <button type="submit" name="action" value="Delete" class="btn btn-default btn-block"> <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Delete</button>
                  <button type="submit" name="action" value="Search" class="btn btn-default btn-block" > <span class="glyphicon glyphicon-search" aria-hidden="true"></span> Search</button>
          --%>
      </td>
    </tr>
  </table>
</form:form>