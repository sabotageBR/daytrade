//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.02.06 às 08:04:50 PM BRST 
//


package com.daytrade.integracao;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.daytrade.integracao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.daytrade.integracao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComportamentoPapeis }
     * 
     */
    public ComportamentoPapeis createComportamentoPapeis() {
        return new ComportamentoPapeis();
    }

    /**
     * Create an instance of {@link ComportamentoPapeis.Papel }
     * 
     */
    public ComportamentoPapeis.Papel createComportamentoPapeisPapel() {
        return new ComportamentoPapeis.Papel();
    }

}
