
package no.nav.arena.tjenester.person.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.4
 * 2014-01-29T15:24:02.640+01:00
 * Generated source version: 2.7.4
 */

@WebFault(name = "faultGenerisk", targetNamespace = "http://arena.nav.no/services/lib/fault")
public class FaultGeneriskMsg extends Exception {
    
    private no.nav.arena.services.lib.fault.FaultGenerisk faultGenerisk;

    public FaultGeneriskMsg() {
        super();
    }
    
    public FaultGeneriskMsg(String message) {
        super(message);
    }
    
    public FaultGeneriskMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultGeneriskMsg(String message, no.nav.arena.services.lib.fault.FaultGenerisk faultGenerisk) {
        super(message);
        this.faultGenerisk = faultGenerisk;
    }

    public FaultGeneriskMsg(String message, no.nav.arena.services.lib.fault.FaultGenerisk faultGenerisk, Throwable cause) {
        super(message, cause);
        this.faultGenerisk = faultGenerisk;
    }

    public no.nav.arena.services.lib.fault.FaultGenerisk getFaultInfo() {
        return this.faultGenerisk;
    }
}
