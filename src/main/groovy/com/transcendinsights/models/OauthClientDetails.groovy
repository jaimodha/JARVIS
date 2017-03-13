package com.transcendinsights.models

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-11
 * OauthClientDetails Dimension representing all the clients registered with the application.
 */
@Entity
@Table(name = 'oauth_client_details')
class OauthClientDetails {

    @Id
    @Column(name = 'client_id')
    String clientId

    @Column(name = 'resource_ids')
    String resourceId

    @Column(name = 'client_secret')
    String clientSecret

    @Column(name = 'scope')
    String scope

    @Column(name = 'authorized_grant_types')
    String authorizedGrantTypes

    @Column(name = 'web_server_redirect_uri')
    String webServerRedirectUri

    @Column(name = 'authorities')
    String authorities

    @Column(name = 'access_token_validity')
    int accessTokenValidity

    @Column(name = 'refresh_token_validity')
    int refreshTokenValidity

    @Column(name = 'additional_information')
    String additionalInformation

    @Column(name = 'autoapprove')
    String autoApprove
}
