<#-- @ftlvariable name="" type="com.razorpay.PaymentView" -->
<html>
<head lang="en">
    <meta charset="utf-8">
</head>
<body>
<form action="/payment/charge" method="POST">
    <script
            src="https://checkout.razorpay.com/v1/checkout.js"
            data-key="rzp_test_uTg5PgiJMsGDHe"
            data-amount=${amount?c}
            data-order_id=${razorpayOrderId}
            data-name="Dummy Data"
            data-description="Purchase Description"
            data-netbanking="true"
            data-description="Dummy desc"
            data-prefill.name="Meghna Misra"
            data-prefill.email="meg9779@gmail.com"
            data-prefill.contact="9999999999"
            data-notes.shopping_order_id="21">
    </script>
    <input type="hidden" name="shopping_order_id" value="21">
</form>
</body>
</html>