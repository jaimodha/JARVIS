package com.transcendinsights.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer

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

  @Override
  void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.authenticationManager(authenticationManager);
  }

  @Override
  void configure(ClientDetailsServiceConfigurer clients) {
    clients.inMemory()
    .withClient('e167ea5c-c36a-4c24-9c8e-7986625c1c88')
    .authorizedGrantTypes('authorization_code','refresh_token','password','client_credentials')
    .scopes('default')
    .secret('2ae200ba-3d1a-419f-913c-5faf09a4df76')
  }
}
