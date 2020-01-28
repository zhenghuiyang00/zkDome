package com.bawei.zkDome.entity;

import java.util.List;

public class ShopEntity {

    /**
     * result : [{"categoryName":"女鞋","shoppingCartList":[{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","count":3,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg","price":139},{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg","price":278}]},{"categoryName":"美妆护肤","shoppingCartList":[{"commodityId":17,"commodityName":"化妆镜","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31},{"commodityId":13,"commodityName":"贝览得美妆蛋","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6}]}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * categoryName : 女鞋
         * shoppingCartList : [{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","count":3,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg","price":139},{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","count":4,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg","price":278}]
         */

        private String categoryName;
        private List<ShoppingCartListBean> shoppingCartList;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<ShoppingCartListBean> getShoppingCartList() {
            return shoppingCartList;
        }

        public void setShoppingCartList(List<ShoppingCartListBean> shoppingCartList) {
            this.shoppingCartList = shoppingCartList;
        }

        public static class ShoppingCartListBean {
            /**
             * commodityId : 23
             * commodityName : 小白鞋 女款 时尚百搭休闲板鞋
             * count : 3
             * pic : http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg
             * price : 139
             */

            private int commodityId;
            private String commodityName;
            private int count;
            private String pic;
            private int price;

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }
}
