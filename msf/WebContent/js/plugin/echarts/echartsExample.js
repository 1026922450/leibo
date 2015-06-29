var myChart;
//var domCode = document.getElementById('sidebar-code');
var domGraphic = document.getElementById('graphic');
var domMain = document.getElementById('forceContent');
//var domMessage = document.getElementById('wrong-message');
//var iconResize = document.getElementById('icon-resize');
var needRefresh = false;

//var enVersion = location.hash.indexOf('-en') != -1;
//var hash = location.hash.replace('-en','');
//hash = hash.replace('#','') || (needMap() ? 'default' : 'macarons');
//hash += enVersion ? '-en' : '';

var curTheme;
function requireCallback (ec, defaultTheme) {
//    curTheme = themeSelector ? defaultTheme : {};
    echarts = ec;
    refresh();
    window.onresize = myChart.resize;
}

//var themeSelector = $('#theme-select');
//if (themeSelector) {
    /*themeSelector.html(
        '<option selected="true" name="macarons">macarons</option>'
        + '<option name="infographic">infographic</option>'
    );*/
    /*$(themeSelector).on('change', function(){
        selectChange($(this).val());
    });*/
//    function selectChange(value){
//        var theme = value;
//        myChart.showLoading();
//        $(themeSelector).val(theme);
        /*if (theme != 'default') {
            window.location.hash = value + (enVersion ? '-en' : '');
            require(['theme/' + theme], function(tarTheme){
                curTheme = tarTheme;
                setTimeout(refreshTheme, 500);
            });
        }
        else {
            window.location.hash = enVersion ? '-en' : '';
            curTheme = {};
            setTimeout(refreshTheme, 500);
        }*/
//    }
//    function refreshTheme(){
//        myChart.hideLoading();
//        myChart.setTheme(curTheme);
//    }
    /*if ($(themeSelector).val(hash.replace('-en', '')).val() != hash.replace('-en', '')) {
        $(themeSelector).val('macarons');
        hash = 'macarons' + enVersion ? '-en' : '';
        window.location.hash = hash;
    }*/
//}

function autoResize() {
    if ($(iconResize).hasClass('glyphicon-resize-full')) {
        focusCode();
        iconResize.className = 'glyphicon glyphicon-resize-small';
    }
    else {
        focusGraphic();
        iconResize.className = 'glyphicon glyphicon-resize-full';
    }
}

function focusCode() {
    domCode.className = 'col-md-8 ani';
    domGraphic.className = 'col-md-4 ani';
}

function focusGraphic() {
    //domCode.className = 'col-md-4 ani';
    //domGraphic.className = 'col-md-8 ani';
    if (needRefresh) {
        myChart.showLoading();
        setTimeout(refresh, 1000);
    }
}

/*var editor = CodeMirror.fromTextArea(
    document.getElementById("code"),
    { lineNumbers: true }
);
editor.setOption("theme", 'monokai');


editor.on('change', function(){needRefresh = true;});*/

