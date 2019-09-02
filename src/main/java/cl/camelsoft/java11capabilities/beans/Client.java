package cl.camelsoft.java11capabilities.beans;

import java.io.Serializable;

/**
 * Client
 */
public class Client implements Serializable{

    final static long serialVersionUID=1234345345L;

    private String name;
    private Long id;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}