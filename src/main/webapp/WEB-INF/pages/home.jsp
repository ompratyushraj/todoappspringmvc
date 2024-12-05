<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><c:out value="${page }"></c:out></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <h1 class="text-center mt-4">ToDo App</h1>
    <div class="container mt-3">
      <h1 class="text-center" >- Welcome to ToDo Manager -</h1>
      <div class="row mt-5">
        <div class="col-md-2">
          <h3>Options</h3>
        </div>
        <div class="list-group">
          <button type="button" class="list-group-item list-group-item-action active" aria-current="true">
            Menu
          </button>
          <a href='<c:url value='/home'></c:url>' class="list-group-item list-group-item-action">View Todo</a>
          <a href='<c:url value='/add'></c:url>' class="list-group-item list-group-item-action">Add Todo</a>
        </div>
        <div class="col-md-10">
          <c:if test="${page=='home' }"><h1 class="text-center">All Todos</h1>
          </c:if>
          <c:if test="${page=='add' }"><h1 class="text-center">Add Todo</h1>
          <br>
            <form:form action="saveTodo" method="post" modelAttribute="todo">
              <div class="form-group">
                <form:input path="todoTitle" cssClass="form-control" placeholder="Enter the title --"></form:input>
              </div>
              <div class="form-group">
                <form:textarea path="todoContent" cssClass="form-control" placeholder="Enter content" cssStyle="height:300px;"></form:textarea>
              </div>
              <div class="container text-center">
                <button class="btn btn-outline-success">Add Todo</button>
              </div>
            </form:form>
          </c:if>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
