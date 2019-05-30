package cityofrevature;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class SessionVarSplitHelper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String name = eventContext.getMessage().getInvocationProperty("name");
		eventContext.getMessage().setProperty("first", name.split(" ")[0], PropertyScope.SESSION);
		eventContext.getMessage().setProperty("last", name.split(" ")[1], PropertyScope.SESSION);
		return null;
	}

	
	
}
