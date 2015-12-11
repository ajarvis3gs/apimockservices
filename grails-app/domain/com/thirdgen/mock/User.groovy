package com.thirdgen.mock

import grails.rest.Resource

@Resource(uri='/users')
class User {

    String username

    static constraints = {
        username blank:false
    }
}
