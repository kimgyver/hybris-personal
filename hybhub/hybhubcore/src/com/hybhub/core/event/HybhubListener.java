/**
 *
 */
package com.hybhub.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HybhubListener extends AbstractEventListener<HybhubEvent>
{
	private final Logger LOG = LoggerFactory.getLogger(HybhubListener.class);

	@Override
	protected void onEvent(final HybhubEvent event)
	{
		LOG.info("Recieved event (Hybhub Event)" + event);
	}

}
