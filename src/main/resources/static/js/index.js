var vm = new Vue({
    el: '#rrapp',
    data: {
        inStorage:{},
        message:'Hello World!',
        ruleValidate: {
            name: [
                {required: true, message: '名称不能为空', trigger: 'blur'}
            ]
        },
        q: {
            name: ''
        }
    },
    methods: {}
});