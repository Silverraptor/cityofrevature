package cityofrevature;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.module.json.JsonData;

public class NametoIdHelper implements Callable {

	@Override
	public String onCall(MuleEventContext eventContext) throws Exception {

		JsonData jd = (JsonData) eventContext.getMessage().getPayload();
		System.out.println(jd.isArray());
		System.out.println(jd.hasNode("id"));
		String id;
		if (jd.hasNode("id"))
			id = jd.get("id").getTextValue();
		else
			id = "";
		return id;

	}

}
