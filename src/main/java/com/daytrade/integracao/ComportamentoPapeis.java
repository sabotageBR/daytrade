//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.02.06 às 08:04:50 PM BRST 
//


package com.daytrade.integracao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Papel" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Ibovespa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Abertura" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Minimo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Maximo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Medio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Ultimo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Oscilacao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "papel"
})
@XmlRootElement(name = "ComportamentoPapeis")
public class ComportamentoPapeis {

    @XmlElement(name = "Papel")
    protected List<ComportamentoPapeis.Papel> papel;

    /**
     * Gets the value of the papel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the papel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPapel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComportamentoPapeis.Papel }
     * 
     * 
     */
    public List<ComportamentoPapeis.Papel> getPapel() {
        if (papel == null) {
            papel = new ArrayList<ComportamentoPapeis.Papel>();
        }
        return this.papel;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Ibovespa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Abertura" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Minimo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Maximo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Medio" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Ultimo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Oscilacao" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Papel {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Codigo")
        protected String codigo;
        @XmlAttribute(name = "Nome")
        protected String nome;
        @XmlAttribute(name = "Ibovespa")
        protected String ibovespa;
        @XmlAttribute(name = "Data")
        protected String data;
        
        @XmlAttribute(name = "Abertura")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal abertura;
        
        @XmlAttribute(name = "Minimo")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal minimo;
        
        @XmlAttribute(name = "Maximo")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal maximo;
        
        @XmlAttribute(name = "Medio")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal medio;
        
        @XmlAttribute(name = "Ultimo")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal ultimo;
        
        @XmlAttribute(name = "Oscilacao")
        @XmlJavaTypeAdapter(BigDecimalAdapter.class)
        protected BigDecimal oscilacao;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIbovespa() {
			return ibovespa;
		}

		public void setIbovespa(String ibovespa) {
			this.ibovespa = ibovespa;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public BigDecimal getAbertura() {
			return abertura;
		}

		public void setAbertura(BigDecimal abertura) {
			this.abertura = abertura;
		}

		public BigDecimal getMinimo() {
			return minimo;
		}

		public void setMinimo(BigDecimal minimo) {
			this.minimo = minimo;
		}

		public BigDecimal getMaximo() {
			return maximo;
		}

		public void setMaximo(BigDecimal maximo) {
			this.maximo = maximo;
		}

		public BigDecimal getMedio() {
			return medio;
		}

		public void setMedio(BigDecimal medio) {
			this.medio = medio;
		}

		public BigDecimal getUltimo() {
			return ultimo;
		}

		public void setUltimo(BigDecimal ultimo) {
			this.ultimo = ultimo;
		}

		public BigDecimal getOscilacao() {
			return oscilacao;
		}

		public void setOscilacao(BigDecimal oscilacao) {
			this.oscilacao = oscilacao;
		}
        

    }

}
