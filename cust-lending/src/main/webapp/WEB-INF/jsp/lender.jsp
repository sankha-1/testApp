<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/favicon.ico">

    <title>iLending | Lender Home</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<!--<link href="style1.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/style1.css" rel="stylesheet">
	<!-- Font Awesome icons styles -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/Chart.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
  </head>

  <body>

    <header>
		<nav class="navbar navbar-expand-md">
			<a class="navbar-brand" href="#">iLending</a>
			<button class="navbar-toggler navbar-dark" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
			  <span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
			  <ul class="navbar-nav ml-auto">
				<li class="nav-item">
				  <a class="nav-link" href="profile.html">Welcome, John Doe</a>
				</li>
				<li class="nav-item">
				  <a class="nav-link" href="login.html">Signout</a>
				</li>
			  </ul>
			</div>
		</nav>
	</header>
	
	<section id="main">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-2 nav-panel">
					<div class="list-group">
						<a href="lender.html" class="list-group-item rounded-0 active main-color-bg"><span><i class="fas fa-tachometer-alt"></i></span> Lender Dashboard</a>
						<a href="opportunities.html" class="list-group-item rounded-0"><span><i class="fa fa-binoculars"></i></span> Opportunities</a>
						<a href="portfolio.html" class="list-group-item rounded-0"><span><i class="fas fa-handshake"></i></span> Portfolio</a>
						<a href="deposit.html" class="list-group-item rounded-0"><span><i class="fas fa-money-bill"></i></span> Deposit Funds</a>
						<a href="withdraw.html" class="list-group-item rounded-0"><span><i class="fa fa-exclamation-triangle"></i></span> Withdraw Funds</a>
						<a href="activity.html" class="list-group-item rounded-0"><span><i class="fa fa-exclamation-triangle"></i></span> Activities</a>
					</div>
				</div>
				<div class="col-md-10 detail-panel">
					<div id="breadcrumb">
						<div class="container">
							<ol class="breadcrumb">
								<li class="active">Lender Dashboard<li>
							</ol>
						</div>
					</div>
					<div class="container">
						<div class="card-deck">
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">New Opportunities</h6>
									<h2 class="card-title"><a href="opportunities.html">
										<c:out value="${total_opportunities}" default='0' /> 
									</a></h2>
									<p class="card-text">New funding opportunities have been listed. You can evaluate the requests by clicking above.</p>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">Expiring Today</h6>
									<h2 class="card-title"><a href="#">2</a></h2>
									<p class="card-text">Loan requests are expiring today. If you are interested in funding any of these requests you can do it today before it expires.</p>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">Card title</h6>
									<h2 class="card-title"><a href="#">0</a></h2>
									<p class="card-text">This is a dummy card title. This will be replaced with actual information based on requirements.</p>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
						</div>
					</div>
					<div class="container">
						<div class="card-deck">
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">Portfolio Status</h6>
									<canvas id="myDoughnut"></canvas>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">Interest Earned</h6>
									<canvas id="myLine"></canvas>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
							<div class="card text-center">
								<div class="card-body">
									<h6 class="card-title">Account Balance</h6>
									<h2 class="card-title"><span><i class="fas fa-rupee-sign"></i></span><a href="#"> 212098.82</a></h2>
									<p class="card-text">Current balance in your account. You can either withdraw/invest total/part of this amount</p>
								</div>
								<div class="card-footer">
									<small class="text-muted">Last updated 3 mins ago</small>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
