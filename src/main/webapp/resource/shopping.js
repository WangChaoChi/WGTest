shopping = {
    URL: {
        doAccount: function (bathPath) {
            return bathPath+"/account";
        }
    },
    data: {
        commodites: [],
        promotions: [],
        coupon: {}
    },
    getPromotions: function (typeCode) {
        var discount = document.getElementById("discount" + typeCode).value;
        var discountDate = document.getElementById("discountDate" + typeCode).value;
        if (discount.length > 0 && discountDate.length > 0) {
            var promotion = {
                discount: discount,
                endDate: discountDate,
                type: typeCode
            }
            console.log(promotion);
            shopping.data.promotions.push(promotion);
        }

    },
    getCommoditys: function (node, typeCode) {
        var rows = node.getElementsByTagName("tr");
        for (var i = 1; i < rows.length; i++) {
            var number = rows[i].getElementsByTagName("input")[0].value;
            if (isNaN(number)) {
                alert("不能填入非数字");
                return;
            }

            if (number.length > 0) {
                var commedity = {
                    name: rows[i].cells[0].innerHTML,
                    price: rows[i].cells[1].innerHTML,
                    number: number,
                    type: typeCode
                };
                console.log(commedity);
                shopping.data.commodites.push(commedity);
            }
        }
    },
    account: function (params) {

        $("#doAccount").click(function () {
            console.log($("#result").html());
            shopping.getCommoditys(document.getElementById("electronList"), 1);
            shopping.getCommoditys(document.getElementById("foodList"), 2);
            shopping.getCommoditys(document.getElementById("dailyList"), 3);
            shopping.getCommoditys(document.getElementById("wineList"), 4);
            shopping.getPromotions(1);
            shopping.getPromotions(2);
            shopping.getPromotions(3);
            shopping.getPromotions(4);
            var endDate = $("#endDate").val();
            var minCash = $("#minCash").val();
            var returnCash = $("#returnCash").val();
            if (endDate.length > 0 && minCash.length > 0 && returnCash.length > 0) {
                shopping.data.coupon = {
                    endDate: endDate,
                    minCash: minCash,
                    returnCash: returnCash
                }
            }
            console.log(shopping.data);
            $("#result").html("0.00");
            /*$.post(shopping.URL.doAccount(), JSON.stringify(shopping.data), function (result) {
                alert("搞定");
            });*/

            $.ajax({
                type: "POST",
                url: shopping.URL.doAccount(params['basePath']),
                data: JSON.stringify(shopping.data),
                dataType:"json",
                success: function (result) {
                    if (result && result['success']==1){
                        $("#result").html(result['result']);
                    }else{
                        alert(result['result']);
                    }
                },
                error: function (result) {
                    alert(result);
                },
                complete: function () {
                    shopping.data = {
                        commodites: [],
                        promotions: [],
                        coupon: {}
                    }
                },
            });
        })

    }
};