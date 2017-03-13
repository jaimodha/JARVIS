package com.transcendinsights.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-12
 * ClientDetails Dimension representing all the clients registered with the application.
 */
@Entity
@Table(name = 'ClientDetails')
class ClientDetails {

    @Id
    @Column(name = 'appId', nullable = false)
    String appId

    @Column(name = 'resourceIds')
    String resourceIds

    @Column(name = 'appSecret')
    String appSecret

    @Column(name = 'scope')
    String scope

    @Column(name = 'grantTypes')
    String grantTypes

    @Column(name = 'redirectUrl')
    String redirectUrl

    @Column(name = 'authorities')
    String authorities

    @Column(name = 'access_token_validity')
    int accessTokenValidity

    @Column(name = 'refresh_token_validity')
    int refreshTokenValidity

    @Column(name = 'additionalInformation')
    String additionalInformation

    @Column(name = 'autoApproveScopes')
    String autoApproveScopes
}
