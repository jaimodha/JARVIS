package com.transcendinsights.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-12
 * OauthRefreshToken Dimension that represents all issued Refresh tokens.
 */
@Entity
@Table(name = 'oauth_refresh_token')
class OauthRefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column(name = 'token_id')
    String tokenId

    @Column(name = 'token')
    @Lob
    String token

    @Column(name = 'authentication')
    @Lob
    String authentication

}
