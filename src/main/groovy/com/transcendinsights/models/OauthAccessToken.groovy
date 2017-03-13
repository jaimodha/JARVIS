package com.transcendinsights.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-12
 * OauthAccessToken Dimension represents all the issued OauthAccessToken.
 */
@Entity
@Table(name = 'oauth_access_token')
class OauthAccessToken {

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

    @Column(name = 'authentication')
    @Lob
    String authentication

    @Column(name = 'refresh_token')
    String refreshToken
}
