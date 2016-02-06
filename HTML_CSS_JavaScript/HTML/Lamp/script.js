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

