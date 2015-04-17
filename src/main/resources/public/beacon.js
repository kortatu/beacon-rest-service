function Beacon($scope, $http) {
	$scope.getData = function () {
		$http.get('http://127.0.0.1:8080/beacons').success(
    			function(data) {	    
    				$scope.beacons = data;    				
    			}
    	)
	};
    setInterval($scope.getData,5000);
}