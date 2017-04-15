package pl.btbw.csrf;

import org.owasp.csrfguard.CsrfGuard;
import org.owasp.csrfguard.CsrfGuardException;
import org.owasp.csrfguard.action.AbstractAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CSRFAttackDetected extends AbstractAction {

	@Override
	public void execute(HttpServletRequest request,
	                    HttpServletResponse response,
	                    CsrfGuardException csrfe,
	                    CsrfGuard csrfGuard) throws CsrfGuardException {
		// example -> org.owasp.csrfguard.action.Log
		System.out.println("Custom message and action when CSRF Attack is Detected");
	}
}
