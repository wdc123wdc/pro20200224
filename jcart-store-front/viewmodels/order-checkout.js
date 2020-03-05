var app = new Vue({
    el: '#app',
    data: {
        myaddresses:[],
        shipMethods:[
            {value: 0, label:'ESC' },
            {value: 1, label:'中通' },
            {value: 2, label:'韵达' },
            {value: 3, label:'邮政' },
            {value: 4, label:'申通' },
        ],
        payMethods:[],
        selectedShipAddressId:'',
        selectShipMethod:'',
        selectedInvoiceAddredssId:'',
        selectedPayMethod:''
    }
})