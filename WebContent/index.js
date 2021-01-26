$(document).ready(function(){
	
	var u = getLoggedUser();
	console.log(u);
})

function redirect()
{
	$(location).attr('href', 'http://localhost:8080/PocetniREST/registration.html');
}


function signIn()
{
	$(location).attr('href', 'http://localhost:8080/PocetniREST/singin.html');
}



function getLoggedUser() {

	var user = null;

	$.ajax({
		
		url : "rest/users/getLoggedUser",
		type : 'GET',
		dataType : 'json',
		success : function(data) {
			if (data) {
				console.log(data);
				user = data;
			}
		},
		error : function(errorThrown) {
			toastr.error(errorThrown.responseText);
		}
	});
	return user;
}
