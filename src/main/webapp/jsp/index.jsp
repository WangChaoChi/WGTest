<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WG(应聘人：王超驰)</title>
    <%@include file="/jsp/common/header.jsp" %>
    <style>
        .table .form-control {
            height: 25px;
            width: 60px;
        }

        #electron, #food, #daily {
            border-right: 0.5px solid #bec1c8;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading  text-center">
            <h5 class="text-center">WG测试（应聘人：王超驰）</h5>
        </div>
        <div class="panel-body">
            <div class="row" id="productList">
                <div class="col-xs-3" id="electron">
                    <table class="table table-hover" id="electronList">
                        <caption class="text-info text-center">电子列表</caption>
                        <thead class="text-center">
                        <tr>
                            <th>商品名称</th>
                            <th>单价</th>
                            <th>购买数量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>ipad</td>
                            <td>2399.00</td>
                            <td><input class="form-control" value="1" type="text"></td>
                        </tr>
                        <tr>
                            <td>iphone</td>
                            <td>5000.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>显示器</td>
                            <td>1799.00</td>
                            <td><input class="form-control" value="1" type="text"></td>
                        </tr>
                        <tr>
                            <td>笔记本电脑</td>
                            <td>8000.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>键盘</td>
                            <td>238.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        </tbody>
                    </table>
                    <h5 class="text-center text-success">电子促销信息：</h5>
                    <form class="form-horizontal" id="electronPromotion" role="form">
                        <div class="form-group">
                            <label for="discount1" class="col-sm-4 control-label"> 折扣率：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discount1" value="0.7" class="form-control" placeholder="折扣率">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="discountDate1" class="col-sm-4 control-label"> 日期：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discountDate1" value="2018-9-9" class="form-control" placeholder="请输入日期">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-xs-3" id="food">
                    <table class="table table-hover" id="foodList">
                        <caption class="text-info text-center">食品列表</caption>
                        <thead class="text-center">
                        <tr>
                            <th>商品名称</th>
                            <th>单价</th>
                            <th>购买数量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>面包</td>
                            <td>9.00</td>
                            <td><input class="form-control" value="5" type="text"></td>
                        </tr>
                        <tr>
                            <td>饼干</td>
                            <td>5.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>蔬菜</td>
                            <td>5.98</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>牛肉</td>
                            <td>50.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>蛋糕</td>
                            <td>15.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        </tbody>
                    </table>
                    <h5 class="text-center text-success">食品促销信息：</h5>
                    <form class="form-horizontal" id="foodPromotion" role="form">
                        <div class="form-group">
                            <label for="discount3" class="col-sm-4 control-label"> 折扣率：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discount3" class="form-control" placeholder="折扣率">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="discountDate3" class="col-sm-4 control-label"> 日期：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discountDate3" class="form-control" placeholder="请输入日期">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-xs-3" id="daily">
                    <table class="table table-hover" id="dailyList">
                        <caption class="text-info text-center">日用品列表</caption>
                        <thead class="text-center">
                        <tr>
                            <th>商品名称</th>
                            <th>单价</th>
                            <th>购买数量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>餐巾纸</td>
                            <td>3.20</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>收纳箱</td>
                            <td>20.50</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>咖啡杯</td>
                            <td>24.66</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>雨伞</td>
                            <td>50.20</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>肥皂</td>
                            <td>5.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        </tbody>
                    </table>
                    <h5 class="text-center text-success">日用品促销信息：</h5>
                    <form class="form-horizontal" id="dailyPromotion" role="form">
                        <div class="form-group">
                            <label for="discount2" class="col-sm-4 control-label"> 折扣率：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discount2" class="form-control" placeholder="折扣率">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="discountDate2" class="col-sm-4 control-label"> 日期：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discountDate2" class="form-control" placeholder="请输入日期">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-xs-3" id="wine">
                    <table class="table table-hover" id="wineList">
                        <caption class="text-info text-center">酒类列表</caption>
                        <thead class="text-center">
                        <tr>
                            <th>商品名称</th>
                            <th>单价</th>
                            <th>购买数量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>啤酒</td>
                            <td>25.00</td>
                            <td><input class="form-control" value="12" type="text"></td>
                        </tr>
                        <tr>
                            <td>白酒</td>
                            <td>501.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>伏特加</td>
                            <td>900.88</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>黄酒</td>
                            <td>50.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        <tr>
                            <td>红酒</td>
                            <td>1000.00</td>
                            <td><input class="form-control" value="" type="text"></td>
                        </tr>
                        </tbody>
                    </table>
                    <h5 class="text-center text-success">酒类促销信息：</h5>
                    <form class="form-horizontal" id="winePromotion" role="form">
                        <div class="form-group">
                            <label for="discount4" class="col-sm-4 control-label"> 折扣率：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discount4" class="form-control" placeholder="折扣率">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="discountDate4" class="col-sm-4 control-label"> 日期：</label>
                            <div class="col-sm-8">
                                <input type="text" id="discountDate4" class="form-control" placeholder="请输入日期">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <h5 class="text-center text-success">优惠券信息：</h5>
            <form class="form-inline" id="couponForm" role="form">
                <div class="form-group">
                    <label for="endDate" class="col-sm-4 control-label"> 到期时间：</label>
                    <div class="col-sm-8">
                        <input type="text" id="endDate" value="2018-8-6" name="endDate" class="form-control" placeholder="到期时间">
                    </div>
                </div>
                <div class="form-group">
                    <label for="minCash" class="col-sm-4 control-label"> 最低消费：</label>
                    <div class="col-sm-8">
                        <input type="text" id="minCash" value="1000" name="minCash" class="form-control" placeholder="请输入最低消费金额">
                    </div>
                </div>
                <div class="form-group">
                    <label for="returnCash" class="col-sm-4 control-label"> 返现金额：</label>
                    <div class="col-sm-8">
                        <input type="text" id="returnCash" value="200" name="returnCash" class="form-control" placeholder="返现金额">
                    </div>
                </div>
            </form>
        </div>
        <div class="panel-footer">
            <div class="row">
                <div class="col-xs-3">
                    <h4 class="pull-right text-warning">结算金额：</h4>
                </div>
                <div class="col-xs-4">
                    <h4 class="pull-left text-warning"><span id="result">0.00</span>元</h4>
                </div>
                <div class="col-xs-3">
                    <span class="label label-denger"></span>
                </div>
                <div class="col-xs-2">
                    <button type="button" class="btn btn-info" id="doAccount">点击结算</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${basePath}/resource/shopping.js" type="text/javascript"></script>
<script>
    $(function () {
        shopping.account({
            basePath:"${basePath}",
        });
    })
</script>
</html>