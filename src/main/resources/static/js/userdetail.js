$(function(){
    vm.init();
});
var vm = new Vue({
    el: '#rrapp',
    data: {
        showList: true,
        title: null,
        UserDetail:{},
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
            {
                title: 'Id',
                key: 'id',
                align: 'center',
                width:100,
                sortable: true
            },
            {
                title: '姓名',
                key: 'userid',
                align: 'center'
            },
            {
                title: '姓名',
                key: 'name',
                align: 'center'
            },
            {
                title: '姓名',
                key: 'sex',
                align: 'center'
            },
            {
                title: '姓名',
                key: 'type',
                align: 'center'
            }
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
            var url="userdetail/list";
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
                    vm.data=data.page.list;
                    vm.page.pageTotal=data.page.totalCount;
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