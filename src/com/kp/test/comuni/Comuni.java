/**
 * 
 */
package com.kp.test.comuni;

/**
 * @author gianpierofrongia
 *
 */

import java.io.Serializable;
import java.util.Date;
 
public class Comuni implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6509104551330318656L;
	private String id;
	private String codice;
	private String codRegione;
	private String codProvincia;
	private String codComune;
	private String nomeComune;
	private String cap;
	

    private Date created;
    private Date modified;
    
    
 
    public Comuni() {
    }
 
    //
    // Define the getters and setters for our pojo.
    //
   
 
    /**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the codRegione
	 */
	public String getCodRegione() {
		return codRegione;
	}

	/**
	 * @param codRegione the codRegione to set
	 */
	public void setCodRegione(String codRegione) {
		this.codRegione = codRegione;
	}

	/**
	 * @return the codProvincia
	 */
	public String getCodProvincia() {
		return codProvincia;
	}

	/**
	 * @param codProvincia the codProvincia to set
	 */
	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}

	/**
	 * @return the codComune
	 */
	public String getCodComune() {
		return codComune;
	}

	/**
	 * @param codComune the codComune to set
	 */
	public void setCodComune(String codComune) {
		this.codComune = codComune;
	}

	/**
	 * @return the nomeComune
	 */
	public String getNomeComune() {
		return nomeComune;
	}

	/**
	 * @param nomeComune the nomeComune to set
	 */
	public void setNomeComune(String nomeComune) {
		this.nomeComune = nomeComune;
	}

	/**
	 * @return the cap
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * @param cap the cap to set
	 */
	public void setCap(String cap) {
		this.cap = cap;
	}

	

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the modified
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * @param modified the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	
	@Override
    public String toString() {
        return "Comune{" +
                "id=" + id +
                ", codice='" + codice + "'" +
                ", codRegione=" + codRegione +
                ", codProvincia=" + codProvincia +
                ", codComune=" + codComune +
                ", nomeComune=" + nomeComune +
                ", cap=" + cap +
                "}";
    }
}
