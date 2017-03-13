package com.transcendinsights.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-12
 * OauthClientToken Dimension representing all the issued ClientTokens.
 */
@Entity
@Table(name = 'oauth_client_token')
class OauthClientToken {

    @Column(name = 'token_id')
    String tokenId

    @Column(name = 'token')
    @Lob
    String token

    @Id
    @Column(name = 'authentication_id', nullable = false)
    String authenticationId

    @Column(name = 'user_name')
    String userName

    @Column(name = 'client_id')
    String clientId
}
