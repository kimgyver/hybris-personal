<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <%@ taglib prefix="formElement" uri="/WEB-INF/tags/responsive/formElement" %> --%>
<%@ taglib prefix="multi-checkout" tagdir="/WEB-INF/tags/responsive/checkout/multi"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<template:page pageTitle="${pageTitle}" hideHeaderLinks="true">

<div class="row">
    <div class="col-sm-6">
    	<div class="checkout-headline">
    		<span class="glyphicon glyphicon-lock"></span>
            <spring:theme code="checkout.multi.secure.checkout" text="Secure Checkout" />
        </div>
		<multi-checkout:checkoutSteps checkoutSteps="${checkoutSteps}" progressBarId="hybhubStep">
			<jsp:body>
				<ycommerce:testId code="hybhub">
					<a href='<spring:url value="${nextStepUrl}"/>' type="button" class="btn btn-primary btn-block">
						Continue
					</a>
					<button id="addressSubmit" type="button"
						class="btn btn-primary btn-block">
						<spring:theme code="checkout.multi.deliveryAddress.continue"></spring:theme>
					</button>
				</ycommerce:testId>
			</jsp:body>
		</multi-checkout:checkoutSteps>
    </div>

    <div class="col-sm-6 hidden-xs">
		<h1>This is hub hub step</h1>
	</div>

</div>
</template:page>