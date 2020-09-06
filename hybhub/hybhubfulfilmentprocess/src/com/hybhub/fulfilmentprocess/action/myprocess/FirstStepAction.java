package com.hybhub.fulfilmentprocess.action.myprocess;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;

import com.hybhub.fulfilmentprocess.model.MyProcessModel;


public class FirstStepAction extends AbstractSimpleDecisionAction<MyProcessModel>
{

	@Override
	public Transition executeAction(final MyProcessModel myProcess) throws RetryLaterException, Exception
	{
		if (myProcess.isFail())
		{
			return Transition.NOK;
		}
		return Transition.OK;
	}

}
