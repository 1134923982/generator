var vm = new Vue({
    el: '#rrapp',
    data: {
        title:'',
        showList:'true',
        page:{
            pageTotal:0,
            pageNum:1,
            pageSize:10
        },
        columns: [],
        data:[],
        ruleValidate:{

        }
    },
    methods: {
    }
});