function refresh(isBtnRefresh){
    if (isBtnRefresh) {
        needRefresh = true;
        focusGraphic();
        return;
    }
    needRefresh = false;
    if (myChart && myChart.dispose) {
        myChart.dispose();
    }
    myChart = echarts.init(domMain, curTheme);

    option = {
		    title : {
		        text: '关联关系',
		        x:'left',
		        y:'bottom'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: '{c}'
		    },
		    toolbox: {
		        show : true,
		        feature : {
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    legend: {
		        x: 'left',
		        data:['机检组','现场记录组', '废料处理组']
		    },
		    series : [
		        {
		            type:'force',
		            name : "关联关系",
		            ribbonType: false,
		            categories : [{name: '机检组'}, {name: '现场记录组'},{name:'废料处理组'}],
		            itemStyle: {
		                normal: {
		                    label: {
		                        show: true,
		                        textStyle: {
		                            color: '#333'
		                        }
		                    },
		                    nodeStyle : {
		                        brushType : 'both',
		                        borderColor : 'rgba(255,215,0,0.4)',
		                        borderWidth : 1
		                    },
		                    linkStyle: {
		                        type: 'curve'
		                    }
		                },
		                emphasis: {
		                    label: {
		                        show: false
		                    },
		                    linkStyle : {}
		                }
		            },
		            useWorker: false,
		            minRadius : 10,
		            maxRadius : 10,
		            roam: true,
		            linkSymbol: 'arrow',
		            nodes:[
		                {category:0, name: '15',value : 15},
		                {category:0, name: '16',value : 16},
		                {category:0, name: '17',value : 17},
		                {category:0, name: '18',value : 18},
		                {category:0, name: '19',value : 19},
		                {category:0, name: '20',value : 20},
		                {category:0, name: '21',value : 21},
		                {category:0, name: '22',value : 22},
		                {category:0, name: '23',value : 23},
		                {category:0, name: '24',value : 24},
		                {category:0, name: '25',value : 25},
		                {category:0, name: '26',value : 26},
		                {category:1, name: '27',value : 27},
		                {category:1, name: '28',value : 28},
		                {category:1, name: '29',value : 29},
		                {category:1, name: '30',value : 30},
		                {category:1, name: '31',value : 31},
		                {category:1, name: '32',value : 32},
		                {category:1, name: '33',value : 33},
		                {category:1, name: '34',value : 34},
		                {category:1, name: '35',value : 35},
		                {category:1, name: '36',value : 36},
		                {category:1, name: '37',value : 37},
		                {category:2, name: '38',value : 38},
		                {category:2, name: '39',value : 39},
		                {category:2, name: '40',value : 40},
		            ],
		            links : [
						{source : '21', target : '24', value:14, name:'14'},
						{source : '24', target : '19', value:12},
						{source : '19', target : '15', value:10},
						{source : '19', target : '23', value:5},
						{source : '23', target : '18', value:2},
						{source : '18', target : '21', value:9},
						{source : '18', target : '25', value:9},
						{source : '25', target : '16', value:7},
						{source : '16', target : '26', value:5},
						{source : '26', target : '20', value:21},
						{source : '20', target : '22', value:7},
						{source : '22', target : '17', value:22},
						{source : '17', target : '16', value:34},
						{source : '15', target : '25', value:3},
						{source : '15', target : '26', value:8},
						{source : '26', target : '19', value:12},
						{source : '26', target : '22', value:9},
						{source : '36', target : '34', value:11},
						{source : '34', target : '35', value:12},
						{source : '35', target : '27', value:13},
						{source : '27', target : '28', value:21},
						{source : '37', target : '28', value:17},
						{source : '28', target : '32', value:18},
						{source : '37', target : '32', value:19},
						{source : '31', target : '37', value:18},
						{source : '33', target : '32', value:13},
						{source : '34', target : '27', value:14},
						{source : '36', target : '33', value:10},
						{source : '32', target : '36', value:35},
						{source : '36', target : '31', value:50},
						{source : '27', target : '33', value:25},
						{source : '39', target : '38', value:17},
						{source : '38', target : '29', value:18},
						{source : '29', target : '40', value:23},
						{source : '40', target : '30', value:11},
						{source : '30', target : '39', value:18},
						{source : '39', target : '40', value:22},
						{source : '29', target : '39', value:32}
		            ]
		        }
		    ]
		};
		var ecConfig = require('echarts/config');
		function focus(param) {
		    var data = param.data;
		    var links = option.series[0].links;
		    var nodes = option.series[0].nodes;
		    if (data.source !== undefined && data.target !== undefined ) { //点击的是边
		        var sourceNode = nodes.filter(function (n) {return n.name == data.source})[0];
		        var targetNode = nodes.filter(function (n) {return n.name == data.target})[0];
		        alert("选中了边, 源点" + sourceNode.name + ' -> 终点' + targetNode.name + ' -> 值' + data.value);
		    } else { // 点击的是点
//		        alert("选中了点，名称 " + data.name + ' ->' + data.value);
		    	searchUbAttrs(data.name);
		    }
		}
		myChart.on(ecConfig.EVENT.CLICK, focus);
		
		myChart.on(ecConfig.EVENT.FORCE_LAYOUT_END, function () {
		    console.log(myChart.chart.force.getPosition());
		});
    
    
    window.onresize = myChart.resize;
    //(new Function(editor.doc.getValue()))();
    myChart.setOption(option, true);
//    domMessage.innerHTML = '';
}

function searchUbAttrs(ubId){
	$.ajax({
		url : "/msf/topo/searchUbAttrs.do",
		type : "post",
		data : {
			ubId : ubId,
		},
		success : function(data) {
			var retCode = data.retCode;
			if (data.retCode == "SUCCESS") {
//				alert(data.retData);
				var retData = data.retData;
				$("#attrForm").html("");
				for(var i = 0; i < retData.length;i++){
					
				}
				
//				$("#menuParentId").html("");
//				$("#menuParentId").append("<option value='0'>请选择</option>");
//				$.each(data.retData, function(index, value) {
//					$("#menuParentId").append("<option value='"+value.id+"'>" + value.name + "</option>");
//				});
			} else {
				alert("ERROR");
//				toastr.error(top.Resource[data.retCode], MessageTitle, showMessage);
			}
		},
		error : function() {
			alert("ERROR");
//			toastr.error(top.Resource["ERROR"], MessageTitle, showMessage);
		}
	});
}


function needMap() {
    var href = location.href;
    return href.indexOf('map') != -1
           || href.indexOf('mix3') != -1
           || href.indexOf('mix5') != -1
           || href.indexOf('dataRange') != -1;

}

var echarts;
var developMode = false;

if (developMode) {
    /*window.esl = null;
    window.define = null;
    window.require = null;
    (function () {
        var script = document.createElement('script');
        script.async = true;

        var pathname = location.pathname;

        var pathSegs = pathname.slice(pathname.indexOf('doc')).split('/');
        var pathLevelArr = new Array(pathSegs.length - 1);
        script.src = pathLevelArr.join('../') + 'asset/js/esl/esl.js';
        if (script.readyState) {
            script.onreadystatechange = fireLoad;
        }
        else {
            script.onload = fireLoad;
        }
        (document.getElementsByTagName('head')[0] || document.body).appendChild(script);
        
        function fireLoad() {
            script.onload = script.onreadystatechange = null;
            setTimeout(loadedListener,100);
        }
        function loadedListener() {
            // for develop
            require.config({
                packages: [
                    {
                        name: 'echarts',
                        location: '../../src',
                        main: 'echarts'
                    },
                    {
                        name: 'zrender',
                        // location: 'http://ecomfe.github.io/zrender/src',
                        location: '../../../zrender/src',
                        main: 'zrender'
                    }
                ]
            });
            launchExample();
        }
    })();*/
}
else {
    // for echarts online home page
    require.config({
        paths: {
            echarts: './js/plugin/echarts/js'
        }
    });
    launchExample();
}

var isExampleLaunched;
function launchExample() {
    if (isExampleLaunched) {
        return;
    }

    // 按需加载
    isExampleLaunched = 1;
    require(
        [
            'echarts',
//            'theme/' + hash.replace('-en', ''),
//            'echarts/chart/line',
//            'echarts/chart/bar',
//            'echarts/chart/scatter',
//            'echarts/chart/k',
//            'echarts/chart/pie',
//            'echarts/chart/radar',
            'echarts/chart/force',
//            'echarts/chart/chord',
//            'echarts/chart/gauge',
//            'echarts/chart/funnel',
//            'echarts/chart/eventRiver',
//            'echarts/chart/venn',
//            'echarts/chart/treemap',
//            'echarts/chart/tree',
//            'echarts/chart/wordCloud',
//            needMap() ? 'echarts/chart/map' : 'echarts'
        ],
        requireCallback
    );
}

