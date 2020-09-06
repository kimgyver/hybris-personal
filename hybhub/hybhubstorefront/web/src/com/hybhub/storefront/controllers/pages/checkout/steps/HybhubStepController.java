/**
 *
 */
package com.hybhub.storefront.controllers.pages.checkout.steps;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.acceleratorstorefrontcommons.util.AddressDataUtil;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// below impex should be done to test hybhub multi step checkout, additionally sync to online should be done.
//$contentCatalog=electronicsContentCatalog
//$contentCV=catalogVersion(CatalogVersion.catalog(Catalog.id[default=$contentCatalog]),CatalogVersion.version[default=Staged])[default=$contentCatalog:Staged]
//
//INSERT_UPDATE ContentPage;$contentCV[unique=true];uid[unique=true];name;masterTemplate(uid,$contentCV);label;defaultPage[default='true']
//;;hybhub;Hybhub Page;MultiStepCheckoutSummaryPageTemplate;hybhub
//
//INSERT_UPDATE BaseStore;uid[unique=true];checkoutFlowGroup;
//;electronics;hybhubCheckoutGroup;


@Controller
@RequestMapping(value = "/checkout/multi/hybhub")
public class HybhubStepController extends AbstractCheckoutStepController
{
	private static final String HYBHUB = "hybhub";
	@Resource(name = "addressDataUtil")
	private AddressDataUtil addressDataUtil;

	@Override
	@RequireHardLogIn
	@RequestMapping(method = RequestMethod.GET)
	@PreValidateCheckoutStep(checkoutStep = HYBHUB)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		this.prepareDataForPage(model);
		this.storeCmsPageInModel(model, getContentPageForLabelOrId(HYBHUB));
		this.setUpMetaDataForContentPage(model, getContentPageForLabelOrId(HYBHUB));
		model.addAttribute(WebConstants.BREADCRUMBS_KEY,
				this.getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.deliveryMethod.breadcrumb"));
		model.addAttribute("metaRobots", "noindex,nofollow");
		this.setCheckoutStepLinksForModel(model, getCheckoutStep());

		return "pages/checkout/multi/hybhubPage";
	}

	@Override
	@RequireHardLogIn
	@RequestMapping(value = "back", method = RequestMethod.GET)
	public String back(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().previousStep();
	}

	@Override
	@RequireHardLogIn
	@RequestMapping(value = "next", method = RequestMethod.GET)
	public String next(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().nextStep();
	}

	public CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(HYBHUB);
	}
}
