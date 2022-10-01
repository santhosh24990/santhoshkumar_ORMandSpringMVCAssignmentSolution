<%@ page isELIgnored = "false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>customer-Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <style>
    .data {
      font-size: large;
      color: white;
      font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    }
  </style>
</head>

<body>
  <div class="container p-3 my-3 bg-primary text-white">
    <h2 style="text-align:center;">CUSTOMER RELATIONSHIP MANAGEMENT</h2>
    <hr style="background-color:white; height: 2px;">

    <p>
      <a class="btn btn-outline-warning btn-lg" href="list">LIST CUSTOMERS</a>
    </p>
    <hr style="background-color:white; height: 2px;">
    <div class="container">
      <h4 style="text-align:center;">CUSTOMER REGISTRATION FORM</h4>
      <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
          <form action="save" method="post">
            <div class="form-group">
              <input type="hidden" class="form-control" placeholder="Enter Id" name="id" value="${customer.id}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter FIRSTNAME" name="firstname" value="${customer.firstname}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter LASTNAME" name="lastname"
                value="${customer.lastname}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter EMAIL" name="email"
                value="${customer.email}">
            </div>

            <button class="btn btn-outline-warning btn-lg" type= "submit" class="btn btn-primary">Save</button>
          </form>
        </div>
        <div class="col-md-4"></div>
      </div>
    </div>
  </div>
</body>
</html>