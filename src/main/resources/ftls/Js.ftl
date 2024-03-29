$(function(){
    vm.init();
});
var vm = new Vue({
    el: '#rrapp',
    data: {
        showList: true,
        title: null,
        ${ClassName}:{},
        page:{
            pageTotal:0,
            pageNum:1,
            pageSize:10
        },
        columns: [
           {
                title: '',
                width: 60,
                align: 'center',
                type: 'selection'
            },
            <#list columns! as column>
            {
                title: '${column.attrname}',
                key: '${column.attrname}',
                align: 'center'
            }<#if column_has_next>,</#if>
            </#list>
        ],
        data:[],
        q: {
            name: ''
        },
        ruleValidate:{
        }
    },
    methods: {
        init:function(){
            var url="${pathName}/list";
            var params={
                page:{pageNum:vm.page.pageNum,pageSize:vm.page.pageSize},
                map:{}
            };
            $.ajax({
                url:url,
                type:"POST",
                data:JSON.stringify(params),
                contentType:"application/json",
                success:function(data){

                }
            })
        },
        query: function () {
			vm.reload();
		},
		add: function () {

		},
		update: function (event) {

		},
		saveOrUpdate: function (event) {

		},
		del: function (event) {

		},
		getInfo: function(){

		},
		reload: function (event) {
            vm.showList = true;
		},
        reloadSearch: function() {

        },
        handleSubmit: function (name) {

        },
        handleReset: function (name) {

        },
        //点击页码
        handlePage:function(value){
            vm.page.pageNum=value;
            vm.init();
        },
        handlePageSize:function(value){
            vm.page.pageSize=value;
            vm.init();
        },
        //点击复选框事件
        handleSelectRow:function(){
            var list=this.$refs.selection.getSelection();
            for(var i=0;i<list.length;i++){
                vm.ids.push(list[i].id);
            }
        }
    }
});