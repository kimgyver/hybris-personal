/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.hybhub.cockpit.components.navigationarea;

import de.hybris.platform.cockpit.components.navigationarea.DefaultNavigationAreaModel;
import de.hybris.platform.cockpit.session.impl.AbstractUINavigationArea;

import com.hybhub.cockpit.session.impl.HybhubcockpitNavigationArea;


/**
 * Hybhubcockpit navigation area model.
 */
public class HybhubcockpitNavigationAreaModel extends DefaultNavigationAreaModel
{
	public HybhubcockpitNavigationAreaModel()
	{
		super();
	}

	public HybhubcockpitNavigationAreaModel(final AbstractUINavigationArea area)
	{
		super(area);
	}

	@Override
	public HybhubcockpitNavigationArea getNavigationArea()
	{
		return (HybhubcockpitNavigationArea) super.getNavigationArea();
	}
}
