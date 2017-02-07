
package com.jyoti.ws.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SeatNotAvailableException", targetNamespace = "http://ws.bookingservice.jyoti.com/")
public class SeatNotAvailableException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SeatNotAvailableException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SeatNotAvailableException_Exception(String message, SeatNotAvailableException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SeatNotAvailableException_Exception(String message, SeatNotAvailableException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.jyoti.ws.client.SeatNotAvailableException
     */
    public SeatNotAvailableException getFaultInfo() {
        return faultInfo;
    }

}
