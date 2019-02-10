
package com.networknt.petstore.handler
import assertk.all
import assertk.assertThat
import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(LightTestServer::class)
class PetsGetHandlerTest {
    companion object {
        val log = KotlinLogging.logger {}
    }

    @Test
    fun `test PetsGetHandlerTest() PetsGetHandler success` () {
        /*
        
        val response = LightTestServer.makeGetRequest("/v1/pets?limit=73")
        
        assertThat(response).all {
            rcIsEqualTo(200)
            bodyContains("any string from the body to be replaced")
        }
        */
    }
}

