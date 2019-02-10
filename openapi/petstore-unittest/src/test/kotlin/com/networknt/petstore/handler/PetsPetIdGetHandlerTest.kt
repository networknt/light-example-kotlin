
package com.networknt.petstore.handler
import assertk.all
import assertk.assertThat
import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(LightTestServer::class)
class PetsPetIdGetHandlerTest {
    companion object {
        val log = KotlinLogging.logger {}
    }

    @Test
    fun `test PetsPetIdGetHandlerTest() PetsPetIdGetHandler success` () {
        val response = LightTestServer.makeGetRequest("/v1/pets/hhRKMxyUaDKvRpYwcXmLHu")
        
        assertThat(response).all {
            rcIsEqualTo(200)
            bodyContains("id")
        }
    }
}

