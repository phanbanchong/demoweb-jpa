package com.codespiral.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfigure {

	//@Value("${spring.datasource.jndi-name}")
	//private String primaryJndiName;
	
	//private JndiDataSourceLookup lookup = new JndiDataSourceLookup();

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSourceProperties() throws SQLException {
		return DataSourceBuilder.create().driverClassName("org.postgresql.Driver").build();
		//DataSource dataSource = lookup.getDataSource(primaryJndiName);
		//return dataSource;
	}

}
