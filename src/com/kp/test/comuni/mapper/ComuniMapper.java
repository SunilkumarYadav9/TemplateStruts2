/**
 * 
 */
package com.kp.test.comuni.mapper;

import java.io.IOException;
import java.sql.SQLException;
import com.kp.test.comuni.Comuni;


/**
 * @author gianpierofrongia
 *
 */
public interface ComuniMapper {
	/**
     * Get a single comune from the database based on the record
     * identified.
     * 
     * @param id comune identifier.
     * @return a comune object.
     */
    Comuni getComune(int id) throws Exception, IOException, SQLException;

   

}
