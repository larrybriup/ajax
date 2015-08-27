function createXMLHttpRequest(){
		var xmlHttpRequest=null;
		// we should whether it's IE or not because IE have both ActiveXObject and 
		// XMLHttpRequest , but others only have XMLHttpRequest
		if(window.ActiveXObject){
			xmlHttpRequest=new XMLHttpRequest("microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
			xmlHttpRequest=new XMLHttpRequest();
		}else{
			alert("对不起!您的浏览器不支持ajax脚本!");
			xmlHttpRequest=false;
		}
		return xmlHttpRequest;
	}
