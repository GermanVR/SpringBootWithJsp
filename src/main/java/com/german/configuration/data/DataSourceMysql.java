package com.german.configuration.data;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DataSourceMysql {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource DataSourceM() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalSessionFactoryBean sessionFactoryMysql() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(DataSourceM());
		sessionFactory.setPackagesToScan(new String[] { "com.german.modelo.entidad" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	// @Bean
	// @Qualifier("sessionFactoryMap")
	// public Map<String, LocalSessionFactoryBean> sessionFactoryMap() {
	// Map<String, LocalSessionFactoryBean> mapa = new HashMap<String,
	// LocalSessionFactoryBean>();
	// mapa.put("1", sessionFactoryMysql());
	// return mapa;
	//
	// }

	public Properties hibernateProperties() {
		return new Properties() {
			private static final long serialVersionUID = -35794547167094515L;
			{
				setProperty("hibernate.show_sql", "true");
				setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
				setProperty("hibernate.c3p0.min_size", "2");
				setProperty("hibernate.c3p0.max_size", "4");
//				setProperty("hibernate.c3p0.timeout", "200");
//				setProperty("hibernate.c3p0.idle_test_period", "10");
//				setProperty("hibernate.c3p0.acquire_increment", "1");
//				setProperty("hibernate.c3p0.max_statements", "40");
//				setProperty("hibernate.connection.autocommit", "true");
				setProperty("hibernate.id.new_generator_mappings", "false");
//				setProperty("hibernate.hbm2ddl.auto", "create");
			}
		};
	}
}
