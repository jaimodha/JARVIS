package com.transcendinsights.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * @authot Jai Modha.
 * @since 2017-March-12
 * OauthCode Dimension that represent oauth OauthCode.
 */
@Entity
@Table(name = 'oauth_code')
class OauthCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column(name = 'code')
    String code

    @Column(name = 'authentication')
    byte[] authentication
}
