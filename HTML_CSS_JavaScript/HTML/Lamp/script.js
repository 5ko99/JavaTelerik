function changeState(state){
	var lamp = document.getElementById('lamp');

	lamp.src = 'lamp_' + state + '.png';
}
 var flag = true;
function changeBackground(color){
	var div = document.getElementById('div');
	if(flag){
		div.style.backgroundColor = color;
		flag = false;
	}
	else{
		div.style.backgroundColor = 'pink';
		flag = true;
	}
}

function fun(){
 var but = document.getElementById('button');
 but.style.backgroundColor = 'green';
}

$('#add-btn').on('click',function(ev){
	var $special = $('.special');
	$special.next().addClass('special');
	$special.removeClass();
	var $s = $('.special');
	printMessage($s.text());
	});

function printMessage(text){
	$('#m-list').first().append(text+' ');
}

    var position = {};
    navigator.geolocation.getCurrentPosition(function (data){
    position.longitude= data.coords.longitude;
    position.latitude = data.coords.latitude;
    
    $.ajax({
        url: 'http://api.openweathermap.org/data/2.5/weather?lat=' +position.latitude +'&lon=' +position.longitude +'&appid=44db6a862fba0b067b1930da0d769e98',
        method : 'GET',
        success: function(data){
            console.log(data);
            var temp = data.main.temp;
            temp = temp - 273.15;
            temp = temp.toFixed(1);
            var city = data.name;
            $('#temp').text('Tempereture in '+city+' is: '+temp+'°C');
        },
        error: function(er){
            console.log(er);
            $('#temp').text('Error with current tempereture.');
        }
    });

});