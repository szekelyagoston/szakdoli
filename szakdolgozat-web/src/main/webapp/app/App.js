var app = angular.module("app", ['ui.router']);

app.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/public');
    
    $stateProvider

	    .state('public', {
	        url: '/public',
	        templateUrl: 'app/public/public.html'
	    })
    
        .state('public.login', {
            url: '/login',
            templateUrl: 'app/login/login.html',
            controller: "LoginController"
        })
        .state('public.about', {
            url: '/about',
            templateUrl: 'app/about/about.html',
            controller: "AboutController"
        })
        
//        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
//        .state('about', {
//            // we'll get to this in a bit       
//        });
        
});
