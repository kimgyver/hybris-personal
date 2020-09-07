/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 7/09/2020 12:43:31 AM                       ---
 * ----------------------------------------------------------------
 */
package com.hybhub.fulfilmentprocess.jalo;

import com.hybhub.fulfilmentprocess.constants.HybhubFulfilmentProcessConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess MyProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyProcess extends BusinessProcess
{
	/** Qualifier of the <code>MyProcess.fail</code> attribute **/
	public static final String FAIL = "fail";
	/** Qualifier of the <code>MyProcess.error</code> attribute **/
	public static final String ERROR = "error";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FAIL, AttributeMode.INITIAL);
		tmp.put(ERROR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.error</code> attribute.
	 * @return the error
	 */
	public Boolean isError(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ERROR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.error</code> attribute.
	 * @return the error
	 */
	public Boolean isError()
	{
		return isError( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.error</code> attribute. 
	 * @return the error
	 */
	public boolean isErrorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isError( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.error</code> attribute. 
	 * @return the error
	 */
	public boolean isErrorAsPrimitive()
	{
		return isErrorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.error</code> attribute. 
	 * @param value the error
	 */
	public void setError(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ERROR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.error</code> attribute. 
	 * @param value the error
	 */
	public void setError(final Boolean value)
	{
		setError( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.error</code> attribute. 
	 * @param value the error
	 */
	public void setError(final SessionContext ctx, final boolean value)
	{
		setError( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.error</code> attribute. 
	 * @param value the error
	 */
	public void setError(final boolean value)
	{
		setError( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.fail</code> attribute.
	 * @return the fail
	 */
	public Boolean isFail(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.fail</code> attribute.
	 * @return the fail
	 */
	public Boolean isFail()
	{
		return isFail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.fail</code> attribute. 
	 * @return the fail
	 */
	public boolean isFailAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFail( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProcess.fail</code> attribute. 
	 * @return the fail
	 */
	public boolean isFailAsPrimitive()
	{
		return isFailAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.fail</code> attribute. 
	 * @param value the fail
	 */
	public void setFail(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.fail</code> attribute. 
	 * @param value the fail
	 */
	public void setFail(final Boolean value)
	{
		setFail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.fail</code> attribute. 
	 * @param value the fail
	 */
	public void setFail(final SessionContext ctx, final boolean value)
	{
		setFail( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProcess.fail</code> attribute. 
	 * @param value the fail
	 */
	public void setFail(final boolean value)
	{
		setFail( getSession().getSessionContext(), value );
	}
	
}
