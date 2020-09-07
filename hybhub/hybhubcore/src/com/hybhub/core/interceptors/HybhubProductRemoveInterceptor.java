/**
 *
 */
package com.hybhub.core.interceptors;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HybhubProductRemoveInterceptor implements RemoveInterceptor
{
	private final Logger LOG = LoggerFactory.getLogger(HybhubProductRemoveInterceptor.class);
	private final static Pattern PRODUCT_MATCH_PATTERN = Pattern.compile("^[0-9]+$");

	@Override
	public void onRemove(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		final ProductModel product = (ProductModel)model;
		final Matcher isMatched = PRODUCT_MATCH_PATTERN.matcher(product.getCode());
		if (isMatched.find())
		{
			throw new InterceptorException("Product is protected, cannot remove it!");
		}
		LOG.info("Product : "  + product.getCode() + " removed.");
	}

}
