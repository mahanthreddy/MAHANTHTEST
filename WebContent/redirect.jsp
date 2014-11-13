
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  </head>
  
  <body>
  <div class="container">
      <br>
      <br>
      <h3 class="text-center">Thanks for Submitting the drill.Your set is updated.</h3><br><br>
      
       <form class="form form-horizontal" role="form">
      
        <div class="form-group">
          <label for="setid" class="col-sm-3 control-label">Question Set Id :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="setid" name="setid" value="${dbvalues[0]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="courseid" class="col-sm-3 control-label">Course Id :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="courseid" name="courseid" value="${dbvalues[1]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="providerid" class="col-sm-3 control-label">Question Provider Id :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="providerid" name="providerid" value="${dbvalues[2]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="setname" class="col-sm-3 control-label">Question Set Name :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="setname" name="setname" value="${dbvalues[3]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="setdesc" class="col-sm-3 control-label">Question Set Description :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="setdesc" name="setdesc" value="${dbvalues[4]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="timelimit" class="col-sm-3 control-label">Question Set Time limit :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="timelimit" name="timelimit" value="${dbvalues[5]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="isfree" class="col-sm-3 control-label">Is Free ? :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="isfree" name="isfree" value="${dbvalues[6]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="totalmarks" class="col-sm-3 control-label">Question Set Total marks :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="totalmarks" name="totalmarks" value="${dbvalues[7]}" disabled>
          </div>
        </div>
        
        <div class="form-group">
          <label for="created" class="col-sm-3 control-label">Created Date and Time :</label>
          <div class="col-sm-6">
          <input type="text" class="form-control" id="created" name="created" value="${dbvalues[8]}" disabled>
          </div>
        </div>
        
        
      </form>
      	
      	
      	
     <br><br><h4 class="text-center">Please Click the <a href="index.jsp">link</a> to submit a new drill.</h4>
      	
      	     
   </div>
  </body>
  
  </html>