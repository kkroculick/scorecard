/*American Express*/

package com.core_scorecard.core_scorecard.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.core_scorecard.core_scorecard.*;
/**
 * Specifies methods used to obtain and modify VAimOwner related information
 * which is stored in the database.
 */
@Repository("core_scorecard.VAimOwnerDao")
public class VAimOwnerDao extends WMGenericDaoImpl <VAimOwner, VAimOwnerId> {

   @Autowired
   @Qualifier("core_scorecardTemplate")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}

