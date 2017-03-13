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
 * OauthApprovals Dimension that represents all OauthApprovals.
 */
@Entity
@Table(name = 'oauth_approvals')
class OauthApprovals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column(name = 'userId')
    String userId

    @Column(name = 'clientId')
    String clientId

    @Column(name = 'scope')
    String scope

    @Column(name= 'expiresAt')
    Date expiresAt

    @Column(name = 'lastModifiedAt')
    Date lastModifiedAt
}
