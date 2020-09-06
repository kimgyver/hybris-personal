package com.hybhub.fulfilmentprocess.action.myprocess;


import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;

import org.apache.log4j.Logger;

import com.hybhub.fulfilmentprocess.model.MyProcessModel;


public class AbortStepAction extends AbstractSimpleDecisionAction<MyProcessModel>
{
	private static final Logger LOG = Logger.getLogger(AbortStepAction.class);

	@Override
	public Transition executeAction(final MyProcessModel myProcess) throws RetryLaterException, Exception
	{
		LOG.error("The process  " + myProcess.getCode() + " failed!");
		return Transition.OK;
	}

}
