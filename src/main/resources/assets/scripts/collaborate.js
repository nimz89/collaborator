var cardWidgets;


$(document).ready(function(){
       cardWidgets = $("#gridListContainer").children();
});
function prev(){
    for(var i=0; i <= cardWidgets.length-1; i++){
      var widgetId =   cardWidgets[i].id;
      var widgetCss = $("#"+widgetId).attr("class");
      if(widgetCss.includes('active')){
          $("#"+widgetId).removeClass('active');
      }else{
          $("#"+widgetId).addClass('active');
      }
    }

}

function next(){
    $("#first").css("display","none");
    $("#second").css("display","");
}

function gridListToggle(element){
    var otherElementID = "gridButton",
    elementID = element.id,
    functionType="grid";
    if(elementID == otherElementID){
        otherElementID = "listButton";
        functionType = "list";
    }
    $("#"+otherElementID).removeClass("active");
    $("#"+elementID).addClass("active");

    toggleElements(functionType);
}

function toggleElements(functionType){
    for(var i=0; i <= cardWidgets.length-1; i++){
        var widgetId =   cardWidgets[i].id;
       if(functionType === "grid"){
            $("#"+widgetId).removeClass("grid");
            $("#"+widgetId).addClass("list");
    }else{
           $("#"+widgetId).removeClass("list");
           $("#"+widgetId).addClass("grid");
    }
    }
}

function hideAnimate(element){
   element.animate({
          left: '200px',
          opacity: '0'
       });
}

function ajaxCall(){
    var data = {};
    $.ajax({
        type: 'GET',
        url: '/collaborate/1',
        data: data,
        cache: false
    }).done(function (data) {
        alert(data.email);
    })
}