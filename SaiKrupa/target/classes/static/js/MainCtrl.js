var app = angular.module('app',['ui.router','ui.bootstrap','app.factory']);
angular.module('app.factory', ['ngResource']);

app.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.when('', '/');
    $stateProvider
        .state('login',{
            url:'/',
            templateUrl:'templates/LoginPage.html'
        })
        .state('forgotPwd',{
            url:'login/identify/',
            templateUrl:'templates/forgotPassword.html'

        })
        .state('home',{
            url:'/home',
            templateUrl:'templates/HomePage.html'

        })
        .state('loginFail',{
            url:'/loginFailed',
            templateUrl:'templates/LoginFailure.html'

        })
        .state('afterSignUp',{
            url:'/registered',
            templateUrl:'templates/sigupSuccess.html'

        })
        .state('upload',{
            url: '/uploadFile',
            templateUrl: 'templates/uploadImage.html'
        })


})
app.controller('MainCtrl',function($scope,$state,$http){
   
   debugger;
    console.log('helllo');
    $scope.credentials = {};
    $scope.signup={};

    function loginSuccess(data){
        
        console.log(data);
        $state.go('home');

    }

    function loginfailure(error){
        $state.go('loginFail');
        $scope.credentials = {};
    }
    $scope.login = function(){
        $http.post('http://localhost:8080/mainController/validateLogin',$scope.credentials).then(loginSuccess(),loginfailure());
    }

    $scope.forgot = function(){
        $state.go('forgotPwd');
    }

    function signupSuccess(){
        $state.go('afterSignUp');
        $scope.signup={};
    }

    function signupFailure(){

    }
    $scope.signUp=function(){
        $http.post('http://localhost:8080/mainController/signUp',$scope.signup).then(signupSuccess(),signupFailure());
    }
})