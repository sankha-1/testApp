$(function(){
    var ctx = $("#myDoughnut").get(0).getContext("2d");

    var data = {
			labels: ['Red', 'Yellow', 'Blue'],
			datasets: [{
				data: [10, 20, 30],
				backgroundColor: ["#1f29fa", "#889fa1", "#0cd7e2"]
			}],
		};

    var myDoughnutChart = new Chart(ctx, {
    type: 'doughnut',
    data: data,
    options: {
		responsive: true,
		legend: {
			display: false
		}
	}
	});
});

$(function(){
    var ctx = $("#myLine").get(0).getContext("2d");

    var data = {
			labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
			datasets: [{
				data: [214.80, 322.20, 130.00, 589.15, 408.21, 101.93],
				backgroundColor: ["#1f29fa", "#889fa1", "#0cd7e2", "#5e0736", "#333231", "f1239e"]
			}],
		};

    var myLineChart = new Chart(ctx, {
    type: 'line',
    data: data,
    options: {
		responsive: true,
		legend: {
			display: false
		}
	}
	});
});

