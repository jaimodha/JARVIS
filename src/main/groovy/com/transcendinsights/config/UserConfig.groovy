package com.transcendinsights.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter
import org.springframework.context.annotation.Bean
import org.springframework.security.ldap.DefaultSpringSecurityContextSource
/**
 * @author Jai Modha
 * @since 2017-March-13
 * Configuration class that represents configuration for the ldap user store.
 */
@Configuration
class UserConfig extends GlobalAuthenticationConfigurerAdapter {

  @Override
  void init(AuthenticationManagerBuilder authenticationManagerBuilder) {
    authenticationManagerBuilder.ldapAuthentication()
                                .userDnPatterns('uid={0},ou=people')
                                .groupSearchBase('ou=groups')
                                .contextSource(contextSource()).passwordCompare()
                                .passwordEncoder(new LdapShaPasswordEncoder()).passwordAttribute('userPAssword')
  }

    @Bean
      DefaultSpringSecurityContextSource contextSource() {
      new DefaultSpringSecurityContextSource(Arrays.asList("ldap://localhost:8389/"), "dc=springframework,dc=org");
    }
}
