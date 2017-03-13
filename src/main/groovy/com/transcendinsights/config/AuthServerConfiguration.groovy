package com.transcendinsights.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain
import org.springframework.security.oauth2.provider.token.TokenStore
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore

import javax.sql.DataSource

/**
 * @author Jai Modha
 * @since 10-March-2017
 * This class represents configuration for the auth server.
 */
@Configuration
@EnableAuthorizationServer
class AuthServerConfiguration extends AuthorizationServerConfigurerAdapter {

  @Autowired
  AuthenticationManager authenticationManager

  @Value('${service1.client-id}')
  String service1ClientId

  @Value('${service1.client-secret}')
  String service1Secret

  @Override
  void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager)
  }

  @Override
  void configure(ClientDetailsServiceConfigurer clients) {
    clients.jdbc(dataSource())
  }

  @Bean
  public DataSource dataSource() {
    final DriverManagerDataSource dataSource = new DriverManagerDataSource()
    dataSource.setUrl('jdbc:mysql://localhost:3306/jarvis?useSSL=false')
    dataSource.setUsername('root')
    dataSource.setPassword('password')
    dataSource
  }

  @Bean
  TokenStore tokenStore() {
     new JdbcTokenStore(dataSource());
  }
}
