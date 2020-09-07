/**
 *
 */
package com.hybhub.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


// Below groovy code tests Hybhub event listening on the HAC console.
//import com.hybhub.core.event.HybhubEvent;
//import de.hybris.platform.servicelayer.event.events.AbstractEvent;
//import de.hybris.platform.servicelayer.event.EventService;
//
//EventService eventService = spring.getBean("eventService");
//AbstractEvent event = new HybhubEvent("EVENT PUBLISHED FROM Groovy CONSOLE");
//eventService.publishEvent(event);


public class HybhubEvent extends AbstractEvent
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "HybhubEvent [name=" + name + "]";
	}

	public HybhubEvent(final String name)
	{
		super();
		this.name = name;
	}
}
