package com.kp.test.comuni;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.kp.test.comuni.mapper.ComuniMapper;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;


public class ComuniData {

	private final Log itsLog = LogFactory.getLog(getClass());

	public void data() throws Exception, IOException, SQLException {
		String resource = "com/mybatis/Mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);

		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);

		SqlSession session = factory.openSession();
		try {
			ComuniMapper mapper = session.getMapper(ComuniMapper.class);
			Comuni comune = mapper.getComune(11);
			itsLog.info("Comune = " + comune);
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
