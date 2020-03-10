var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1
    },
    mounted(){
        console.log('view mounted');
        this.searchProduct();
    },
    methods: {
        searchProduct() {
            axios.get('/product/search', {
                params: {
                    productCode:this.productCode,
                    productName:this.productName,
                    price:this.price,
                    stockQuantity:this.stockQuantity,
                    statuses:this.statuses,
                    pageNum: this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handlePageChange(val){
            console.log('page change', val);
            this.pageNum = val;
            this.searchProduct();
        }

    }
})