<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  	<title>Drill  Submission</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  </head>

  <body>
    <div class="container">
      <h2 class=text-center>Enter the details of the drill</h2><br><br>
      <form role="form" name="submit" method="post" class="form form-horizontal" action="Submission">
      <input type="hidden" name="pagename" value="submit"/>
      
        <div class="form-group">
        
          <label for="setname"  class="col-sm-3 control-label">Set Name :</label>
          <div class="col-md-5">
          <input type="text" class="form-control" id="setname" name="setname" placeholder="Enter the name of the Question Set" required>
        
        </div>
        </div>
        
        <div class="form-group">
          <label for="setdesc" class="col-sm-3 control-label">Set Description :</label>
          <div class="col-md-5">
          <input type="text" class="form-control" id="setdesc" name="setdesc" placeholder="Enter the description of the Question Set" required>
        </div>
        </div>
        
        <div class="form-group">
          <label for="setlimit" class="col-sm-3 control-label">Set limit :</label>
          <div class="col-md-2">
          <input type="number" class="form-control" id="setlimit" name="setlimit" value=20 min=1 required>
        </div>
        </div>
        
        <div class="form-group">
  			<label for="isfree" class="col-sm-3 control-label">Is the Question set Free ? :</label>
  			<div class="col-md-2">
  			<select class="form-control" id="isfree" name="isfree" required>
    				<option>Y</option>
    				<option>N</option>
  			</select>
		</div>
		</div>
		
		 <div class="form-group">
          <label for="settotalmarks" class="col-sm-3 control-label">Total marks for the set :</label>
          <div class="col-md-2">
          <input type="number" class="form-control" id="settotalmarks" name="settotalmarks" value=170 min=1 required>
           </div>
        </div>
        <br>
       	<span class="col-sm-4 control-label"><button type="submit" class="btn btn-default btn-block">Submit</button></span>
       	<button type="button" class="btn btn-default btn-lg btn-block">Block level button</button>
      </form>
    </div>

    
  </body>
</html>