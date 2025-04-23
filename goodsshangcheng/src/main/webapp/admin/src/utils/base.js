const base = {
    get() {
        return {
            url : "http://localhost:8080/goodsshangcheng/",
            name: "goodsshangcheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/goodsshangcheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "果蔬商品管理系统"
        } 
    }
}
export default base
